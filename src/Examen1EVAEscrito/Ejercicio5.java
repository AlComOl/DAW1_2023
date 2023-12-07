package Examen1EVAEscrito;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=1013,n1=500061,aux, aux1, contador=0;
		final int C=17;
		
		
		for(;n<=n1;n++) {
			aux=n%C;
			aux1=n/C;
			if(aux==0&&aux1%2!=0) {
				contador++;
			}
		}
		
		System.out.println(contador);

	}

}
