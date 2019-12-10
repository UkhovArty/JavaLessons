package ru.sberbank.Serializer.XMLSerializer;

public class XMLPrimitiveSerializer {
    public void serializePrimitive(Object obj, String o) {
        System.out.print('<' + o + '>' + obj);
        System.out.println("</" + o + '>');
    }
}
