package EstructurasCondicionales;
/**********************************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Programa que recibe como datos de entrada dos números enteros positivos N y M, 
	y calcula e imprime los múltiplos de N, inferiores a M.


***************************************************************************************/
import java.util.*;

public class PRG_53_while {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int i = 2, temp, numeroOriginal,numeroInvertido;
		System.out.println("Introduce dos numeros enteros positivos");
		int n=entrada.nextInt();
		System.out.println("Introduce otro numero entero positivo mayor que el anterior");
		int m=entrada.nextInt();
		
		if(n <=0 || m<=0) {
			System.out.println("Los numeros deben ser enteros y positivos");
			
		}else{//encontrar multiplos de n
			//for (int i = 2; i < m; i++) {
				while(i<m) {
                if (n % i == 0) {  // Verificar si i es un múltiplo de n
                 numeroOriginal = i;
                 numeroInvertido = 0;
                temp = i;
                if(temp<10) {
                	System.out.println("Capicua"+temp);
                }else {
	                while (temp > 0) {
	                    int digito = temp % 10;
	                    numeroInvertido = numeroInvertido * 10 + digito;
	                    temp /= 10;
	                }
                }
                if (numeroOriginal == numeroInvertido) {
                    System.out.println(i + " es un multiplo de " + n + " y es capicua.");
                }
            }
                i++;
        }
    }
}
}	
