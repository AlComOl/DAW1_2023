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
		int a,aux;
		System.out.println("Introcuce numeros a multiplicar");
		int n=entrada.nextInt();
		int n1=entrada.nextInt();
		//hay que poner el mayor delante para optimizar esta para repasar 
		if(n>n1) {
			aux=n;
			n=n1;
			n1=aux;
		}
			for(int i=0;i<n1;i++) {
			res+=n;
			System.out.println(res);
			}
		
	
			
		System.out.println(res);
		
		entrada.close();
	}

}
