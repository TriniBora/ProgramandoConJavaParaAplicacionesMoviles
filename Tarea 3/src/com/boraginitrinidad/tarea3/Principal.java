package com.boraginitrinidad.tarea3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Creaci�n de los ArrayList del tipo PeliculaHija y Series Hija
				ArrayList<PeliculaHija> miArrayListPeliculas = new ArrayList<PeliculaHija>();
				ArrayList<SeriesHija> miArrayListSeries = new ArrayList<SeriesHija>();
				
				//Creaci�n de los elementos de cada arreglo
				PeliculaHija miPelicula1 = new PeliculaHija("Batman: the dark knight", "Acci�n/Aventura", "Christopher Nolan", 2008, 173.3);
				PeliculaHija miPelicula2 = new PeliculaHija("The Lordof the rings: The two towers", "Fantas�a/Aventura", "Peter Jackson", 2002, 251.6);
				PeliculaHija miPelicula3 = new PeliculaHija("Wicker Park", "Romance/Suspenso", "Paul McGuigan", 2004, 151.6);
				PeliculaHija miPelicula4 = new PeliculaHija("Labyrinth", "Fantas�a/Musical", "Jim Henson", 1986, 128.3);
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
				
										
				//Utilizando el m�todo marcarVisto, se marcan en visto algunas pel�culas ingresadas por teclado por un usuario
				//Se utilizan las excepciones en el caso de que el usuario no ingrese una opci�n v�lida
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				
				boolean v�lido = false;
				
				while (v�lido == false) {
						System.out.print("Ingrese el n�mero de pel�cula a marcar como Visto: ");
						int opci�n = input.nextInt();
						System.out.print("Ingrese otro n�mero diferente de pel�cula a marcar como Visto: ");
						int opci�n2 = input.nextInt();
					
						try {miArrayListPeliculas.get(opci�n).marcarVisto();
							miArrayListPeliculas.get(opci�n2).marcarVisto();
							v�lido = true;
													
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("El valor ingresado no existe. Ingrese otro.");
						}
				}
				
				//Utilizando el m�todo marcarVisto, se marcan en visto algunas series
				miSerie2.marcarVisto();
				miSerie5.marcarVisto();
				
				//Utilizando el m�todo esVisto, tiempoVisto y toString, se muestran las pel�culas y series visualizadas y la cantidad de minutos visualizados
								
				System.out.println("Pel�culas visualizadas: ");
				
				boolean aux = true;
				double tiempoVistoPeliculas = 0.0;
				double tiempoVistoSeries = 0.0;
				
				
				for(int i = 0; i< miArrayListPeliculas.size(); i++)
					if(miArrayListPeliculas.get(i).esVisto() == true) {
						System.out.println(miArrayListPeliculas.get(i).toString());
						tiempoVistoPeliculas += miArrayListPeliculas.get(i).tiempoVisto();
					}	
				
				System.out.println("El tiempo de pel�culas visualizado es: " + tiempoVistoPeliculas + " minutos.");
	
				System.out.println();
					
				System.out.println("Series visualizadas: ");
				
				for(int j = 0; j< miArrayListSeries.size(); j++)
					if(miArrayListSeries.get(j).esVisto() == true) {
						System.out.println(miArrayListSeries.get(j).toString());
						tiempoVistoSeries += miArrayListSeries.get(j).tiempoVisto();
					}
		
				System.out.println("El tiempo de series visualizado es: " + tiempoVistoSeries + " minutos.");
				
				System.out.println();
							
				////Utilizando los m�todos getNroTemporadas y getA�o, se muestra la serie con m�s temporadas y la pel�cula del a�o m�s reciente. 
				
				int nroTemporadas = 0;
				int auxTemporadas = 0; 
				int posicion = 0;
						
				System.out.println("La serie con m�s temporadas es: ");
				
				for (int k = 0; k < miArrayListSeries.size(); k++) {
					nroTemporadas = miArrayListSeries.get(k).getNroTemporadas();
					if(nroTemporadas >= auxTemporadas) {
						auxTemporadas = nroTemporadas;
						posicion = k;
					}
				}	
				
				System.out.println(miArrayListSeries.get(posicion).toString());
				
				System.out.println();
				
				int a�o = 0;
				int auxA�o = 0; 
				int posicion2 = 0;
						
				System.out.println("La pel�cula m�s reciente es: ");
				
				for (int m = 0; m < miArrayListPeliculas.size(); m++) {
					a�o = miArrayListPeliculas.get(m).getA�o();
					if(a�o >= auxA�o) {
						auxA�o = a�o;
						posicion2 = m;
					}
				}	
				
				System.out.println(miArrayListPeliculas.get(posicion2).toString());
						
	}

}
