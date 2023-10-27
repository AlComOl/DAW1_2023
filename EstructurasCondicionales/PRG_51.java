package EstructurasCondicionales;
/**********************************************************************************************************************

Autor: Álvaro Comenge

Fecha:18/10/23


	Descripción:
	Programa que calcula el producto de dos números enteros positivos mediante el denominado “algoritmo ruso del producto”.
	 Este algoritmo consiste en duplicar el primer factor y dividir (cociente entero) por 2 el segundo hasta que el 
	 segundo factor se hace 0. Cuando el segundo factor es impar se acumula el primer factor donde se va a obtener el resultado. 
	 Ejemplo: Primer factor Segundo factor Acumulador 25 6 0 
	 												  50 3 50
	 												 100 1 150
	 												 200 0 150
	
	
	
************************************************************************************************************************/
import java.util.*;

public class PRG_51 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
				int n,m,nc,mc,acumula=0;
				System.out.println("Introduce el primer valor");
				n=entrada.nextInt();
				System.out.println("Introduce el segundo valor");
				m=entrada.nextInt();
				
				nc=n;
				
				mc=m;
				
				while(m>0) {
					if(m%2!=0) {
						System.err.println(n+"   "+m+"  "+"    "+acumula);
						acumula+=n;//acumula=acumula+n
					}
					n*=2;
					m/=2;
					
				}
				
		System.out.println("El producto de "+ nc + " y " + mc + " da como resultado "+ acumula);
	}
	
}
//public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//
//        int pFactor,n,m, sFactor, pFAux, sFAux, contador = 0;
//
//        System.out.println("Dame un primer factor: ");
//        n = sc.nextInt();
//
//        System.out.println("Dame un segundo factor: ");
//        m = sc.nextInt();
//
//        pFAux = n;
//        sFAux = m;
//
//        while (m > 0) {
//        	System.err.println(n+"   "+m+"  "+"    "+contador);
//            if (m % 2 != 0) {
//
//                contador += n;
//
//            }
//
//            n *= 2;
//            m /= 2;
//
//        }
//
//        System.out.println("El producto del factor "+ pFAux +" y " + sFAux +" da como resultado "+ contador);
//
//        sc.close();
//}
//}
