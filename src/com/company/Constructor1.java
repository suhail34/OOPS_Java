package com.company;

class Call{
    int _1st;
    static int _2nd;
    static int counter = 0;
//  if we provide explicitly a return type to the constructor the compiler will treat it as a method
    Call(){
        counter  = 0;
    }

    Call(int a, int b){
        this();//it will Call the constructor with no parameter
        _1st = a;// and initialize counter to 0 every time an object is created
        _2nd = b;
        counter++;
        System.out.println("Counter is : "+ counter);
    }

    static void change(){
        counter = 4;
        _2nd = 22;
    }

    int sum(){
        return _1st + _2nd;
    }
    static {
        System.out.println("hello");
    }
//    static block gets executed first at the time of class Loading
}

public class Constructor1 {
    public static void main(String[] args) {
        Call c1 = new Call(5, 6);
        c1.change();
        Call c2 = new Call(7, 3);

        Call c3 = new Call(8, 4);
//        System.out.println(Call.counter);
//        c2.change();
//        c1.counter = 4;

        System.out.println(c1._1st+"+"+c1._2nd+"="+c1.sum()+" "+c2._1st+"+"+c2._2nd+"="+c2.sum());
    }
}
