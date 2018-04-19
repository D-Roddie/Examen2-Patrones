package com.renta.peliculas;

public class Disco {

	private String numeroSerie;
	private Pelicula pelicula;

	public Disco(String numeroSerie, Pelicula pelicula) {
		super();
		this.numeroSerie = numeroSerie;
		this.pelicula = pelicula;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

}
