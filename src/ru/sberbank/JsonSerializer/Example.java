package ru.sberbank.JsonSerializer;

public class Example<T extends Object> {
    public final int t = 0;
    public String poop = "KAKASHKA";
    private double rudePi = 3;
    public String[] str = new String[2];
    public SomeClass someClass;
    public SomeClass[] someClasses = new SomeClass[2];
    public Example (SomeClass someClass) {
        this.str[0] = "Hey, I've just met u";
        this.str[1] = "And this is crazy";
        this.someClass = someClass;
        this.someClasses[0] = someClass;
        this.someClasses[1] = someClass;
    }

}
