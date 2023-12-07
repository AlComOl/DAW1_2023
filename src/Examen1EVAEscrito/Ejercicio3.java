package Examen1EVAEscrito;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a;
		System.out.println("Introduce el numero");
		a=entrada.nextInt();
		if(a>2&&4>=a) 
			System.out.println("a");
		else
			switch (7/a*2+1) {
				
			default :
				System.out.println("b");
			case 3:
				System.out.println("c");
			case 1:	
				break;
			case 7:	
				System.out.println("d");
				
			case 0:
				System.out.println("e");
				break;
			
			}
			System.out.println("f");

	}

}
