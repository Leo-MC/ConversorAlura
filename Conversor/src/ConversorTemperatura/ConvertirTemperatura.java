package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	ConvertirTemperaturaCelsius conversionCel = new ConvertirTemperaturaCelsius();
	ConvertirTemperaturaKelvin conversionKel = new ConvertirTemperaturaKelvin();
	ConvertirTemperaturaRankine conversionRan = new ConvertirTemperaturaRankine();
	ConvertirTemperaturaFahrenheit conversionFah = new ConvertirTemperaturaFahrenheit ();
	public void ConvertirTemperaturaKelvin(Double temperatura) {
			String opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", 
					JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Celsius", "Rankine", "Fahrenheit"}, "Selecciona")).toString();
			switch(opcion4) {
			
			case "Celsius":
				conversionKel.KelvinACelsius(temperatura);
				break;
			case "Rankine":
				conversionKel.KelvinARankine(temperatura);
				break;
			case "Fahrenheit":
				conversionKel.KelvinAFahrenheit(temperatura);
				break;
			}
	}
	public void ConvertirTemperaturaCelsius(Double temperatura) {
		String opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", 
				JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Kelvin", "Rankine", "Fahrenheit"}, "Selecciona")).toString();
		switch(opcion4) {
		
		case "Kelvin":
			conversionCel.CelsiusAKelvin(temperatura);
			break;
		case "Rankine":
			conversionCel.CelsiusARankine(temperatura);
			break;
		case "Fahrenheit":
			conversionCel.CelsiusAFahrenheit(temperatura);
			break;
		}		
	}
	public void ConvertirTemperaturaRankine(Double temperatura) {
		String opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", 
				JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Celsius", "Kelvin", "Fahrenheit"}, "Selecciona")).toString();
		switch(opcion4) {
		
		case "Celsius":
			conversionRan.RankineACelsius(temperatura);
			break;
		case "Kelvin":
			conversionRan.RankineAKelvin(temperatura);
			break;
		case "Fahrenheit":
			conversionRan.RankineAFahrenheit(temperatura);
			break;
		}
	}
	public void ConvertirTemperaturaFahrenheit(Double temperatura) {	
		String opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", 
				JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Celsius", "Rankine", "Kelvin"}, "Selecciona")).toString();
		switch(opcion4) {
		
		case "Celsius":
			conversionFah.FahrenheitACelsius(temperatura);
			break;
		case "Rankine":
			conversionFah.FahrenheitARankine(temperatura);
			break;
		case "Kelvin":
			conversionFah.FahrenheitAKelvin(temperatura);
			break;
		}
	}
}
