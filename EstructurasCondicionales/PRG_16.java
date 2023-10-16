package EstructurasCondicionales;
/******************************************************

Autor: Álvaro Comenge

Fecha:7/10/23


	Descripción:

	Acepta 10 números enteros y muestra su suma.
	
	
*******************************************************/

import java.util.*;
public class PRG_16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int aux=0;
		
		System.out.println("Introduce 10 numeros");
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		aux+=entrada.nextInt();
		
		System.out.println(aux);
		
		entrada.close();
	}
}