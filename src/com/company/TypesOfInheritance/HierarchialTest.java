package com.company.TypesOfInheritance;

class Parents{
    static int count = 0;

    Parents(int age, String name){
        count+=1;
        System.out.println("Child has name "+name+" age "+age);
    }

    static void displayNoOfChild(){
        System.out.println("No Of Child : "+count);
    }
}

class Son extends Parents{

    Son(int age, String name){
        super(age, name);
        System.out.println("I'am the first child");
    }
}

class Daughter extends Parents{
    Daughter(int age, String name){
        super(age, name);
        System.out.println("I'am the second child");
    }
}

public class HierarchialTest {
    public static void main(String[] args) {
        Daughter d1 = new Daughter(25, "XyZ");
        Son s1 = new Son(20, "Khan Suhail");
        Parents.displayNoOfChild();
    }
}
