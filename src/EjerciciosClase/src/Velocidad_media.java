package src.pruebasClase;
import java.util.*;

public class Velocidad_media {
	
	public static void main(String[] args) {
		//DECLARACION
		Scanner entrada=new Scanner(System.in);
		int vueltas, horas,minutos;
		double segundos , metros,tiempo, tiempoHoras, velocidad, velocidad_KM;
		//ENTRADA
		System.out.println("Dime vueltas");
		vueltas=entrada.nextInt();
		System.out.println("Dime metros por vuelta");
		metros=entrada.nextDouble();
		System.out.println("Dime tiempo");
		
			System.out.println("Horas");
			horas=entrada.nextInt();
			System.out.println("Minutos");
			minutos=entrada.nextInt();
			System.out.println("Segundos");
			segundos=entrada.nextInt();
		//PROCESO
		// tiempo en segundos	
		tiempo=horas*3600 + minutos*60 + segundos;
		// tiempo en horas
		tiempoHoras= horas + minutos/60 + segundos/3600;
		
		// la velocidad media 
		velocidad= metros*vueltas/tiempo;
		
		//velocidad media en Km/h
		
		velocidad_KM=((metros*vueltas)/1000)
		
		
	}

}
