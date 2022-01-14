package com.company;
import com.company.Student;

public class PredictAge {
    public static void main(String[] args) {
        DateOfBirth d1 = new DateOfBirth(),d2 = new DateOfBirth();
        Student s1 = new Student(),s2 = new Student();
        s1.insertRecord(6119003, "Zaki Kazi");
        s2.insertRecord(7119012, "Suhail Khan");
        d1.insert(2001);
        d2.insert(1997);
        s1.displayDetails();
        System.out.print("The age is : ");
        d1.displayAge();
        s2.displayDetails();
        System.out.print("The age is : ");
        d2.displayAge();
    }
}

class DateOfBirth{
    static int currYear = 2022;
    int birthYear;

    void insert(int d){
//        currYear = c;
        birthYear = d;
    }

    void displayAge(){
        System.out.println(currYear-birthYear+" ");
    }
}
