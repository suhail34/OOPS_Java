package com.company;

import javax.lang.model.element.Name;

class Employee{
    private int emp_id;
    private String name;
    private int acct_no;

    int getEmp_id(){
        return emp_id;
    }
    void setEmp_id(int emp_id){
        this.emp_id = emp_id;
    }
    int getAcct_no(){
        return acct_no;
    }
    void setAcct_no(int acct_no){
        this.acct_no = acct_no;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmp_id(102);
        emp1.setAcct_no(101154798);
        emp1.setName("Suhail Khan");

        Employee emp2 = new Employee();
        emp2.setEmp_id(105);
        emp2.setAcct_no(204994504);
        emp2.setName("XYZ");

        System.out.println(emp1.getEmp_id()+" "+emp1.getName()+" "+emp1.getName());
        System.out.println(emp2.getEmp_id()+" "+emp2.getName()+" "+emp2.getAcct_no());
    }
}
