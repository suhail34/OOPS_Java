package com.company;

abstract class Animal {
    abstract void typeOfFood();
}

class Deer extends Animal {
    void typeOfFood() {
        System.out.println("Doesn't eats Flesh");
    }
}

class Lion extends Animal {
    void typeOfFood() {
        System.out.println("Eat's Flesh");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Animal a1 = new Lion();
        Animal a2 = new Deer();
        a1.typeOfFood();
        a2.typeOfFood();
    }
}
