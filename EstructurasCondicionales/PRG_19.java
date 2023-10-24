package EstructurasCondicionales;
/*****************************************************************

	Autor: Alvaro

	Fecha:24/10/23

	Descripción:

	Multiplica 2 números enteros aceptados por teclado, mediante sumas sucesivas, optimizando proceso



******************************************************************/
import java.util.*;
public class PRG_19 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int res=0,aux=0,n,n1;
		System.out.println("Introcuce numeros a multiplicar");
		n=entrada.nextInt();
		System.out.println("Introcuce numeros a multiplicar");
		n1=entrada.nextInt();
		 
		if(n>n1) {
			aux=n;
			n=n1;
			n1=aux;
		}
			for(int i=1;i<=n1;i++) {
			res+=n;
			}
		System.out.println(res);
		
		entrada.close();
	}

}
