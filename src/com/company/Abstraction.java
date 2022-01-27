package com.company;

interface write{
    void hello();
}

abstract class Animal implements write{
    abstract void typeOfFood();
}

class Deer extends Animal {
    void typeOfFood() {
        System.out.println("Doesn't eats Flesh");
    }
    public void hello(){
        System.out.println("Bye");
    }
}

class Lion extends Animal {
    void typeOfFood() {
        System.out.println("Eat's Flesh");
    }
    public void hello(){
        System.out.println("Hello");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Animal a1 = new Lion();
        Animal a2 = new Deer();
        a1.typeOfFood();
        a1.hello();
        a2.typeOfFood();
        a2.hello();
    }
}
