package MacoWins;

import java.util.Date;

import MacoWins.Prendas.*;
import MacoWins.Marcas.*;

public class MacoWins {
	public static void main(String[] args) {
		Negocio macoWins = new Negocio();
		macoWins.addVenta(new Camisa(new Armani()), 2);
		System.out.println(macoWins.gananciasDelDia(new Date()));
	}

}
