package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirSolesDolares(Double valor) {
		double moneda = valor*0.26;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " dolares");
	}
	public void ConvertirSolesEuros(Double valor) {
		double moneda = valor*0.25;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " Euros");
	}
	public void ConvertirSolesPesosMexicanos(Double valor) {
		double moneda = valor*4.84;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " pesos mexicanos");
	}
	public void ConvertirSolesPesosColombianos(Double valor) {
		double moneda = valor*1277.52;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " pesos colombianos");
	}
	public void ConvertirDolaresSoles(Double valor) {
		double moneda = valor/0.26;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " Soles");
	}
	public void ConvertirEurosSoles(Double valor) {
		double moneda = valor/0.25;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " Soles");
	}
	public void ConvertirPesosMexicanosSoles(Double valor) {
		double moneda = valor/4.84;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " Soles");
	}
	public void ConvertirPesosColombianosSoles(Double valor) {
		double moneda = valor/1277.52;
		moneda = (double)Math.round(moneda*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " Soles");
	}
}
