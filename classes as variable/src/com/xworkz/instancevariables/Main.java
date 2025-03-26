package com.xworkz.instancevariables;

public class Main {
    public static void main(String[] args) {
        Jail jail = new Jail("Alcatraz", "USA", "John Doe", 500);
        Satellite satellite = new Satellite(SatelliteType.COMMUNICATION, 500000.0, 1000.5, 200.0);
        IdCard idCard = new IdCard("Plastic", new String[]{"Red", "Blue"}, 5.5, "ABC Corp");
        Alien alien = new Alien("James", "2024-03-25", "Tall, green, glowing eyes");
        Camera camera = new Camera("Canon", 1500.0, CameraType.DSLR, "WiFi");

        Camera[] cameras = {
                new Camera("Nikon", 1200.0, CameraType.MIRRORLESS, "Bluetooth"),
                new Camera("Sony", 2000.0, CameraType.ACTION, "WiFi")
        };

        processCameras(cameras);
    }

    public static void processCameras(Camera[] cameras) {
        for (Camera cam : cameras) {
            System.out.println("Camera Brand: " + cam.getBrand() + ", Price: " + cam.getPrice());
        }
    }
}
