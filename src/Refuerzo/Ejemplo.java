package Refuerzo;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String valor=teclado.nextLine();
		saluda(valor);
		

	}
	
	public static void saluda(String valor) {

		System.out.println("Hola "+valor+" soy un procedimiento");
		System.out.println("Aunque en realidad soy un metodo");
	}
	
	

}
