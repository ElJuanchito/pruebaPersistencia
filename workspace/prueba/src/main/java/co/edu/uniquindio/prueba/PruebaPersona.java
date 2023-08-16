package co.edu.uniquindio.prueba;

public class PruebaPersona {
	public static void main(String[] args) {
		PersonaDao dao = new PersonaDao();
		 
		//Persona persona = new Persona("Santiago", "santiago@gmail.com", "200");
		//dao.guardarCliente(persona);
		
		Persona pe = dao.obtenerClientePorId("200");
		System.out.println(pe);
	}
}
