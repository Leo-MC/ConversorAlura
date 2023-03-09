package Principal;

import javax.swing.JOptionPane;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemp;

public class Principal {
	public static boolean validarNumeros(String datos) {
		return datos.matches("[0-9]*");
	}
	public static void main(String[] args) {
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemp conversionTemp = new OpcionesConversionTemp();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Convertir Monedas","Convertir Temperatura"}, "Eligir").toString();
			
			switch (opciones) {
			case "Convertir Monedas":
				while(true) {
					String input = JOptionPane.showInputDialog("Ingrese la cantidad del dinero que desea convertir");
					if (input.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Ingrese algun valor");
						continue;
					}else
					if (!validarNumeros(input)) {
						JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
						continue;
					}else {
						double valorRecibido = Double.parseDouble(input);
						conversion.ConvertirMonedas(valorRecibido);
					}
					break;
				}				
				int continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
				if (continuar == 0) {
					continue;
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}
			case "Convertir Temperatura":
				while(true) {
					String valorTemp = JOptionPane.showInputDialog("Ingrese la temperatura que deseas convertir");
					if(valorTemp.isEmpty()) {
						JOptionPane.showMessageDialog(null, "ingrese algun valor");
						continue;
					}else
					if (!validarNumeros(valorTemp)) {
						JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
						continue;
					}else {
						double temp = Double.parseDouble(valorTemp);
						conversionTemp.ConvertirTemperatura(temp);		
					}
					break;
				}
				continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
				if (continuar == 0) {
					continue;
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}				
			}
			break;
		}
	}	
}
