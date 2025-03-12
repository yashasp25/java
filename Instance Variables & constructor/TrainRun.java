class TrainRun {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.name = "Rajdhani Express";
        train1.number = 12301;
        train1.speed = 130.5;
        train1.isExpress = true;
        System.out.println("Train 1: " + train1.name + ", " + train1.number + ", Speed: " + train1.speed + " km/h, Express: " + train1.isExpress);

        Train train2 = new Train();
        train2.name = "Shatabdi Express";
        train2.number = 12001;
        train2.speed = 150.0;
        train2.isExpress = true;
        System.out.println("Train 2: " + train2.name + ", " + train2.number + ", Speed: " + train2.speed + " km/h, Express: " + train2.isExpress);

        Train train3 = new Train();
        train3.name = "Duronto Express";
        train3.number = 12201;
        train3.speed = 140.8;
        train3.isExpress = true;
        System.out.println("Train 3: " + train3.name + ", " + train3.number + ", Speed: " + train3.speed + " km/h, Express: " + train3.isExpress);

        Train train4 = new Train();
        train4.name = "Garib Rath";
        train4.number = 12909;
        train4.speed = 110.6;
        train4.isExpress = false;
        System.out.println("Train 4: " + train4.name + ", " + train4.number + ", Speed: " + train4.speed + " km/h, Express: " + train4.isExpress);

        Train train5 = new Train();
        train5.name = "Vande Bharat Express";
        train5.number = 22439;
        train5.speed = 160.2;
        train5.isExpress = true;
        System.out.println("Train 5: " + train5.name + ", " + train5.number + ", Speed: " + train5.speed + " km/h, Express: " + train5.isExpress);

        Train train6 = new Train();
        train6.name = "Maharaja Express";
        train6.number = 11111;
        train6.speed = 80.4;
        train6.isExpress = false;
        System.out.println("Train 6: " + train6.name + ", " + train6.number + ", Speed: " + train6.speed + " km/h, Express: " + train6.isExpress);

        Train train7 = new Train();
        train7.name = "Tejas Express";
        train7.number = 22119;
        train7.speed = 150.7;
        train7.isExpress = true;
        System.out.println("Train 7: " + train7.name + ", " + train7.number + ", Speed: " + train7.speed + " km/h, Express: " + train7.isExpress);

        Train train8 = new Train();
        train8.name = "Intercity Express";
        train8.number = 14301;
        train8.speed = 100.5;
        train8.isExpress = false;
        System.out.println("Train 8: " + train8.name + ", " + train8.number + ", Speed: " + train8.speed + " km/h, Express: " + train8.isExpress);

        Train train9 = new Train();
        train9.name = "Howrah Mail";
        train9.number = 12321;
        train9.speed = 95.3;
        train9.isExpress = false;
        System.out.println("Train 9: " + train9.name + ", " + train9.number + ", Speed: " + train9.speed + " km/h, Express: " + train9.isExpress);

        Train train10 = new Train();
        train10.name = "Deccan Queen";
        train10.number = 12123;
        train10.speed = 120.9;
        train10.isExpress = true;
        System.out.println("Train 10: " + train10.name + ", " + train10.number + ", Speed: " + train10.speed + " km/h, Express: " + train10.isExpress);
    }
}