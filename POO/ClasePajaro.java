package POO;

public class ClasePajaro {
	
	//attributos
	private char color;
	private String nombre;
	private byte edad;
	
	//constructores
	ClasePajaro() {
	color = 'v';
	edad = 0;
	}
	ClasePajaro(char c, byte e) {
	color = c;
	edad = e;
	}
	
	//metodos
	public void setNombre(String n){
		
	nombre=n;
	
	}
	
	
	public String getNombre(){
		
		return nombre;
		
	}
	
	
	public void setColor(char c){
		
	color=c;
	
	}
	
	
	public char getColor(){
		
	return color;
	
	}
	
	
	public byte getEdad(){
		
	return edad;
	
	}
	
	
	public void printEdad() {
		
	System.out.println("Edad: " + edad);
	}
	
	
	public void setEdad(byte anyos){
		
	edad = anyos;
	
	}
	
	
	public void printColor() {
		
	System.out.println("Color: " + color);
	
	}
	
	

	}

