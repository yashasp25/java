class LampRun {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.type = "Table Lamp";
        lamp1.wattage = 40;
        lamp1.height = 30.5;
        lamp1.isLED = true;
        System.out.println("Lamp 1: " + lamp1.type + ", " + lamp1.wattage + "W, height: " + lamp1.height + "cm, LED: " + lamp1.isLED);

        Lamp lamp2 = new Lamp();
        lamp2.type = "Floor Lamp";
        lamp2.wattage = 60;
        lamp2.height = 150.0;
        lamp2.isLED = false;
        System.out.println("Lamp 2: " + lamp2.type + ", " + lamp2.wattage + "W, height: " + lamp2.height + "cm, LED: " + lamp2.isLED);

        Lamp lamp3 = new Lamp();
        lamp3.type = "Wall Lamp";
        lamp3.wattage = 30;
        lamp3.height = 25.0;
        lamp3.isLED = true;
        System.out.println("Lamp 3: " + lamp3.type + ", " + lamp3.wattage + "W, height: " + lamp3.height + "cm, LED: " + lamp3.isLED);

        Lamp lamp4 = new Lamp();
        lamp4.type = "Desk Lamp";
        lamp4.wattage = 20;
        lamp4.height = 40.0;
        lamp4.isLED = true;
        System.out.println("Lamp 4: " + lamp4.type + ", " + lamp4.wattage + "W, height: " + lamp4.height + "cm, LED: " + lamp4.isLED);

        Lamp lamp5 = new Lamp();
        lamp5.type = "Chandelier";
        lamp5.wattage = 100;
        lamp5.height = 200.0;
        lamp5.isLED = false;
        System.out.println("Lamp 5: " + lamp5.type + ", " + lamp5.wattage + "W, height: " + lamp5.height + "cm, LED: " + lamp5.isLED);

        Lamp lamp6 = new Lamp();
        lamp6.type = "Garden Lamp";
        lamp6.wattage = 50;
        lamp6.height = 120.5;
        lamp6.isLED = true;
        System.out.println("Lamp 6: " + lamp6.type + ", " + lamp6.wattage + "W, height: " + lamp6.height + "cm, LED: " + lamp6.isLED);

        Lamp lamp7 = new Lamp();
        lamp7.type = "Emergency Lamp";
        lamp7.wattage = 15;
        lamp7.height = 35.0;
        lamp7.isLED = true;
        System.out.println("Lamp 7: " + lamp7.type + ", " + lamp7.wattage + "W, height: " + lamp7.height + "cm, LED: " + lamp7.isLED);

        Lamp lamp8 = new Lamp();
        lamp8.type = "Pendant Lamp";
        lamp8.wattage = 70;
        lamp8.height = 180.0;
        lamp8.isLED = false;
        System.out.println("Lamp 8: " + lamp8.type + ", " + lamp8.wattage + "W, height: " + lamp8.height + "cm, LED: " + lamp8.isLED);

        Lamp lamp9 = new Lamp();
        lamp9.type = "Spotlight";
        lamp9.wattage = 90;
        lamp9.height = 20.0;
        lamp9.isLED = true;
        System.out.println("Lamp 9: " + lamp9.type + ", " + lamp9.wattage + "W, height: " + lamp9.height + "cm, LED: " + lamp9.isLED);

        Lamp lamp10 = new Lamp();
        lamp10.type = "Candle Lamp";
        lamp10.wattage = 10;
        lamp10.height = 15.0;
        lamp10.isLED = false;
        System.out.println("Lamp 10: " + lamp10.type + ", " + lamp10.wattage + "W, height: " + lamp10.height + "cm, LED: " + lamp10.isLED);
    }
}