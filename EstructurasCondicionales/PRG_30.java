package EstructurasCondicionales;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:7/10/23


	Descripción:

	Acepta un número entero y comprueba si es primo o no.
	
	
*******************************************************************/

import java.util.*;
public class PRG_30 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int n,res,primo,cont=0;
		System.out.println("Introduce el numero");
		n=entrada.nextInt();
		
		for(int i=1;i<n+1;i++) {
			res=n%i;
			primo=n/i;
			
			if(res==0&&primo==1||primo==n) 
				cont++;
			}
		String resultado =(cont==2)?"El numero es primo":"El numero no es primo";
		
		System.out.println(resultado);
	}

}
