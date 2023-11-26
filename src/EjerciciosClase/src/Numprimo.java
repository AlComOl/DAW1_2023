package EjerciciosClase.src;
import java.util.*;

public class Numprimo {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in) ;
		int n,aux=0,res=0;
		n=entrada.nextInt();
		if(n<0) {
			System.out.println("el numero es negativo");
		}else {
			for(int i=1;i<=n;i++) {
				res=n/i;
				if(n%i==0) {
					aux+=res;
				}
			}
				if(aux==n+1) {
					System.out.println("es primo");
				}else {
					System.out.println("no es primo ");
				}	
		}

	}

}
