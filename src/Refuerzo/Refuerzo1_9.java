package Refuerzo;
/*
           Álvaro Comenge 
  
  
  
  
  		9. Escribe un programa que pida al usuario dos números enteros (sin importar el orden)
			y que muestre la cuenta desde el menor hasta el mayor
 */
 import java.util.*;
public class Refuerzo1_9 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce 2 numeros enteros");
		int n = entrada.nextInt();
		int n1 = entrada.nextInt();
		if(n<n1) {
			for(;n<=n1;n++) {
				System.out.println(n);
			}
		
		}else{///MAL
			for(;n>=n1;n1++)
				System.out.println(n1);
			}

	}
}
