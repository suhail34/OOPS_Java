package com.company.TypesOfPolymorphism;

class Operation{

    static int multiply(int num1, int num2){
        return num1*num2;
    }

    static double multiply(double num1, double num2){
        return num1*num2;
    }

}

public class CompileTime {
    public static void main(String[] args) {
        System.out.println(Operation.multiply(4, 6));
        System.out.println(Operation.multiply(5,4.7));
    }
}
