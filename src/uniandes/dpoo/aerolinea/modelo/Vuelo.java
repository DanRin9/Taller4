package uniandes.dpoo.aerolinea.modelo;

public class Vuelo {
	
	private Avion avion;
	private String fecha;
	private Ruta ruta;
	private HashMap<String, Tiquete> tiquetes;
	
	public Vuelo(Avion avion, String fecha) {
		
		this.avion = avion;
		this.fecha = fecha;
	}
	
	public Ruta getRuta() {
		return this.ruta;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public Avion getAvion() {
		return this.avion;
	}
	
	public Collection<Tiquete> getTiquietes(){
		
	}
	
	public int venderTiquietes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		
	}
	
	public boolean equals(Object obj) {
		return ;
	}
	
	

}
