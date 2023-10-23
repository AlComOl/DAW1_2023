package src.pruebasClase;
import java.util.*;
public class ecuacion_segundo_grado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Introduce un nuemro");
//		int n=entrada.nextInt();
//		
//		String octal =Integer.toOctalString(n);		
//		String hexa = Integer.toHexString(n);
//		System.out.println(octal);
//		System.out.println(hexa);
		Scanner entrada = new Scanner(System.in);
		
		double a , b ,c ,res1, res2, dis1, dis2;
			
			System.out.println("Introduce el valor de a");
			a=entrada.nextFloat();
			System.out.println("Introduce el valor de b");
			b=entrada.nextFloat();
			System.out.println("Introduce el valor de c");
			c=entrada.nextFloat();
			
			dis1 =-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
			System.out.println(dis1);
			dis2 =-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
			System.out.println(dis2);
			
			//ax2+bx+c=0
		
	}

}

