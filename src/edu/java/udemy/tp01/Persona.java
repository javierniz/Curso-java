package edu.java.udemy.tp01;

public class Persona {
	//Atrbutos de la clase
	private String nombre;
	private String apellido;

	
	//Metodos de la clase
	public void desplegarInformacion() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Apellido: "+ apellido);
		
	}
	
		
		
	public Persona(String nombre, String apellido) {
			
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}