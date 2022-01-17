package com.company;

class Sum{
    Sum(int num1){
        System.out.println("The Number is : "+(num1));
    }

    static void sum(int num1, int num2){
        System.out.println("Addition is : "+(num1 + num2));
    }

}

class FirstNum extends Sum{
    static int num1;
    FirstNum(int num1){
        super(num1);
        this.num1 = num1;
    }
    {
//        this.num1 = num1;
        System.out.println("Let's get the second number");
    }
}

class SecondNum extends Sum{
    static int num2;
    SecondNum(int num2){
        super(num2);
        this.num2 = num2;
    }
    {
//        this.num2 = num2;
        System.out.println("Let's add this two number");
    }
}

public class InstInitialBlock {
    public static void main(String[] args) {
        FirstNum f1 = new FirstNum(2);
        SecondNum s1 = new SecondNum(3);
        Sum.sum(f1.num1, s1.num2);
    }
}
