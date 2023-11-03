package PooClase;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce cadena");
		String q=entrada.nextLine();
		
		System.out.println("Introduce un valores");
		int n= entrada.nextInt();
		int m= entrada.nextInt();
		int s= entrada.nextInt();
		int t= entrada.nextInt();
//		calculaFactorial(n);
		System.out.println(sumaConTexto(q,n,m,s,t));

	}
//	Con esta funcion podemos Escribir un cadena y encadenarla a al resultado de la suma 
	public static String sumaConTexto(String param1, int param2, int ...params){
		int acumulador = 0;
		for(int num:params)
			
			acumulador += num;
		return param1+acumulador;
		
	}
	
//	metodo
	public static void calculaFactorial(double num) {
		int factorial=1;
		for(int i=1;i<=num;i++) {
		
			factorial=factorial*i;
			
		}
			System.out.println(factorial);

	}
	
	
	
	
	public static int suma(int ...params){
		
		int acumulador = 0;
		for(int num:params)
			
			acumulador += num;
		return acumulador;
	}

	
}