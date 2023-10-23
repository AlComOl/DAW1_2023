package src.pruebasClase;
/*
  **********************************************************************************************************
  	Nombre:Álvaro Comenge 

	Fecha:29/09/23

	Ejercicio:
	Muestra por pantalla la suma de tres números reales, introducidos por teclado.
 
  *************************************************************************************************************
*/



import java.util.*;

public class PRG_2 {
	public static void main(String[] args) {
		//DECLARACIONES
		Scanner entrada=new Scanner(System.in);
		float n,aux;
		aux=0;
		//ENTRADA//PROCESO
		System.out.println("Introduce 3 numeros");
		n=entrada.nextFloat();
		aux+=n;
		n=entrada.nextFloat();
		aux+=n;
		n=entrada.nextFloat();
		aux+=n;
		
		//SALIDA
		System.out.println(aux);
		
		entrada.close();
		
	}
}
