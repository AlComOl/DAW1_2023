package src;

import java.util.*;
public class ecuacion_segundo_grado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		double a,b,c,res,res1,res2,discriminante;
//		
//		System.out.println("Introduce el valor de a");
//		a=entrada.nextDouble();
//		System.out.println("Introduce el valor de b");
//		b=entrada.nextDouble();
//		System.out.println("Introduce el valor de c");
//		c=entrada.nextDouble();
//		
//		discriminante=(Math.pow(b, 2)-4*a*c);
//		
//		if(discriminante>0) {
//			res1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));
//			
//			res2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));
//			
//			System.out.println( " x1 "+ res1 +"\n x2 "+ res2);
//		}else if(discriminante==0) {
//			
//			res=-b/(2*a);
//			System.out.println("La solucion de x es : "+ res);
//			
//			
//		}else {
//			
//			System.out.println("no hay soluciones reales");
//		}
		
		double x1,x2,a,b,c;
		
		System.out.println("Introduce el valor de a");
		a=entrada.nextDouble();
		System.out.println("Introduce el valor de b");
		b=entrada.nextDouble();
		System.out.println("Introduce el valor de c");
		c=entrada.nextDouble();
		
		x1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));		
		x2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));		
		System.out.println( " x1 "+ x1 +"\n x2 "+ x2);
		
		
		
		
		
		
		
		//ax^2+bx+c=0;
	}

}
