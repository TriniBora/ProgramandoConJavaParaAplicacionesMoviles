package com.trinidadboragini.netflix;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación de arreglos del tipo PeliculaHija y SeriesHija 
		PeliculaHija[] miArregloPeliculas = new PeliculaHija[5];
		SeriesHija [] miArregloSeries = new SeriesHija[5];
		
		//Creación de los elementos de cada arreglo
		PeliculaHija miPelicula1 = new PeliculaHija("Batman: the dark knight", "Acción/Aventura", "Christopher Nolan", 2008, 173.3);
		PeliculaHija miPelicula2 = new PeliculaHija("The Lordof the rings: The two towers", "Fantasía/Aventura", "Peter Jackson", 2002, 251.6);
		PeliculaHija miPelicula3 = new PeliculaHija("Wicker Park", "Romance/Suspenso", "Paul McGuigan", 2004, 151.6);
		PeliculaHija miPelicula4 = new PeliculaHija("Labyrinth", "Fantasía/Musical", "Jim Henson", 1986, 128.3);
		PeliculaHija miPelicula5 = new PeliculaHija("IT", "Terror/Suspenso", "Christopher Nolan", 1990, 200.0);
		
		SeriesHija miSerie1 = new SeriesHija("Game of Thrones", 8, "Drama", "David Benniof & D. B. Weiss", 45.0);
		SeriesHija miSerie2 = new SeriesHija("Grey's Anatomy", 16, "Drama", "Shonda Rhimes", 60.0);
		SeriesHija miSerie3 = new SeriesHija("How I met your mother", 9, "Comedia", "Carter Bays & Craig Thomas", 22.0);
		SeriesHija miSerie4 = new SeriesHija("Sex Education", 2, "Drama", "Laurie Nunn", 45.0);
		SeriesHija miSerie5 = new SeriesHija("Vikings", 6, "Drama", "Michael Hirst", 45.0);
		
		//Creación de un objeto en cada posición de cada arreglo
		miArregloPeliculas[0] = miPelicula1;
		miArregloPeliculas[1] = miPelicula2;
		miArregloPeliculas[2] = miPelicula3;
		miArregloPeliculas[3] = miPelicula4;
		miArregloPeliculas[4] = miPelicula5;
		
		miArregloSeries[0] = miSerie1;
		miArregloSeries[1] = miSerie2;
		miArregloSeries[2] = miSerie3;
		miArregloSeries[3] = miSerie4;
		miArregloSeries[4] = miSerie5;		
		
		//Utilizando el método marcarVisto, se marcan en visto algunas películas y series
		miPelicula1.marcarVisto();
		miPelicula3.marcarVisto();
		miSerie2.marcarVisto();
		miSerie5.marcarVisto();
		
		//Utilizando el método esVisto, tiempoVisto y toString, se muestran las películas y series visualizadas y la cantidad de minutos visualizados
		double tiempoVisto = 0;
		
		System.out.println("Películas visualizadas: ");
		
		for (int i = 0; i < miArregloPeliculas.length; i++) 
			if(miArregloPeliculas[i].esVisto() == true) {
				System.out.println(miArregloPeliculas[i].toString());
				tiempoVisto += miArregloPeliculas[i].tiempoVisto();
			}	
		
		System.out.println("El tiempo de películas visualizado es: " + tiempoVisto + " minutos.");
		
		System.out.println();
			
		System.out.println("Series visualizadas: ");
		
		for (int j = 0; j < miArregloSeries.length; j++) 
			if(miArregloSeries[j].esVisto() == true) {
				System.out.println(miArregloSeries[j].toString());
				tiempoVisto += miArregloSeries[j].tiempoVisto();
			}
		
		System.out.println("El tiempo de series visualizado es: " + tiempoVisto + " minutos.");
		
		System.out.println();
					
		////Utilizando los métodos getNroTemporadas y getAño, se muestra la serie con más temporadas y la película del año más reciente. 
		
		int nroTemporadas = 0;
		int auxTemporadas = 0; 
		int posicion = 0;
				
		System.out.println("La serie con más temporadas es: ");
		
		for (int k = 0; k < miArregloSeries.length; k++) {
			nroTemporadas = miArregloSeries[k].getNroTemporadas();
			if(nroTemporadas >= auxTemporadas) {
				auxTemporadas = nroTemporadas;
				posicion = k;
			}
		}	
		
		System.out.println(miArregloSeries[posicion].toString());
		
		System.out.println();
		
		int año = 0;
		int auxAño = 0; 
		int posicion2 = 0;
				
		System.out.println("La película más reciente es: ");
		
		for (int m = 0; m < miArregloPeliculas.length; m++) {
			año = miArregloPeliculas[m].getAño();
			if(año >= auxAño) {
				auxAño = año;
				posicion2 = m;
			}
		}	
		
		System.out.println(miArregloPeliculas[posicion2].toString());
		
	}	

}
