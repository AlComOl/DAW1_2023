package pruebasClase;
import java.util.*;
public class numParImpar {
	 public static void main(String[] args){
	        Scanner tec = new Scanner(System.in);
	     
	        int num, numPar, numImpar;

	        System.out.println("Dame un número");
	        num = tec.nextInt();

	            /* if(num % 2 == 0){
	                  System.out.println(num+2);
	               }else{
	                  System.out.println(num+1);
	               }
	        
	             if(num % 2 == 0){
	                  System.out.println(num-2);
	               }else{
	                  System.out.println(num-1);
	               }
	            */
	        
	            numPar = (num % 2 == 0) ? num + 2 : num + 1;
	            numImpar = (num % 2 == 1) ? num  - 2  : num - 1;
	        
	            System.out.println("El número par mayor es: " + numPar);
	            System.out.println("El número impar menor es: " + numImpar);
}
}