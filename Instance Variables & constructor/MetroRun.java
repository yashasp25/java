class MetroRun {
    public static void main(String[] args) {
        Metro metro1 = new Metro();
        Metro metro2 = new Metro();
        Metro metro3 = new Metro();
        Metro metro4 = new Metro();
        Metro metro5 = new Metro();
        Metro metro6 = new Metro();
        Metro metro7 = new Metro();
        Metro metro8 = new Metro();
        Metro metro9 = new Metro();
        Metro metro10 = new Metro();

        metro1.city = "Delhi";
        metro1.stations = 250;
        metro1.fare = 30.5;
        metro1.isUnderground = true;

        metro2.city = "Mumbai";
        metro2.stations = 200;
        metro2.fare = 25.0;
        metro2.isUnderground = false;

        metro3.city = "Bangalore";
        metro3.stations = 100;
        metro3.fare = 20.0;
        metro3.isUnderground = true;

        metro4.city = "Kolkata";
        metro4.stations = 150;
        metro4.fare = 22.5;
        metro4.isUnderground = true;

        metro5.city = "Chennai";
        metro5.stations = 120;
        metro5.fare = 18.0;
        metro5.isUnderground = false;

        metro6.city = "Hyderabad";
        metro6.stations = 130;
        metro6.fare = 21.0;
        metro6.isUnderground = false;

        metro7.city = "Pune";
        metro7.stations = 90;
        metro7.fare = 15.5;
        metro7.isUnderground = false;

        metro8.city = "Ahmedabad";
        metro8.stations = 80;
        metro8.fare = 17.0;
        metro8.isUnderground = false;

        metro9.city = "Lucknow";
        metro9.stations = 70;
        metro9.fare = 16.0;
        metro9.isUnderground = false;

        metro10.city = "Jaipur";
        metro10.stations = 60;
        metro10.fare = 14.5;
        metro10.isUnderground = false;

        System.out.println("Metro 1: " + metro1.city + ", " + metro1.stations + " stations, fare: " + metro1.fare + ", Underground: " + metro1.isUnderground);
        System.out.println("Metro 2: " + metro2.city + ", " + metro2.stations + " stations, fare: " + metro2.fare + ", Underground: " + metro2.isUnderground);
        System.out.println("Metro 3: " + metro3.city + ", " + metro3.stations + " stations, fare: " + metro3.fare + ", Underground: " + metro3.isUnderground);
        System.out.println("Metro 4: " + metro4.city + ", " + metro4.stations + " stations, fare: " + metro4.fare + ", Underground: " + metro4.isUnderground);
        System.out.println("Metro 5: " + metro5.city + ", " + metro5.stations + " stations, fare: " + metro5.fare + ", Underground: " + metro5.isUnderground);
        System.out.println("Metro 6: " + metro6.city + ", " + metro6.stations + " stations, fare: " + metro6.fare + ", Underground: " + metro6.isUnderground);
        System.out.println("Metro 7: " + metro7.city + ", " + metro7.stations + " stations, fare: " + metro7.fare + ", Underground: " + metro7.isUnderground);
        System.out.println("Metro 8: " + metro8.city + ", " + metro8.stations + " stations, fare: " + metro8.fare + ", Underground: " + metro8.isUnderground);
        System.out.println("Metro 9: " + metro9.city + ", " + metro9.stations + " stations, fare: " + metro9.fare + ", Underground: " + metro9.isUnderground);
        System.out.println("Metro 10: " + metro10.city + ", " + metro10.stations + " stations, fare: " + metro10.fare + ", Underground: " + metro10.isUnderground);
    }
}