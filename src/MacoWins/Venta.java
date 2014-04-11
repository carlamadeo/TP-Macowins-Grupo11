package MacoWins;

import java.util.Date;

public class Venta {
	Prenda prenda;
	int cantidad;
	Date dia;
	
	Venta(Prenda prend, int cant)
	{
		prenda = prend;
		cantidad = cant;
		dia = new Date();
	}
	
	float CalcularImporte()
	{
		return prenda.PrecioFinal() * cantidad;
	}
}
