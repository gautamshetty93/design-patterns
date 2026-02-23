package adapter.src;

public class WeatherData {
    double temperature;   // Celsius
    double windSpeed;     // km/h
    double humidity;      // percentage

    public WeatherData(double temperature, double windSpeed, double humidity) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
    }
}
