package src.pruebasClase;

import java.io.IOException;
import java.util.*;


public class EjecicioChar {
	
	public static void main (String[] args)throws IOException {
		char c1,c2,c3,c4,c5;
		try {
			System.out.println("dame cinco caracteres");
			c1=(char) System.in.read();
			c2=(char) System.in.read();
			c3=(char) System.in.read();
			c4=(char) System.in.read();
			c5=(char) System.in.read();
			
			
			if(c1==c5&&c2==c4) {
				System.out.println("La palabra es palindroma" +c4+c3+c2+c1);
			}else {
				System.out.println("La palabra no es palindroma");
			}
		
		}catch(IOException e) {
			System.err.println("Error:entrada");
		}
	}
		
}


