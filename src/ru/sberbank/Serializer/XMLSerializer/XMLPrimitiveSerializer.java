package ru.sberbank.Serializer.XMLSerializer;

public class XMLPrimitiveSerializer {
    public void serializePrimitive(Object obj, String o) {
        if (o.equals("")) {
            System.out.print(obj);
        } else {
            System.out.print('<' + o + '>' + obj);
            System.out.println("</" + o + '>');
        }
    }
}
