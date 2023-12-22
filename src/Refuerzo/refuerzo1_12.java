package Refuerzo;
import java.util.*;
/****************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:04/11/23


Descripción:
	Escribe un programa que pida al usuario un número entero de CUATRO cifras. En caso
	de no introducir un número de cuatro cifras, le seguirá pidiendo números hasta que lo
	introduzca.
	Finalmente, mostrará por pantalla una a una las cuatro cifras (empezando por la
	derecha).



Ejemplo:
	Introduce un número de cuatro cifras: 7845


		-> 5
		-> 4
		-> 8
		-> 7




***********************************************************************************************************************************/
public class refuerzo1_12 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
	
			
		System.out.println("Introduce un numero de 4 cifras");
		int n=entrada.nextInt();
		while (n>999&&n<9999) {
			int c1=n/1000%10;
			int c2=n/100%10;
			int c3=n/10%10;
			int c4=n/1%10;
			System.out.println(" ->"+c1+ "\n ->"+c2+"\n ->"+c3+"\n ->"+c4 );
			System.out.println("Introduce un numero de 4 cifras");
			n=entrada.nextInt();
		}
		System.out.println("El numero no tiene 4 cifras");
	}

}
