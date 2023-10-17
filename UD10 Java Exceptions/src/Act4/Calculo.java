package Act4;

import javax.swing.JOptionPane;

public class Calculo 
{
	static double num1 = 0;
	static double num2 = 0;
	static double resultado = 0;
	
	public static void operacion() {
		int opcion = 0;
		
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Que operación quiere realizar? \n1 - Suma\n2 - Resta\n3 - Multiplicación\n4 - División\n5 - Potencia\n6 - Raíz Cuadrada\n7 - Raíz Cubica"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		switch (opcion) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplica();
			break;
		case 4:
			divide();
			break;
		case 5:
			potencia();
			break;
		case 6:
			raizCuadrada();
			break;
		case 7:
			raizCubica();
			break;
		default:
			JOptionPane.showMessageDialog(null, "La opción introducida no es correcta");
			break;
		}
	}

	public static void suma() {
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "La suma de " + num1 + " y " + num2 + " es " + resultado);

	}

	public static void resta() {
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, "La resta de " + num1 + " menos " + num2 + " es " + resultado);

	}

	public static void multiplica() {
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "La multiplicación de " + num1 + " y " + num2 + " es " + resultado);

	}

	public static void divide() {
		
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		
		try {
			resultado = num1 / num2;
			
			if (resultado == Double.POSITIVE_INFINITY ||
					resultado == Double.NEGATIVE_INFINITY ||
					resultado == Double.NaN)
                throw new ArithmeticException();

			JOptionPane.showMessageDialog(null, "La división de " + num1 + " entre " + num2 + " es " + resultado);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null,"ERROR");
		}
		

	}

	public static void potencia() {
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero que quieres elevar: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		try {
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la potencia a la que quieres elevar: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}
		resultado = Math.pow(num1, num2);
		JOptionPane.showMessageDialog(null, num1 + " elevado a " + num2 + " es " + resultado);

	}

	public static void raizCuadrada() {
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero para saber su raís cuadrada: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}

		resultado = Math.sqrt(num1);
		JOptionPane.showMessageDialog(null, "La raiz cuadrada de " +num1+ " es " + resultado);
	}

	public static void raizCubica() {
		
		try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero para saber su raíz cúbica: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El campo se tiene que rellenar con un NUMERO, gracias");
		}

		resultado = Math.cbrt(num1);
		JOptionPane.showMessageDialog(null, "La raiz cubica de " +num1+ " es " + resultado);
	}
	
}
