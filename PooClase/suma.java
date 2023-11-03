package PooClase;

import java.util.*;

public class suma {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un valor");
		double n= entrada.nextDouble();
		System.out.println("Introduce un valor");
		double n1= entrada.nextDouble();
		
		calcularSuma(n,n1);
		
	}
	
	//metodo
	
	public static void calcularSuma(double num,double num1) {
		
		double res=num+num1;
		System.out.println(res);
	}
	
	}
	
