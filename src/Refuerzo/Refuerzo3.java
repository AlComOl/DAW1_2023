package Refuerzo;
import java.util.*;

public class Refuerzo3 {
	static	Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
//		Ejercicio 1 
		
//		ejercicio3_1();
		
//		Ejercicio2
		
//		ejercicio3_2();
		
		//	Ejercicio3
//		System.out.println("Precio real");
//		int	 pr=sc.nextInt();
//		System.out.println("Cuanto puedes llegar a pagar");
//		int	 pp=sc.nextInt();
//		
//		ejercicio3_3(pr,pp);
		
//		ejercicio 4 
		
//		ejercicio3_4();
//		ejercicio5
		
		System.out.println("Introduce el numero");
		int numero=sc.nextInt();
		ejercicio3_5(numero);
	}
	

	
	public static void ejercicio3_1() {
		
		double aux=0,n;

	
		do {
			System.out.println("Introduce el numero");
			
			 n=sc.nextDouble();	
			 if(n<0) {
				 break;
			 }else {
				 aux+=n; 
			 }
		}while (n>0);
			 System.out.println(aux);
	}
	
	
	
	public static void ejercicio3_2() {
		int numero=0;
		int aux=0,res;
		do {
			System.out.println("Introduce un numero de 4 cifras");
			numero=sc.nextInt();
//			filtra que el numero tenga 4 cifras
		}while(numero<=1000&&numero<=9999) ;	
//			si se cumple la condición descompone el numero
			aux=numero;
				while(aux>0) {
					res=aux%10;
					aux/=10;
					System.out.println(res);
				}
			
			
			
	}
			
//	
	
	public static void ejercicio3_3(int pr, int pp) {
		double cantidadDescontada;
		int porcentajeDescuento;
		
		 
		 cantidadDescontada=pr-pp;
		 
		 porcentajeDescuento=(int) ((cantidadDescontada/pr)*100);
		 System.out.println(porcentajeDescuento);
		
	 	 
		 System.out.println("Necesitas una oferta del "+ porcentajeDescuento+" %");
		 
		 
	}
	
	public static void  ejercicio3_4() {
		int n,nc,aux=0;
		System.out.println("Introduce un numero");
		 n=sc.nextInt();
		 nc=n;		
		 while(nc>0) {
			aux=nc%10;
			nc/=10;
			System.out.println(aux);
			
		}
		 
	}
	public static void ejercicio3_5(int param) {
		 int aux,n,acumula=0;
		 n=param;
		 
		 while(n>0) {
			 aux=n%10;
			 acumula+=aux;
			 n/=10;
		 }
		 System.out.println(acumula);
	 }	
		
	}
	

