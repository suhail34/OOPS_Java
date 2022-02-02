package com.company.strings;

public class StringBuff {
    public static void main(String[] args) {
//        StringBuffer are mutable
        StringBuffer str = new StringBuffer("Hello");
        StringBuffer str1 = new StringBuffer(2);
        StringBuffer str2 = new StringBuffer();
//        StringBuffer class initial capacity is 16 and when strings content increases from 16 then the capacity gets
//        increased by (oldcapacity*2) + 2

        System.out.println(str.capacity());
        System.out.println(str.append(" World"));
        System.out.println(str.length());
        System.out.println(str.capacity());
        str.ensureCapacity(10);
        System.out.println(str.capacity());
        System.out.println(str.insert(2,"ll"));
        System.out.println(str.replace(2,4,""));
        System.out.println(str.delete(5,11));
        System.out.println("Mirror image : "+str.reverse());
    }
}
