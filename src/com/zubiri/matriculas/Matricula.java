package com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	private int anoMatriculacion;
    private double precio;

    public Matricula(String nombre,int creditos,Profesor profesor,int anoMatriculacion,double precio, int porcentaje){
    	super(nombre,creditos,profesor);
		setAnoMatriculacion(anoMatriculacion);
		setPrecio(precio);
		setPrecio(getPrecio()-descuentoFamiliaNumerosa(porcentaje));
	}

	public Matricula(Scanner sc){
		super(sc);
		System.out.println("Ano de matriculacion: ");
		setAnoMatriculacion(sc.nextInt());
		System.out.println("Precio: ");
		setPrecio(sc.nextDouble());	
		System.out.println("Descuento: ");
		setPrecio(getPrecio()-descuentoFamiliaNumerosa(sc.nextInt()));
	}
    	
	public int getAnoMatriculacion() {
		return anoMatriculacion;
	}
	
	public void setAnoMatriculacion(int anoMatriculacion) {
		this.anoMatriculacion = anoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    

    public String formatted() {
		String formatted=
		super.formatted()+
		"Ano matriculacion: "+this.anoMatriculacion+
		"Precio: "+this.precio;
		return formatted;
	}
	
	/**
	 * Metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		double descuentoFamiliaNumerosa=precio*porcentaje;
		return descuentoFamiliaNumerosa;
	}
	
}
