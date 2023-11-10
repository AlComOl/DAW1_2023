package EstructurasCondicionales;

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
		 int n,i,aux=0;
			do {
				System.out.println("Introduce un numero entero y positivo");
					n=entrada.nextInt();
					while(n<0){
						System.out.println("Introduce valor correcto");
						n=entrada.nextInt(); //for(n=entrada.nextInt();n<0; )
					}
//						if(n<0) {
//							
//						}else {
							for(i=1;n>=i;i++) {
								if(n%i==0) {
									aux+=i;//acumulador
								}
							}
//						}
						System.out.println("La suma de los divisores es:"+aux);
						aux=0;
			} while (n>0); 
			
	}
}
		
		 
		 
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
//	}
//}


//	public class PRG_47 {
//
//		public static void main(String[] args) {
//			Scanner entrada=new Scanner(System.in);
//			int i,n,Suma=0,aux=0;
//			//creo que el bucle while es el mas optimo, auque para hacer
//			do {
//				System.out.println("Introduce un numero");
//				n=entrada.nextInt();
//	
//				for(i=1;n>=i;i++) {
//					if(n%i==0) {
//						aux+=i;//acumulador
//					}
//					}
//				System.out.println(""+aux);
//				aux=0;
//			} while (n>0); 
//			
//				
//			
//	}
//}


//public class PRG_47 {
//	public static void main(String[] args) {
//		 Scanner entrada = new Scanner(System.in);
//		 int n,i,res,aux=0;
//		
//			System.out.println("Introduce un numero entero y positivo");
//			n=entrada.nextInt();
//		
//			if(n<0) {
//				System.out.println("El numero es negativo");
//			}else {
//			for(i=1;n>=i;i++) {
//				if(n%i==0) {
//					aux+=i;//acumulador
//				}
//				}
//			System.out.println("La suma de los divissores de : "+n+" es : "+aux);
//			aux=0;
//			}
//	}
//}
