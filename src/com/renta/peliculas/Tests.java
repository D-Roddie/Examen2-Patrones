package com.renta.peliculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	public void pruebaUno() {
		Pelicula movie = new Pelicula("Anihilation", 0);
		Disco disc = new Disco("4321", movie);
		Alquiler rental = new Alquiler(disc, 43);
		Cliente cliente = new Cliente("Marian");

		cliente.addRental(rental);
		cliente.statement();
	}

}
