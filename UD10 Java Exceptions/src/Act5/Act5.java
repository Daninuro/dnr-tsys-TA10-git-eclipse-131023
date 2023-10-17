package Act5;

import javax.swing.JOptionPane;

public class Act5 
{
	
	public static void main(String[] args) 
	{
		
		int tamaño_array = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantas contraseñas quieres generar"));
		

		Password contraseñas[] = new Password[tamaño_array];
				
		boolean segura[] = new boolean[tamaño_array];

		
		for (int i = 0; i < tamaño_array; i++) 
		{
		
			int tamaño_contraseña = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la contraseña " + (i + 1)));

			
			contraseñas[i] = new Password(tamaño_contraseña);

			if (Password.esFuerte(contraseñas[i].getContrasena())) 
			{
				
				segura[i] = true;
				
			} else 
			{
				
				segura[i] = false;
				
			}
			
			System.out.println(contraseñas[i].getContrasena() + " : " + segura[i]);
		}

	}
	
}
