package ru.sberbank;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Serializer<T extends Object> {
    public void objectAsJson(T o) throws IllegalAccessException {
        if (o.getClass().isPrimitive() || o instanceof String || o instanceof Number || o instanceof Character) {
            System.out.print("\t" + '"');
            System.out.print(o);
            System.out.println('"' + ",");
        } else {
            ObjectStructureGetter getter = new ObjectStructureGetter();
            Map<String, Field> fields = new HashMap();
            fields = getter.GetObjFields(o);
            for (Object obj : fields.keySet()) {
                System.out.print('"' + obj.toString() + '"' + ": ");
               // System.out.println(fields.get(obj).get(o));
                if (fields.get(obj).get(o).getClass().isArray()) {
                   // System.out.println(obj);
                    ArraySerializer serializer = new ArraySerializer();
                    serializer.SerializeArray(((Object[]) fields.get(obj).get(o)));
                } else {
                    //System.out.println(obj);
                    Field field = fields.get(obj);
                    System.out.println('"' + field.get(o).toString() + '"' + ",");
                }
            }
        }
    }
}
