import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9 / 5 ) + 32;
		double kelvin = celsius + 273.15;
		
		System.out.println("Temperatura em Celsius: " + celsius);
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		System.out.println("Temperatura em Kelvin: " + kelvin);
		
		sc.close();		
	}
}