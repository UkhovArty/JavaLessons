package ru.sberbank.Serializer.JsonSerializer;

public class PrimitiveJsonSerializer {
    public void serializePrimitive(Object obj, String o) {
        if (o.equals("")) {
            System.out.print('"');
            System.out.print(obj);
            System.out.println('"' + ",");
        } else {
            System.out.print('"' + o + '"' + ": ");
            System.out.print('"');
            System.out.print(obj);
            System.out.println('"' + ",");
        }
    }
}
