package com.igor.conversor;

public class TemperatureConverter {
	
	public static double converterParaFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	public static double converterParaKelvin(double celsius) {
		return celsius + 273.15;
	}

}
