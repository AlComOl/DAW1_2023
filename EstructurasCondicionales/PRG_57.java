package EstructurasCondicionales;
///*******************************************************************************************************************
//
//Autor: Álvaro Comenge
//
//Fecha:19/10/23A
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
		
		int n1,n2,res1,res2,mcd=0,aux,temp;
		
		 System.out.println("Introduce el numero");
			n1=entrada.nextInt();
		
		 System.out.println("Introduce el numero n2");
		 	n2=entrada.nextInt();
		 			if(n1<n2){//Ordeno numeros para tener en el divisor el mayor
		 				temp=n1;
		 				n1=n2;
		 				n2=temp;
		 			}//Guardo variables para hallar el resutado final 
		 			res1=n1;
		 			res2=n2;
        //dividir el valor mayor entre el menor, guardando el mayor en un aux,
		//darle el valor del menor al n1(dividendo), para dividirlo entre el resto(que es el divisor)
		 					while(n2>2) {//Algoritmo de uclides, Mientras el n2 sea mayor que 2 se ejecuta,
		 								 //ya que 1 es comun para todos
		 					aux=n1;//guardo en aux n1
		 					n1=n2;//el valor de n2 se lo doy a n1
		 					n2=aux%n2;//guardamos sucesivamente el valor del resto en n2
		 					mcd=n2;
		 					}
		 					
		 			System.out.println("Minimo comun multiplo "+res1*res2/mcd);
			 	entrada.close();
			 }
		 }
					 

		 		



