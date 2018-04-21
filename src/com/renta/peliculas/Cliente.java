package com.renta.peliculas;

import java.util.ArrayList;
import java.util.Iterator;

import com.renta.peliculas.estrategia.Registrar;
import com.renta.peliculas.fabrica.Fabrica;

public class Cliente {

	private String nombre;
	private ArrayList<Alquiler> alquileres = Fabrica.fabricaArrayList();
	public static Registrar registrar = new Registrar();

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public static Cliente get(String name) {
		return registrar.get(name);
	}

	public void persist() {
		registrar.add(this);
	}

}


