public class Main {
    public static void main(String[] args) {
        Clip[] clips = {
            new Clip(Color.RED),
            new Clip(Color.BLUE),
            new Clip(Color.GREEN),
            new Clip(Color.RED),
            new Clip(Color.BLUE)
        };
        
        Pushpa pushpa = new Pushpa();
        Brush brush = new Brush(Color.GREEN);
        Ticket ticket = new Ticket(TicketType.VIP, 100.0);
        Cricket cricket = new Cricket(ticket);
        Virat virat = new Virat(brush, clips, ticket, cricket);
        
        pushpa.useClip(clips);
        
        System.out.println("\nVirat Playing:");
        virat.play();
        
        System.out.println("\nVirat Cleaning:");
        virat.clean();
        
        System.out.println("\nVirat Relaxing:");
        virat.relax();
    }
}
