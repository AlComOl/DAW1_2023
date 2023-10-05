package src.Practica41023;
//import java.util.*;
//public class cajonesBandejasNaranjas {
//
//	public static void main(String[] args) {
//		Scanner entrada=new Scanner(System.in);
//		int b1,b2,b3,aux,aux1,sumaKilosB;
//		double totalCajones;
//		
//		System.out.println("Dime bandejas de 1 kilo");
//		b1=entrada.nextInt();
//		
//		System.out.println("Dime bandejas de 2 kilos");
//		b2=entrada.nextInt();
//		
//		System.out.println("Dime bandejas de 3 kilos");
//		b3=entrada.nextInt();
//		
//		totalCajones=(b1+b2*2+b3*3)/12.00;
//		aux=(int)totalCajones;
//		
//		aux1=(aux==totalCajones)?0:1;
//		
//
//		
//		System.out.println("Deberias tener preparados "+(aux+aux1)+" cajones de naranjas");
//	}
//
//}

import java.util.*;
public class cajonesBandejasNaranjas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int b1,b2,b3,sumaKilosB;
		double totalCajones;
		
		System.out.println("Dime bandejas de 1 kilo");
		b1=entrada.nextInt();
		
		System.out.println("Dime bandejas de 2 kilos");
		b2=entrada.nextInt();
		
		System.out.println("Dime bandejas de 3 kilos");
		b3=entrada.nextInt();
		
		sumaKilosB=b1+b2*2+b3*3;
		totalCajones=(b1+b2*2+b3*3)/12.00;
	
		
		if(sumaKilosB%12==0) {
			
			System.out.println("Deberias tener preparados "+totalCajones+" cajones de naranjas");
			
		}else {
			System.out.println("Deberias tener preparados "+((sumaKilosB/12)+1)+" cajones de naranjas");
		}
		
		
		entrada.close();
	}

}

//////////////////////////////////////////////////////////LOGICA EMILIANO/////TRUNCAR VALOR Y COMPARAR////////////////////////////////


/*package UT1.PRACTICA_UT1;
import java.util.*;

public class Ej_4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int bandejas1,bandejas2,bandejas3,total , aSumar;
		double producto_necesito;
		
		System.out.println("Dime el numero de bandejas de un kilo");
		bandejas1=entrada.nextInt();
		System.out.println("Dime el numero de bandejas de un kilo");
		bandejas2=entrada.nextInt();
		System.out.println("Dime el numero de bandejas de un kilo");
		bandejas3=entrada.nextInt();
		
		
	    producto_necesito=(bandejas1+bandejas2*2+bandejas3*3)/12.0;
	  
		total=(int)producto_necesito;
		
		aSumar= ( producto_necesito == total )?0: 1;
				
				
		System.out.println("Deberias de tener preparados "+(total+aSumar) +" cajones de naranjas");
		 
		entrada.close();

		}
	}*/