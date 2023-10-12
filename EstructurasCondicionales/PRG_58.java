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
	       int n,aux=0, cont=0,media;
	       
	       
	       do {
	    	  System.out.println("Introduce notas:");
	    	  n=entrada.nextInt();
	    	  if(n<0) {
	    		  media= aux/cont;
	    		  System.out.println(media);
	    	  }else {
	    	  aux+=n;
	    	  cont++;
	    	  }
	    	  }while(n>0 && n<10);
	       		
	         	
	       }
	      
	    }
	