package EstructurasCondicionales;
/***************************************************************************

Autor: Álvaro Comenge

Fecha:21/10/23


	Descripción:

	Algoritmo que recibe como datos de entrada una 
	hora expresada en horas, minutos y segundos que nos calcula y 
	escribe la hora, minutos y segundos que serán, transcurrido un segundo.
	
	
*******************************************************************************/
import java.util.*;
public class PRG_6 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
			int h,m,s;
		do {
			System.out.println("Introduce horas");
			 h=entrada.nextInt();
			System.out.println("Introduce minutos");
			 m=entrada.nextInt();
			System.out.println("Introduce un segundos");
			 s=entrada.nextInt();
			 entrada.close();
			 if(s==59) {
				 s=00;
				 m=00;
				 if(h==23) {
					 h=0;
				 }else {
					 h+=1;
				 }
			 }else if(s<59) {
				 s+=1;
			 }else if(m>59) {
				 m=00;
			 }
		//	Como la condicion no se cumplira nunca el bucle solo se ejecutará una vez 
		}while(h==(h-1));
		//Si cumple uno de estas condiciones mostrara que el valor es erroneo
			if(h<-1||h>24||m<0||m>59||s<0||s>59) {
		
				System.out.println("Has introducidos datos erroneos");
			}else {
			//Sino mostrará un segundo más de la hora idfntroducida	
			System.out.println("dentro de un segundo seran las "+h+":"+m+":"+s);
		}
		
	}

}
