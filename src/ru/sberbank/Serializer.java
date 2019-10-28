package ru.sberbank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Serializer<T extends Object> {
    public void objectAsJson(T o) throws IllegalAccessException {
        ObjectStructureGetter getter = new ObjectStructureGetter();
        Map fields = new HashMap();
        fields = getter.GetObjFields(o);
        for (Object obj : fields.values()) {
            switch (obj.getClass().toString()) {
                case "Collection":
                    CollectionSerializer serializer = new CollectionSerializer();
                    serializer.SerializeCollection((Collection) obj);
                    break;
                case "ArrayList":
                    ArrayListSerializer serializer1 = new ArrayListSerializer();
                    serializer1.serializeArrayList((ArrayList) obj);
                    break;
            }
        }
    }
}
