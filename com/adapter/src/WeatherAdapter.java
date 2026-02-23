package com.adapter.src;

public class WeatherAdapter implements ModernWeatherProvider {

    private LegacyWeatherSystem legacySystem;

    public WeatherAdapter(LegacyWeatherSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public WeatherData getWeather(String city) {

        String report = legacySystem.fetchWeatherReport(city);

        // Parse string
        String[] parts = report.split(";");
        double tempF = Double.parseDouble(parts[0].split(":")[1]);
        double windMph = Double.parseDouble(parts[1].split(":")[1]);
        double humidityDecimal = Double.parseDouble(parts[2].split(":")[1]);

        // Convert units
        double tempC = (tempF - 32) * 5 / 9;
        double windKmH = windMph * 1.60934;
        double humidityPercent = humidityDecimal * 100;

        return new WeatherData(tempC, windKmH, humidityPercent);
    }
}
