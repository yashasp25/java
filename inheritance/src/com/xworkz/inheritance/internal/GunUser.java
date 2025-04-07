package com.xworkz.inheritance.internal;

public class GunUser {

    public GunUser(Gun gun) {
        gun.shoot();
        gun.inspect();
        gun.aim();
        gun.reload();
        gun.switchMode();

    if (gun instanceof M416) {
        M416 m416 = (M416) gun;
        m416.m416Fire();
    }
        if (gun instanceof AWM) {
        AWM awm = (AWM) gun;
        awm.awmFire();
    }
        if (gun instanceof AKM) {
        AKM akm = (AKM) gun;
        akm.akmFire();
    }
        if (gun instanceof UMP45) {
        UMP45 ump45 = (UMP45) gun;
        ump45.ump45Fire();
    }
        if (gun instanceof M24) {
        M24 m24 = (M24) gun;
        m24.m24Fire();
    }
        if (gun instanceof SCARL) {
        SCARL scarl = (SCARL) gun;
        scarl.scarlFire();
    }
        if (gun instanceof Mini14) {
        Mini14 mini14 = (Mini14) gun;
        mini14.mini14Fire();
    }
        if (gun instanceof DP28) {
        DP28 dp28 = (DP28) gun;
        dp28.dp28Fire();
    }
        if (gun instanceof Kar98k) {
        Kar98k kar98k = (Kar98k) gun;
        kar98k.kar98kFire();
    }
        if (gun instanceof Groza) {
        Groza groza = (Groza) gun;
        groza.grozaFire();
    }
        if (gun instanceof Famas) {
        Famas famas = (Famas) gun;
        famas.famasFire();
    }
        if (gun instanceof QBZ) {
        QBZ qbz = (QBZ) gun;
        qbz.qbzFire();
    }
        if (gun instanceof MK14) {
        MK14 mk14 = (MK14) gun;
        mk14.mk14Fire();
    }
        if (gun instanceof MP5K) {
        MP5K mp5k = (MP5K) gun;
        mp5k.mp5kFire();
    }
        if (gun instanceof Vector) {
        Vector vector = (Vector) gun;
        vector.vectorFire();
    }
        if (gun instanceof S12K) {
        S12K s12k = (S12K) gun;
        s12k.s12kFire();
    }
        if (gun instanceof S1897) {
        S1897 s1897 = (S1897) gun;
        s1897.s1897Fire();
    }
        if (gun instanceof S686) {
        S686 s686 = (S686) gun;
        s686.s686Fire();
    }

        if (gun instanceof P90) {
        P90 p90 = (P90) gun;
        p90.p90Fire();
    }
        if (gun instanceof M249) {
        M249 m249 = (M249) gun;
        m249.m249Fire();
    }
        if (gun instanceof AUG) {
        AUG aug = (AUG) gun;
        aug.augFire();
    }
        if (gun instanceof G36C) {
        G36C g36c = (G36C) gun;
        g36c.g36cFire();
    }
        if (gun instanceof Mk47) {
        Mk47 mk47 = (Mk47) gun;
        mk47.mk47Fire();
    }
        if (gun instanceof Bizon) {
        Bizon bizon = (Bizon) gun;
        bizon.bizonFire();
    }
}
}
