package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Tree;

public class Forest {
    Tree tree;

    public Forest(Tree tree){
        this.tree=tree;
        System.out.println("run tree in forest");
    }

    public void execute(){
        if(this.tree!=null){
            this.tree.grow();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
