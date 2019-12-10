package ru.sberbank.Serializer.JsonSerializer;

import ru.sberbank.Serializer.Serializer;

public class JsonSerializer<T extends Object> extends Serializer {

    @Override
    public void serializeNestedObject(Object obj, String o) throws IllegalAccessException {
        JsonNestedObjSerializer jsonNestedObjSerializer = new JsonNestedObjSerializer();
        jsonNestedObjSerializer.serializeNestedObj(obj, o);
    }

    @Override
    public void serializeArray(Object[] o, String obj) throws IllegalAccessException {
        JsonArraySerializer jsonArraySerializer = new JsonArraySerializer();
        jsonArraySerializer.SerializeArray(o, obj);
    }

    @Override
    public void serializePrimitive(Object obj, String o) {
        PrimitiveJsonSerializer primitiveJsonSerializer = new PrimitiveJsonSerializer();
        primitiveJsonSerializer.serializePrimitive(obj, o);
    }
}
