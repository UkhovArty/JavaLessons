package ru.sberbank.Serializer.XMLSerializer;

import ru.sberbank.Serializer.JsonSerializer.JsonSerializer;
import ru.sberbank.Serializer.ObjectStructureGetter;
import ru.sberbank.Serializer.Serializer;

import java.util.HashMap;
import java.util.Map;

public class DecoratorForXMLSerializer extends XMLSerializer {
    public void serializeXMLObject(Object obj) throws IllegalAccessException {
        ObjectStructureGetter objectStructureGetter = new ObjectStructureGetter();
        Map fields = new HashMap();
        fields = objectStructureGetter.GetObjFields(obj);
        Serializer serializer = new JsonSerializer<>();
        for (Object o : fields.keySet()) {
            System.out.print("\t");
            serializer.serializeObject(fields.get(o));
        }
    }
}
