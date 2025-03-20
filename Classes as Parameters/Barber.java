class Barber {
    void provideService(Haircut haircut) {
        if (haircut == null) {
            System.out.println("No haircut available!");
            return;
        }
        haircut.trim();
    }
}