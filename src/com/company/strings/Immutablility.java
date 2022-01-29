package com.company.strings;

public class Immutablility {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("World");  //this will create a value in string constant pool "World" but will not refer it
        s = s.concat(" World"); // Now it will concatenate " World" with "Hello" means "Hello World" and will refer to it

        System.out.println(s);
//        s.charAt(1) = 'u';  since, java string are immutable
    }
}
