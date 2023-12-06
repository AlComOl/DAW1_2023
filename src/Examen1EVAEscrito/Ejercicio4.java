package Examen1EVAEscrito;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
				int seg=entrada.nextInt();
				int segCopia=seg;
				
				int dias=seg/(24*60*60);
				seg=seg%(24*60*60);
				
				int horas=seg/(60*60);
				seg=seg%(60*60);
				
				int min=seg/(60);
				seg=seg%60;
				
				
				System.out.println(segCopia+" segundos son "+dias+" dias " +horas+" horas "+min+" minutos "+seg+" segundos");

	}

}
