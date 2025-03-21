class Clip {
    Color color;
    
    Clip(Color color) {
        this.color = color;
    }
    
    void hold() {
        System.out.println("Holding with " + color + " clip");
    }
}