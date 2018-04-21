package com.renta.peliculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.renta.peliculas.fabrica.Fabrica;

class AlquilerTests {

	@Test
	public void pruebaUno() {
		Pelicula movie = new Pelicula("Pulp Fiction", 0);
		Disco disc = new Disco("3254", movie);
		Alquiler rental = new Alquiler(disc, 88);
		Cliente cliente = new Cliente("Daniel Rodríguez");

		Rental movieRental = Fabrica.fabricaRental();

		movieRental.addRental(rental);

	}

}
