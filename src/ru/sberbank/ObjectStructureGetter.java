package ru.sberbank;

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
        System.out.println("Hey, Boss, I've got a class!");
        Map<String, Field> fields = new HashMap();
            Field[] tmp = clazz.getDeclaredFields();
            for (Field field : tmp) {
                field.setAccessible(true);
                fields.put((String) field.getName(), field);
            }
        return fields;
    }
}
