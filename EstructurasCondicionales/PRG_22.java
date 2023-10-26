package EstructurasCondicionales;

/*************************************************************************************************************************

	Autor: Álvaro Comenge

	Fecha:25/10/23


	Descripción:

	Algoritmo que lee un número entero y positivo N y escribe los N primeros términos de la sucesión de Fibonacci.
	 La sucesión se caracteriza porque cada término es igual a la suma de sus dos anteriores, a0=1; a1=1; an=an-1 + an-2. 
	
	
****************************************************************************************************************************/
import java.util.*;
public class PRG_22 {
	public static void main(String [] args) {
		Scanner entrada=new Scanner(System.in);
		int m=1,n=1,f,aux=0;
		
		System.out.println("Introduce numero para terminar secuencia fibonachi");
		f=entrada.nextInt();
		System.out.println(n);//Empezaremos con n+m(1+1)
		System.out.println(m);
		for(int contador=0;contador<f;contador++) {
			
			//sumamos m , n siendo 1 para empezar la secuencia tienen que ser 2 numeros iguales
			aux=n+m;
			//metemos en n a m, y a aux en n de manera sumaremos el resultado de la suma con el anterior f veces , que será el numero de vueltas al bucle
			m=n;
			n=aux;
			
			System.out.println(aux);
		}
		
	}

}
