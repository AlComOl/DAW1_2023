package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Programa que lee un número N entero positivo y obtiene su descomposición factorial (sus factores primos).


*****************************************************************************************************************/
import java.util.*;



	import java.util.Scanner;

	public class PRG_56 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Introduce un número entero positivo:");
	        int n = entrada.nextInt();
	        entrada.close();
	        if (n <= 1) {//descarta valores negativos
	            System.out.println("El número debe ser positivo o mayor de 1");
	        } else {
	            int cn = n;  // Hacemos una copia de n para no modificar el original y poder trabajar con n ,la salida no es la que queria
	               for (int i = 2; cn > 1; i++) {//itera dentro de los diferentes numeros empezando por 2 while(cn!=1)**
	                while (cn % i == 0) {//verifica si i es factor primo
	                	 System.out.println(i+" es factor primo de "+n);
		                   
	                    cn /= i;
	                 //   System.out.println(i+" es factor primo de "+n);
	                   
	                }
	              
	            }
	        }
	    }
	}