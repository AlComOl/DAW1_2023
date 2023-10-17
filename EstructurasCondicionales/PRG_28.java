package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:14/10/23A

Descripción:

	Acepta una serie de notas (finalizando con una negativa) y calcula la media.

*****************************************************************************************************************/
import java.util.*;

public class PRG_28 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	//el valor de centinela no se puede utilizar en el bucle	 
		 int centinela=-1,contador=0;
		 float media, suma=0,nota;
		 
		 do {
			 System.out.println("Introduce la nota (-1 para salir)");
			nota=entrada.nextFloat();
		 }while(nota<-1||nota>10);
		 	while(nota!=centinela) {
		 		contador++;
		 		suma+=nota;
		 		do {
		 			System.out.println("Introduce la nota (-1 para salir)");
		 			nota=entrada.nextFloat();
		 		}while(nota<-1||nota>10);
		 			
		 	}		if(nota==-1&&contador>0) {
		 				media=suma/contador;
		 				System.out.println(media);
		 			}else {
		 				System.out.println("No hay notas par hacer la media");
		 		
		 		}
		 	}

	}


