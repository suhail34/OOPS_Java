package com.company;

class Operate{

}

class Check extends Operate{
    static void downCast(Operate o1){
        if(o1 instanceof Operate){
            Check c1 = (Check) o1;
            System.out.println("DownCasting Done");
        }
    }
}

public class InstanceOp {
    public static void main(String[] args) {
        Operate o1 = new Check();
        Check.downCast(o1);
    }
}
