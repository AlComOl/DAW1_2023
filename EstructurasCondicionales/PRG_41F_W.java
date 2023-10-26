package EstructurasCondicionales;
///*******************************************************************************************************************
//
//Autor: Álvaro Comenge
//
//Fecha:24/10/23A
//
//Descripción:
//
//	Algoritmo que genera la lista de los N primeros números primos,
//	siendo N el dato de entrada.
//
//*****************************************************************************************************************/
import java.util.*;

public class PRG_41F_W {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n,j=2;
		boolean primo=true;
		
		 
		System.out.println("Introduce un numero");
		n= entrada.nextInt();
	
		if(n<0) {
			System.out.println("El numero tiene que ser positivo");
		}else {
			System.out.println("primos de "+ n);
				for(int i=n;i>0;i--) {
					primo=true;
				
					while(j<i&&primo) {
						if(i%j==0) 
						primo=false;
						j++;
						
					}
					if(primo) {
						System.out.println(i);
					}
					
				}
				}
		entrada.close();
	}
}