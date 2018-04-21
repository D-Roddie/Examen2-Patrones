package com.renta.peliculas.fabrica;

import java.util.ArrayList;
import java.util.HashMap;

import com.renta.peliculas.Rental;

public class Fabrica {
	public static HashMap fabricaHashMap() {
		return new HashMap();

	}

	public static ArrayList fabricaArrayList() {
		return new ArrayList();

	}
	
	public static Rental fabricaRental() {
		return new Rental();
	}

}
