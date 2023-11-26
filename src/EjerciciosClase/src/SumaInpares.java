package EjerciciosClase.src;
import java.util.*;

public class SumaInpares {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		int a,b, aux=0;
		
		System.out.println("Introduce 2 numeros");
		a=entrada.nextInt();
		b=entrada.nextInt();
		
		for(;a<=b;a++) {
			if(a%2!=0) {
				aux+=a;
				System.out.println(a);
			}
		}
System.out.println(aux);
	}

}
