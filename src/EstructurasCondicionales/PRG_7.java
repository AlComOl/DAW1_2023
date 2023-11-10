package EstructurasCondicionales;

/********************************************************************************************************

	Autor: Álvaro Comenge
	
	Fecha:7/10/23
	
	Descripción:
	
	Acepta un carácter inicial de una calificación (I, s, B, N, S) y muestra el mensaje 
	alfabético de la nota correspondiente (Insuficiente, suficiente, Bien, ...).
	
	
	
	
*******************************************************************************************************/
import java.util.*;
public class PRG_7 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		char c;
			
		System.out.println("Introduce el carater I,s,B,N,S");
		 c=entrada.next().charAt(0);
		
		
		if(c=='I') 
			System.out.println("Insuficiente");
		else if(c=='s')
			 System.out.println("suficiente");
		else if(c=='B')
			System.out.println("Bien");
		else if(c=='N')
			 System.out.println("Notable");
		else if(c=='S')
			 System.out.println("Sobresaliente");
		else
			System.out.println("Te has equivocado de caracter");
		//si el caracter es distinto de I,s,B,N,S
		
		
	}

}
