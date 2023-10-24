package EstructurasCondicionales;

/****************************************************************************

	Autor: Álvaro Comenge

	Fecha:24/10/23


	Descripción:

	Calcula el cociente de 2 números enteros aceptados por teclado mediante restas sucesivas
	
*******************************************************************************/
import java.util.*;

public class PRG_21 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int dividendo,divisor,cociente;
		System.out.println("Introduce el el dividendo");	
	    dividendo=entrada.nextInt();
	    System.out.println("Introduce el el divisor");	
	    divisor=entrada.nextInt();

            for(cociente=0;divisor<=dividendo;cociente++) {
	    	dividendo-=divisor;
	    	
	    	
	    }
            System.out.println(cociente);
            entrada.close();
                  }
      }