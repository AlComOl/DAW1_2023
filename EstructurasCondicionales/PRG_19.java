package EstructurasCondicionales;
/*****************************************************************

	Autor: Alvaro

	Fecha:9/10/23

	Descripción:

	Multiplica 2 números enteros aceptados por teclado, mediante sumas sucesivas, optimizando proceso



******************************************************************/
import java.util.*;
public class PRG_19 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int res=0;
		int a;
		System.out.println("Introcuce numeros a multiplicar");
		int n=entrada.nextInt();
		int n1=entrada.nextInt();
		
		/*for(int i=0;i<n1;i++) {
			res+=n;
			System.out.println(res);
		}*/
		
		while(n1>0) { //(n1>0)n*n1 != res
			res+=n;
			n1--;
			
		}
			
		System.out.println(res);
		
		entrada.close();
	}

}
