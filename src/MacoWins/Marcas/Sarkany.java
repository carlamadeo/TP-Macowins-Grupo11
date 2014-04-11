package MacoWins.Marcas;

import MacoWins.Marca;

public class Sarkany implements Marca {
	public float CalcularCoeficiente(float precioBase)
	{
		if(precioBase > 500)
			return 1.35f;
		
		return 1.10f;
	}
}
