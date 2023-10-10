package src.PRG_UT1;
import java.util.*;

public class Ejercicio_1 {
	//Muestra por pantalla la suma de tres números enteros, introducidos por teclado.
	//prueba

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Introduce 3 numeros enteros");
		n1=entrada.nextInt();
		System.out.println("Introduce otro");
		n2=entrada.nextInt();
		System.out.println("Introduce el tercero");
		n3=entrada.nextInt();
		
		System.out.println("La suma de los 3 numeros enteros es: " +(n1+n2+n3));
	}

}
