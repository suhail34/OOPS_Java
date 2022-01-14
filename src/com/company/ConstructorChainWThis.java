package com.company;

class Chain{
    int num1;
    int num2;
    int num3;

    Chain(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    Chain(int num1, int num2, int num3){
        this(num1,num2);
        this.num3 = num3;
    }

    void avg(){
        if(num3==0){
            System.out.println((num1+num2)/2);
        }else {
            System.out.println((num1+num2+num3)/3);
        }
    }
}

public class ConstructorChainWThis {
    public static void main(String[] args) {
        Chain c1 = new Chain(4, 6);
        Chain c2 = new Chain(11, 8, 8);

        c1.avg();
        c2.avg();
    }
}
