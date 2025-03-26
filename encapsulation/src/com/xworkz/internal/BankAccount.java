package com.xworkz.internal;

public class BankAccount {

    public String name = "Yashas P";
    Long account_number = 78146164699L;
    private String password = "asdf1234";

    String getpassword(){
        return password;
    }

    void setPassword(String password){
        this.password=password;
    }
}
