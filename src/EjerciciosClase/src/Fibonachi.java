package EjerciciosClase.src;
import java.util.*;
	public class Fibonachi {
		public static void main (String[] args) {
			Scanner entrada = new Scanner(System.in);
			int fibonachi=0,n=1,m=1,num;
			System.out.println("Introduce el numero de la serie Fibonachi");
		
			num=entrada.nextInt();
			
			for(int contador=1;contador<num;contador++) {
				fibonachi=m+n;
				
				n=m;
				m=fibonachi;
			
			
				
				System.out.print(fibonachi+",");
			}
			
		}
		}

