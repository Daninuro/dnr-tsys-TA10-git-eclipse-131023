package Exceptions;

public class RandomException extends Exception{
	public String mensaje;
	


	public RandomException(String mensaje , int num) {
//		super();
		this.mensaje="El numero aleatorio generado es: "+num+ "\n"+ mensaje;
		
	}
	
	public String getMessage() {
		return mensaje;
	}
}
