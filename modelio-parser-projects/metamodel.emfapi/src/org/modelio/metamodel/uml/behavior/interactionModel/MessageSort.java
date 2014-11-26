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
                                    

package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.Enumerator;

@objid ("009676e8-91e0-1f74-804b-001ec947cd2a")
public enum MessageSort implements Enumerator {
    SYNCCALL (0, "SyncCall", "SyncCall"),
    ASYNCCALL (1, "ASyncCall", "ASyncCall"),
    ASYNCSIGNAL (2, "ASyncSignal", "ASyncSignal"),
    DESTROYMESSAGE (3, "DestroyMessage", "DestroyMessage"),
    CREATEMESSAGE (4, "CreateMessage", "CreateMessage"),
    RETURNMESSAGE (5, "ReturnMessage", "ReturnMessage");

public static final int SYNCCALL_VALUE = 0;
public static final int ASYNCCALL_VALUE = 1;
public static final int ASYNCSIGNAL_VALUE = 2;
public static final int DESTROYMESSAGE_VALUE = 3;
public static final int CREATEMESSAGE_VALUE = 4;
public static final int RETURNMESSAGE_VALUE = 5;
private static final MessageSort[] VALUES_ARRAY =
new MessageSort[] {
SYNCCALL,
ASYNCCALL,
ASYNCSIGNAL,
DESTROYMESSAGE,
CREATEMESSAGE,
RETURNMESSAGE,
};
public static final List<MessageSort> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
public static MessageSort get(String literal) {
  for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    MessageSort result = VALUES_ARRAY[i];
    if (result.toString().equals(literal)) {
       return result;
    }
  }
  return null;
}
public static MessageSort getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
MessageSort result = VALUES_ARRAY[i];
if (result.getName().equals(name)) {
return result;
}
}
return null;
}
public static MessageSort get(int value) {
    switch (value) {
        case SYNCCALL_VALUE: return SYNCCALL;
        case ASYNCCALL_VALUE: return ASYNCCALL;
        case ASYNCSIGNAL_VALUE: return ASYNCSIGNAL;
        case DESTROYMESSAGE_VALUE: return DESTROYMESSAGE;
        case CREATEMESSAGE_VALUE: return CREATEMESSAGE;
        case RETURNMESSAGE_VALUE: return RETURNMESSAGE;
    }
    return null;
}
private final int value;
private final String name;
private final String literal;
private MessageSort(int value, String name, String literal) {
  this.value = value;
  this.name = name;
  this.literal = literal;
}
public int getValue() {
   return value;
}
 public String getName() {
    return name;
}
public String getLiteral() {
  return literal;
}
 @Override
public String toString() {
   return literal;
}
}
