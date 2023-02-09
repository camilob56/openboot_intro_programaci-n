package personaHerencia;

public class herenciaPersona {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Trabajador trabajador = new Trabajador();
		cliente.Nombre = "Camilo b";
		cliente.Edad = 28;
		cliente.Telefono = 321433435;
		cliente.Credito = 12303;
		trabajador.Nombre = "Pedro perez";
		trabajador.Edad = 31;
		trabajador.Telefono = 324243545;
		trabajador.Salario = 2000.000;
		System.out.println("CLIENTE");
		System.out.println(cliente.Nombre);
		System.out.println(cliente.Edad);
		System.out.println(cliente.Telefono);
		System.out.println(cliente.Credito);
		System.out.println("TRABAJADOR");
		System.out.println(trabajador.Nombre);
		System.out.println(trabajador.Edad);
		System.out.println(trabajador.Telefono);
		System.out.println(trabajador.Salario);
		
	}
}

class Persona {
	String Nombre;
	int Edad;
	int Telefono;
	
}

final class Cliente extends Persona {
	int Credito;
}

final class Trabajador extends Persona {
	double Salario;
}

