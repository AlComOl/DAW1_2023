package src.Practica41023;
import java.util.*;

public class EJ_3 {

	public static void main(String[] args) {
		//DECLARACION
		Scanner entrada=new Scanner(System.in);
		
		double x=5.4 ,y=8.2, resultado, resultado2,resultado3,resultado1_2,resultado1_1;
		double	res3=(Math.pow(x,2)*Math.pow(y,2))/(Math.pow(x,3)+Math.pow(y,3));
//		System.out.println("Introduce el valor de x");
//		x=entrada.nextDouble();
//		
//		System.out.println("Introduce el valor de y");
//		y=entrada.nextDouble();
		////////////////////////////////////////////
		resultado=Math.sqrt(x+3*y);
		
		System.out.println("Raiz cuadrada de la primea es"+resultado);
////////////////////////////////////////////////////////////////
		
		resultado2=Math.log10(Math.pow(x, 2)+(Math.pow(y,2))/7);
		System.out.println("Logaritmo"+resultado2);
////////////////////////////////////////////////////////////////3expresion
		resultado3=Math.pow(res3,6);
		System.out.println("potencia 6"+resultado3);
///////////////////////////////////////////////////////////////	2 expresion potencia6	
		resultado1_2=Math.pow(resultado2, 6);
		System.out.println("Potencia 6"+resultado1_2);
//////////////////////////////////////////////////////////////	1 expresion potencia 6
		resultado1_1=Math.pow(resultado, 6);
		System.out.println("Potencia 6"+ resultado1_1);
		
		entrada.close();
		
	}

}
