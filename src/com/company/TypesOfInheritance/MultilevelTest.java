package com.company.TypesOfInheritance;

class GrandParent{
    static int count = 0;
    void displayInfo(){
        System.out.println("I've "+count+" child");
    }
}

class Parent extends GrandParent{
    Parent(){
        System.out.println("I can call my child's grand Parent");
        GrandParent.count+=1;
    }
}

class Child extends Parent{
    Child(){
        System.out.println("I can call my parent");
        GrandParent.count+=1;
    }
}

public class MultilevelTest {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.displayInfo();
    }
}
