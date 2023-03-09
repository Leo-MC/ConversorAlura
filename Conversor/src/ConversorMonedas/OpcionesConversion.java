package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas conversion = new ConvertirMonedas();
	public void ConvertirMonedas(Double valor) {
		String opcion3 = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object [] {"de soles a dolares", "de soles a euros", "de soles a pesos mexicanos",
				"de soles a pesos colombianos", "de dolares a soles", "de euros a soles", "de pesos mexicanos a soles", 
				"de pesos colombianos a soles"}, "selecciona").toString();
		switch (opcion3) {
		case "de soles a dolares":
			conversion.ConvertirSolesDolares(valor);
			break;
		case "de soles a euros":
			conversion.ConvertirSolesEuros(valor);
			break;
		case "de soles a pesos mexicanos":
			conversion.ConvertirSolesPesosMexicanos(valor);
			break;
		case "de soles a pesos colombianos":
			conversion.ConvertirSolesPesosColombianos(valor);	
			break;
		case "de dolares a soles":
			conversion.ConvertirDolaresSoles(valor);
			break;
		case "de euros a soles":
			conversion.ConvertirEurosSoles(valor);
			break;
		case "de pesos mexicanos a soles":
			conversion.ConvertirPesosMexicanosSoles(valor);
			break;
		case "de pesos colombianos a soles":
			conversion.ConvertirPesosColombianosSoles(valor);	
			break;
		}
	}
}
