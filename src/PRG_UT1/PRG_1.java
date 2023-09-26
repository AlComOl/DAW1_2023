package PRG_UT1;

import java.util.*;

public class PRG_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,res, aux,octal=0,i=1;
		int hexa=0, aux1=0;
		System.out.println("Introcuce numero");
		n=entrada.nextInt();
		
		while(n>7) {
			aux=n%8;
			octal=aux*i+octal;
			n=n/8;
			i=i*10;
		}
		
		while(n>15) {
			aux1=n%16;
			hexa=aux1*i+hexa;
			
			
//			if(aux1==10) {
//				aux1='A';
//			}if(aux1==11) {
//				aux1='B';
//			}if(aux1==12) {
//				aux1='C';
//			}if(aux1==13) {
//				aux1='D';
//			}if(aux1==14) {
//				aux1='E';
//			}if(aux1==15) {
//				aux1='D';
//			}
			
			
			n=n/16;
			i=i*10;
			System.out.println(aux1);
		}
		System.out.println("El resultado en octal " + (octal+(n*i)));
		System.out.println("El resultado en hexadecimal " + (hexa+(n*i)));
	}

}
