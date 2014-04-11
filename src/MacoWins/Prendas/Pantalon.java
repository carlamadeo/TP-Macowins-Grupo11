package MacoWins.Prendas;

import MacoWins.Prenda;

public class Pantalon extends Prenda {
	int tela;
	
	Pantalon()
	{
		precioBase = 250;
	}
	
	@Override
	public int PrecioBruto()
	{
		return precioBase+tela;
	}
}
