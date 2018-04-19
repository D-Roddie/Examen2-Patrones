package com.renta.peliculas;

public class Pelicula {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int ESTRENO = 1;

	public Pelicula(String nombre, int codigoPrecio) {
		super();
		this.nombre = nombre;
		this.codigoPrecio = codigoPrecio;
	}

	private String nombre;
	private int codigoPrecio;

	public int getCodigoPrecio() {
		return codigoPrecio;
	}

	public void persist() {
		Registrar.add("Peliculas", this);
	}

	public static Pelicula get(String name) {
		return (Pelicula) Registrar.get("Peliculas", name);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
