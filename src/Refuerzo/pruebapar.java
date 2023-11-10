
package Refuerzo;

import java.util.*;

public class pruebapar {

	public static void main(String[] args) {
		
		    Scanner entrada=new Scanner(System.in);
		   
		    System.out.println("Ingresa un numero");
		    int n = entrada.nextInt();
		    do {
		    if(n>2) {
		    	while(n>2) {
		    		n=n-2;
		    	}
		    }if (n==2){
		    		System.out.println("El numero es par");
		    }else {
		    		System.out.println("El numero es impar");
		    }
		   
		}while(n !=0);
	}
}

