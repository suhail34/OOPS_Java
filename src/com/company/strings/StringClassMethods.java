package com.company.strings;

public class StringClassMethods {
    public static void main(String[] args) {
        String str = new String(new char[]{' ','H','E','L','L','O',' ','W','O','R','L','D',' '});
        String str1 = str.intern();
        String str2 = str.intern();
        char[] ch = {'r','y','h','t'};
        String str3 = String.valueOf(ch);

        System.out.println(str.substring(0,6).toLowerCase());
        System.out.println(str.substring(0,7).trim());
        System.out.println(str.trim());
        System.out.println(str.startsWith(" "));
        System.out.println(str.toLowerCase().endsWith("d "));
        System.out.println(str.length());
        System.out.println(str1);
        System.out.println(str1==str2);
        System.out.println(str3);
        System.out.println(str.replace(" HELLO", "BYE"));
    }
}
