package com.company;

class Return{
    Return getInst(){
        return this;
    }
    void msg(){
        System.out.println(getInst());
    }
}

public class ThisRetCurrClassInstance {
    public static void main(String[] args) {
        Return r = new Return();
        System.out.println(r);
        r.msg();                //this returns the same reference ID as the above print statement
    }
}
