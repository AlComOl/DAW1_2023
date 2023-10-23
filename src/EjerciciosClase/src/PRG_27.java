package src;
import java.util.*;
/*********************************************************************************************************************

Autor: Álvaro Comenge

Fecha:23/10/23


	Descripción:

	Realiza el juego del Master Mind(indica los muertos y heridos de cada tirada) con 2 caracteres y 2 intentos.
	
	
********************************************************************************************************************************/


public class PRG_27 {

	public static void main(String[] args)throws Exception {
		
		char valorentero=(char)(Math.floor(Math.random()*('Z'-'A')+'A'));//GENERA UN CARACTER ALEATORIO ENTRE LA Z Y LA A
		char valorentero1=(char)(Math.floor(Math.random()*('Z'-'A')+'A'));



		char c1,c2;
		int muertos, heridos,contador=0;
	
			do {
			contador++;
			System.out.println("Introduce una letra Mayuscula");
			do {
		
			c1 =(char)System.in.read();
			
			}while(c1<'A'||c1>'Z');//CADA WHILE EVALUA SI LA CONDICION , SI EL CARACTER ES DISTINTO LO VUELVE A PEDIR
			System.out.println("Introduce una letra ");
			do {		

			 c2 =(char)System.in.read();
			}while(c2<'A'||c2 >'Z');
			
			muertos =heridos= 0;
		
			
			if(c1==valorentero) muertos++;
			if(c2==valorentero1) muertos++;
			if(c1==valorentero1) heridos++;
			if(c2==valorentero) heridos++;
		
			System.out.println( muertos+" muertos "+heridos+" heridos");

	
		}while(muertos!=2);//MIENTRAS MUERTOS SEAN DIFERENTE DE 2 SE VOLVERA A EJECUTAR
		
		System.out.println("has necesitado "+ contador + " intentos");
			
	
	
	}

}
