package Refuerzo;
/*
 * 10. Escribe un programa que vaya pidiéndole al usuario resultados de una tirada de dado.
	Tras introducir cada resultado, el programa debe indicar cuál es la cara opuesta del
	dado (la cara no visible que ha quedado apoyada sobre la mesa, vamos). El programa
	seguirá pidiendo resultados y mostrando la cara oculta hasta que el usuario introduzca
	un valor no válido.
	Recuerda: Un valor válido es cualquier valor entero entre 1 y 6, incluidos. Además, en
	todos los dados legales las caras opuestas suman siempre 7

	Tras introducir cada resultado, el programa debe indicar cuál es la cara opuesta del
	dado (la cara no visible que ha quedado apoyada sobre la mesa, vamos). El programa
	seguirá pidiendo resultados y mostrando la cara oculta hasta que el usuario introduzca
	un valor no válido.
	
	Recuerda: Un valor válido es cualquier valor entero entre 1 y 6, incluidos. Además, en
	todos los dados legales las caras opuestas suman siempre 7
 */
import java.util.*;

public class Refuerzo1_10 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n;
		
		
		
		do {
			
			System.err.println("Introduce la cara del dado");
			n=entrada.nextInt();
			
				switch (n) {
				case 1:
					System.out.println("la cara opuesta es 6");
					break;
				case 2:
					System.out.println("la cara opuesta es 5");
					break;
				case 3:
					System.out.println("la cara opuesta es 4");
					break;
				case 4:
					System.out.println("la cara opuesta es 3");
					break;
				case 5:
					System.out.println("la cara opuesta es 2");
					break;
				case 6:
					System.out.println("la cara opuesta es 1");
					break;
	
				default:
					System.out.println("El numero es incorrecto");
					break;
				}
			
		}while(n!=1&&n!=2&&n!=3&&n!=4&&n!=5&&n!=6);	
	}
}