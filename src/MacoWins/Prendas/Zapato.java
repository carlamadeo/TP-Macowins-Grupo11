package MacoWins.Prendas;

import MacoWins.Prenda;

public class Zapato extends Prenda {
	int talle;
	
	Zapato()
	{
		precioBase = 400;
	}
	
	@Override
	public int PrecioBruto()
	{
		return precioBase+5*talle;
	}
}
