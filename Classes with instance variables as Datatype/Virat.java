class Virat {
    Brush brush;
    Clip[] clips;
    Ticket ticket;
    Cricket cricket;
    
    Virat(Brush brush, Clip[] clips, Ticket ticket, Cricket cricket) {
        this.brush = brush;
        this.clips = clips;
        this.ticket = ticket;
        this.cricket = cricket;
    }
    
    void play() {
        if (cricket != null) {
            cricket.watch();
            cricket.profit();
        }
    }
    
    void clean() {
        if (brush != null) {
            brush.clean();
            brush.scrub();
        }
    }
    
    void relax() {
        if (ticket != null) {
            ticket.buy();
            ticket.sell();
        }
    }
}
