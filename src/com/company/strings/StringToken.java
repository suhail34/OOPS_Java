package com.company.strings;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
//        StringTokenizer has three constructors
//        If return value is true, delimiter characters are considered to be tokens.
//        If it is false, delimiter characters serve to separate tokens.
        StringTokenizer st0 = new StringTokenizer("Suhail Khan");
        StringTokenizer st1 = new StringTokenizer("Suhail Khan is currently learning java"," ",true);
        StringTokenizer st = new StringTokenizer("Hello ,Welcome to intellij",",");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
//            System.out.println(st1.nextElement());
        }
    }
}
