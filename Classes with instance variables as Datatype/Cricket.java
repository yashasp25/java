class Cricket {
    Ticket ticket;
    
    Cricket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    void watch() {
        if (ticket != null) {
            ticket.buy();
            System.out.println("Watching Cricket Match...");
        }
    }
    
    void profit() {
        if (ticket != null) {
            ticket.sell();
        }
    }
}