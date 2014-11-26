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
                                    

package org.modelio.vcore.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;
import org.modelio.vbasic.log.Log;

@objid ("a307bbeb-0e85-4a66-b4d1-c505dbaf0401")
public class UUBase64Compressor {
    @objid ("b3e9c2b0-6ce2-4772-9312-08f26a50ebc2")
    private static final String CHARSET = "UTF-8";

    @objid ("5c3a47f5-368b-46e9-97d9-9f7b18c9ce80")
    public static String compress(String source) {
        try {
            // long start = System.currentTimeMillis();
            // System.out.printf("compress: initial size: %d\n",
            // source.length());
        
            byte[] sourceBytes = source.getBytes(CHARSET);
        
            // System.out.printf("compress: initial bytes size: %d\n",
            // sourceBytes.length);
        
            Deflater compressor = new Deflater();
            compressor.setInput(sourceBytes);
            compressor.finish();
        
            byte[] output = new byte[sourceBytes.length];
            int compressedDataLength = compressor.deflate(output, 0, output.length, Deflater.FULL_FLUSH);
            output = Arrays.copyOf(output, compressedDataLength);
        
            compressor.end();
        
            String s = Base64.encode(output);
            //long end = System.currentTimeMillis();
            //System.out.printf("compress: ratio %.2f%% %d ms\n", (float) s.length() / source.length() * 100, end - start);
            return s;
        
        } catch (UnsupportedEncodingException e) {
            Log.error(e);
        }
        return null;
    }

    @objid ("d9ae23e9-0283-4f7b-8337-831e5428f71c")
    public static String decompress(String source) {
        try {
            // long start = System.currentTimeMillis();
            byte[] sourceBytes = Base64.decode(source);
            if (sourceBytes.length == 0) {
                return source;
            }
        
            // Decompress the bytes
            Inflater decompressor = new Inflater();
            decompressor.setInput(sourceBytes, 0, sourceBytes.length);
        
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(sourceBytes.length);
            byte[] buffer = new byte[1024];
            while (!decompressor.finished()) {
                int count = decompressor.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            decompressor.end();
        
            outputStream.close();
            byte[] output = outputStream.toByteArray();
        
            // long end = System.currentTimeMillis();
            // System.out.printf("decompress: %d ms\n", end - start);
            // Decode the bytes into a String
            return new String(output, 0, output.length, "UTF-8");
        } catch (DataFormatException | IOException e) {
            Log.error(e);
        }
        return null;
    }

    @objid ("aee22247-4f44-4d92-ad11-6ae1582c596f")
    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\" ?><Object id=\"1\" type=\"org.modelio.diagram.editor.statik.elements.staticdiagram.GmStaticDiagram\"";
        
        for (int i = 0; i < 10; i++) {
            xml = xml + xml;
        }
        String compressed = UUBase64Compressor.compress(xml);
        
        String decompressed = null;
        
        decompressed = UUBase64Compressor.decompress(compressed);
        
        System.out.println(compressed);
        System.out.println(decompressed);
        
        System.out.printf("initial=%d, compressed=%d \n", xml.length(), compressed.length());
        
        System.out.println("result = " + decompressed.compareTo(xml));
    }

}
