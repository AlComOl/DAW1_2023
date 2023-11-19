package EjerciciosClase.src;
import java.util.*;

public class NocheVieja {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int aux=0,aux1=0,aux2=0,m=1,n=1;
		
		while (m!=0 && n!=0) {
			System.out.println("Introduce 2 numeros");
		 m=entrada.nextInt();
		 n=entrada.nextInt();
		
		
		for(int i=1;i<=m;i++) {
			aux+=n;
		}
		System.out.println("El primer sumatorio "+aux);
		for(int i=1;i<=n;i++) {
			aux1+=m;
		}
		System.out.println("El segundo sumatorio "+aux1);
		aux2=m*n;
		if(aux==aux1&&aux1==aux2&&aux==aux2) {
			System.out.println("El ejercicio esta bien echo");
		}
		
		}
		
		
	}

}
