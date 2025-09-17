package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	public Tiquete(String codigo, int tarifa, boolean usado, Vuelo vuelo, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = usado;
		this.vuelo = vuelo;
		this.cliente = cliente;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void marcarComoUsado() {
		this.usado = true;
	}
	
	public boolean esUsado() {
		return this.usado;
	}
	
	
	
	
	
	
	
	
	
}
