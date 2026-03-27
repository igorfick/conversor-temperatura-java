import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 3) {
			
			System.out.println("\n=== Conversor de Temperatura ===");
			System.out.println("1 - Celsius para Fahrenheit");
			System.out.println("2 - Celsius para Kelvin");
			System.out.println("3 - Sair");
			System.out.print("Escolha uma opcao: ");
			
			opcao = sc.nextInt();
			
			switch (opcao) {
				
			case 1:
				System.out.print("Digite a temperatura em Celsius: ");
				double c1 = sc.nextDouble();
				
				double f = TemperatureConverter.converterParaFahrenheit(c1);
				System.out.println("Resultado " + f + " Fahrenheit");
				break;
				
			case 2:
				System.out.print("Digite a temperatura em Celsius: ");
				double c2 = sc.nextDouble();
				
				double k = TemperatureConverter.converterParaKelvin(c2);
				System.out.println("Resultado " + k + " Kelvin");	
				break;
				
			case 3:
				System.out.println("Encerrando o programa....");
				break;
				
			default:
				System.out.println("Opcao invalida!");
			}
		}
		sc.close();		
	}
}