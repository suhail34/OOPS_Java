package com.company;

public class Student {

    int rollNo;
    String name;

    void insertRecord(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
        displayDetails();//compiler automatically adds this keyword while invoking the method
        //this.displayDetails();
    }

    void displayDetails(){
        System.out.println(name+" is learning IOT Roll No "+rollNo);
    }
}

class Teacher {
    int teachNo = 75;
    String name = "Asadullah Asad";

    public static void main(String[] args){
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        t2.teachNo = 80;
        t2.name = "Saiqa Khan";
        Student s1 = new Student();
        Student s2 = new Student();
//        s1.name = "Zaki Kazi";
//        s1.rollNo = 6119003;
//        s2.name = "Talha Ansari";
//        s2.rollNo = 5119001;
        s1.insertRecord(7119012,"Suhail Khan");
        System.out.println(t1.name+" is teaching cass to "+t1.teachNo+" students");

        s2.insertRecord(3119012, "Burhanuddin Fatehi");
        System.out.println(t2.name+" is teaching DSIP to "+t2.teachNo+" students");


//        System.out.println(s1.name+" is learing IOT Roll No "+s1.rollNo);
//        s1.displayDetails();
//        System.out.println(t1.name+" is teaching cass to "+t1.teachNo+" students");
//        System.out.println(s2.name+" is learning DSIP Roll No "+s2.rollNo);
//        s2.displayDetails();
//        System.out.println(t2.name+" is teaching DSIP to "+t2.teachNo+" students");
    }
}
