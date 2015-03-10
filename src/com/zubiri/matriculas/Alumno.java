package com.zubiri.matriculas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Alumno extends Persona {
	
	//Ano en el que se inscribio por primera vez en alguna asignatura
	private int anoInscripcion = -1;
	//Ciclo que cursa el alumno
	private String ciclo = null;
	
	//Matriculas realizadas a lo largo de los anos en las distintas asignaturas
	//private ArrayList<Matricula> matriculas = null;
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

	public Alumno(String dni,String nombre,String apellido,int anoInscripcion,String ciclo,ArrayList<Matricula> matriculas){
		super(dni, nombre, apellido);
		setAnoInscripcion(anoInscripcion);
		setCiclo(ciclo);
		setMatriculas(matriculas);
	}

	public Alumno(Scanner sc){
		super(sc);
		do{
			try{
		System.out.println("Ano de inscripcion: ");
		setAnoInscripcion(sc.nextInt());
			}catch(InputMismatchException e){
				System.out.println("No has escrito un numero");
				sc.nextLine();
			}
		}while(getAnoInscripcion()==-1);	
		System.out.println("Ciclo formativo: ");
		setCiclo(sc.next());
		System.out.println("Cuantas matriculas ha realizado a lo largo de los anos en las distintas asignaturas?");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println(n+" Matricula ");
			System.out.println("Ciclo formativo: ");
			Matricula matricula = new Matricula(sc);
			matriculas.add(matricula);
		}
		Alumnos.addAlumno(this);		
	}
	
	public int getAnoInscripcion() {
		return anoInscripcion;
	}
	
	public void setAnoInscripcion(int anoInscripcion) {
		this.anoInscripcion = anoInscripcion;
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

	public String formatted() {
		String formatted=
		super.formatted()+
		"\nAno de inscripcion: "+this.anoInscripcion+
		"\nCiclo: "+this.ciclo
		//+"Matriculas"
		;
		return formatted;
	}

}
