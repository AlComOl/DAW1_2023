package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:15/10/23A

Descripción:

	Programa que lee una fecha en formato día (1 a 31), mes (1 a 12) y años (en número) y obtiene 
	el número de orden del día en el total del año. Ejemplo: Si se lee 01 03 1992, se obtiene 61 de 1992.

*****************************************************************************************************************/
import java.util.*;

public class PRG_54 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int d,m,a,norden=0;
		
		 
		System.out.println("Introduce dia");
		 d= entrada.nextInt();
		System.out.println("Introduce mes ");
		 m= entrada.nextInt();
		System.out.println("Introduce ano");
		 a= entrada.nextInt();
		
		
		 //hacemos un bucle que itere mientras i sea menor del mes introducido sumara los dias de cada mes en norden
		for(int i = 1; i<m;i++) { 
		
			switch (i) {
				case 1:
					norden+=31;
					break;
				case 2://Esto nos permitira sabe si consideramos 29 dias en Febrero(bisiesto) o 28 (si no es bisiesto)
					if(a%4==0 && a%100 != 0 || a%400==0) {
					norden+=29;
				
					}else {
					norden+=28;
				
					}
					break;	
				case 3:
					norden+=31;
					break;
				case 4:
					norden+=30;
					break;
				case 5:
					norden+=31;
					break;
				case 6:
					norden+=30;
					break;
				case 7:
					norden+=31;
					break;
				case 8:
					norden+=31;
					break;
				case 9:
					norden+=30;
					break;
				case 10:
					norden+=31;
					break;
				case 11:
					norden+=20;
					break;
				case 12:
					norden+=31;
					break;

				default:
					break;
			}
		}
			norden+=d;//acumularemos a la salida del bucle los dias de los meses anteriores mas el d(dia del mes que empezamos a contar)
			System.out.println("El numero de orden de la fecha es: "+norden);
		
		entrada.close();
}
}