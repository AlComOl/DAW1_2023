package Examen1EVAEscrito;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
				int seg=entrada.nextInt();
				int segCopia=seg;
				
				int dias=seg/(24*60*60);//pasamos a dias los segundos
				seg=seg%(24*60*60);//el resto de la divion entre los segundos totales entre el total de segundos de un dia
				
				int horas=seg/(60*60);//los segundos que sobran de un dia/numero de horas del dia
				seg=seg%(60*60);//el resto de los segundos entre el numero total de horas para utilizarlo en la siguiente operacion
				
				int min=seg/(60);
				seg=seg%60;//
				
				
				System.out.println(segCopia+" segundos son "+dias+" dias " +horas+" horas "+min+" minutos "+seg+" segundos");

	}

}
