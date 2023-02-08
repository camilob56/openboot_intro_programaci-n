package encapsulación;

public class objetoEncapsulación {
	public static void main(String[] args) {
		// creo una instancia del objeto persona
		Persona camilo = new Persona();
		// set - asigno los valores
		camilo.setNombre("Cristian camilo b");
		camilo.setEdad(28);
		camilo.setTelefono("313 456 3214");
		// get . obtengo los valores
		System.out.println(camilo.getNombre());
		System.out.println(camilo.getEdad());
		System.out.println(camilo.getTelefono());
		
		
	}
}

// Objeto persona
class Persona{
	// propiedades de persona
	private int edad;
	private String nombre;
	private String telefono;
	
	// getter - obtenemos el valor de la propiedad
	// no pasa parametros
	public int getEdad() {
		return edad;
	}
	// setter - asigna el valor de la propiedad
	// pasan parametros ya que se va a asignar
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
		
	
}