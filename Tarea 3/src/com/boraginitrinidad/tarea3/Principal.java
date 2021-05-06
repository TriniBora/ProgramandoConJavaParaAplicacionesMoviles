package com.boraginitrinidad.tarea3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Creación de los ArrayList del tipo PeliculaHija y Series Hija
				ArrayList<PeliculaHija> miArrayListPeliculas = new ArrayList<PeliculaHija>();
				ArrayList<SeriesHija> miArrayListSeries = new ArrayList<SeriesHija>();
				
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
				
				
				//Carga del ArrayList con los objetos Pelicula y objetos Series
				miArrayListPeliculas.add(miPelicula1);
				miArrayListPeliculas.add(miPelicula2);
				miArrayListPeliculas.add(miPelicula3);
				miArrayListPeliculas.add(miPelicula4);
				miArrayListPeliculas.add(miPelicula5);
				
				miArrayListSeries.add(miSerie1);
				miArrayListSeries.add(miSerie2);
				miArrayListSeries.add(miSerie3);
				miArrayListSeries.add(miSerie4);
				miArrayListSeries.add(miSerie5);
				
										
				//Utilizando el método marcarVisto, se marcan en visto algunas películas ingresadas por teclado por un usuario
				//Se utilizan las excepciones en el caso de que el usuario no ingrese una opción válida
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				
				boolean válido = false;
				
				while (válido == false) {
						System.out.print("Ingrese el número de película a marcar como Visto: ");
						int opción = input.nextInt();
						System.out.print("Ingrese otro número diferente de película a marcar como Visto: ");
						int opción2 = input.nextInt();
					
						try {miArrayListPeliculas.get(opción).marcarVisto();
							miArrayListPeliculas.get(opción2).marcarVisto();
							válido = true;
													
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("El valor ingresado no existe. Ingrese otro.");
						}
				}
				
				//Utilizando el método marcarVisto, se marcan en visto algunas series
				miSerie2.marcarVisto();
				miSerie5.marcarVisto();
				
				//Utilizando el método esVisto, tiempoVisto y toString, se muestran las películas y series visualizadas y la cantidad de minutos visualizados
								
				System.out.println("Películas visualizadas: ");
				
				boolean aux = true;
				double tiempoVistoPeliculas = 0.0;
				double tiempoVistoSeries = 0.0;
				
				
				for(int i = 0; i< miArrayListPeliculas.size(); i++)
					if(miArrayListPeliculas.get(i).esVisto() == true) {
						System.out.println(miArrayListPeliculas.get(i).toString());
						tiempoVistoPeliculas += miArrayListPeliculas.get(i).tiempoVisto();
					}	
				
				System.out.println("El tiempo de películas visualizado es: " + tiempoVistoPeliculas + " minutos.");
	
				System.out.println();
					
				System.out.println("Series visualizadas: ");
				
				for(int j = 0; j< miArrayListSeries.size(); j++)
					if(miArrayListSeries.get(j).esVisto() == true) {
						System.out.println(miArrayListSeries.get(j).toString());
						tiempoVistoSeries += miArrayListSeries.get(j).tiempoVisto();
					}
		
				System.out.println("El tiempo de series visualizado es: " + tiempoVistoSeries + " minutos.");
				
				System.out.println();
							
				////Utilizando los métodos getNroTemporadas y getAño, se muestra la serie con más temporadas y la película del año más reciente. 
				
				int nroTemporadas = 0;
				int auxTemporadas = 0; 
				int posicion = 0;
						
				System.out.println("La serie con más temporadas es: ");
				
				for (int k = 0; k < miArrayListSeries.size(); k++) {
					nroTemporadas = miArrayListSeries.get(k).getNroTemporadas();
					if(nroTemporadas >= auxTemporadas) {
						auxTemporadas = nroTemporadas;
						posicion = k;
					}
				}	
				
				System.out.println(miArrayListSeries.get(posicion).toString());
				
				System.out.println();
				
				int año = 0;
				int auxAño = 0; 
				int posicion2 = 0;
						
				System.out.println("La película más reciente es: ");
				
				for (int m = 0; m < miArrayListPeliculas.size(); m++) {
					año = miArrayListPeliculas.get(m).getAño();
					if(año >= auxAño) {
						auxAño = año;
						posicion2 = m;
					}
				}	
				
				System.out.println(miArrayListPeliculas.get(posicion2).toString());
						
	}

}
