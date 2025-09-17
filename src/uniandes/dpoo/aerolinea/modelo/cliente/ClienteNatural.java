package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{
	
	private String nombre;
	public final String NATURAL = "Natural";
	
	public ClienteNatural(List<Tiquete> tiquetesSinUsar, List<Tiquete> tiquetesUsados, String nombre) {
		super(tiquetesSinUsar, tiquetesUsados);
		this.nombre = nombre;
		
	}

	

	
	@Override
	public String getTipoCliente() {
		
		return this.NATURAL;
	}

	@Override
	public String getIdentificador() {
		
		return this.nombre;
	}


	
}
