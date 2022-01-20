package com.company.TypesOfInheritance;

interface Living{
    void create();
}

interface NonLiving{
    void exist();
}

class Person implements Living,NonLiving{
    public void create(){
        System.out.println("Created");
    }

    public void exist(){
        System.out.println("No sense");
    }
}

public class MultipleTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.create();
        p1.exist();
    }
}
