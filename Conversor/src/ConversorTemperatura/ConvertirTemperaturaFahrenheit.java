package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperaturaFahrenheit {
	public void FahrenheitAKelvin (Double temperatura) {
		temperatura = (temperatura-32)*5/9 + 273.15;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Kelvin");
	}
	public void FahrenheitACelsius (Double temperatura) {
		temperatura = (temperatura - 32)*5/9;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Celsius");
	}
	public void FahrenheitARankine (Double temperatura) {
		temperatura = temperatura + 459.67;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Rankine");
	}
}
