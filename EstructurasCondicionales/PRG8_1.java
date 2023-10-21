package EstructurasCondicionales;
/******************************************************

Autor: Álvaro Comenge

Fecha:10/10/23


	Descripción:

	Acepta un número entero por teclado, y muestra un mensaje indicando si el número es positivo, negativo o nulo.
	
	
*******************************************************/
import java.util.*;

public class PRG8_1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int n=entrada.nextInt();
		
		if(n==0) {
			System.out.println("nulo");
		}else if(n>0){
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
	}
}