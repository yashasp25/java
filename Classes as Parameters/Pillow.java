class Pillow {
    void useCushion(Cushion cushion) {
        if (cushion == null) {
            System.out.println("No cushion available!");
            return;
        }
        cushion.rest();
    }
}