package EstructurasCondicionales;
/**********************************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Programa que recibe como datos de entrada dos números enteros positivos N y M, 
	y calcula e imprime los múltiplos de N, inferiores a M, sean capicúas.


***************************************************************************************/
import java.util.*;

public class PRG_53 {

	public static void main(String[] args) {
			Scanner entrada= new Scanner(System.in);
			int res=1,i=1;
			System.out.println("Introduce dos numeros enteros positivos");
			int n=entrada.nextInt();
			System.out.println("Introduce otro numero entero positivo");
			int m=entrada.nextInt();
			
			if(n>0&&m>0) {
				while(res<m) {
					res=n*i;
					i++;
					System.out.println(res);
					int nI=0;
					int digito=res%10;
					nI=nI*10+digito;
					if(nI==n) {
						System.out.println(nI);
					}
				}
				
			}else {
				System.out.println("Error introducuiendo datos (introduce enteros positivos)");
			}
			
			
			
	}
}