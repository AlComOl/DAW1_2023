package EstructurasCondicionales;
///*******************************************************************************************************************
//
//Autor: Álvaro Comenge
//
//Fecha:18/10/23A
//
//Descripción:
//
//	Programa que lee dos números N1 y N2 enteros positivos y obtiene su mínimo común múltiplo. (Se sabe que el mínimo común múltiplo 
//	de dos números es igual a su producto N1 · N2 dividido entre su MCD). 
//
//******************************************************************************************************************/
import java.util.*;
public class PRG_57 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int n1 , n2,res,temp,resto,cociente;
		
		 System.out.println("Introduce el numero");
			n1=entrada.nextInt();
		
		 System.out.println("Introduce el numero n2");
		 	n2=entrada.nextInt();
		 			if(n1<n2) {
		 				temp=n1;
		 				n1=n2;
		 				n2=temp;
		 				cociente=n1/n2;
		 				resto=n1%n2;
		 				
		 				if(n1%n2!=0) {
		 					for(int i=0;n1>i;i++) {
		 					cociente%resto
		 				}
		 			}
		 		
		 				
		 		

	}
}

