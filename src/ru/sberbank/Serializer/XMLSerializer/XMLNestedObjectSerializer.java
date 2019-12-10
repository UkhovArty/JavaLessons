package ru.sberbank.Serializer.XMLSerializer;

import ru.sberbank.Serializer.Serializer;

public class XMLNestedObjectSerializer {
    public void serializeNestedObj(Object obj, String o) throws IllegalAccessException {
        System.out.print('<' + o + '>');
        System.out.println("\t");
        Serializer serializer = new DecoratorForXMLSerializer();
        ((DecoratorForXMLSerializer) serializer).serializeXMLObject(obj);
    }
}
