class RCB {
    static void selectPlayers() { 
        System.out.println("RCB: selectPlayers"); 
    }
    static void team() { 
        System.out.println("RCB: team"); 
    }
    static void matches() { 
        System.out.println("RCB: matches"); 
    }
    static void performance() { 
        System.out.println("RCB: performance"); 
    }
    static void celebrateWin() { 
        System.out.println("RCB: celebrateWin"); 
    }

    public static void main(String[] v) {
        selectPlayers();
        team();
        matches();
        performance();
        celebrateWin();
		IPLCup.designCup();
        IPLCup.manufactureCup();
        IPLCup.engraveWinner();
        
		ICC.match();
        ICC.overs();
        ICC.field();
        
    }
}
