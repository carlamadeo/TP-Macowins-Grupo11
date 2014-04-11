package MacoWins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Negocio {
	List<Venta> ventas = new ArrayList<Venta>();
	
	float gananciasDelDia(Date dia)
	{
		Stream<Venta> ventasDelDia = ventas.stream().filter(venta -> venta.dia.getDate() == dia.getDate());
		
		return (float)ventasDelDia.mapToDouble(venta -> venta.CalcularImporte()).average().getAsDouble();
	}
	
	void addVenta(Prenda prenda, int cantidad)
	{
		ventas.add(new Venta(prenda, cantidad));
	}
}
