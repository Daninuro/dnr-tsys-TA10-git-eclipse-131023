package Act2;

import Exceptions.NewException;


public class Act2 
{
	
	public static void main(String[] args) 
	{

		try 
		{
			
			throw new NewException();
			
		} catch (NewException e) 
		{
			
			System.out.println("Mensaje mostrado por pantalla");
			System.out.println(e.getMessage());
			System.out.println("Programa terminado");

		}
		
	}
}
