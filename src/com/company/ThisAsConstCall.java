package com.company;

class Args{
    ThisAsConstCall obj;
    Args(ThisAsConstCall obj){
        this.obj = obj;
    }
    void display(){
        System.out.println(obj.data);
    }
}

public class ThisAsConstCall {
    int data = 7;
    ThisAsConstCall(){
        Args aa = new Args(this);
        aa.display();
    }
    public static void main(String[] args) {
        ThisAsConstCall cc = new ThisAsConstCall();
    }
}
