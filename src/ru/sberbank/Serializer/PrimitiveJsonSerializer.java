package ru.sberbank.Serializer;

public class PrimitiveJsonSerializer {
    public void serializePrimitive(Object obj) {
        System.out.print('"');
        System.out.print(obj);
        System.out.println('"' + ",");
    }
}
