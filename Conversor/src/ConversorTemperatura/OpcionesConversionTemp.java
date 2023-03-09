package ConversorTemperatura;

import javax.swing.JOptionPane;


public class OpcionesConversionTemp {
	ConvertirTemperatura conver = new ConvertirTemperatura();
	public void ConvertirTemperatura(Double temperatura) {
		String opcion2 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura que tienes", "Conversor", 
				JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Kelvin", "Celsius", "Rankine", "Fahrenheit"}, "Selecciona")).toString();
		switch (opcion2) {
		case "Kelvin":
			conver.ConvertirTemperaturaKelvin(temperatura);
			break;
		case "Celsius":
			conver.ConvertirTemperaturaCelsius(temperatura);
			break;
		case "Rankine":
			conver.ConvertirTemperaturaRankine(temperatura);
			break;
		case "Fahrenheit":
			conver.ConvertirTemperaturaFahrenheit(temperatura);
			break;
		}
	}
}
