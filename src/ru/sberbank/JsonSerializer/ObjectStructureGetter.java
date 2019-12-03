package ru.sberbank.JsonSerializer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectStructureGetter<T extends Object> {
    private Object o;

    Map GetObjFields(T o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Map<String, Object> fields = new HashMap();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                fields.put((String) field.getName(), field.get(o));
            }
        return fields;
    }
}
