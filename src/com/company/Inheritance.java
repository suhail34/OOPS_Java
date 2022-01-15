package com.company;

import java.util.Scanner;

class Inherits{
    static int data = 7;

    void display(){
        System.out.println("Prints : "+data);
    }
}

public class Inheritance extends Inherits{
    double val = 5.6d;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Inheritance ii = new Inheritance();
        Inherits.data = in.nextInt();
        ii.display();
        System.out.println(ii.val);
    }
}
