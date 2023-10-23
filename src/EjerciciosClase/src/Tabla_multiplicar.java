package src.pruebasClase;

import java.util.*;

public class Tabla_multiplicar {
//le pide la tabla de multiplicar y te muestra la tabla 
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
//		int res ,n,centinela=-1;
//		do {
//		System.out.println("Que tabla de multiplicar quieres");
//		 n=entrada.nextInt();
////		if (n<1) {
////			System.out.println("Tiene que ser del 1 al 10");
////		}else {
//	
//			for(int i=0;i<=n;i++) {
//				System.out.println("***************************************"+"tabla de: "+i);
//			  for(int j=0;j<=n;j++) {
//				res=j*i;
//				System.out.println(i+" x" + j +"="+res);
//				
//				}
//			}
//		}while(n!=centinela);
//	    }
//	}
//}
		int i, j;
		for (i=1; i<=10;i++) //table i
		for (j=1; j<= 10; j++) //
		System.out.println(i + "*" + j + "=" + i*j );
		
	}
}