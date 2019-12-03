package ru.sberbank.JsonSerializer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SerializationUtils {
    public void serializeObjectUtils(Object obj) throws IllegalAccessException {
        Class clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.print("\t");
            System.out.print('"' + field.getName() + '"' + ": ");
            Object object = field.get(obj);
            JsonSerializer serializer = new JsonSerializer();
            serializer.objectAsJson(object);
        }
        System.out.println("},");
    }
}
