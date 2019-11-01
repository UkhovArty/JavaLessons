package ru.sberbank;

public class PrimitiveSerializer {
    public void serializePrimitive(Object obj) {
        System.out.print('"');
        System.out.print(obj);
        System.out.println('"' + ",");
    }
}
