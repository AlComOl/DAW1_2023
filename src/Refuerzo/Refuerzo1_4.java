package Refuerzo;
/*
	Álvaro Comenge

	Escribe un programa que vaya pidiendo números al usuario. Mientras se introduzcan
	números positivos, el programa seguirá pidiendo números. En cuanto se introduzca un
	número negativo, el programa se detendrá y se despedirá del usuario.


*/
import java.util.*;

public class Refuerzo1_4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double n;
		do {
		System.out.println("Dame un numero");
		n=entrada.nextDouble();
		
		
		}while(n>0);
		System.out.println("Los numeros negativos detienen el programa");
		
	}
	
	}