package src.pruebasClase;
/*
  **********************************************************************************************************
  	Nombre:Álvaro Comenge 

	Fecha:30/09/23

	Ejercicio:
        Acepta un número entero y muestra por pantalla el número par(mayor) más próximo.
  *************************************************************************************************************
*/


import java.util.Scanner;

public class PRG_5 {

	public static void main(String[] args) {
		//DECLARACION
		Scanner entrada= new Scanner(System.in);
		int n, parmayor;
		//ENTRADA
		System.out.println("Introduce numero");
		n = entrada.nextInt();
		//Si el resto es igual a 0 el numero par le sumo 2, si no es igual a 0 impar sumo 1
		//PROCESO
		parmayor = (n%2==0)? (n+2):(n+1);
		//SALIDA
		System.out.println("El par mayor del numero introducido es "+parmayor);
		
		entrada.close();
	}

}
