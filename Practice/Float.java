class Float {
    public static void main(String[] args) {
        float temperatureMorning = 18.5f;
        float temperatureAfternoon = 29.3f;
        float temperatureEvening = 24.8f;
        float temperatureNight = 20.2f;
        float humidity = 75.6f;

        System.out.println("Initial Weather Data: Morning Temp = " + temperatureMorning + ", Afternoon Temp = " + temperatureAfternoon + ", Evening Temp = " + temperatureEvening + ", Night Temp = " + temperatureNight + ", Humidity = " + humidity);

        temperatureMorning = 19.2f;
        temperatureAfternoon = 31.5f;
        temperatureEvening = 26.0f;
        temperatureNight = 21.3f;
        humidity = 72.1f;

        System.out.println("Updated Weather Data: Morning Temp = " + temperatureMorning + ", Afternoon Temp = " + temperatureAfternoon + ", Evening Temp = " + temperatureEvening + ", Night Temp = " + temperatureNight + ", Humidity = " + humidity);
    }
}
