package EstructurasCondicionales;
import java.io.IOException;
import java.util.*;

public class Ejercicio2Examen1Eva {

	public static void main(String[] args)throws IOException {
		Scanner entrada=new Scanner(System.in);

		int a=entrada.nextInt();
		
		if(a<4) {
			System.out.println("b");
		}
		switch (a*2+1) {
		case 3:
			System.out.println("a");
			break;
		case 5:
			break;
		default:
		case 7:
			System.out.println("d");
		case 1:
			System.out.println("e");
			break;
		
////	Ejercicio 2
//	
//		int a=(char)System.in.read();
//				
//		
//		int b=(char)(a-'G'+'z');
//		
//		
//		System.out.println(b);
		
		
//		Ejercicio 5
//		int aux=0,aux1=0,m=1,n=1;
//		
//		while (m!=0 && n!=0) {
//			System.out.println("Introduce 2 numeros");
//		 m=entrada.nextInt();
//		 n=entrada.nextInt();
//		
//		
//		for(int i=1;i<=m;i++) {
//			aux+=n;
//		}
//		System.out.println(aux);
//		for(int i=1;i<=n;i++) {
//			aux1+=m;
//		}
//		System.out.println(aux1);
//		}
//		Ejercicio 6
		
		
//		int digito,digito1,compara=0,aux=0;
//		boolean divisor=false;
//		System.out.println("Introduce el numero");	
//		int n=entrada.nextInt();
//
//			while(n>0) {
//				digito=n%10;
//				n/=10;
//				aux+=digito;
//				
//		}
//			
//			while(aux>0) {
//				digito1=aux%10;
//				aux/=10;
//				compara+=digito1;
//			}
//			if(compara ==9) {
//				divisor=true;
//				System.out.println(divisor);
//			}else {
//				System.out.println(divisor);
//			}
			
			
			
			
		
		
	}	
	}
}

