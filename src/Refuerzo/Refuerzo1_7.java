package Refuerzo;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Escribe un programa que pida un número entero al usuario, y muestre por pantalla
	una cuenta atrás hasta cero, seguido de un “¡BOOOM!”.
	Cuidado: Una vez lo tengas, ¿funciona correctamente si el usuario introduce un
	número negativo? De no ser así, arréglalo


******************************************************************/
import java.util.*;

public class Refuerzo1_7 {


	public static void main(String[] args) {
			Scanner entrada= new Scanner(System.in);
			
			System.out.println("Introdue un numero entero");
			int n = entrada.nextInt();
			if(n>=0) {
				for(;n>0;n--) {
				System.out.println(n);
				
				}
				System.out.println("BOOOOOM");
				
			}if(n<0) {
				for(;n<0;n++) {
					System.out.println(n);
				}
				System.out.println("BOOOOOM");
			}
	}
	

}
