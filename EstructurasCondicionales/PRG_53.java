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
		
		System.out.println("Introduce dos numeros enteros positivos");
		int n=entrada.nextInt();
		System.out.println("Introduce otro numero entero positivo");
		int m=entrada.nextInt();
		
		if(n <=0 || m<=0) {
			System.out.println("Los numeros deben ser enteros y positivos");
			
		}//encontrar multiplos de n
		for (int i = n; i < m; i++) {
                if (i % n == 0) {  // Verificar si i es un múltiplo de n
                int numeroOriginal = i;
                int numeroInvertido = 0;
                int temp = i;
                while (temp > 0) {
                    int digito = temp % 10;
                    numeroInvertido = numeroInvertido * 10 + digito;
                    temp /= 10;
                }

                if (numeroOriginal == numeroInvertido) {
                    System.out.println(i + " es un multiplo de " + n + " y es capicúa.");
                }else {
                	wrv
                }
            }
        }
    }
}
	
