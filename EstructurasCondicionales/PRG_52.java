package EstructurasCondicionales;
/**********************************************************************************************************************

Autor: Álvaro Comenge

Fecha:18/10/23


	Descripción:

	Programa que lee 100 datos, compuesto cada uno de ellos por la inicial del nombre de la persona
 	y su sueldo neto mensual, y obtiene e imprime el nombre y sueldo de la persona que más cobra y de la que menos.
 	 Si hay varias se imprime la primera que aparezca en la secuencia de entrada.
	
	
************************************************************************************************************************/

import java.util.*;

public class PRG_52 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int s=0,sMayor=0,sMenor=0;
		String n, nMayor="",nMenor="";
		
		
	
		for(int i=1;i<10;i++){
			System.out.println("Introduce nombre");
			n=entrada.next();
			System.out.println("Introduce sueldo");
			s=entrada.nextInt();
			if(sMenor==0&&sMayor==0) {
				sMayor=s;
				nMayor=n;
				sMenor=s;
				nMenor=n;
				
			}else if(s>sMayor) {
					sMayor=s;
					nMayor=n;
					System.out.println("mayor"+sMayor);

			}else if(s<sMenor) {
					sMenor=s;
					nMenor=n;
					System.out.println("menor"+sMenor);
				}
				

				
			
       	
		}
		System.out.println("El sueldo mayor es de "+sMayor+ " lo cobra "+ nMayor);

		System.out.println("El sueldo menor es de "+sMenor+ " lo cobra "+ nMenor);
		
	}

}
