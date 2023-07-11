import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.printf("%.2f", temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		
	}
}
