class Shop {
    void showAd(Display display) {
        if (display == null) {
            System.out.println("No display available!");
            return;
        }
        display.run();
    }
}
