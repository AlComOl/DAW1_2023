package Practica_301023;
import java.util.*;
public class E_1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el primer color");
		char c=entrada.next().charAt(0);
		System.out.println("Introduce el primer color");
		char c1=entrada.next().charAt(0);
		
		
			
		if(c=='R') {
			if(c1=='R'){
					System.out.println("El color es ROJO");
			}else if(c1=='V') {
				System.out.println("El color es AMARILLO");
			}else if(c1=='A') {
				System.out.println("El color es MORADO");
		}else {
			System.out.println("No esta en la paleta de COLOR");
		}
		}
			
		if(c=='V') {
			if(c1=='V'){
					System.out.println("El color es VERDE");
			}else if(c1=='R') {
				System.out.println("El color es AMARILLO");
			}else if(c1=='A') {
				System.out.println("El color es TURQUESA");
		}else {
			System.out.println("No esta en la paleta de COLOR");
		}
		}
		if(c=='A') {
			if(c1=='A'){
					System.out.println("El color es AZUL");
			}else if(c1=='V') {
				System.out.println("El color es TUURQUESA");
			}else if(c1=='R') {
				System.out.println("El color es MORADO");
		}else {
			System.out.println("No esta en la paleta de COLOR");
		}
		}
		}
		}
		
	


