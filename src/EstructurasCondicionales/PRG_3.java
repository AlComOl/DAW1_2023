package EstructurasCondicionales;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:6/10/23

Descripción:33. Algoritmo que lee tres números cualesquiera y los escribe ordenados de forma descendente.

******************************************************************/
import java.util.*;

public class PRG_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer numero");
		int n = entrada.nextInt();
		System.out.println("Introduce el segundo numero"); 
		int n1 = entrada.nextInt();
		System.out.println("Introduce el tercer numero"); 
		int  n2 = entrada.nextInt();
		 
	//Averigüo la cantidad de convinaciones posibles y si pasa  por  && , se ordena 
		
		
		 if (n < n1 && n < n2 && n1 < n2) { //123
			System.out.println("Los numeros introducidos en orden ascendente "+n2+","+n1+","+n);
		 }else if (n < n1 && n < n2 && n1 > n2) { //132
			 System.out.println("Los numeros introducidos en orden ascendente "+n1+","+n2+","+n); 
		 }else if (n > n1 && n < n2 && n1 < n2) { //213
			 System.out.println("Los numeros introducidos en orden ascendente "+n2+","+n+","+n1);
		 }else if (n < n1 && n > n2 && n1 > n2) {//231
			 System.out.println("Los numeros introducidos en orden ascendente "+n1+","+n+","+n2);
		 }else if (n > n1 && n > n2 && n1 > n2) {//321
			 System.out.println("Los numeros introducidos en orden ascendente "+n+","+n1+","+n2);
		 }else if (n > n1 && n1 < n2 && n2 < n) {//312
			 System.out.println("Los numeros introducidos en orden ascendente "+n+","+n2+","+n1);
		 }else {
			 
			 System.out.println("Hay numeros  que son iguales");
			 
			 entrada.close();
		 }
	}

}
