package ru.sberbank;

import javax.print.attribute.standard.Fidelity;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ArraySerializer<T extends Object> {
    public void SerializeArray(T[] o) throws IllegalAccessException {
        System.out.println("{");
        for (T t : o) {
            if (t.getClass().isPrimitive() || t.getClass().equals(String.class) || t.getClass().getSuperclass().equals(Number.class) || t.getClass().equals(Character.class)) {
                System.out.print("\t");
                PrimitiveSerializer primitiveSerializer = new PrimitiveSerializer();
                primitiveSerializer.serializePrimitive(t);
            } else {
                Class clazz = t.getClass();
                for (Field field : clazz.getDeclaredFields()) {
                    field.setAccessible(true);
                    System.out.print("\t");
                    System.out.print('"' + field.getName() + '"' + ": ");
                    Serializer serializer = new Serializer();
                    serializer.objectAsJson(field.get(t));
                }
            }
        }
        System.out.println("},");
    }
}

