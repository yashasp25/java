class Supra {
    static void startEngine() { 
        System.out.println("Supra: startEngine"); 
    }
    static void accelerate() { 
        System.out.println("Supra: accelerate"); 
    }
    static void brake() { 
        System.out.println("Supra: brake"); 
    }
    static void drift() { 
        System.out.println("Supra: drift"); 
    }
    static void turn() { 
        System.out.println("Supra: turn"); 
    }

    public static void main(String[] v) {
        startEngine();
        accelerate();
        brake();
        drift();
        turn();
		Globe.equator();
		Globe.rotate();
		Laptopu.powerOn();
		Atom.fuse();
        Atom.charge();
    }
}
