package pruebasClase;

import java.util.*;

public class imversor_cuatro_n {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce 4 numeros enteros");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		int n4 = entrada.nextInt();
		int temp=n1;
		
		  	n1 = n4;
	        n4 = temp;
	        temp = n2;
	        n2 = n3;
	        n3 = temp;
	        
	        int numeroInvertido= n1*1000 + n2*100 + n3*10 + n4;  
		
		System.out.println("El numero invertido es igual "+ numeroInvertido);
		
		

	}

}
