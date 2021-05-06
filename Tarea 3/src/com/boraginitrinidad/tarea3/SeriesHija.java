package com.boraginitrinidad.tarea3;

public class SeriesHija extends PeliculasySeries implements IVisualizable{
		
	//Metodos constructores
	public SeriesHija() {
		super();
		this.nroTemporadas = 1;
	}
	
	public SeriesHija(String titulo, int nroTemporadas, String genero, String creador, double duracion) { 
		super(titulo, genero, creador, duracion);
		this.nroTemporadas = nroTemporadas;
	}
		
	//Atributos
	private int nroTemporadas;
		
	//Métodos get y set
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

	//Implementaciones de los métodos
	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		visto = true;
	}
		
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		//System.out.println("Estado: " + visto);
		return visto;
	}
		
	@Override
	public double tiempoVisto() {
		// TODO Auto-generated method stub
		double tiempoVisto = 0;
		tiempoVisto += duracion;
		return tiempoVisto;
	}
	

	//Sobreescritura del Método toString
	@Override
	public String toString() {
		return "Serie => Título: " + titulo + ", género:" + genero + ", creador: " + creador + ", número de temporadas: " + nroTemporadas + ", duración: " + duracion + " minutos.";
	}
	
}

