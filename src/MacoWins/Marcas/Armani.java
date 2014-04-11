package MacoWins.Marcas;

import MacoWins.Marca;

public class Armani implements Marca {
	public float CalcularCoeficiente(float precioBase)
	{
		return precioBase*0.65f;
	}
}
