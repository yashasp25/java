package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Server;

public class Datacenter {
    Server server;

    public Datacenter(Server server){
        this.server=server;
        System.out.println("run server in data center");
    }

    public void execute(){
        if(this.server!=null){
            this.server.host();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
