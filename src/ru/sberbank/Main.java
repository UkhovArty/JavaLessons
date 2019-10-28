package ru.sberbank;

public class Main {
    public static void main(String[] args) {
        Example exanple = new Example();
        ObjectStructureGetter structure = new ObjectStructureGetter();
        structure.GetObjFields(exanple);
    }
}
