package com.company;

class MethodArgs{
    void prints(MethodArgs m1){
        System.out.println("Invoked through this");
    }
    void call(){
        prints(this);
    }
}

public class ThisAsMethodArgs {
    public static void main(String[] args) {
        new MethodArgs().call();
    }
}
