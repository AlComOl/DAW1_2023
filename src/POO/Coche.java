package POO;
import java.util.*;
/****************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:05/11/23


Descripción:
	Crea la clase Coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos constructores inicializarán los atributos marca y 
	modelo de la clase. Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.



***********************************************************************************************************************************/

public class Coche {
//Atributos 
	private String marca="Citroen";
	private String modelo="Diane6";

	//No toma parametros
	public Coche() {
//		this.marca="Renault";
//		this.modelo="5";
	}
	//toma paremetros
	public Coche(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
		
	}
//	Metodos
	public void setmarca(String marca) {
		this.marca=marca;
	}
	public String getmarca() {
		return marca;
	}
	public void setmodelo(String modelo) {
		this.modelo=modelo;
	}
	public String getmodelo() {
		return modelo;
	}
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		Coche seat = new Coche();//Instancia1
		
	System.out.println("Obtenemos valor del primer constructor Marca y Modelo por defecto");	
	System.out.println(seat.getmarca());
	System.out.println(seat.getmodelo());
	Coche ford =new Coche("Audi","A3");//Instancia2
	System.out.println("Obtenemos el valor del segundo constructor inicializandolo con los valores de Marca y Modelo");
	System.out.println(ford.getmarca());
	System.out.println(ford.getmodelo());
	System.out.println("Cambiamos el valor del del primer objeto");
	seat.setmarca("Alfa Romeo");
	seat.setmodelo("Spider");
	System.out.println(seat.getmarca());
	System.out.println(seat.getmodelo());
	System.out.println("Cambiamos el valor del del segundo objeto");
	ford.setmarca("Maserati");
	ford.setmodelo("Sline");
	System.out.println(ford.getmarca());
	System.out.println(ford.getmodelo());
	
		
		
		entrada.close();
	}
	
}
