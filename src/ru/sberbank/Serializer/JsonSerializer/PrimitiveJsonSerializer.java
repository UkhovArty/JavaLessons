package ru.sberbank.Serializer.JsonSerializer;

public class PrimitiveJsonSerializer {
    public void serializePrimitive(Object obj, String o) {
        System.out.print('"' + o + '"' + ": ");
        System.out.print('"');
        System.out.print(obj);
        System.out.println('"' + ",");
    }
}