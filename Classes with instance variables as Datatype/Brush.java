class Brush {
    Color color;
    
    Brush(Color color) {
        this.color = color;
    }
    
    void clean() {
        System.out.println("Cleaning with " + color + " brush");
    }
    
    void scrub() {
        System.out.println("Scrubbing with " + color + " brush");
    }
}
