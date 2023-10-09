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
			int par=0 ,numero=0,parmayor,imparmenor;
			for(int i=0;i<10;i++) {
				System.out.println("Introduce 10 numeros");
				int n= entrada.nextInt();
				int impar=n;
					if(n%2==0&&n>=numero) {
						par=n;
						System.out.println(par);
					}else if(n%2!=0&&n<=numero){
						impar=n;
						System.out.println(impar);
				}
			}
			parmayor=par+2;
			imparmenor=impar-1;
			System.out.println(par+","+impar);
	}

}
