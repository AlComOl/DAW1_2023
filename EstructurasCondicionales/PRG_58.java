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
	       int   porApro=0,porApro1, porSu=0,porSu1 ,aprovados=0;
	   	   double n=0,aux=0,media=0,suspendidos=0,contPers=-1;
	       do {
	    	   System.out.println("Introduce notas");
	    	   n=entrada.nextDouble();
	    	   contPers++;
	    	   if(n>=0&&n<=10) {
	    		  aux+=n; 
	    	   }
	    	   if(n>=5) {
	    		   aprovados++;
	    		  
	    	   }if(n<5){
	    		   suspendidos++;
	    		
	    	   }
	    	   System.out.println(aux);
	    	
	       }while(n != -1);
	       		media=aux/contPers;
	       		System.out.println(media);
	       		porApro1=(int) (aprovados*100/contPers);
	       		porSu1=(int) (porSu*10/(contPers));
	       		System.out.println("La media de las notas es :"+ media);
	       		System.out.println("Hay "+ porApro+"examenes  aprovados que corresponde a un "+porApro1);
	       		System.out.println("Hay "+ porSu+"examenes  aprovados que corresponde a un "+porSu1);
	    	   
	       }
	      
	    }
	