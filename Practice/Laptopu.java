class Laptopu {
    static void powerOn() { 
        System.out.println("Laptop: powerOn"); 
    }
    static void powerOff() { 
        System.out.println("Laptop: powerOff"); 
    }
    static void software() { 
        System.out.println("Laptop: software"); 
    }
    static void closeSoftware() { 
        System.out.println("Laptop: closeSoftware"); 
    }
    static void connectWiFi() { 
        System.out.println("Laptop: connectWiFi"); 
    }

    public static void main(String[] v){
        powerOn();
        powerOff();
        software();
        closeSoftware();
        connectWiFi();
		MNCCompany.hire();
        MNCCompany.fire();
        MNCCompany.conductMeeting();
        MNCCompany.salary();
        MNCCompany.bonus();
    }
}
