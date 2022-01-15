package com.company.TypesOfInheritance;

class HighLvl{
    void _high(){
        System.out.println("You have Reached the end");
    }
}

class Lvl2 extends HighLvl{
    void _2nd(){
        System.out.println("You have Reached Level 2");
    }
}

class Lvl1 extends Lvl2{
    void _1st(){
        System.out.println("You have Reached Level 1");
    }
}

public class MultilevelTest {
    public static void main(String[] args) {
        Lvl1 l1 = new Lvl1();
        l1._1st();
        l1._2nd();
        l1._high();
    }
}
