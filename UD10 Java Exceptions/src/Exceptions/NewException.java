package Exceptions;


public class NewException extends Exception
{

		public NewException()
		{
			
			super();
			
		}
		
		public String getMessage() 
		{
			
			String mensaje="Exception capturada con mensaje : Esto es un objeto Exception";
			return mensaje;
			
		}
		
}


