package EstructurasCondicionales;
import java.util.*;
public class PRG_24 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int divisor=10,cifras=0,res=0;
		System.out.println("Introduce un numero");
		int n=entrada.nextInt();
		if(n<0) {
			System.out.println("El numero tiene que ser negativo");
		}else {
			
				res=n/divisor;
				
			while(res!=0) {
				
				divisor/=10;
			
			System.out.println(res+"="+n+"/"+divisor);
					
				cifras++;
				
			}
				System.out.println("Tiene "+(cifras+1)+" cifras");
				
					
				
			}
		}

	}


