package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperaturaCelsius {
	public void CelsiusAKelvin (Double temperatura) {
		temperatura = temperatura + 273.15;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Kelvin");
	}
	public void CelsiusARankine (Double temperatura) {
		temperatura = temperatura*9/5 + 491.67;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Rankine");
	}
	public void CelsiusAFahrenheit (Double temperatura) {
		temperatura = temperatura*9/5 + 32;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Fahrenheit");
	}
	
}
