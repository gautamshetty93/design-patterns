package com.adapter.src;

public class DashboardApp {
    public static void main(String[] args) {

        LegacyWeatherSystem legacy = new LegacyWeatherSystem();

        ModernWeatherProvider provider = new WeatherAdapter(legacy);

        WeatherData data = provider.getWeather("Mumbai");

        System.out.println("Temperature (C): " + data.temperature);
        System.out.println("Wind (km/h): " + data.windSpeed);
        System.out.println("Humidity (%): " + data.humidity);
    }
}
