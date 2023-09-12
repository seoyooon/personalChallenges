package Q230830.P6;
import java.util.*;
import java.io.*;

/**
 * "온도 변환"을 수행하는 추상 클래스 TemperatureConverter를 정의하세요.
 * TemperatureConverter 클래스는 온도 값을 입력받아 섭씨(Celsius)를 화씨(Fahrenheit)로 변환하거나,
 * 화씨를 섭씨로 변환하여 출력하는 추상 메서드 convert()를 가져야 합니다.
 * CelsiusToFahrenheit 클래스와 FahrenheitToCelsius 클래스를 구현하여 온도 변환을 수행하는 convert() 메서드를 구현하세요.
 * Fahrenheit = Celsius * 9/5 + 32
 * Celsius = (Fahrenheit - 32) * 5/9
 * */

public class Main {
    public static void main(String[] args) {
        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit(25);
        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius(68);

        double fahrenheit = celsiusToFahrenheit.convert();
        double celsius = fahrenheitToCelsius.convert();

        System.out.println("25 Celsius is " + fahrenheit + " Fahrenheit");
        System.out.println("68 Fahrenheit is " + celsius + " Celsius");
    }
}
