package Practica_301023;
import java.util.*;
public class E_3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el piso");
		int p=entrada.nextInt();
		
		switch (p) {
		
		case -2:
			System.out.println("Parking");
			break;
		case -1:
			System.out.println("Gimnasio y piscina");
			break;
		case 0:
			System.out.println("P-Baja");
			break;
		case 1:
			System.out.println("P-Entresuelo.Restaurante");
			break;
		case 10:
			System.out.println("Mirador");
			break;
		case 2,3,4,5,6,7,8,9:
			System.out.println("Planta "+p);
			break;
		default:
			System.out.println("El valor introducido no es correcto");
			break;
		}
	}

}
