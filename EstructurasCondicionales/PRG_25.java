package EstructurasCondicionales;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Acepta 10 enteros y muestra el par mayor y el impar menor.


******************************************************************/
import java.util.*;

public class PRG_25 {

	public static void main(String[] args) {
			Scanner entrada= new Scanner(System.in);
			int par=0 , impar=0;
			for(int i=0;i<10;i++) {
				System.out.println("Introduce 10 numeros");
				int n= entrada.nextInt();
					if(n%2==0&&n>=par) {
						
						par=n;
						System.out.println(par);
			
					}else if(n<impar||impar==0){
				
							impar=n;
					
						System.out.println(impar);
				}
			}
			
			System.out.println("El numero par mayor de los introducidos es "+par);
			System.out.println("El numero impar es "+impar);
	}
	

}
