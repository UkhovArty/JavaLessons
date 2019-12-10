package ru.sberbank.Serializer.XMLSerializer;

import ru.sberbank.Serializer.Serializer;

public class XMLSerializer extends Serializer {

    @Override
    public void serializeNestedObject(Object obj, String o) throws IllegalAccessException {
        XMLNestedObjectSerializer xmlNestedObjectSerializer = new XMLNestedObjectSerializer();
        xmlNestedObjectSerializer.serializeNestedObj(obj,o);
    }

    @Override
    public void serializeArray(Object[] o, String obj) throws IllegalAccessException {
        XMLArraySerializer xmlArraySerializer = new XMLArraySerializer();
        xmlArraySerializer.SerializeArray(o, obj);
    }

    @Override
    public void serializePrimitive(Object obj, String o) {
        XMLPrimitiveSerializer xmlPrimitiveSerializer = new XMLPrimitiveSerializer();
        xmlPrimitiveSerializer.serializePrimitive(obj, o);
    }
}
