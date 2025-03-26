package com.xworkz.internal;

public class BankAccount {

    public String name = "Yashas P";
    private Long account_number = 78146164699L;
    private String password = "asdf1234";

    public Long getAccount_number(){
        return account_number;
    }

    void setAccount_number(Long account_number){
        this.account_number=account_number;
    }

    String getpassword(){
        return password;
    }

    void setPassword(String password){
        this.password=password;
    }
}
