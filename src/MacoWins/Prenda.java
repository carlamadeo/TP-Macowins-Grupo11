package MacoWins;

public class Prenda {
	static int valorFijo = 100;
	static float tasaImportancion = 1.30f;
	protected int precioBase;
	public boolean importada;
	protected Marca marca;
	
	public int PrecioBruto()
	{
		return precioBase;
	}
	
	public float PrecioFinal()
	{
		float precioFinal = ( valorFijo+PrecioBruto() ) * marca.CalcularCoeficiente(precioBase);

		if(importada == true)
			precioFinal = precioFinal * tasaImportancion;
		
		return precioFinal;
	}
}