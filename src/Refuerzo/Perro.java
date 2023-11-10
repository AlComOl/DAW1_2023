package Refuerzo;
//CLASE perro 
public class Perro {
	
	//ATRIBUTOS
	private String nombre;
	private String raza;
	private int edad;
	private String duenyo;
	private boolean microchip;
	
	
	
	
	//MÉTODOS
	//El método ladra muestra por pantalla simplemente un ladrido

	public void ladra() {//void
		
		System.out.println("Guau!!!");
	}
	public void saluda() {//void
		System.out.println("Hola humano mi nombre es "+ this.nombre);
	}
	public void dime_edad(int edad) {//void
		System.out.println("Tengo "+ edad);
	}
	public String propietario(String nombre) {//string
		return nombre;
		
	}
	public String dime_duenyo(String duenyo) {
		return duenyo;
	}
	
	/////////////////////////////////////////////////METODO MAIN///////////////////////////////////////////////////////////////
	public static void main(String[] args){
		
 
		//Instanciar Perro 
		Perro Bobi=new Perro();
		
		Bobi.nombre="Bob";
		
		System.out.println("El nombre del perro es "+ Bobi.nombre);
		
		Bobi.ladra();
	
		Bobi.saluda();
		
		Bobi.dime_edad(25);
		
		//Bobi.dime_duenyo();
		
		//System.out.println("El propietario es "+ Bobi.propietario("Lider"));
		Bobi.dime_duenyo("pepe");
		System.out.println("el dueyo"+);
		//INSTANCIAR UN NUEVO PERRO LLAMADO SULTAN
		
		//Perro Sultan = new Perro();
		
		//Sultan.nombre="Sultan";
	}
}
