package com.company.strings;

import java.util.StringJoiner;

public class Concate {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
        String strFormat = String.format("%s%s",str1,str2);
        System.out.println(strFormat);
        String strJoin = String.join(",",str1,str2);
        System.out.println(strJoin);

        StringBuilder str3 = new StringBuilder("Suhail ");
        StringBuilder str4 = new StringBuilder("Khan");
        String con = String.valueOf(str3.append(str4));
//        System.out.println(str3.append(str4));
//        System.out.println(str3.append(" "+str4)+" has "+str3.append(50)+" rupees"); prints Suhail Khan Khan50 has Suhail Khan Khan50 rupees
        System.out.println(con+" has "+ str4.append("'s "+50)+" rupees");
        System.out.println(str3+" "+str4);

        StringJoiner str5 = new StringJoiner(", ","prefix "," suffix");
        str5.add("Hey");
        str5.add("Hii");
        System.out.println(str5);
    }
}
