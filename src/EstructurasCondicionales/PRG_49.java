package EstructurasCondicionales;
import java.util.*;
public class PRG_49 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double capital ,interes,redito,reditoAcum=0;
		int any;
		System.out.println("Introduce años");
		any=entrada.nextInt();
		System.out.println("Introduce interes");
		interes=entrada.nextInt();
		System.out.println("Introduce capital ");
		capital=entrada.nextInt();
		//calcula el interes anual 
		for(int i=0;i<any;i++) {
			redito=capital*interes/100;
			reditoAcum+=redito;
			capital+=redito;
			System.out.println("Anyo:"+(i+1)+"       "+redito+"       "+capital);
		}
System.out.println(reditoAcum);
System.out.println("Capital Final"+capital);
	}

}
