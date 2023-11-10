package EjerciciosClasePoo;

public class ConstructorCopia {
	
	private String color;
	private int numero;
	private String nombre;
	
	public ConstructorCopia(String color,int numero,String nombre){ // constructor comun
		this.color=color;
		this.numero=numero;
		this.nombre=nombre;
	}
	private ConstructorCopia(ConstructorCopia otroConstructor) {
		this.color=otroConstructor.color;
		this.numero=otroConstructor.numero;
//		this.nombre=otroConstructor.nombre;
		
	}
	
//	this.ancho = r.getAncho(); //r.ancho
//	this.alto = r.getAlto();
//	}
//	
	public String getColor() {
		return color;
	}
	public int getNumero() {
		return numero;
	}
	public String getNombre() {
		return nombre;
	}
//	
//
//	public static void main(String[] args) {
//		ConstructorCopia r1 = new ConstructorCopia(5,7);
//		ConstructorCopia r2 = new ConstructorCopia(r1);
//		r2.incrementarAncho();
//		r2.incrementarAlto();
//		System.out.println("Ancho = " + r1.getAncho());
//		System.out.println("Alto = " + r1.getAlto());

	
	public static void main (String [] args) {
	
		ConstructorCopia a1= new ConstructorCopia("verde",23,"Juan");
		
		
		ConstructorCopia a2= new ConstructorCopia(a1);
		System.out.println(a1.getColor());	
		System.out.println(a1.getNumero());
		System.out.println(a1.getNombre());	
	System.out.println(a2.getColor());	
	System.out.println(a2.getNumero());
	System.out.println(a2.getNombre());
		
}
}