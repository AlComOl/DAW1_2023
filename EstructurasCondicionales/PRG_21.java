package EstructurasCondicionales;

import java.util.*;

public class PRG_21 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int cociente=0;
		System.out.println("Introduce el el dividendo");	
	    int	dividendo=entrada.nextInt();
	    System.out.println("Introduce el el divisor");	
	    int	divisor=entrada.nextInt();

            while(dividendo>divisor) {
	    	dividendo-=divisor;
	    	
	    	cociente++;
	    }
	    System.out.println(cociente);
            entrada.close();
                  }
      }