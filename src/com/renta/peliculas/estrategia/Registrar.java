package com.renta.peliculas.estrategia;

import java.util.HashMap;

import com.renta.peliculas.Cliente;
import com.renta.peliculas.Pelicula;
import com.renta.peliculas.fabrica.Fabrica;

public class Registrar implements Estrategia {
	private static HashMap Peliculas = Fabrica.fabricaHashMap();
	private static HashMap Clientes = Fabrica.fabricaHashMap();

	@Override
	public Cliente get(String pNombre) {
		return (Cliente) Clientes.get(pNombre);

	}

	@Override
	public void add (Object oCliente) {
		Cliente newCliente = (Cliente) oCliente;
		Clientes.put(newCliente.getNombre(), newCliente);
	}

	@Override
	public Object get2(String pPelicula) {
		
		return (Pelicula) Peliculas.get(pPelicula);
	}

	@Override
	public void add2(Object oPelicula) {
		Pelicula newPelicula = (Pelicula) oPelicula;
		Peliculas.put(newPelicula.getNombre(), newPelicula);
		
		
	}
	

}
