package Refuerzo;
/*
 * Álvaro Comenge 
 * 
 * 
 * 		Escribe un programa que pida al usuario dos números enteros (sin importar el orden)
		y que muestre la cantidad de múltiplos de 5 que hay entre ellos.
 */
import java.util.*;

public class Refuerzo1_11 {

	public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			int cont=0,temp=0,aux=0;
			final int CONST=5;
			System.out.println("Introduce 2 numeros enteros ");
			int n= entrada.nextInt();
			int n1= entrada.nextInt();
			if(n<n1) {
				temp=n;
				n=n1;
				n1=temp;
			}
			while(n>=n1&&aux<=n) {
			n-=CONST;
			aux=n;
			System.out.println(aux);
			
			cont++;
			
		
			}
				System.out.println((cont-1));
				
				entrada.close();
	}

}
