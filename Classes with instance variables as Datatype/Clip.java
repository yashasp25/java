class Clip {
    Color color;
    
    Clip(Color color) {
        this.color = color;
    }
    
    void hold() {
        if (this != null) {
            System.out.println("Holding with " + color + " clip");
        }
    }
}