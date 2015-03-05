package com.zubiri.matriculas;

import java.util.Scanner;

public abstract class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;

	public Persona(String dni,String nombre,String apellido){
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
	}

	public Persona(Scanner sc){
		System.out.println("Dni: ");
		setDni(sc.next());
		System.out.println("nombre: ");
		setNombre(sc.next());
		System.out.println("Apellido: ");
		setApellido(sc.next());
	}	

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
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
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		String formatted=
		"\nDni: "+this.dni+
		"\nNombre: "+this.nombre+
		"\nApellido: "+this.apellido;
		return formatted;
	}
	
	/**
	 * Metodo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		String separador = separator+"";
		String [] separados = personaStr.split(separador);
	}
}
