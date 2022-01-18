package com.company.TypesOfPolymorphism;

class Book{
    void bookDisplay(){
        System.out.println("This is Book shelve");
    }
}

class DBMS extends Book{
    void bookDisplay(){
        System.out.println("This is DBMS Book");
    }
}

class OS extends Book{
    void bookDisplay(){
        System.out.println("This is OS Book");
    }
}

public class RunTime {
    public static void main(String[] args) {
        Book b1 = new DBMS();
        b1.bookDisplay();
        Book b2 = new OS();
        b2.bookDisplay();
    }
}
