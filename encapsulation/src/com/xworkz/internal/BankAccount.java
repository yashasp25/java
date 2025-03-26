package com.xworkz.internal;

public class BankAccount {

    public String name ;

    private Long account_number;
    private String password;

    public Long getAccount_number(){
        System.out.println(this.account_number);
        return account_number;
    }

    void setAccount_number(Long account_number){
        this.account_number=account_number;
    }

    String getpassword(){
        System.out.println(this.password);
        return password;
    }

    void setPassword(String password){
        this.password=password;
    }
}
