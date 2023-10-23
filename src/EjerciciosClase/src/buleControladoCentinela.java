package src.pruebasClase;
import java.util.*;
public class buleControladoCentinela {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); 
		int suma,centinela,contador,nota,Media;
		
		suma=0;
		centinela = -1;
		contador=0;
		do{
		System.out.println("Introducir nota (fin=-1): ");
		nota = entrada.nextInt();
		}while(nota<-1||nota>10);
		while (nota != centinela)
		{
		contador++;
		suma += nota;
		do{
		System.out.println("Introducir nota (fin=-1): ");
		nota = entrada.nextInt();
		}while(nota<-1||nota>10);
		}
		if (nota == -1 && contador >0) { 
		Media=suma / contador;
		System.out.println(Media);
		}
		else System.out.println("No hay notas para calcular media");
	}

}
