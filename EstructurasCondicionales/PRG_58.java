package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

	Programa que lee una secuencia de calificaciones numéricas (entre 0 y 10) que termina con el valor -1 y 
	calcula e imprime la media aritmética, el número y porcentaje de aprobados y el número y porcentaje de suspensos.


*****************************************************************************************************************/
import java.util.*;



	import java.util.Scanner;

	public class PRG_58 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	       int   porApro1, porSu1 ,aprovados=0,suspendidos=0;
	   	   double n,aux=0,media,contPers=0;
	       do {
	    	   System.out.println("Introduce notas");
	    	   n=entrada.nextDouble();
	    	   
	    	   if(n>=0&&n<=10) {//Si esta entre estos valores suma el valor
	    		 //  No sumara a aux numeros nemores de 0  
	    		  aux+=n; 
	    	   }
	    	   if(n>=5) {//Si es mayor lo suma contador de aprovados y contPers
	    		   aprovados++;
	    		   contPers++;
	    	   }if(n<5&&n>=0){// Si es menor cuenta suspensos y contPers
	    		   suspendidos++;
	    		   contPers++;
	    	   }
	    
	    	
	       }while(n != -1);//Cunado se cumple condicion sale 
	      
	       		media=aux/contPers;
	      
	      //Opera con valores para mostrar la salia 		
	       		porApro1=(int) (aprovados*100/contPers);
	       		porSu1=(int) (suspendidos*100/contPers);
	       		System.out.println("La media de las notas es :"+ media);
	       		System.out.println("Hay "+ aprovados+" aprovados en los examenes y la media de  aprovados corresponde a un "+porApro1+"%");
	       		System.out.println("Hay "+ suspendidos+" suspendidos en los examenes y la media de suspendidos corresponde a un "+porSu1+"%");
	    	   
	       		entrada.close();
	       }
	      
	    }
	