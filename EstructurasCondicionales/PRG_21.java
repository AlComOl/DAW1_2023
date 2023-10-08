package EstructurasCondicionales;
/*****************************************************************

	Autor: Álvaro Comenge

	Fecha:8/10/23


	Descripción:

	Calcula el cociente de 2 números enteros aceptados por teclado mediante restas sucesivas.
	
	
*******************************************************************/

import java.util.*;
public class PRG_21 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int cont=0;
		System.out.println("Introduce el el dividendo");	
	    int	dividendo=entrada.nextInt();
	    System.out.println("Introduce el el divisor");	
	    int	divisor=entrada.nextInt();
	    
	    for(int i=0;i<=dividendo;i++) {
	    	
	    	int	res=dividendo-divisor;
	    	dividendo=res;
	    	cont++;
	    }
	    
		System.out.println((cont+1));
		
		System.err.println((3+(5*2-1)%2));
		entrada.close();
	}

}
