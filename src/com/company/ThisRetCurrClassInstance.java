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
        r.msg();
    }
}
