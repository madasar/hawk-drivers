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
                                    

package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.Enumerator;

@objid ("0086d06c-91e0-1f74-804b-001ec947cd2a")
public enum EventType implements Enumerator {
    SIGNALEVENT (0, "SignalEvent", "SignalEvent"),
    CALLEVENT (1, "CallEvent", "CallEvent"),
    TIMEEVENT (2, "TimeEvent", "TimeEvent"),
    CHANGEEVENT (3, "ChangeEvent", "ChangeEvent");

public static final int SIGNALEVENT_VALUE = 0;
public static final int CALLEVENT_VALUE = 1;
public static final int TIMEEVENT_VALUE = 2;
public static final int CHANGEEVENT_VALUE = 3;
private static final EventType[] VALUES_ARRAY =
new EventType[] {
SIGNALEVENT,
CALLEVENT,
TIMEEVENT,
CHANGEEVENT,
};
public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
public static EventType get(String literal) {
  for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    EventType result = VALUES_ARRAY[i];
    if (result.toString().equals(literal)) {
       return result;
    }
  }
  return null;
}
public static EventType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
EventType result = VALUES_ARRAY[i];
if (result.getName().equals(name)) {
return result;
}
}
return null;
}
public static EventType get(int value) {
    switch (value) {
        case SIGNALEVENT_VALUE: return SIGNALEVENT;
        case CALLEVENT_VALUE: return CALLEVENT;
        case TIMEEVENT_VALUE: return TIMEEVENT;
        case CHANGEEVENT_VALUE: return CHANGEEVENT;
    }
    return null;
}
private final int value;
private final String name;
private final String literal;
private EventType(int value, String name, String literal) {
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
