package src.Practica41023;
import java.util.*;

public class Ej_4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int bandejas1,bandejas2,bandejas3,total , aSumar;
		double producto_necesito;
		
		System.out.println("Dime el numero de bandejas de un kilo");
		bandejas1=entrada.nextInt();
		System.out.println("Dime el numero de bandejas de un kilo");
		bandejas2=entrada.nextInt();
		System.out.println("Dime el numero de bandejas de un kilo");
		bandejas3=entrada.nextInt();
		
		
		producto_necesito=(bandejas1+bandejas2*2+bandejas3*3)/12.0;
		total=(int)producto_necesito;
		
		aSumar= ( producto_necesito == total )?0: 1;
				
				
		System.out.println("Deberias de tener preparados "+(total+aSumar) +" cajones de naranjas");
		 
		
		
		

	}

}
