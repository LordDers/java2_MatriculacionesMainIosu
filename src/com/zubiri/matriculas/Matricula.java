package com.zubiri.matriculas;

public class Matricula extends Asignatura {
	
	int a�oMatriculacion;
    double precio;
    
	public String getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public int getA�oMatriculacion() {
		return a�oMatriculacion;
	}
	
	public void setA�oMatriculacion(int a�oMatriculacion) {
		this.a�oMatriculacion = a�oMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
	}
	
}
