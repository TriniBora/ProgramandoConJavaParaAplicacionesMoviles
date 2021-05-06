package com.trinidadboragini.netflix;

public class PeliculaHija extends PeliculasySeries implements IVisualizable{
		
	public PeliculaHija() {
		super();
		this.año = 1;
	}
		
	public PeliculaHija(String titulo, String genero, String creador, int año, double duracion) { 
		super(titulo, genero, creador, duracion);
		this.año = año;
	}
		
	//Atributos
	private int año;
		
	//Métodos get y set
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		if(año >= 1) {
			this.año = año;
		}else{
			this.año = 2020;
		}
	}	
	
	
	//Implementaciones de los métodos de la interface
	@Override
	public void marcarVisto() {
		visto = true;
	}
		
	@Override
	public boolean esVisto() {
		//System.out.println("Estado: " + visto);
		return visto;
	}
		
	@Override
	public double tiempoVisto() {
		double tiempoVisto = 0;
		tiempoVisto += duracion;
		return tiempoVisto;
	}

	//Sobreescritura del Método toString
	@Override
	public String toString() {
		return "Pelicula => Título: " + titulo + ", género:" + genero + ", creador: " + creador + ", año: " + año + ", duración: " + duracion + " minutos.";
	}
}
