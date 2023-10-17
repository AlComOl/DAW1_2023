package EstructurasCondicionales;
<<<<<<< HEAD
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:14/10/23A

Descripción:

	Algoritmo que lee un número entero y positivo N y calcula y escribe la suma de sus divisores. 

*****************************************************************************************************************/
import java.util.*;

public class PRG_47 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 int n,i,res,aux=0;
		
			System.out.println("Introduce un numero entero y positivo");
			n=entrada.nextInt();
		 do {
			if(n<0) {
				System.out.println("El numero es negativo");
			}else {
			for(i=1;n>=i;i++) {
	
				if(n%i==0) {
					res=n/i;
					aux+=res;//acumulador
				}
				}
			System.out.println(aux);
			}
			 } while (n<0);
		     
		 
		
		
		 
		 
//		 int n, o = 0, divi = 1;
//		    
//		 System.out.println("Dame un numero entero: ");
//		    n = entrada.nextInt();
//
//		    while (divi <= n) {
//		            if (n % divi == 0) {
//		               o = o + divi; 
//		            }
//		        divi ++;
//		    }
//
//		    System.out.println("La suma de los divisores de " + n + " es " + o);
	}
}
=======



	import java.util.*;
	/*******************************************************************************************************

	Autor: Álvaro Comenge

	Fecha:17/10/23


		Descripción:

		Algoritmo que lee un número entero y positivo N y calcula y escribe la suma de sus divisores.
		
	********************************************************************************************************/
	public class PRG_47 {

		public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			int n,Suma=0;
			
			do {
				Suma+=0;
				System.out.println("Introduce un numero");
				n=entrada.nextInt();
			} while (n>0); 
			System.out.println(""+Suma);
				
			
		}

	}
>>>>>>> b48c777dc64498bab87c1129894cf90ce76aac81
