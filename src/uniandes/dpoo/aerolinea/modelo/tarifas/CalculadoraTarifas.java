package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import java.util.*;

public abstract class CalculadoraTarifas {
	
	public double IMPUESTO = 0.28;
	
	public abstract int calcularTarifa(Vuelo vuelo, Cliente cliente);
		
	
	

}
