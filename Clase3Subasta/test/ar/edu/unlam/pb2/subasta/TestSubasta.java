package ar.edu.unlam.pb2.subasta;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestSubasta {

	@Test
	public void testQueSeCreeUnaSubasta() {
		Subasta miSubasta = new Subasta(100);
		Integer valorEsperadoInteger = 100;
		// Boolean valorEsperadoBoolean = true;

		assertEquals(valorEsperadoInteger, miSubasta.getValorInicial());
		// assertEquals(valorEsperadoBoolean, miSubasta.getAbierta());
		Assert.assertTrue(miSubasta.getAbierta());
	}

	@Test
	public void testQueSePuedaOfertar() {
		Subasta miSubasta = new Subasta(100);
		Integer valorEsperado = 500;
		miSubasta.nuevaOferta(500);
		Integer valorObtenido = miSubasta.getValorInicial();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testQueSePuedaCerrarUnaSubasta() {
		Subasta miSubasta = new Subasta(100);
		Integer valorEsperadoInteger = 500;
		Boolean valorEsperadoBoolean = false;
		miSubasta.nuevaOferta(500);
		miSubasta.itemVendido();

		assertEquals(valorEsperadoInteger, miSubasta.getValorInicial());
		assertEquals(valorEsperadoBoolean, miSubasta.getAbierta());
	}

}
