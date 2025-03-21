class Brush {
    Color color;
    
    Brush(Color color) {
        this.color = color;
    }
    
    void clean() {
        if (this != null) {
            System.out.println("Cleaning with " + color + " brush");
        }
    }
    
    void scrub() {
        if (this != null) {
            System.out.println("Scrubbing with " + color + " brush");
        }
    }
}