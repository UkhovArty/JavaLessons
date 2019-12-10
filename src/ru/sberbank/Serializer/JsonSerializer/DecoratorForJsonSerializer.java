package ru.sberbank.Serializer.JsonSerializer;

import ru.sberbank.Serializer.ObjectStructureGetter;
import ru.sberbank.Serializer.Serializer;

import java.util.HashMap;
import java.util.Map;

public class DecoratorForJsonSerializer extends JsonSerializer {
    public void serializeJsonObject(Object obj) throws IllegalAccessException {
        ObjectStructureGetter objectStructureGetter = new ObjectStructureGetter();
        Map fields = new HashMap();
        fields = objectStructureGetter.GetObjFields(obj);
        Serializer serializer = new JsonSerializer<>();
        for (Object o : fields.keySet()) {
            System.out.print("\t" + '"' + o + '"' + ':' + ' ');
            serializer.serializeObject(fields.get(o));
        }
    }
}
