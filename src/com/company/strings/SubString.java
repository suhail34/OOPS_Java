package com.company.strings;

public class SubString {
    public static void main(String[] args) {
        String str = new String("Hello, My name is Suhail Khan");
//        startIndex is inclusive and endIndex is exclusive
        System.out.println(str.substring(7));
        System.out.println(str.substring(18, 29) + "'s roll no is 7119012");
    }
}
