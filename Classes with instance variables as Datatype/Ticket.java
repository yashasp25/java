class Ticket {
    TicketType type;
    double cost;
    
    Ticket(TicketType type, double cost) {
        this.type = type;
        this.cost = cost;
    }
    
    void buy() {
        if (this != null) {
            System.out.println("Ticket bought: " + type + " for $" + cost);
        }
    }
    
    void sell() {
        if (this != null) {
            System.out.println("Ticket sold: " + type + " for $" + cost);
        }
    }
}
