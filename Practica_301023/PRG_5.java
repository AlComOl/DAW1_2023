package Practica_301023;
import java.util.*;

public class PRG_5 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		double n,res;
		System.out.println("Introduce un numero");
		n=entrada.nextDouble();
		for(int i=0;i<20;i++) {
			System.out.println(i);
		res=Math.sqrt(n);
		
		System.out.println(res);
		}
	}

}
