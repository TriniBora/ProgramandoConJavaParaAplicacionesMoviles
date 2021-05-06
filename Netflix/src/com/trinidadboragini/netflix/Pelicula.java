package com.trinidadboragini.netflix;

public class Pelicula {
	
	//Atributos: t�tulo, g�nero, creador, a�o, duraci�n, visto
	private String titulo;
	private String genero;
	private String creador;
	private int a�o;
	protected double duracion;
	public boolean visto;
	
	//Constructor default
	public Pelicula() { 
		this.titulo = "T�tulo";
		this.genero = "G�nero";
		this.creador = "Creador";
		this.a�o = 1;
		this.duracion = 1.0;
		this.visto = false;
	} 
	
	//Constructor con t�tulo y g�nero
	public Pelicula(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	} 
	
	//Constructor con todos los atributos, excepto Visto
	public Pelicula(String titulo, String genero, String creador, int a�o, double duracion) { 
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.a�o = a�o;
		this.duracion = duracion;
	}

	//M�todos get y set de todos los atributos, excepto visto
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

	//Override del m�todo toString
	@Override
	public String toString() {
		return "Pelicula => T�tulo: " + titulo + ", g�nero:" + genero + ", creador: " + creador + ", a�o: " + a�o + ", duraci�n: " + duracion + " minutos.";
	}
}
