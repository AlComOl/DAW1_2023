
/*
 * *****************************************************************************************
  	Nombre:Alvaro Comenge 

	Fecha:29/09/23

	Ejercicio:

 	Realiza un programa que calcule el coste de una llamada telefónica de acuerdo
	a las siguientes premisas: a) Toda llamada que dure menos de tres minutos cuesta 
	12 céntimos. b) Cada minuto adicional a partir de los tres cuesta 9 céntimos.
*********************************************************************************************	
	*/



package UT1;

import java.util.*;

public class PRG_17 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		float tiempo_llamada,res1,res2;
		final float coste=0.12F,coste_m=0.9F;
		float precio;
		
		System.out.println("Introduce el tiempo en minutos de la llamada");
		
		tiempo_llamada=entrada.nextFloat();
		
			res1=tiempo_llamada*coste;
			res2=coste+(tiempo_llamada*coste_m);
			
	/*	if(tiempo_llamada<0) {
			System.out.println("Has introducido un valor erroneo");
		} if(tiempo_llamada<=3) {
			System.out.println("El precio de la llamada es "+res1);
		}else {
			System.out.println("El precio de la llamada es "+res2);
		}*/
		
		
		precio=(tiempo_llamada<3) ? res1 : res2 ;
		
		System.out.println("El precio de la llamada es "+ precio);
		entrada.close();
	}
	

}
