package Q230830.P6;

public class CelsiusToFahrenheit extends TemperatureConverter{
    public double fahrenheit;
    public CelsiusToFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    @Override
    public double convert() { return (fahrenheit * 9 / 5) + 32; }
}
