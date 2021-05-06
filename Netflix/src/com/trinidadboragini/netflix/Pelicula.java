package com.trinidadboragini.netflix;

public class Pelicula {
	
	//Atributos: título, género, creador, año, duración, visto
	private String titulo;
	private String genero;
	private String creador;
	private int año;
	protected double duracion;
	public boolean visto;
	
	//Constructor default
	public Pelicula() { 
		this.titulo = "Título";
		this.genero = "Género";
		this.creador = "Creador";
		this.año = 1;
		this.duracion = 1.0;
		this.visto = false;
	} 
	
	//Constructor con título y género
	public Pelicula(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	} 
	
	//Constructor con todos los atributos, excepto Visto
	public Pelicula(String titulo, String genero, String creador, int año, double duracion) { 
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
	}

	//Métodos get y set de todos los atributos, excepto visto
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

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

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		if(duracion >= 1) {
			this.duracion = duracion;
		}else{
			this.duracion = 1.0;
		}
	}

	//Override del método toString
	@Override
	public String toString() {
		return "Pelicula => Título: " + titulo + ", género:" + genero + ", creador: " + creador + ", año: " + año + ", duración: " + duracion + " minutos.";
	}
}
