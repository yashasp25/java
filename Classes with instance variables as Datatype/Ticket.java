class Ticket {
    TicketType type;
    double cost;
    
    Ticket(TicketType type, double cost) {
        this.type = type;
        this.cost = cost;
    }
    
    void buy() {
        System.out.println("Ticket bought: " + type + " for $" + cost);
    }
    
    void sell() {
        System.out.println("Ticket sold: " + type + " for $" + cost);
    }
}
