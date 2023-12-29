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
		
		ejercicio3_3(60,24);

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
		int numero;
		int aux=0,res;
		System.out.println("Introduce un numero de 4 cifras");
			numero=sc.nextInt();
			aux=numero;
			do {
				res=aux%10;
		 
				aux/=10;
		
				System.out.println(res);
		
			}while(aux>0) ;	
	}
		
	
	public static void ejercicio3_3(int pr, int pp) {
		double cantidadDescontada;
		int porcentajeDescuento , ct;
		System.out.println("Precio real");
		 pr=sc.nextInt();
		System.out.println("Cuanto puedes llegar a pagar");
		 pp=sc.nextInt();
		 
		 cantidadDescontada=pr-pp;
		 
		 porcentajeDescuento=(int) ((cantidadDescontada/pr)*100);
		 System.out.println(porcentajeDescuento);
		 ct=100-porcentajeDescuento;
		 
		 System.out.println("Necesitas una oferta del "+ porcentajeDescuento+" %");
		 
		 
	}
		
		
	}
	

