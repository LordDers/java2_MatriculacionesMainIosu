package com.zubiri.matriculas;

public class Alumno extends Persona {
	
	//A�o en el que se inscribi� por primera vez en alguna asignatura
	int a�oInscripci�n = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	//Matr�culas realizadas a lo largo de los a�os en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public int getA�oInscripcion() {
		return a�oInicio;
	}
	
	public void setA�oInscripcion(int a�oInscripcion) {
		this.a�oInicio = a�oInicio;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

}
