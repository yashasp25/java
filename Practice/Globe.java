class Globe {
    static void rotate() { 
        System.out.println("Globe: rotate"); 
    }
    static void continents() { 
        System.out.println("Globe: continents"); 
    }
    static void country() { 
        System.out.println("Globe: country"); 
    }
    static void oceans() { 
        System.out.println("Globe: oceans"); 
    }
    static void equator() { 
        System.out.println("Globe: equator"); 
    }

    public static void main(String[] v) {
        rotate();
        continents();
        country();
        oceans();
        equator();
		Supra.accelerate();
		Supra.turn();
		Atom.observe();
    }
}
