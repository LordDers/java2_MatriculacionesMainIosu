package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {

	private String nombre;
	private int creditos;
	private Profesor profesor;

	public Asignatura(String nombre,int creditos,Profesor profesor){
		setNombre(nombre);
		setCreditos(creditos);
		setProfesor(profesor);
	}

	public Asignatura(Scanner sc){
		System.out.println("Nombre de asignatura: ");
		setNombre(sc.next());
		System.out.println("Creditos: ");
		setCreditos(sc.nextInt());
		System.out.println("Profesor: ");
		Profesor profesor = new Profesor(sc);
		setProfesor(profesor);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
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
		"\nNombre: "+this.nombre+
		"\nCreditos: "+this.creditos+
		"\nProfesor: "+this.profesor.formatted();
		return formatted;
	}
	
	/**
	 * Metodo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		String separador = separator+"";
		String [] separados = personaStr.split(separador);
	}

}
