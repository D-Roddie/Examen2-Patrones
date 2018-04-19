package com.renta.peliculas;

import java.util.HashMap;

public class Registrar {
	private static HashMap Peliculas = Fabrica.fabricaHashMap();
	private static HashMap Clientes = Fabrica.fabricaHashMap();
	
	public static Object get(String coleccion, String nombre) {
		if ("Peliculas".equals(coleccion)){
			return Peliculas.get(nombre);
		}
		return Clientes.get(nombre);
		
	}

	public static void add(String coleccion, Object objeto) {
		if ("Peliculas".equals(coleccion)){
			Pelicula nuevaPelicula = (Pelicula) objeto;
			Peliculas.put(nuevaPelicula.getNombre(), nuevaPelicula);
		}
		Cliente nuevoCliente = (Cliente) objeto;
		Clientes.put(nuevoCliente.getNombre(), nuevoCliente);
	}

}
