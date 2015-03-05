package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	private String titulacion;
	private String departamento;

	public Profesor(String dni,String nombre,String apellido,String titulacion,String departamento){
		super(dni, nombre, apellido);
		setTitulacion(titulacion);
		setDepartamento(departamento);
	}

	public Profesor(Scanner sc){
		super(sc);
		System.out.println("Titulacion: ");
		setTitulacion(sc.next());
		System.out.println("departamento: ");
		setDepartamento(sc.next());
	}
	
	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String formatted() {
		String formatted=
		super.formatted()+
		"\nTitulacion: "+this.titulacion+
		"\nDepartamento: "+this.departamento;
		return formatted;
	}
	
}