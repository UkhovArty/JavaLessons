package ru.sberbank.Serializer.XMLSerializer;

import ru.sberbank.Serializer.Serializer;

public class XMLArraySerializer <T extends Object> {
    public void SerializeArray(T[] o, String obj) throws IllegalAccessException {
        System.out.println('<' + obj + '>');
        int i = 1;
        for (T t : o) {
            System.out.print("\t" + '<' + obj + i + ">");
            Serializer serializer = new XMLSerializer();
            serializer.serializeObject(t);
            System.out.println("</" + obj + i + ">");
            i++;
        }
        System.out.println("</" + obj + '>');
    }
}
