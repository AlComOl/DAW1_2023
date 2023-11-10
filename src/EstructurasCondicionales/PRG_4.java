package EstructurasCondicionales;

import java.util.Scanner;

/*****************************************************************

Autor: Álvaro Comenge

Fecha:6/10/23

Descripción:

******************************************************************/
public class PRG_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la nota");
		float n = entrada.nextFloat();

		if(n<=3) {
			System.out.println("Muy deficiente(MD)");
		}else if(n>=3&&n<=4.99) {
			System.out.println("Insuficiente(I)");
		}else if(n>=5&&n<6) {
			System.out.println("Suficiente(SF)");
		}else if(n>=6&&n<7) {
			System.out.println("Bien(B)");
		}else if(n>=7&&n<=8.99) {
			System.out.println("Notable(N)");
		}else if(n>=9&&n<=10) {
			System.out.println("Sobresaliente(SS)");
		}else if(n==10) {
			System.out.println("Matricula de honor(MD)");
		}
		entrada.close();
		}
	}

