package com.xworkz.interfacelast.implement;


import com.xworkz.interfacelast.interfacecs.Account;

public class AccountImpl implements Account {
    @Override
    public void deposit() {
        System.out.println("run deposit in implements");
    }
}
