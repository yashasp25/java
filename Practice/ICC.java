class ICC {
    static void match() { 
        System.out.println("ICC: match"); 
    }
    static void overs() { 
        System.out.println("ICC: overs"); 
    }
    static void field() { 
        System.out.println("ICC: field"); 
    }
    static void players() { 
        System.out.println("ICC: players"); 
    }
    static void announce() { 
        System.out.println("ICC: announce"); 
    }

    public static void main(String[] v) {
        match();
        overs();
        field();
        players();
        announce();
		RCB.selectPlayers();
        RCB.team();
        RCB.matches();
        IPLCup.shinny();
        IPLCup.teamName();
    }
}