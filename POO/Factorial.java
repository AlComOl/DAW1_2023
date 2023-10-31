package POO;
import java.util.*;
public class Factorial {

	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	
		System.out.println("Introduce el numero");
		double x=entrada.nextDouble();
		
		

		
	
          factorial(x);
	
		
	}
	public static void factorial(double x ) {
		double aux=1;
		for(int i=1;i<=x;i++) {
			aux=aux*i;
		}
		System.out.println(aux);
	}
	}

