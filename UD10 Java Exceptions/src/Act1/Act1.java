package Act1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		int numGenerado = generaNumeroRandom();
		int intentos = 0;
		int numUsuario = -1;
		
		
		
		do 
		{
			
			System.out.println("introduce un numero: ");
			
			try {
				
				numUsuario = sc.nextInt();
				

				if (numUsuario != numGenerado) 
				
				{
					mensajeMayorMenor(numUsuario, numGenerado);
					intentos++;
					
				} else 
				{
					
					intentos++;
					System.out.println("Has acertado el numero " + numGenerado + " en " + intentos + " intentos");
					
				}

			} catch (InputMismatchException e) 
			{
				
				System.out.println(e);
				intentos++;

				sc.next();
				
			}

		} while (numUsuario != numGenerado);
		
		
		sc.close();

	}

	
	public static int generaNumeroRandom() 
	
	{
		int num = (int) (Math.random() * (500 - 1) + 1);
		return num;
		
	}

	
	
	public static void mensajeMayorMenor(int num, int numRandom) 
	{
		
		if (num < numRandom) 
		{
			
			System.out.println("el numero que buscas es mayor");
			
		} else if (num > numRandom) 
		{
			
			System.out.println("el numero que buscas es menor");

		}
	}

}
