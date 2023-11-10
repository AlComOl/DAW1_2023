package Refuerzo;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Escribe un programa que vaya pidiendo números al usuario. Mientras se introduzcan
	números positivos, el programa seguirá pidiendo números. En cuanto se introduzca un
	número negativo, el programa se detendrá, se despedirá del usuario y mostrará por
	pantalla la suma de todos los números introducidos.
		a) Contando el último número negativo introducido.
		b) Sin contar el último número negativo introducido.

******************************************************************/
import java.util.*;

public class Refuerzo1_8 {


	public static void main(String[] args) {
			Scanner entrada= new Scanner(System.in);
			int aux=0,n=0;
			//////B)Sin contar el ultimo numero negativo introducido/////////////////////////////////////////////////
			do {
			System.out.println("Introdue un numero");
			n = entrada.nextInt();
			aux+=n;
			}while(n>=0);
			System.out.println("La suma de los numeros es :"+aux);
			
			System.out.println("Adios");
			////////////////A)Contando el numero negativo introducido////////////////////////////////////////   */
			
			/*while(n>=0) {
			System.out.println("Introdue un numero");
			n = entrada.nextInt();
			aux+=n;
			System.out.println(aux);
			}
			System.out.println("La suma de los numeros es :"+aux);
			
			System.out.println("Adios");*/
			
		entrada.close();		
	}
}