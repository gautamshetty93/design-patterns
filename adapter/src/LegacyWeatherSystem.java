package adapter.src;

public class LegacyWeatherSystem {
    // Temperature in Fahrenheit
// Wind speed in miles per hour
// Humidity as decimal (0.75 instead of 75%)
    public String fetchWeatherReport(String city) {
        return "Temp:95;Wind:10;Humidity:0.60";
    }
}
