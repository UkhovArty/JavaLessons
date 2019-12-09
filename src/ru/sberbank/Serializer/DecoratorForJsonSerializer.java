package ru.sberbank.Serializer;

import java.util.HashMap;
import java.util.Map;

public class DecoratorForJsonSerializer extends JsonSerializer {
    public void serializeJsonObject(Object obj) throws IllegalAccessException {
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
