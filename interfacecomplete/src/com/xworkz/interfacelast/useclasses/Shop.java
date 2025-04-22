package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Product;

public class Shop {
    Product product;

    public Shop(Product product){
        this.product=product;
        System.out.println("run product in shop");
    }

    public void execute(){
        if(this.product!=null){
            this.product.sell();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
