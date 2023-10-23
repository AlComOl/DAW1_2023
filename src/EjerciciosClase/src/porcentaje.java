package pruebasClase;
import java.util.*;
public class porcentaje {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n,res;
		
		n=entrada.nextInt();
		
		do {
			res=n%8;
			n=n/8;
			
			System.out.println(res);
			
		} while (n>8);
			System.out.println(n);
	}

}
