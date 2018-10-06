package ar.edu.unlam.Pb2.PilaRec;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaRecTest {

	/* Probar método para medir carga */
	@Test
	void probarMedirCarga() {
		PilaRec miPilaRec = new PilaRec(10.00, 15.00);
		Double valorEsperado = 50.00;
		Double valorObtenido = miPilaRec.medirCarga();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

	@Test
	void probarConsumir(Double minutos) {
		PilaRec miPilaRec = new PilaRec(10.00, 15.00);
		Double valorEsperado = 10.00;
		Double valorObtenido = miPilaRec.consumir(10.00);
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

}
