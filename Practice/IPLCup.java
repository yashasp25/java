class IPLCup {
    static void designCup() { 
        System.out.println("IPLCup: designCup"); 
    }
    static void manufactureCup() { 
        System.out.println("IPLCup: manufactureCup"); 
    }
    static void engraveWinner() { 
        System.out.println("IPLCup: engraveWinner"); 
    }
    static void shinny() { 
        System.out.println("IPLCup: shinny"); 
    }
    static void teamName() { 
        System.out.println("IPLCup: teamName"); 
    }

    public static void main(String[] v) {
        designCup();
        manufactureCup();
        engraveWinner();
        shinny();
        teamName();
        RCB.performance();
        RCB.celebrateWin();
		RCB.team();
        ICC.players();
        ICC.announce();
    }
}
