package EstructurasCondicionales;
///*****************************************************************

//Autor: Alvaro 
//Fecha:22/10/23
//Descripción: Algoritmo que recibe como datos de entrada una hora expresada en horas,
//minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
//******************************************************************/
import java.util.*;

public class PRG_6_1 {
	
public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int hora, minutos, segundos;
		
		System.out.println("Introduce la hora");
			hora = tec.nextInt();
		System.out.println("Introduce los minutos");
			minutos = tec.nextInt();
		System.out.println("Introduce los segundos");
			segundos = tec.nextInt();	
		
		if(hora > 23 || minutos >= 60 || segundos >= 60  || hora < 0 || minutos < 0 || segundos < 0) {
			System.out.println( "La hora no es correcta");
		}else{
			   
			if(segundos == 59 ) {
					segundos=00;
					minutos =0;
				if(minutos == 59) {
					minutos=00;
					hora +=1;
					if(hora == 23) {
						hora=00;
					
					}
				}	
			}		 
		System.out.println("Dentro de un segundo seran las "+hora+":"+minutos+":"+segundos);	
		}	
	}
}