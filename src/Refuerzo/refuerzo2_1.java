package Refuerzo;
import java.util.*;
public class refuerzo2_1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int n=0, aux=0,vm=0,i=1,mayor=0,menor=0;
			
			while(n>=0) {
			System.out.println("Introduce un numero");
			n=entrada.nextInt();
		
			aux+=n;
			vm=aux/i;
			i++;
			if(mayor==0&&menor==0) {
				mayor=n;
				menor=n;
			}
			if(n>mayor) {
			mayor=n;
		
			
			}else if(n<menor&&n>0) {
				menor=n;
			}
				
			}
			System.out.println("La suma de los numeros es: "+ aux +" la media de ellos es : "+vm+" el mayor es "+mayor+" El menor es "+ menor);

	}

}
