package Refuerzo;
import java.util.*;


public class refuerzo2_2 {
	static Scanner sc=new Scanner(System.in);
	
	public static String Saludo () {
		
		return "Hola Buenos dias";
		
	}
	
	public static String Introducirpalabra() {
		System.out.println("Dime una palabra");
		String palabra;	
		palabra=sc.nextLine();
		return palabra;
		
		}
	
	public static int Introducirrepeticion() {
		int repeticion;
		System.out.println("Cuantas veces la repito");
		repeticion=sc.nextInt();
		
		return repeticion;
	}
		
		public static String  salida(String palabra,int repeticion ) {
			
			for(int i=1; i<repeticion;i++) {
				
			System.out.println(palabra);
			}
			
			return palabra;
		}
		
	
	public static String adios() {
		return "Adiós hasta la próxima.";
	}
	
	
	public static void main (String [] args) {
		
		
		Saludo();
		System.out.println(salida(Introducirpalabra(),Introducirrepeticion()));
		System.out.println(adios());
	}

}
