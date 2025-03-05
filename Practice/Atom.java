class Atom {
    static void create() { 
        System.out.println("Atom: create"); 
    }
    static void split() { 
        System.out.println("Atom: split"); 
    }
    static void fuse() { 
        System.out.println("Atom: fuse"); 
    }
    static void charge() { 
        System.out.println("Atom: charge"); 
    }
    static void observe() { 
        System.out.println("Atom: observe"); 
    }

    public static void main(String[] v) {
        create();
        split();
        fuse();
        charge();
        observe();
		Globe.equator();
		Globe.rotate();
		Supra.accelerate();
		Supra.turn();
    }
}
