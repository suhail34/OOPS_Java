package com.company.strings;

public class Concate {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        StringBuilder str3 = new StringBuilder("Suhail ");
        StringBuilder str4 = new StringBuilder("Khan");
        String con = String.valueOf(str3.append(str4));
//        System.out.println(str3.append(str4));
//        System.out.println(str3.append(" "+str4)+" has "+str3.append(50)+" rupees"); prints Suhail Khan Khan50 has Suhail Khan Khan50 rupees
        System.out.println(con+" has "+ str4.append("'s "+50)+" rupees");
        System.out.println(str3+" "+str4);
    }
}
