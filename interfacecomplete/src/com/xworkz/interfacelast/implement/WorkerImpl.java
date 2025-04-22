package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Worker;

public class WorkerImpl implements Worker {
    @Override
    public void build() {
        System.out.println("run build in implements");
    }
}
