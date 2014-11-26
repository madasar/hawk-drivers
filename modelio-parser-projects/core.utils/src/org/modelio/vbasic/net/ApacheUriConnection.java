/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.vbasic.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.net.UnknownServiceException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Properties;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.auth.NoneAuthData;
import org.modelio.vbasic.auth.UserPasswordAuthData;
import org.modelio.vbasic.log.Log;

/**
 * HTTP/HTTPS URI support using Apache HTTP client library.
 */
@objid ("bae410b8-11a7-4719-b527-e7909fe8cb16")
public class ApacheUriConnection extends UriConnection {
    @objid ("d7bd2f5b-6589-4747-8ec6-9cc506dcaca6")
    private int timeout;

    @objid ("a5281e74-0c89-492a-87b7-83a0eb22c299")
    private CloseableHttpResponse res;

    @objid ("6a0187ad-4705-4542-b9a9-62c4905b67aa")
    private boolean dooutput;

    @objid ("ee156a19-6f09-4516-87bb-8d14ef600644")
    private Builder configBuilder;

    @objid ("0f70dd79-2413-4803-8869-091743d047bb")
    private static CloseableHttpClient httpclient = initHttpClient();

    @objid ("64f7bf30-b22d-49ac-9467-1af449b781bb")
    private HttpClientContext context;

    @objid ("dd1f5d11-eb65-4998-8263-9e56adc8ef00")
    private IAuthData auth;

    @objid ("a1511e70-2685-47e5-88d5-2d8064d43fc3")
    private URI uri;

    @objid ("d0873604-f235-4d24-acbd-d1a221812836")
    private HttpRequestBase req;

    /**
     * @param uri the URI to open
     */
    @objid ("bcf11edd-2a78-43ac-bf86-c0b0d059c536")
    public ApacheUriConnection(URI uri) {
        this.uri = uri;
        this.configBuilder = RequestConfig.custom();
    }

    @objid ("526c188d-d764-4c43-bef9-8b09b0b3c1eb")
    private static CloseableHttpClient initHttpClient() {
        X509HostnameVerifier hostnameVerifier = new HostNameVerifier();
        return HttpClientBuilder.create()
                .useSystemProperties()
                .setSslcontext(SslManager.getInstance().getSslContext())
                .setRedirectStrategy(null)
                .setRetryHandler(new RetryHandler())
                .setHostnameVerifier(hostnameVerifier)
                .build();
    }

    @objid ("f8e1a3e4-45b3-4065-8838-90de7fe64eaa")
    private void openConnection() throws IOException, IllegalStateException {
        this.context = HttpClientContext.create();
        
        CredentialsProvider credsProvider = new SystemDefaultCredentialsProvider();
        this.context.setCredentialsProvider(credsProvider);
        
        if (this.auth != null) {
            switch (this.auth.getSchemeId()) {
            case UserPasswordAuthData.USERPASS_SCHEME_ID:
                UserPasswordAuthData authData = (UserPasswordAuthData) this.auth;
                
                if (authData.getUser() == null)
                    throw new ClientProtocolException(this.uri+": User name may not be null.");
                
                UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(
                        authData.getUser(), authData.getPassword());
                AuthScope authscope = new AuthScope(this.uri.getHost(), AuthScope.ANY_PORT);
                credsProvider.setCredentials( authscope, credentials);
                
                break;
            case NoneAuthData.AUTH_NONE_SCHEME_ID:
                break;
                
            default:
                throw new UnknownServiceException(this.auth+ " not supported for "+this.uri);
            }
        }
        
        /** support different proxy */
        configProxy(credsProvider);
        
        getRequest().setConfig(this.configBuilder.build());
        
        
        try {
            this.res = httpclient.execute(getRequest(), this.context);
            int statusCode = this.res.getStatusLine().getStatusCode();
            
            if (statusCode >=200 && statusCode < 300) { 
                // Try to get content now to get an exception on failure immediately
                this.res.getEntity().getContent();
            } else {
                handleConnectionFailure();
            }
            
        } catch (ClientProtocolException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    @objid ("6d2eabdf-d059-465d-8143-f7d9c6c1eb30")
    private HttpResponse getResponse() throws IOException {
        if (this.res == null) {
            openConnection();
        }
        return this.res;
    }

    @objid ("569f276f-58a6-480b-bc05-ceb79fed4262")
    @Override
    public InputStream getInputStream() throws IOException {
        return getResponse().getEntity().getContent();
    }

    /**
     * Same as {@link java.net.URLConnection#getOutputStream()}.
     * <p>
     * This implementation creates a {@link PipedOutputStream} to the Apache entity input stream.
     * It is strongly advised to <b>write to the returned stream in another thread</b>.
     * @see PipedOutputStream
     * @see PipedInputStream
     * @return an output stream that writes to this connection.
     * @throws java.io.IOException if an I/O error occurs while creating the output stream.
     */
    @objid ("79282b13-7e13-42d5-9917-892c78a155bd")
    @Override
    public OutputStream getOutputStream() throws IOException {
        if (! this.dooutput)
            throw new IllegalStateException("This is not an output connection");
        
        if (this.req != null && ! (this.req instanceof HttpPut))
            throw new IllegalStateException("This is not an output connection");
        
        PipedOutputStream outPipe = new PipedOutputStream();
        PipedInputStream snk = new PipedInputStream(outPipe);
        outPipe.connect(snk);
        
        BasicHttpEntity entity = new BasicHttpEntity();
        entity.setContent(snk);
        
        HttpPut pr = (HttpPut) getRequest();
        pr.setEntity(entity);
        return outPipe;
    }

    @objid ("cf3de94a-81a4-4832-921f-7ba243cceeca")
    private HttpRequestBase getRequest() {
        if (this.req == null) {
            if (this.dooutput) {
                this.req = new HttpPut(this.uri);
            } else {
                this.req = new HttpGet(this.uri);
            }
        }
        return this.req;
    }

    @objid ("e3bc0c3f-d049-43a7-afe9-f4d93825d1d0")
    @Override
    public void setRequestProperty(String key, String value) {
        getRequest().addHeader(key, value);
    }

    @objid ("b8217cfb-3879-4a9a-9962-ac6c5a15da88")
    @Override
    public void setDoOutput(boolean dooutput) {
        this.dooutput = dooutput;
    }

    @objid ("b96addaa-11c6-4df7-b0f2-4882209696e4")
    @Override
    public void setDoInput(boolean doinput) {
        // ignore
    }

    @objid ("26cc7c2b-7b49-4b3d-b018-0a11f678bc67")
    @Override
    public void setConnectTimeout(int timeout) throws IllegalArgumentException {
        this.configBuilder.setConnectTimeout(timeout);
        this.timeout = timeout;
    }

    @objid ("366975a5-be39-484e-a69f-c37ffc4a162e")
    @Override
    public int getConnectTimeout() {
        return this.timeout;
    }

    @objid ("735661c6-69c9-4f06-9ef7-0b83001da5a0")
    @Override
    public void setIfNotStamp(String stamp) {
        getRequest().addHeader("If-Modified-Since", stamp);
    }

    @objid ("1726b583-3997-4662-b8e0-fc673b2c07dd")
    @Override
    public String getStamp() {
        try {
            Header firstHeader = getResponse().getFirstHeader("Last-Modified");
            if (firstHeader == null)
                return "";
            else
                return firstHeader.getValue();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @objid ("d397b034-969b-4d1e-b1ae-d91981eb1887")
    @Override
    public void setAuthenticationData(IAuthData auth) {
        this.auth = auth;
    }

    /**
     * Proxy configuration for this connection.
     * <p>
     * Configure the proxy if specified in the connection and set proxy authentication data
     * from user settings.
     * @param credsProvider the credential provider to fill.
     */
    @objid ("e106d3cf-c3a2-4cea-9fcf-f405317e705f")
    private void configProxy(CredentialsProvider credsProvider) {
        // currently not used : allow auth data to specify proxy
        if (this.auth != null) {
            Map<String, String> data = this.auth.getData();
            if (data != null ) {
                if (data.containsKey("http.proxyHost")) {
                    String host = data.get("http.proxyHost");
                    int port = Integer.parseInt(data.get("http.proxyPort"));
        
                    HttpHost proxy = new HttpHost(host, port);
                    this.configBuilder.setProxy(proxy);
        
                    final Properties props = new Properties();
                    props.putAll(data);
        
                    configProxyCredentials(props, "http", credsProvider);
                }
            }
        }
        
        // Setup proxy authentication from system properties set by Eclipse
        // see : org.eclipse.core.internal.net.ProxyType
        configProxyCredentials(System.getProperties(), "http", credsProvider);
        configProxyCredentials(System.getProperties(), "https", credsProvider);
    }

    /**
     * Configure proxy authentication from the given properties.
     * @see <a href="http://stackoverflow.com/questions/1626549/authenticated-http-proxy-with-java">stackoverflow: Authenticated HTTP proxy with Java</a>
     * @see org.eclipse.core.internal.net.ProxyType
     * @param props configuration source
     * @param protocol = http/https
     * @param credsProvider the credential provider to fill
     */
    @objid ("fbda3db8-0195-4690-81dc-81ecfe95a586")
    @SuppressWarnings("javadoc")
    private void configProxyCredentials(Properties props, String protocol, CredentialsProvider credsProvider) {
        /*
         * http://docs.oracle.com/javase/7/docs/api/java/net/doc-files/net-properties.html:
         * 
          There are 3 properties you can set to specify the proxy that will be used by the http protocol handler:
            http.proxyHost: the host name of the proxy server
            http.proxyPort: the port number, the default value being 80.
            
          proxyUser and proxyPassword are not used by the JDK but are set by Eclipse preference page.
          see : org.eclipse.core.internal.net.ProxyType
         */
        
        String proxyHostKey = protocol+".proxyHost";
        String proxyUserKey = protocol+".proxyUser";
        
        if (props.containsKey(proxyHostKey) &&
                props.containsKey(proxyUserKey)) {
        
            String proxyPortKey = protocol+".proxyPort";
            String proxyPasswdKey = protocol+".proxyPassword";
        
            String user = props.getProperty(proxyUserKey);
            String pwd = props.getProperty(proxyPasswdKey);
            String sport = props.getProperty(proxyPortKey);
        
            int port = sport!=null ? Integer.parseInt(sport) : AuthScope.ANY_PORT;
        
            final UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(user, pwd);
        
            final AuthScope authscope = new AuthScope(this.uri.getHost(), port);
            credsProvider.setCredentials(
                    authscope, 
                    credentials);           
        
        }
    }

    /**
     * Builds and throws a {@link FileSystemException} from {@link #res}.
     * <p>
     * Adds as cause another exception whose message is the entity content. This may be the HTML message sent by the server.
     * @throws java.nio.file.FileSystemException the built exception
     */
    @objid ("4e25ec1d-3711-45cc-b742-0c77edf5e414")
    private void handleConnectionFailure() throws FileSystemException {
        StatusLine statusLine = this.res.getStatusLine();
        String reason = statusLine.getReasonPhrase();
        
        Exception base = null;
        try {
            String s = EntityUtils.toString(this.res.getEntity());
            if (s != null)
                base = new HttpResponseException(statusLine.getStatusCode(), s);
        } catch (IOException e) {
            base = e;
        }
        
        FileSystemException error;
        
        int statusCode = statusLine.getStatusCode();
        if (statusCode == HttpStatus.SC_FORBIDDEN || statusCode == HttpStatus.SC_UNAUTHORIZED || statusCode == HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED) {
            error = new AccessDeniedException(this.uri.toString(), null, reason);
        } else if (statusCode == HttpStatus.SC_NOT_FOUND) {
            error = new NoSuchFileException(this.uri.toString(),  null, reason);
        } else {
            error = new FileSystemException(this.uri.toString(),  null, reason);
        }
        
        if (base != null)
            error.initCause(base);
        
        throw error;
    }

    /**
     * URI connection factory.
     */
    @objid ("160e1779-5aa1-46ab-97b1-b9c4e88d3ffb")
    public static class ApacheUriConnectionFactory implements IUriConnectionFactory {
        @objid ("cac25ba2-73d0-4b92-8d68-b3b12ffb8711")
        @Override
        public boolean supports(URI uri) {
            return uri.getScheme().equals("http") || uri.getScheme().equals("https");
        }

        @objid ("25d00bea-798a-4046-99c3-5adaf15e1760")
        @Override
        public UriConnection createConnection(URI uri) throws IOException {
            return new ApacheUriConnection(uri);
        }

    }

    @objid ("9453ebe9-8193-4264-b09f-dfb4ab856a7c")
    private static class RetryHandler extends DefaultHttpRequestRetryHandler {
        @objid ("00f3dd92-08d0-4053-829a-1c52d7ec5267")
        public RetryHandler() {
            super();
        }

        @objid ("fded4899-30d6-4cc6-95ec-3a4a3b7773c4")
        @Override
        public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
            if (exception instanceof SSLException){
                HttpClientContext clientContext = HttpClientContext.adapt(context);
                HttpHost currentHost = clientContext.getTargetHost();
                HttpUriRequest request = (HttpUriRequest) clientContext.getRequest();
                
                URI anUri = request.getURI();
                anUri = (anUri.isAbsolute()) ? anUri : URI.create(currentHost.toURI()).resolve(anUri);
                
                return (SslManager.getInstance().fixUntrustedServer((SSLHandshakeException) exception, anUri));
            }
            return super.retryRequest(exception, executionCount, context);
        }

    }

    /**
     * Use our own implementation of Apache {@link X509HostnameVerifier} that
     * delegates to {@link BrowserCompatHostnameVerifier} and intercepts failures.
     * <p>
     * Exceptions thrown by the delegate are augmented by adding a suppressed
     * {@link InvalidCertificateException} that will be found
     * by {@link SslManager#fixUntrustedServer(SSLException, URI)}.
     */
    @objid ("e5a628f4-826f-4727-b3ed-838b86b17879")
    private static class HostNameVerifier implements X509HostnameVerifier {
        @objid ("377a9998-b1a5-4757-a60b-5c66b7fdbcfd")
         BrowserCompatHostnameVerifier delegate = new BrowserCompatHostnameVerifier();

        @objid ("774f3770-2d3b-4899-8bbd-cad288d11dc7")
        public HostNameVerifier() {
            super();
        }

        @objid ("63e0be86-be74-4bb8-8ab5-bd27ec18d665")
        @Override
        public boolean verify(String hostname, SSLSession session) {
            // Code copied from AbstractVerifier.
            try {
                final Certificate[] certs = session.getPeerCertificates();
                final X509Certificate x509 = (X509Certificate) certs[0];
                verify(hostname, x509);
                return true;
            }
            catch(final SSLException e) {
                try {
                    handleSslFailure(hostname, e, session);
                    return true;
                } catch (IOException e2) {
                    return false;
                }
            }
        }

        @objid ("7ee46efa-552c-43a5-9dbd-3167cb14d1d0")
        @Override
        public void verify(String host, SSLSocket ssl) throws IOException {
            try {
                this.delegate.verify(host, ssl);
            }
            catch ( SSLException ex) {
                SSLSession session = ssl.getSession();
                handleSslFailure(host, ex, session);
                return;
            }
        }

        /**
         * Asks {@link SslManager#getTrustManager()} to check the certificate is manually trusted by the user.
         * In this case return normally.
         * <p>
         * I the other case augment the passed exception by adding a suppressed
         * {@link InvalidCertificateException} that will be found
         * by {@link SslManager#fixUntrustedServer(SSLException, URI)}.
         * @param host the host name
         * @param ex the exception to handle
         * @param session the SSL session
         * @throws javax.net.ssl.SSLPeerUnverifiedException if the SSL session is not in valid state, should not occur.
         * @throws javax.net.ssl.SSLException the augmented <i>exception</i>.
         */
        @objid ("1828252d-3495-46a7-b8c9-c13791fe3e05")
        private void handleSslFailure(String host, SSLException ex, SSLSession session) throws SSLPeerUnverifiedException, SSLException {
            X509Certificate[] chain = (X509Certificate[]) session.getPeerCertificates();
            
            try {
                // If the server certificate is in the trusted list this call will return normally.
                // In all other cases it should throw an exception
                SslManager.getInstance().getTrustManager().checkServerTrusted(chain, host);
                
                Log.trace("Ignoring SSL exception because user trusts '"+host+"':");
                Log.trace(ex);
                return;
            } catch (CertificateException ex2) {
                // Add InvalidCertificateException with the invalid certificate chain
                // so that it can be found by SslManager.fixUntrustedServer(...)
                InvalidCertificateException ex3 = new InvalidCertificateException(chain, ex2);
                ex.addSuppressed(ex3);
                Log.trace(ex);
                throw ex;
            }
        }

        /**
         * Called in practice only by {@link #verify(String, SSLSession)} or {@link #verify(String, SSLSocket)}.
         */
        @objid ("8ec703a5-4602-4eed-8c30-e80ad35a6f93")
        @Override
        public void verify(String host, X509Certificate cert) throws SSLException {
            this.delegate.verify(host, cert);
        }

        /**
         * Should not be called at all.
         */
        @objid ("2d4942ce-4793-4f6b-8090-ea6d6dd26d49")
        @Override
        public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
            this.delegate.verify(host, cns, subjectAlts);
        }

    }

}
