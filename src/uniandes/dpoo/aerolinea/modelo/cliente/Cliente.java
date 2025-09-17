package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.*;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public abstract class Cliente {

	protected List<Tiquete> tiquetesSinUsar;
	protected List<Tiquete> tiquetesUsados;
	
	public Cliente(List<Tiquete> tiquetesSinUsar, List<Tiquete> tiquetesUsados) {
		
		this.tiquetesSinUsar = tiquetesSinUsar;
		this.tiquetesUsados = tiquetesUsados;
	}
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador(); 
	
	public void agregarTiquete(Tiquete tiquete) {
		if (tiquete.esUsado()) {
			this.tiquetesUsados.add(tiquete);
			
		}else {
			this.tiquetesSinUsar.add(tiquete);
		}
	}
	
	public int calcularValorTotalTiquetes() {
		int precio = 0;
		Iterator<Tiquete> it =  this.tiquetesSinUsar.iterator();
		while (it.hasNext()) {
			Tiquete tiquete = it.next();
			precio += tiquete.getTarifa();
		}
		return precio;
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
		Collection<Tiquete> tiquetes = vuelo.getTiquietes();
		Iterator<Tiquete> it = tiquetes.iterator();
		while(it.hasNext()) {
			Tiquete tiquete = it.next();
			tiquete.marcarComoUsado();
		}
	}
	
	
	
	
	
	
	
}
