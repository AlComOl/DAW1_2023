package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:14/10/23

Descripción:

	Acepta 10 números enteros y muestra su suma.

*****************************************************************************************************************/
import java.util.*;
public class PRG_11 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n;
		for(int i=1;i<10;i++) {
			System.out.println("Introduce un numero");
			
			n=entrada.nextInt();
			n=+n;
		}
		System.out.println(n);
	}

}
