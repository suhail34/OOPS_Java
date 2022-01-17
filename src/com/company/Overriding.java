package com.company;

class Ride{

    void display(){
        System.out.println("I'am the parent class");
    }

}

public class Overriding extends Ride {

    void display(){
        System.out.println("I'am the child class");
    }

    public static void main(String[] args) {
        Ride r1 = new Overriding();
        r1.display();
    }

}
