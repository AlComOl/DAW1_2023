package EstructurasCondicionales;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:6/10/23

Descripción:

Algoritmo que lee tres números cualesquiera y nos indica todas sus relaciones de igualdad.



******************************************************************/
import java.util.*;

public class PRG_5 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros diferentes");
		double n1=entrada.nextDouble();
		double n2=entrada.nextDouble();
		double n3=entrada.nextDouble();
		
		if(n1==n2||n2==n3||n1==n3) {
			System.out.println("Hay algun numero igual(hay que introducir numeros diferentes)");
		}else if(n1<n2&&n1<n3&&n2<n3) {
			System.out.println(n1 +" < "+n2+" < "+n3);
		}else if(n1<n2&&n2>n3&&n1<n3) {
			System.out.println(n1+" < "+n2+" > "+n3);
		}else if(n1>n2&&n2<n3&&n3>n1) {
			System.out.println(n1+" > "+n2+" < "+n3);
		}else if(n1<n2&&n2>n3&&n2>n3) {
			System.out.println(n1+" < "+n2+" > "+n3);
		}else if(n1>n2&&n2<n2&&n1>n3) {
			System.out.println(n1+" > "+n2+" < "+n3);
		}else if(n1>n2&&n2>n3&&n2>n3) {
			System.out.println(n1+" > "+n2+" > "+n3);
		}else
		entrada.close();
	}

}
