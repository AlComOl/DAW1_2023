package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:14/10/23

Descripción:

	Algoritmo que genera la lista de los N primeros números primos,
	siendo N el dato de entrada.

*****************************************************************************************************************/
import java.util.*;

public class PRG_41 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int res,aux,temp=1;
		
		System.out.println("Introduce un numero");
		int n= entrada.nextInt();
		
		if(n<=0) {
			System.out.println("Los numeros negativos no consideran primos");
		}else {
		for(;temp<n;temp++) {
			for(int i=1;n>i;i++) {
				res=temp/i;
				System.out.println(temp+"/"+i+"="+res);
				}
			}
		}
	}
}
	


