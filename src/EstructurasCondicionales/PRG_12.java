package EstructurasCondicionales;
/******************************************************

Autor: Álvaro Comenge

Fecha:18/10/23


	Descripción:

	Acepta la fecha en formato numérico (dd, mm y aaaa) y muestra por pantalla un mensaje si la fecha es o no correcta. 
	Un año es bisiesto si es divisible entre 4 pero no entre 100, excepto aquellos años que son divisibles entre 400, que 
	sí son bisiestos.
	
	
*******************************************************/

import java.util.*;

public class PRG_12 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int dia , mes, anyo;
		boolean correcta=true;
		
		System.out.println("Introduce dia");
		dia=entrada.nextInt();
		System.out.println("Introduce mes");
		mes=entrada.nextInt();
		System.out.println("Introduce anyo");
		anyo=entrada.nextInt();
		//Si cualquiera de estas 2 condiciones es correcta se establecera Correcta como FALSE"Si el dia no es del 1 a 31"		
		if(dia<1||dia>31) {
			correcta=false;
		//Al igual con el mes 
		}else if(mes<1||mes>12){
			correcta=false;
		}else {
		
		switch (mes) {
		//Si alguno de los meses indicados tienen mas de 30 dias Corecta se establera como FALSE(estará mal la fecha)
		case 4,6,9,11://30dias
			if(dia>30) {
				correcta=false;
			}
			break;
		case 2://30dias
			//Si año es divisible por 4 Y por 100 O año es divisible por 400 2" Si la expresion da true BISIESTO"
			if(anyo%4==0&&anyo%100!=0||anyo%400==0) { /*<--*/
				//Si tiene mas de 29 dias la fecha estará mal 
				if(dia>29) {
				correcta=false;
				//si tiene más de 28 dias , la fecha es incorrecta tambien.
	/*-->*/	}else if(dia>28) {
				correcta=false;
			
			
			
			}	
		}
		
		if(correcta) {
			System.out.println(" Fecha Correcta");
		}else {
			System.out.println(" Fecha Incorrecta");
		}
		}
	  }//corchete del ELSE
	}
}
