package com.zubiri.matriculas;

import java.util.Scanner;
import java.util.ArrayList;

public class Alumnos{
	
	//private static ArrayList<Alumno> alumnos = null;
	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public Alumnos(ArrayList<Alumno>alumnos){
    	setAlumnos(alumnos);
	}
   	
	public static ArrayList<Alumno> getAlumnos() throws Exception{
		if (alumnos.size() == 0) {
			throw new Exception("No hay alumnos matriculados");
		}
			return alumnos;
	}
	
	public void setAlumnos(ArrayList<Alumno>alumnos) {
		this.alumnos = alumnos;
	}

	public static void addAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
    
    public static Alumno obtainAlumno(int index) throws Exception{
		if (getAlumnos() == null) {
			throw new Exception("No hay alumnos matriculados");
		}    	
    	Alumno alumnoObtenido=alumnos.get(index);
    	return alumnoObtenido;
    }

    public static String formatted() {
    	String formatted="";
		try{	
			for(int i=0; i<alumnos.size(); i++){
				formatted+=formatted+"Alumno: "+obtainAlumno(i).formatted()+"\n";
			}		
		}catch(NullPointerException e){
				System.err.println("No hay alumnos Matriculados");
				formatted="";		
		}catch (Exception e){			
				System.err.println(e+ "aa");
				formatted="";
		}
		return formatted;
	}	
}