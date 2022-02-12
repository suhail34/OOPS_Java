package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndSecondL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = in.nextInt();
        System.out.println();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array : ");
        for (int idx = 0; idx < size; idx++) {
            arr[idx] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int start = 0, end = size, largest = 0;

        for(start = 0; start < end; start++){
            if(arr[start] > arr[largest]){
                largest = start;
            }
        }

        int secondLargest = 0;
        for(start = 0; start < end; start++){
            if(arr[start]!=arr[largest]){
                if(arr[start] > arr[secondLargest]){
                    secondLargest = start;
                }
            }
        }

        System.out.println("First Largest element in the array is  : " + arr[largest]);
        System.out.println("Second Largest element in the array is : " + arr[secondLargest]);
    }
}
