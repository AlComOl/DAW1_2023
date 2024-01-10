package PruebaPracticaMascarilla;

public abstract class Mascarilla  implements Interface{
	
//atributos 
	protected double precio;
	
//	constructor
	
	public Mascarilla() {
		
	}
	public Mascarilla(float precio) {
		this.precio=precio;	
	}
	
//	metodos 
	
	public double getPrecio() {
		return precio;
	}
	public double getParteIva() {
		double pp=(precio*IVA)/100;
		return pp;
	}
	protected abstract int getIVA();
		
	

}
