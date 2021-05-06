package com.boraginitrinidad.tarea3;

public class PeliculaHija extends PeliculasySeries implements IVisualizable{
		
	public PeliculaHija() {
		super();
		this.a�o = 1;
	}
		
	public PeliculaHija(String titulo, String genero, String creador, int a�o, double duracion) { 
		super(titulo, genero, creador, duracion);
		this.a�o = a�o;
	}
		
	//Atributos
	private int a�o;
		
	//M�todos get y set
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		if(a�o >= 1) {
			this.a�o = a�o;
		}else{
			this.a�o = 2020;
		}
	}	
	
	
	//Implementaciones de los m�todos de la interface
	@Override
	public void marcarVisto() {
		visto = true;
	}
		
	@Override
	public boolean esVisto() {
		return visto;
	}
		
	@Override
	public double tiempoVisto() {
		double tiempoVisto = 0;
		tiempoVisto += duracion;
		return tiempoVisto;
	}

	//Sobreescritura del M�todo toString
	@Override
	public String toString() {
		return "Pelicula => T�tulo: " + titulo + ", g�nero:" + genero + ", creador: " + creador + ", a�o: " + a�o + ", duraci�n: " + duracion + " minutos.";
	}
	
}
