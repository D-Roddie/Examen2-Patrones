package com.renta.peliculas;

public class Disco {
	public Pelicula getPelicula() {
		return pelicula;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Disco(String numeroSerie, Pelicula pelicula) {
		super();
		this.numeroSerie = numeroSerie;
		this.pelicula = pelicula;
	}

	private String numeroSerie;
	private Pelicula pelicula;
}
