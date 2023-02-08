package funciones;

public class funciones {
	/*
	 * Declaro una variable resultado la cual es igual a la funcione suma de 
	 * tres parametros, por ultimo imprimo el resultado
	*/
	public static void main(String[] args) {
		int resultado;
		resultado =suma(2,4,5);
		System.out.println("El resultado de la suma es: " + resultado);
		
		
	}
	
	/*
	 * Declaro la función int suma con tres parametros int
	 * la cual retorna la suma de estos
	*/
	public static int suma(int a, int b, int c) {
		return a+b+c;
	}
	
}



