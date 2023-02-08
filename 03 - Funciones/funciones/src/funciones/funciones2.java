package funciones;

public class funciones2 {
	/*
	 * Declaro un nuevo coche el cual esta definido en una clase 
	 * a la variable miCoche le pasamos la funcion de incrementar
	 * imprimimos por pantalla las puertas del coche = 5 
	*/
	public static void main(String[] args) {
		coche miCoche = new coche();
		miCoche.incrementar();
		System.out.println(miCoche.puertas);
	}
	
	
	
}
	
/*
 * Declaro una clase coche con una variable int puertas
 * y creo una funcion de incrementar la cual suma el valor que le dimos a las 
 * puertas 
*/
class coche{
	
	int puertas = 4;
	
	
	public void incrementar() {
		this.puertas++;
	}
	
	
}
	
