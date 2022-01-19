package com.company;

interface Implement{
    int sum(int nums1, int nums2);
    int subtract(int nums1, int nums2);
}

class Operation implements Implement{
    public int sum(int nums1, int nums2){
        return nums1+nums2;
    }

    public int subtract(int nums1, int nums2){
        return nums1-nums2;
    }
}

public class Interface {
    public static void main(String[] args) {
        Operation o1 = new Operation();
        System.out.println(o1.sum(5, 4));
        System.out.println(o1.subtract(9, 2));
    }
}
