package com.company.strings;

class Overriding{
    String name;
    int rollno;
    int id;

    Overriding(int id, String name, int rollno){
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Overriding{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", id=" + id +
                '}';
    }
}

public class OverRideToStringMethod {
    public static void main(String[] args) {
        Overriding o1 = new Overriding(101, "Suhail Khan", 7119012);
        System.out.println(o1);
    }
}
