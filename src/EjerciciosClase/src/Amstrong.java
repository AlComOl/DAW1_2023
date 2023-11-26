package EjerciciosClase.src;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int d,contador=0,aux=0,m,e=0,cont1=0,cont=0;
		int n=entrada.nextInt();
//	contar los digitos del numero
		m=n;
		while(m>0) {
			cont1=m%10;
			m/=10;
			cont ++;
		}
//		System.out.println(cont);
		
		while(n!=0) {
			d=n%10;
			n/=10;
	// Elevar el dígito a la potencia del número de dígitos
			int w=1;
			for(int i=0;i<cont;i++) {
				w*=d;
			}
			aux+=w;
		}
		System.out.println(aux);
	}

}
