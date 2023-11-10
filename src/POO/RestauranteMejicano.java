package POO;
import java.util.*;
public class RestauranteMejicano {

	//Atributos 
//	private double chocos;
//	private double papas;
//	constructor
//	public RestauranteMejicano() {
//		
//	}
	
//	Metodos 
	
	public static  String disponivilidad(double chocos, double papas) {
	double	personasPapas=(int) (papas/3);	
	double personasChoco=(int) (chocos/0.5);
	return"Con la cantidad  de chocos introducida el restaurante puede ateneder a "+ personasChoco +"personas "+"\n y con la cantidad de papas introducida "+personasPapas;
	 
	}
	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce el numero de Chocos");
			double ch=entrada.nextDouble();
			System.out.println("Introduce el numero de Chocos");
			double p=entrada.nextDouble();
			
			System.out.println(disponivilidad(ch,p));
			
			
	}

}
