package EjerciciosClase.src;
import java.util.*;

public class Sumapares {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int aux=0;
		System.out.println("Introduce el numero");
		int n= entrada.nextInt();
		if(n<0) {
			System.out.println("El numero es negativo , ingresa otro");
		}else {
		for(int i= 2 ; i<n;i++) {
			
			if(i%2==0) {
				aux+=i;
				
			}else {
				aux=aux;
			}
			
		}
		System.out.println(aux);
		}
	}

}
