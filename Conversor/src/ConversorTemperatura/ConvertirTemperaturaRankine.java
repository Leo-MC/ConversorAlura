package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperaturaRankine {
	public void RankineAKelvin (Double temperatura) {
		temperatura = temperatura*5/9;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Kelvin");
	}
	public void RankineACelsius (Double temperatura) {
		temperatura = (temperatura - 491.67)*5/9;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Celsius");
	}
	public void RankineAFahrenheit (Double temperatura) {
		temperatura = temperatura - 459.67;
		temperatura = (double)Math.round(temperatura*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + temperatura + " grados Fahrenheit");
	}
	
}
