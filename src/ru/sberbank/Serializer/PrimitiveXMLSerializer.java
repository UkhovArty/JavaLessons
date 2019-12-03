package ru.sberbank.Serializer;

public class PrimitiveXMLSerializer {

    public void serializeInXML(Object obj) {
        System.out.print("<" + obj.getClass().getCanonicalName() + ">");
        System.out.print(obj.getClass());
    }
}
