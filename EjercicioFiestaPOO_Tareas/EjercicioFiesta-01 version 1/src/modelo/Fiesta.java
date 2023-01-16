package modelo;

public class Fiesta {
	private String tipo; //El tipo de fiesta puede ser: infantil, de cumpleaños, de disfraces, etc.
	private String fechaHora;
	private String direccion;
	private int bebidas;//Las propiedades bocadillos y bebidas seran la cantidad que se compraran para la fiesta
	private int bocadillos;
	private int invitados;
	
	public Fiesta(String tipo, String fechaHora, String direccion, int bebidas, int bocadillos) {
		super();
		this.tipo = tipo;
		this.fechaHora = fechaHora;
		this.direccion = direccion;
		this.bebidas = bebidas;
		this.bocadillos = bocadillos;
		this.invitados = 0;
	}
	public Fiesta() { //Creamos un constructor por defecto sin parametros con valores predefinidos
		super();
		this.tipo="disfraces";
		this.fechaHora="13/07/2023, 19.30h";
		this.direccion="C/Huertas, 37";
		this.bebidas=30;
		this.bocadillos=25;
		this.invitados=0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	
	public String consultar() {
		 return "La fiesta de tipo: "+this.tipo+", tendrá lugar el día "+this.fechaHora+" en la dirección "+this.direccion+". Número de bebidas: "+this.bebidas+". Número de bocadillos: "+this.bocadillos+". Número de invitados: "+this.invitados;
	}
	
	public void invitar() {
		this.invitados++;
	}
	
	public void cancelarInvitacion() {
		this.invitados--;
	}
	
	public double precioFiesta(int invitados,int bebidas,int bocadillos) {
		int precioTotal;
		int precioBoc=3*bocadillos;
		int precioBeb=2*bebidas;
		int precioInv=5*invitados;
		precioTotal=precioBoc+precioBeb+precioInv;
		return precioTotal;
	}

	
	
	
	
	
	
	
	
	
	
}





