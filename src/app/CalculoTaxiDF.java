package app;

public class CalculoTaxiDF {

	public static double calculoTarifa(String bandeirada, int km, int hora) throws BandeiraException, KMException {
		double valor = 0.0;
		
		if (km != 0) {
			if (bandeirada != null){
				if (bandeirada == "Bandeira 1") {
					valor = 5.24 + (km * 2.85) + (31.72 * hora);
				} else if (bandeirada == "Bandeira 2") {
					valor = 5.24 + (km * 3.66) + (31.72 * hora);
				}
			} else {
				throw new BandeiraException();
			}
		} else {
			throw new KMException();
		}
		return valor;
	}

}
