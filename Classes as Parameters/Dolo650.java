class Dolo650 {
    void takeMedicine(Tablet tablet) {
        if (tablet == null) {
            System.out.println("No tablet available!");
            return;
        }
        tablet.consume();
    }
}