package com.company;

class Copy{
    int first;
    int second;

    Copy(int a, int b){
        first = a;
        second = b;
        System.out.println(first+"+"+second+"="+(first+second));
    }

    Copy(Copy c){
        second = c.first;
        first = c.second;
        System.out.println(first+"-"+second+"="+(first-second));
    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        Copy c1 = new Copy(5, 3);
        Copy c2 = new Copy(c1);
    }
}
