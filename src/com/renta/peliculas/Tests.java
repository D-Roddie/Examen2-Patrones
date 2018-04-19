package com.renta.peliculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	public void pruebaUno() {
		Pelicula movie = new Pelicula("Pirates of the Caribbean", 0);
		Disco disc = new Disco("1234", movie);
		Alquiler rental = new Alquiler(disc, 22);
		Cliente cliente = new Cliente("Daniel");

		cliente.addRental(rental);
		cliente.statement();
	}

}
