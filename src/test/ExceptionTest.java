package test;

import org.junit.Test;

import app.BandeiraException;
import app.CalculoTaxiDF;
import app.KMException;

public class ExceptionTest {
	
	@Test(expected = BandeiraException.class)
	public void testBandeiradaNull() throws BandeiraException, KMException {
		CalculoTaxiDF.calculoTarifa(null, 10, 1);
	}
	
	@Test(expected = KMException.class)
	public void testKMZero() throws BandeiraException, KMException {
		CalculoTaxiDF.calculoTarifa("Bandeira 1", 0, 10);
	}

}
