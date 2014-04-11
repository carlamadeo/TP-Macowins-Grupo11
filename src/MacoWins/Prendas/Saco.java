package MacoWins.Prendas;

import MacoWins.Prenda;

public class Saco extends Prenda{
	int botones;
	
	Saco()
	{
		precioBase = 300;
	}
	
	@Override
	public int PrecioBruto()
	{
		return precioBase+10*botones;
	}
}
