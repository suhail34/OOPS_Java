package com.company;

import java.util.Scanner;

//class NoOfNotes{
//    void calculate(float amount , float denomination){
//        int num = (int)(amount/denomination);
//        System.out.println("Number Of Notes : "+num);
//    }
//}

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter the amount: ");
        int amount = in.nextInt();

        System.out.println("Enter Denomination as 100 or 200 or 500 or 2000 : ");
        int denomination = in.nextInt();

        switch (denomination){
            case 100 : num = (amount/denomination);
                        break;
            case 200 : num = (amount/denomination);
                        break;
            case 500 : num = (amount/denomination);
                        break;
            case 2000 : num = (amount/denomination);
        }

        System.out.println("No Of Notes : "+num);

//        NoOfNotes n1 = new NoOfNotes();
//        n1.calculate(amount,denomination);
    }
}


