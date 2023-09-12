package Q230830.P6;

public class FahrenheitToCelsius extends TemperatureConverter {
    public double celsius;
    public FahrenheitToCelsius(double celsius) {
        this.celsius = celsius;
    }
    @Override
    public double convert() { return ((celsius - 32) * 5 / 9 ); }
}
