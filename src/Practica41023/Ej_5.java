package src.Practica41023;
import java.util.*;
public class Ej_5 {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
	double barriles,galones,pintas,cuartos,gills,onzas,barrilesTotales,totalLitros;
	final double BALITROS=159.11315;
		System.out.println("Dame barriles");
		 barriles=entrada.nextDouble();
		System.out.println("Dame Galones");
		 galones=entrada.nextDouble();
		System.out.println("Dame cuartos");
		 cuartos=entrada.nextDouble();
		System.out.println("Dame pintas");
		 pintas=entrada.nextDouble();
		System.out.println("Dame grills");
		 gills=entrada.nextDouble();
		System.out.println("Dame onzas");
	   	 onzas=entrada.nextDouble();
		
		 barrilesTotales=(barriles+galones/35+cuartos/140+pintas/280+gills/1160+onzas/5600);
		 totalLitros=(barrilesTotales*BALITROS);
		 
		
		System.out.println("Los barriles totales son "+barrilesTotales);
		System.out.println("Los litros equivalentes son "+totalLitros);
	}

}
