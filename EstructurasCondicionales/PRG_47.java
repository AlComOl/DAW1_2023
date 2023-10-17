package EstructurasCondicionales;



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
