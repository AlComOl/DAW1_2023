package PooClase;
import java.util.*;
public class ParametrosyValoresDevueltos {
	
	

	
	public void setColor(char c) {
		int color;
	    switch(c) {
	        case 'a': case 'v': case 'r':
	            color = c;
	            System.out.println("Color asignado correctamente");
	            break;
	        default:
	            System.out.println("Color incorrecto");
	    }
	}

	public char getColor() {
		char color=0;
	    return color;
	}

	public String getColorCadena(char color) {
		 color= 'a';
	    String auxiliar = color;///no puedo no se hacer funcionar
	    switch(color) {
	        case 'a':
	            auxiliar = "Amarillo";
	            break;
	        case 'v':
	            auxiliar = "Verde";
	            break;
	        case 'r':
	            auxiliar = "Rojo"; // Se asume 'r' es para rojo
	            break;
	        default:
	            auxiliar = "Color no definido";
	            break;
	    }
	    return auxiliar;
	}
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	ParametrosyValoresDevueltos alvaro=new ParametrosyValoresDevueltos();
	
		System.out.println("Introduce color");
//		char valor=entrada.next().charAt(0);
//	
//			alvaro.setColor(valor);
			
		System.out.println(	alvaro.getColorCadena());
}
}