package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Account;

public class Bank {
    Account account;

    public Bank(Account account){
        this.account=account;
        System.out.println("run account in bank");
    }

    public void execute(){
        if(this.account!=null){
            this.account.deposit();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
