package com.igor.conversor;

import java.util.Scanner;

import com.igor.conversor.service.TemperatureConverter;

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

			try {

				opcao = sc.nextInt();

			} catch (java.util.InputMismatchException e) {

				System.out.println("Opcao invalida, Digite um numero, voltando para o menu... ");
				sc.next();
				continue;
			}
			switch (opcao) {

			case 1:
				boolean temperaturaValida1 = false;

				while (!temperaturaValida1) {
					try {

						System.out.print("Digite a temperatura em Celsius: ");
						double c1 = sc.nextDouble();

						double f = TemperatureConverter.converterParaFahrenheit(c1);
						System.out.println("Resultado " + f + " Fahrenheit");
						
						temperaturaValida1 = true;
					} catch (java.util.InputMismatchException e) {

						System.out.print("Valor Invalido, Digite uma temperatura valida: ");
						sc.next();
					}
				}
				break;

			case 2:
				boolean temperaturaValida2 = false;

				while (!temperaturaValida2) {
					try {
						System.out.print("Digite a temperatura em Celsius: ");
						double c2 = sc.nextDouble();

						double k = TemperatureConverter.converterParaKelvin(c2);
						System.out.println("Resultado: " + k + " Kelvin");

						temperaturaValida2 = true;
					} catch (java.util.InputMismatchException e) {
						System.out.println("Valor invalido. Digite uma temperatura valida.");
						sc.next();
					}
				}
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