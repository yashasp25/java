class Cricket {
    Ticket ticket;
    
    Cricket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    void watch() {
        ticket.buy();
        System.out.println("Watching Cricket Match...");
    }
    
    void profit() {
        ticket.sell();
    }
}