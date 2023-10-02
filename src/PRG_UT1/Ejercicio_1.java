
/*
 * *****************************************************************************************
  	Nombre:Álvaro Comenge 

	Fecha:29/09/23

	Ejercicio:

 	Muestra por pantalla la suma de tres números enteros, introducidos por teclado.
*********************************************************************************************	
	*/


package PRG_UT1;
import java.util.*;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n1,n2,n3,aux=0;
		System.out.println("Introduce 3 numeros enteros");
		n1=entrada.nextInt();
		aux+=n1;
		System.out.println("Introduce otro");
		n2=entrada.nextInt();
		aux+=n2;
		System.out.println("Introduce el tercero");
		n3=entrada.nextInt();
		aux+=n3;
		System.out.println("La suma de los 3 numeros enteros es: " + aux);
	}

}
