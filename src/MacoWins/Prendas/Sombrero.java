package MacoWins.Prendas;

import MacoWins.Prenda;

public class Sombrero extends Prenda {
	int coefMetroSexualidad;
	
	Sombrero()
	{
		precioBase = 150;
	}
	
	@Override
	public int PrecioBruto()
	{
		return precioBase+coefMetroSexualidad;
	}
}
