package com.company.strings;

public class StringBuild {
    public static void main(String[] args) {
//        use when no thread safety is required
        StringBuilder str = new StringBuilder("Java is a Object Oriented");
        StringBuilder str1 = new StringBuilder(8);
        StringBuilder str2 = new StringBuilder();
        str2.append("yakO");
        str1.append("yakO");
//        The default capacity of the Builder is 16. If the number of character increases from its current capacity,
//        it increases the capacity by (oldcapacity*2)+2.

        System.out.println(str1.equals(str2));
        System.out.println(str.append(" !!!"));
        System.out.println(str.insert(0,"Hello, "));
        System.out.println(str.replace(7,11,"Smalltalk"));
        System.out.println(str.delete(19,21));
//        System.out.println(str.append("yakO"));
//        System.out.println(str.length());
        System.out.println(str2.reverse());
        System.out.println(str.capacity());
        str.ensureCapacity(50); // if minimumCapacity > currentCapacity then capacity increases by
//        (oldCapacity * 2) + 2
        System.out.println(str.capacity());
    }
}
