package com.company;

class BankProcess{
    int amount;
    int deposit;
    int withdraw;
    String name;
    int account;

    BankProcess(){
        System.out.println("BankProcess Constructor");
    }

    void insertAccount(int amt, String nm, int acc){
        amount = amt;
        name = nm;
        account = acc;
    }

    void depositAmount(int d){
        amount = amount + d;
        deposit = d;
        System.out.println("Amount deposited is : "+deposit);
    }

    void withdrawAmount(int w){
        withdraw = w;
//        amount = amt;
        if(amount < withdraw){
            System.out.println("Insufficient Amount");
        }else{
            amount=amount-withdraw;
            System.out.println("Amount withdrawn is : "+withdraw);
        }
    }

    void checkBalance(){
        System.out.println("Balance is : "+amount);
    }
    void displayAccount(){
        System.out.println(name+" Rs "+amount+" AccNo "+account);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankProcess b1 = new BankProcess();
        b1.insertAccount(50000,"Suhail",802745684);
        b1.displayAccount();
        b1.depositAmount(4000);
        b1.checkBalance();
        b1.withdrawAmount(40000);
        b1.checkBalance();

        System.out.println();

        BankProcess b2 = new BankProcess();
        b2.insertAccount(60000,"Talha",908473955);
        b2.displayAccount();
        b2.depositAmount(30000);
        b2.checkBalance();
        b2.withdrawAmount(80000);
        b2.checkBalance();
    }
}
