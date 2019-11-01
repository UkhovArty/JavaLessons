package ru.sberbank;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class NestedObjSerializer {
    public void serializeNestedObj(Object obj) throws IllegalAccessException {
        System.out.println("{");
        Class clazz = obj.getClass();
        Map<String, Object> fields = new HashMap();
        for (Field field: clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.print("\t");
            System.out.print(field.getName());
            Object object = field.get(obj);
            Serializer serializer = new Serializer();
            serializer.objectAsJson(object);
        }
        System.out.println("},");
    }
}