package UT2.EstructurasDeControl;

import java.util.*;

public class PRG1 {

	public static void main(String[] args) {
		//DECLARACION
		Scanner entrada = new Scanner(System.in);
		int n1,n2;
		//ENTRADA
		System.out.println("Introduce numero");
		n1=entrada.nextInt();
		System.out.println("Introduce numero");
		n2=entrada.nextInt();
		//PROCESO
		if(n1>n2) {
			System.out.println("El mayor es "+n1);
		}else if (n2>n1){
			System.out.println("El mayor es "+n2);
		}else
			System.out.println("Los numeros son iguales");
			
		entrada.close();

	}

}
