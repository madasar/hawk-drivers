/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;

/**
 * Message class for api plugin.
 */
@objid ("3f338c4a-911c-11e0-9de7-002564c97630")
public final class Messages {
    @objid ("83c5374d-911d-11e0-9de7-002564c97630")
    private static final ResourceBundle bundle = ResourceBundle.getBundle("api");

    @objid ("5bfc4bdb-911c-11e0-9de7-002564c97630")
    private Messages() {
        // Nothing to do.
    }

    /**
     * Retrieves a message from the resource file and inserts the parameters in it.
     * @param key the key of the string to retrieve.
     * @param strings the strings to insert into the message
     * @return the formatted message.
     */
    @objid ("83c55e5d-911d-11e0-9de7-002564c97630")
    public static String getMessage(final String key, final String... strings) {
        String pattern;
        
        try {
            pattern = bundle.getString(key);
        } catch (MissingResourceException e) {
            Modelio.getInstance().getLogService().warning(null, e.getMessage());
            pattern = "!" + key + "!";
        }
        return MessageFormat.format(pattern, (Object[]) strings);
    }

}
