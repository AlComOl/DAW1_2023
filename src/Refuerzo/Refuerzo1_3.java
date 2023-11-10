package Refuerzo;

import java.util.Scanner;

/*
  	Álvaro Comenge
  
 	3. Escribe un programa que pida al usuario dos números enteros (sin importar el orden).
	A continuación, le pedirá que adivine e introduzca la resta entre el número mayor y el
	número menor. Finalmente, el programa le indicará al usuario si ha acertado o no
	
	
 */
public class Refuerzo1_3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int res1;
		System.out.println("Introsuce dos numeros enteros");
		int n=entrada.nextInt();
		int n1=entrada.nextInt();
		
		System.out.println("Adivina la resta entre el numero mayor y el menor");
		int res=entrada.nextInt();
		
		res1=(n>n1)?(n-n1):(n1-n);
		
		String resFinal=(res1==res)?"acertado":"no has acertado";
		
		System.out.println(resFinal);
		

	}

}
