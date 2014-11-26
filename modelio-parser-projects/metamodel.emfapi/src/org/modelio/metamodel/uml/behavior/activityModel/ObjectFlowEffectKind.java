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
                                    

package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.Enumerator;

@objid ("007f30c8-91e0-1f74-804b-001ec947cd2a")
public enum ObjectFlowEffectKind implements Enumerator {
    CREATEFLOW (0, "CreateFlow", "CreateFlow"),
    READFLOW (1, "ReadFlow", "ReadFlow"),
    UPDATEFLOW (2, "Updateflow", "Updateflow"),
    DELETEFLOW (3, "DeleteFlow", "DeleteFlow"),
    EXCEPTIONFLOW (4, "ExceptionFlow", "ExceptionFlow");

public static final int CREATEFLOW_VALUE = 0;
public static final int READFLOW_VALUE = 1;
public static final int UPDATEFLOW_VALUE = 2;
public static final int DELETEFLOW_VALUE = 3;
public static final int EXCEPTIONFLOW_VALUE = 4;
private static final ObjectFlowEffectKind[] VALUES_ARRAY =
new ObjectFlowEffectKind[] {
CREATEFLOW,
READFLOW,
UPDATEFLOW,
DELETEFLOW,
EXCEPTIONFLOW,
};
public static final List<ObjectFlowEffectKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
public static ObjectFlowEffectKind get(String literal) {
  for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    ObjectFlowEffectKind result = VALUES_ARRAY[i];
    if (result.toString().equals(literal)) {
       return result;
    }
  }
  return null;
}
public static ObjectFlowEffectKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
ObjectFlowEffectKind result = VALUES_ARRAY[i];
if (result.getName().equals(name)) {
return result;
}
}
return null;
}
public static ObjectFlowEffectKind get(int value) {
    switch (value) {
        case CREATEFLOW_VALUE: return CREATEFLOW;
        case READFLOW_VALUE: return READFLOW;
        case UPDATEFLOW_VALUE: return UPDATEFLOW;
        case DELETEFLOW_VALUE: return DELETEFLOW;
        case EXCEPTIONFLOW_VALUE: return EXCEPTIONFLOW;
    }
    return null;
}
private final int value;
private final String name;
private final String literal;
private ObjectFlowEffectKind(int value, String name, String literal) {
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
