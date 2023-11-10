package EstructurasCondicionales;

/****************************************************************************

	Autor: Álvaro Comenge

	Fecha:25/10/23


	Descripción:

	Calcula la potencia de 2 números aceptados por teclado mediante productos
	
	
*******************************************************************************/

import java.util.*;
public class PRG_20 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double aux=1;//es un productorio
		
		System.out.println("Introduce base");
		int b=entrada.nextInt();
		System.out.println("Introduce exponente");
		int e=entrada.nextInt();
		
		for(int i=0;i<e;i++) {
			aux=aux*b;
		}
		System.out.println(aux);
		
		entrada.close();
	}

}
