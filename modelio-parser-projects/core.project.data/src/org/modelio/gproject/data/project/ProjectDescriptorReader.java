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
                                    

package org.modelio.gproject.data.project;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import net.sf.practicalxml.DomUtil;
import net.sf.practicalxml.ParseUtil;
import net.sf.practicalxml.XmlException;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.auth.NoneAuthData;
import org.modelio.vbasic.auth.UserPasswordAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.version.Version;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/**
 * Read a project descriptor from an XML file.
 */
@objid ("cf0fcec4-99bb-11e1-ac83-001ec947ccaf")
public class ProjectDescriptorReader {
    @objid ("0625bb57-3019-11e2-8f81-001ec947ccaf")
    private DefinitionScope forcedScope;

    /**
     * Default scope if no scope specified in file nor forces scope.
     */
    @objid ("c87e0610-5a62-4a82-836e-8bd9c452c058")
    private DefinitionScope defaultScope = null;

    @objid ("eedc2206-9a71-11e1-ac83-001ec947ccaf")
    private ProjectDescriptor projectDesc;

    @objid ("2db7d8e7-070d-11e2-9469-001ec947ccaf")
    private Path localProjectPath;

    /**
     * C'tor.
     */
    @objid ("eedc2207-9a71-11e1-ac83-001ec947ccaf")
    public ProjectDescriptorReader() {
    }

    /**
     * Read a project descriptor from an XML input source.
     * @param is the XML input source.
     * @param scope the definition scope of the file.
     * If non <code>null</code> all elements will be assumed of the given scope.
     * If <code>null</code>, the scope will be read from the file.
     * @return the read descriptor.
     * @throws java.io.IOException in case of failure
     */
    @objid ("cd325526-2eb6-413d-bc3a-53cbf1f3b77e")
    public ProjectDescriptor read(final InputSource is, DefinitionScope scope) throws IOException {
        this.projectDesc = new ProjectDescriptor();
        this.forcedScope = scope;
        
        String confLocation = is.getSystemId();
        try  {
            Document dom = ParseUtil.parse(is);
        
            decodeProject(dom.getDocumentElement());
        
        } catch (XmlException e) {
            throw new IOException("Parsing of '" + confLocation  + "' failed: " + e.getCause().getLocalizedMessage(), e);
        } catch (FileSystemException e) {
            throw new IOException("Parsing of '" + confLocation + "' failed: " + FileUtils.getLocalizedMessage(e), e);
        } catch (IOException e) {
            throw new IOException("Parsing of '" + confLocation + "' failed: " + e.getLocalizedMessage(), e);
        }
        return this.projectDesc;
    }

    /**
     * Read a project descriptor from an XML file.
     * <p>
     * Looks for an {@link DescriptorWriter#CONF_ENCRYPT_FILE} file in the same directory
     * to determine encryption of the file.
     * @param confFile The project.conf file path
     * <code>null</code> means the project is in the conf file directory.
     * @param scope the definition scope of the file.
     * If non <code>null</code> all elements will be assumed of the given scope.
     * If <code>null</code>, the scope will be read from the file.
     * @return the read descriptor.
     * @throws java.io.IOException in case of failure
     */
    @objid ("eedc2209-9a71-11e1-ac83-001ec947ccaf")
    public ProjectDescriptor read(final Path confFile, DefinitionScope scope) throws IOException {
        this.localProjectPath = confFile.getParent();
        
        // Look for encryption file
        String encryption = "";
        Path encryptionFile = this.localProjectPath.resolve(DescriptorWriter.CONF_ENCRYPT_FILE);
        if (Files.isRegularFile(encryptionFile))
            encryption = new String(Files.readAllBytes(encryptionFile));
        
        // Setup input stream and run parsing
        try (InputStream fis = Files.newInputStream(confFile);
                InputStream is = getDecryptedInputStream(fis, encryption)) {
            InputSource xmlSource = new InputSource(is);
            return read (xmlSource, scope);
        }
    }

    /**
     * Set the scope to set to read descriptor elements if no scope is specified either
     * in the source nor in the call to {@link #read(InputSource, DefinitionScope)}.
     * @param defaultScope the default scope.
     * @return <code>this</code> for convenience.
     */
    @objid ("c4a2ae95-e13d-47fb-bde8-ff8e4697fa05")
    public ProjectDescriptorReader setDefaultScope(DefinitionScope defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    /**
     * Convert the project DOM tree to the current version.
     * @param p the DOM element
     * @param lversion the saved version
     * @throws java.io.IOException in case of failure
     */
    @objid ("eedc2211-9a71-11e1-ac83-001ec947ccaf")
    @SuppressWarnings("static-method")
    private void convertProject(final Element p, final long lversion) throws IOException {
        if (lversion == 1) {
            p.setAttribute("type", "LOCAL");
        } else 
        throw new IOException("Project descriptor version " + lversion + " not supported by current version "
                + ProjectDescriptor.serialVersionUID);
    }

    @objid ("a78bd7c4-abbc-11e1-8392-001ec947ccaf")
    private FragmentDescriptor decodeFragment(final Element domEl) throws IOException {
        FragmentDescriptor fd = new FragmentDescriptor();
        
        fd.setId(domEl.getAttribute("id"));
        fd.setType(decodeFragmentType(domEl));
        fd.setProperties(decodeProperties(domEl));
        
        String stringUri = domEl.getAttribute("uri");
        if (stringUri != null && !stringUri.isEmpty()) try {
            
            fd.setUri(new URI(stringUri));
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
        
        fd.setAuthDescriptor(decodeAuth(domEl));
        fd.setScope(decodeScope(domEl, fd.getUri() == null? null : this.defaultScope));
        return fd;
    }

    @objid ("eedc220e-9a71-11e1-ac83-001ec947ccaf")
    private void decodeProject(final Element p) throws IOException {
        // Check version
        String version = p.getAttribute("version");
        long lversion = Long.parseLong(version);
        if (lversion > ProjectDescriptor.serialVersionUID) {
            throw new IOException("File version " + version + " newer than current version " + ProjectDescriptor.serialVersionUID);
        } else if (lversion != ProjectDescriptor.serialVersionUID) {
            convertProject(p, lversion);
        }
        
        // Read name
        this.projectDesc.setName(p.getAttribute("name"));
        
        // Read project type
        this.projectDesc.setType(p.getAttribute("type"));
        
        // Read project path if specified
        String projPath = p.getAttribute("path"); 
        if (projPath!=null && !projPath.isEmpty())
            this.projectDesc.setPath(Paths.get(projPath));
        else
            this.projectDesc.setPath(this.localProjectPath);
        
        // Read project remote path if specified
        String remotePath = p.getAttribute("remote"); 
        if (remotePath!=null && !remotePath.isEmpty())
            this.projectDesc.setRemoteLocation(remotePath);
        
        // Read fragments
        for (Element f : DomUtil.getChildren(p, "fragment")) {
            this.projectDesc.getFragments().add(decodeFragment(f));
        }
        
        // Read modules
        for (Element f : DomUtil.getChildren(p, "module")) {
            this.projectDesc.getModules().add(decodeModule(f));
        }
        
        this.projectDesc.setAuthDescriptor(decodeAuth(p));
        this.projectDesc.setProperties(decodeProperties(p));
    }

    /**
     * Reads the &lt;properties> tag and returns its content.
     * @param domNode the &lt;properties> DOM element.
     * @return the read properties
     * @throws java.io.IOException in case of parse error
     */
    @objid ("f47686b2-aa5a-11e1-8392-001ec947ccaf")
    private GProperties decodeProperties(final Element domNode) throws IOException {
        GProperties ret = new GProperties();
        for (Element g : DomUtil.getChildren(domNode, "properties")) {
            for (Element p : DomUtil.getChildren(g, "prop")) {
                ret.setProperty(p.getAttribute("name"), p.getAttribute("value"), decodeScope(p, this.defaultScope));
            }
        }
        return ret;
    }

    @objid ("aa7640db-ec75-11e1-912e-001ec947ccaf")
    private ModuleDescriptor decodeModule(final Element domEl) throws IOException {
        ModuleDescriptor md = new ModuleDescriptor();
        
        md.setName(domEl.getAttribute("name"));
        md.setVersion(readVersion(domEl.getAttribute("version")));
        final String activated = domEl.getAttribute("activated");
        md.setActivated(activated.isEmpty() ? true : Boolean.parseBoolean(activated));
        String archiveLoc = domEl.getAttribute("archive");
        try {
            if (archiveLoc != null)
                md.setArchiveLocation(new URI(archiveLoc));
        } catch (URISyntaxException e) {
            // Compatibility with 1 version : the 'archive' is a local path.
            try {
                Path p = Paths.get(archiveLoc);
                md.setArchiveLocation(p.toUri());
            } catch (InvalidPathException e2) {
                e.addSuppressed(e2);
                throw new IOException("'"+md.getName()+"' module has invalid URI: "+e.getLocalizedMessage(), e);
            }
        }
        
        md.setScope(decodeScope(domEl, md.getArchiveLocation() == null ? null : this.defaultScope));
        md.setAuthDescriptor(decodeAuth(domEl));
        md.setParameters(decodeProperties(domEl));
        return md;
    }

    @objid ("7296fe4e-c4dd-40ec-97dc-427ba5387f00")
    private DefinitionScope decodeScope(final Element domEl, DefinitionScope defaultValue) throws IOException {
        if (this.forcedScope != null)
            return this.forcedScope;
        
        String ftype = domEl.getAttribute("scope");
        
        if (ftype==null || ftype.isEmpty())
            return defaultValue;
        
        try {
            return DefinitionScope.valueOf(ftype);
        } catch (IllegalArgumentException e) {
            throw new IOException("Invalid fragment scope '" + ftype + "' on fragment '" + domEl.getAttribute("id") + "'", e);
        }
    }

    @objid ("47239769-c825-4761-b026-04701dc416cd")
    private AuthDescriptor decodeAuth(final Element domEl) throws IOException {
        AuthDescriptor authDesc = null;
        
        for (Element authNode : DomUtil.getChildren(domEl, "auth")) {
            if (authDesc != null)
                throw new IOException("More than one <auth> tag on the same node: "+domEl);
            
            authDesc = new AuthDescriptor();
            authDesc.setScope(decodeScope(authNode, this.defaultScope));
            IAuthData authData = createAuthData(authNode.getAttribute("scheme"));
            authDesc.setData(authData);
            if (authData != null) {
                for (Element p : DomUtil.getChildren(authNode, "prop")) {
                    authData.getData().put(p.getAttribute("name"), p.getAttribute("value"));
                }
            }
        }
        
        if (authDesc == null)
            authDesc = new AuthDescriptor(null, DefinitionScope.LOCAL);
        return authDesc;
    }

    /**
     * Get an authentication data from this descriptor.
     * <p>
     * Returns the authentication data given to the constructor
     * @return the authentication data
     */
    @objid ("d1767cec-0e77-4445-bfb3-c6ba579105e8")
    private IAuthData createAuthData(String scheme) {
        if (scheme == null)
            return null;
        
        switch (scheme) {
        case "":
            return null;
            
        case NoneAuthData.AUTH_NONE_SCHEME_ID:
            return new NoneAuthData();
        
        case UserPasswordAuthData.USERPASS_SCHEME_ID:
            return new UserPasswordAuthData();
        
        default:
            return new UnknownAuthData(scheme); 
        }
    }

    @objid ("4364e312-14c6-4774-bdfc-09a1128485ce")
    private InputStream getDecryptedInputStream(final InputStream is, String encryption) throws IOException {
        if (encryption.equals("base64"))
            return new Base64DecoderInputStream(is);
        else if (encryption.isEmpty())
            return is;
        else
            throw new IOException("Unsupported encryption:"+encryption);
    }

    @objid ("1997ee4e-d569-11e1-9f03-001ec947ccaf")
    private static FragmentType decodeFragmentType(final Element domEl) throws IOException {
        String ftype = domEl.getAttribute("type");
        if (ftype==null || ftype.isEmpty())
            return null;
        
        try {
            return FragmentType.valueOf(ftype);
        } catch (IllegalArgumentException e) {
            throw new IOException("Invalid fragment type '" + ftype + "' on fragment '" + domEl.getAttribute("id") + "'", e);
        }
    }

    @objid ("0083bdba-f36a-11e1-9173-001ec947ccaf")
    private static Version readVersion(final String s) throws IOException {
        if (s==null || s.isEmpty())
            return null;
        
        try {
            return new Version(s);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /**
     * Filter input stream that decodes an input stream coded in Base64.
     * <p>
     * The whole input stream is read at opening.
     */
    @objid ("4f4ac999-b6ee-434e-a026-ef9bfd943d0a")
    private static class Base64DecoderInputStream extends FilterInputStream {
        @objid ("a54fc81a-c0d5-4975-8568-20f7785fb508")
        protected Base64DecoderInputStream(InputStream in) throws IOException {
            super(init(in));
        }

        @objid ("e4a89a72-c128-424e-bbe4-f2797f4efefa")
        private static ByteArrayInputStream init(InputStream in) throws IOException {
            InputStreamReader reader = new InputStreamReader(in);
            
            StringBuilder ss = new StringBuilder();
            char[] cbuf = new char[2048];
            int read;
            while ((read = reader.read(cbuf)) > 0) {
                ss.append(cbuf, 0, read);
            }
            
            byte[] srcContent = javax.xml.bind.DatatypeConverter.parseBase64Binary(ss.toString());
            return new ByteArrayInputStream(srcContent);
        }

        @objid ("b0448ee0-5052-43d7-8aee-e00b0705d1b9")
        @Override
        public int read() throws IOException {
            return this.in.read();
        }

        @objid ("e485e330-b1de-427c-b271-4b100f550598")
        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            return this.in.read(b, off, len);
        }

        @objid ("391be21b-4464-4745-a4cf-6e4ba50e2bf0")
        @Override
        public int read(byte[] b) throws IOException {
            return this.in.read(b);
        }

    }

}
