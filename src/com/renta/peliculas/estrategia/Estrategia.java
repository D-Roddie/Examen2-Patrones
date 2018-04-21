package com.renta.peliculas.estrategia;

public interface Estrategia {
	public Object get(String pNombreCliente);
	
	public void add(Object oCliente);
	
	public Object get2(String pPelicula);
	
	public void add2 (Object oPelicula);
	}
