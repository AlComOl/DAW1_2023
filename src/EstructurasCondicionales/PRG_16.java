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
		int n,aux=0;
		
		for(int i=0;i<=10;i++) {
			System.out.println("Introduce numero");
		    n=entrada.nextInt();
			
		}
		
		System.out.println(aux);
		
		entrada.close();
	}
}