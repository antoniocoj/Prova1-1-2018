package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.BandeiraException;
import app.CalculoTaxiDF;
import app.KMException;

@RunWith(Parameterized.class)
public class CalculoTaxiDFTest {
	
	Integer bandeirada;
	int km;
	int hora;
	double valor;
	
	public CalculoTaxiDFTest (Integer bandeirada, int km, int hora, double valor) {
		this.bandeirada = bandeirada;
		this.km = km;
		this.hora = hora;
		this.valor = valor;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,100,0,290.24},
			{2,100,0,371.24},
			{1,50,1,179.46},
			{2,50,1,219.96},
			{1,30,1,122.46},
			{2,30,2,178.48}
		});
	}
	@Test
	public void testCalculoTaxiDF() throws BandeiraException, KMException {
		assertEquals(valor, CalculoTaxiDF.calculoTarifa(bandeirada, km, hora), 0.01);
	}

}
