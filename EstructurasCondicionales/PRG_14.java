package EstructurasCondicionales;
/*************************************************************

Autor: Álvaro Comenge

Fecha 9/10/23


	Descripción:

	Acepta 5 caracteres que forman una palabra y comprueba
	 si es palíndroma. (Ej.: SACAS)
	
	
****************************************************************/

import java.io.IOException;
import java.util.*;


public class PRG_14 {
	
	public static void main (String[] args)throws IOException {
		char c1,c2,c3,c4,c5;
		try {
			System.out.println("dame cinco caracteres");
			c1=(char) System.in.read();
			c2=(char) System.in.read();
			c3=(char) System.in.read();
			c4=(char) System.in.read();
			c5=(char) System.in.read();
			
			
			if(c1==c5&&c2==c4) {
				System.out.println("La palabra es palindroma  :" +c5+c4+c3+c2+c1);
			}else {
				System.out.println("La palabra no es palindroma");
			}
		
		}catch(IOException e) {
			System.err.println("Error:entrada");
		}
	}
		
}

/* Esta seria otra fortma de hacerlo
 * Scanner entrada = new Scanner(System.in);
		char l1,l2,l3,l4,l5;
		
		System.out.println("Introduce la primera letra");
		l1 = entrada.next().charAt(0);
		System.out.println("Introduce la segunda letra");
		l2 = entrada.next().charAt(0);
		System.out.println("Introduce la tercera letra");
		l3 = entrada.next().charAt(0);
		System.out.println("Introduce la cuarta letra");
		l4 =entrada.next().charAt(0);
		System.out.println("Introduce la quinta letra");
		l5 =entrada.next().charAt(0);
		
	//	if (l1>0 || l1>128 || l2>0 || l2>128 || l3>0 || l3>128 || l4>0 || l4>128 || l5>0 || l5>128) {
		//	System.out.println("Introduce solo un caracter");
			//}else{
				if(l1==l5 && l2==l4) {
					System.out.println("La palabra es palindroma "+ l5 + l4 + l3 + l2 + l1);
				}else if(l1!=l5 && l2!=l4) {
					System.out.println("La palabra NO es palindroma");
				}
 */
 