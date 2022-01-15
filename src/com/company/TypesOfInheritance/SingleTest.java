package com.company.TypesOfInheritance;

class Human{
    static String needs = "Food Shelter and Clothes";

    void displayInfo(int age, String fullName){
        System.out.println("Full Name : "+fullName+"Age : "+age);
        System.out.println("Basic Needs are :  "+needs);
    }
}

class Suhail extends Human{
    int age;
    String fullName;

    Suhail(int age, String fullName){
        this.age = age;
        this.fullName = fullName;
        displayInfo(age,fullName);
    }
}

public class SingleTest {
    public static void main(String[] args) {
        Suhail s1 = new Suhail(20, "Suhail Khan");
    }
}
