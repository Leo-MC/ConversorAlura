package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperaturaKelvin {
	
	public void KelvinACelsius (Double temperatura) {
		temperatura = temperatura - 273.15;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Celsius");
	}
	public void KelvinARankine (Double temperatura) {
		temperatura = temperatura*1.8;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Rankine");
	}
	public void KelvinAFahrenheit (Double temperatura) {
		temperatura = (temperatura - 273.15)*9/5 + 32;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Fahrenheit");
	}
	
}
