package com.trinidadboragini.netflix;

public class Serie {
	
	//Atributos: título, número de temporadas, visto, género, creador, duración
	private String titulo;
	private int nroTemporadas;
	public boolean visto;
	private String genero;
	private String creador;
	protected double duracion;
			
	//Constructor default
	public Serie() { 
		this.titulo = "Título";
		this.nroTemporadas = 1;
		this.genero = "Género";
		this.creador = "Creador";
		this.duracion = 60.0;
		this.visto = false;
	} 
		
	//Constructor con título y género
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	} 
	
	//Constructor con todos los atributos, excepto Visto
	public Serie(String titulo, int nroTemporadas, String genero, String creador, double duracion) { 
		this.titulo = titulo;
		this.nroTemporadas = nroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}

	//Métodos get y set de todos los atributos, excepto visto
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getNroTemporadas() {
		return nroTemporadas;
	}

	public void setNroTemporadas(int nroTemporadas) {
		if(nroTemporadas >= 1) {
			this.nroTemporadas = nroTemporadas;
		}else{
			this.nroTemporadas = 1;
		}
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
		return "Serie => Título: " + titulo + ", género:" + genero + ", creador: " + creador + ", número de temporadas: " + nroTemporadas + ", duración: " + duracion + " minutos.";
	}
		
}
