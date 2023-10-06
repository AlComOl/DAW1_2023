/*
  **********************************************************************************************************
  	Nombre:Álvaro Comenge 

	Fecha:29/09/23

	Ejercicio:
	36.	Algoritmo que lee dos números enteros, positivos y distintos y nos dice si el mayor es múltiplo del menor o,
	 lo que es lo mismo, si el menor es divisor del mayor
 
  *************************************************************************************************************
*/

package UT2.EstructurasDeControl;

import java.util.*;

public class PRG_36 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int n1,n2,res;
		
		System.out.println("Introduce 2 numeros enteros, positivos distintos");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		
		if(n1<0||n2<0||n1==n2) {
			System.out.println("El numero no cumple los requisitos (enteros, positivos y distintos)");
				
			}
		else if(n1>n2&&n1%n2==0) {
					
				System.out.println(n2+" es multiplo de "+n1);
		}else if(n2>n1&&n2%n1==0) {
				
				System.out.println(n1+"es multiplo de "+ n2);
			
		}
	
		
		
		
		
		entrada.close();

	}

}
