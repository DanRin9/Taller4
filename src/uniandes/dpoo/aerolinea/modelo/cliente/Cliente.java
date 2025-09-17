package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.*;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
public abstract class Cliente {

	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	public Cliente(List<Tiquete> tiquetesSinUsar, List<Tiquete> tiquetesUsados) {
		
		this.tiquetesSinUsar = tiquetesSinUsar;
		this.tiquetesUsados = tiquetesUsados;
	}
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador(); 
	
	public abstract Tiquete agregarTiquete(Tiquete tiquete);
	
	public int 
	
	
	
	
	
	
	
}
