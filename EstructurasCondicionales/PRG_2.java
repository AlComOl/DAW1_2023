package EstructurasCondicionales;

/******************************************************

	Autor: Álvaro Comenge

	Fecha:6/10/23


 	Descripción:
 
 	Algoritmo que lee tres números distintos y nos dice cuál de ellos es el mayor.
 	
 	
*******************************************************/

import java.util.*;
public class PRG_2 {

public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);


	System.out.println("Introduce numeros");	
	int n = entrada.nextInt();
	int n1 = entrada.nextInt();
	int n2 = entrada.nextInt();
	
	if(n==n1||n1==n2||n1==n2) {
		System.out.println("Los numeros han de ser distintos(vuelve a introducirlos)");
	}else if (n>n1 && n>n2) {
		System.out.println("El numero mayor es "+ n);
	}else if(n1>n && n1>n2){
		System.out.println("El numero mayor es "+ n1);	
	}else if(n2>n1 && n2>n){
		System.out.println("El numero mayor es "+ n2);
							}
	
	entrada.close();
										}

					}