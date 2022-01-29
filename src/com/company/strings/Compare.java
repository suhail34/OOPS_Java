package com.company.strings;

public class Compare {
    public static void main(String[] args) {
        String str1 = new String(new char[]{'H','E','L','L','O'});
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str3==str4);
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2==str3);
    }
}
