package com.boraginitrinidad.tarea3;

public class PeliculasySeries {
	
	//Atributos comunes a las clases Pel�culaHija y SeriesHija: t�tulo, g�nero, creador, duraci�n, visto
		protected String titulo;
		protected String genero;
		protected String creador;
		protected double duracion;
		public boolean visto;
		
		//Constructor default
		public PeliculasySeries() { 
			this.titulo = "T�tulo";
			this.genero = "G�nero";
			this.creador = "Creador";
			this.duracion = 1.0;
			this.visto = false;
		} 
		
		//Constructor con t�tulo y g�nero
		public PeliculasySeries(String titulo, String creador) {
			this.titulo = titulo;
			this.creador = creador;
		} 
		
		//Constructor con todos los atributos, excepto Visto
		public PeliculasySeries(String titulo, String genero, String creador, double duracion) { 
			this.titulo = titulo;
			this.genero = genero;
			this.creador = creador;
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
}
