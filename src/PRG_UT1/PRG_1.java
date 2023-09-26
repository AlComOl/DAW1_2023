package PRG_UT1;

import java.util.*;

public class PRG_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,res, aux,octal=0,i=1;
		System.out.println("Introcuce numero");
		n=entrada.nextInt();
		
		while(n>8) {
			aux=n%8;
			octal=aux*i+octal;
			n=n/8;
			i=i*10;
			
		
		}
		System.out.println("El resultado en octal " + (octal+(n*1000)));
	}

}
