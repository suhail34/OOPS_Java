package com.company.accessModifiers;

class A{
    private int datamember1 = 10;
    private int datamember2 = 20;

    void sum(A obj1){
        obj1.datamember2 = 5;//member having private access can be accessed within the class
        System.out.println("Sum Of the datamember is : "+(datamember1+datamember2));
    }
}

public class PrivateTest {
    public static void main(String[] args) {
        A obj1 = new A();
//        obj1.datamember1 = 9;   datamember1 & datamember2 can't be accessed because it has private access
        obj1.sum(obj1);
    }
}
