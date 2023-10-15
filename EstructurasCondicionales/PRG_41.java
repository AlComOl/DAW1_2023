package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:14/10/23A

Descripción:

	Algoritmo que genera la lista de los N primeros números primos,
	siendo N el dato de entrada.

*****************************************************************************************************************/
import java.util.*;

public class PRG_41 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int res,aux=0;
		
		 
		System.out.println("Introduce un numero");
		int n= entrada.nextInt();
		
		if(n<=0) {
			System.out.println("Los numeros negativos no consideran primos");
		}else {
		for(int temp=1;temp<=n;temp++) {///Iteramos temp que es el dividendo hasta el numero introducido N

			if(aux==2) {//Si el contador viene con valor 2 el numero será primo,temp es -1 porque al pasar por el bucle de nuevo temp sera ++
				System.out.println((temp-1) +" es primo");
			}
			aux=0;//ponemos aux a cero para que inicie el conteo
		
			for(int i=1;temp>=i;i++) {//itera para hallar los numeros primos si hay 2 numeros con resto 0 aux++ 
				res=temp%i;
				if(res==0) {
					aux++;
					
				}
			}
				
					
				
		}
				
				}
			
			}
		}

	


