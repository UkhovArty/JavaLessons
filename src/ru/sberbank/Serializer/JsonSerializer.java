package ru.sberbank.Serializer;

import java.util.HashMap;
import java.util.Map;

public class JsonSerializer<T extends Object> extends Serializer{

    @Override
    void serializeNestedObject(Object obj, String o) throws IllegalAccessException {
        JsonNestedObjSerializer jsonNestedObjSerializer = new JsonNestedObjSerializer();
        jsonNestedObjSerializer.serializeNestedObj(obj, o);
    }

    @Override
    void serializeArray(Object[] o, String obj) throws IllegalAccessException {
        JsonArraySerializer jsonArraySerializer = new JsonArraySerializer();
        jsonArraySerializer.SerializeArray(o, obj);
    }

    @Override
    void serializePrimitive(Object obj, String o) {
        PrimitiveJsonSerializer primitiveJsonSerializer = new PrimitiveJsonSerializer();
        primitiveJsonSerializer.serializePrimitive(obj, o);
    }
}
