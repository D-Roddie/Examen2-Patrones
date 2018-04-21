package com.renta.peliculas;

import com.renta.peliculas.estrategia.Registrar;

public class Pelicula {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int ESTRENO = 1;
	public static Registrar registrar = new Registrar();

	private String nombre;
	private int codigoPrecio;

	public Pelicula(String nombre, int codigoPrecio) {
		super();
		this.nombre = nombre;
		this.codigoPrecio = codigoPrecio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPrecio() {
		return codigoPrecio;
	}

	public void setCodigoPrecio(int codigoPrecio) {
		this.codigoPrecio = codigoPrecio;
	}

	public void persist() {

		registrar.add2(this);
	}

	public static Pelicula get(String name) {
		return (Pelicula) registrar.get2(name);
	}

}
