package Act3;


//import java.util.*;

import Exceptions.RandomException;


public class Act3 
{
	
	public static void main(String[] args) 
	{
		
		String mensaje="";
		
		//Random rn = new Random();
		
		// int num = rn.nextInt(999);
		int num = generaNumeroRandom();
		
		System.out.println("Generando número aleatorio...");

		
		try 
		{
			
			if (num % 2 == 0) 
			{
				
				mensaje = "Es par";
				
			} else 
			{
				
				mensaje = "Es impar";
				
			}
			
			throw new RandomException(mensaje,num);
			
		} catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	

	
public static int generaNumeroRandom() 
	
	{
		int num = (int) (Math.random() * (999 - 1) + 1);
		return num;
		
	}
	
}
