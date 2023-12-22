package Refuerzo;
import java.util.*;
public class refuerzo2_1 {
	static Scanner sc=new Scanner(System.in);
	
	public static void saluda() {
		System.out.println("Bienvenido.Como va todo?");
	}
	
	public static double pideEuros() {
		System.out.println("Dame la cantidad de uros que quieres convertir");
		double cantidad=sc.nextDouble();
		
		return cantidad;
	}
	
	public static double convierteAPesetas(double euros) {
		
		double pesetas=euros*166.386;
		
		return pesetas;
	}
	
	public static void despide() {
		
		System.out.println("Gracias por usarme .Hasta la proxima");
	}
	public static void main(String[] args) {
		
		
		saluda();
		double euros =pideEuros();
	System.out.println(convierteAPesetas(euros));
		despide();
		
	

	}

}
