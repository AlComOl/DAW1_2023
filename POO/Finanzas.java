package POO;
import java.util.*;
public class Finanzas {
	
//	ATRIBUTOS
	private double cambio;
	
// CONSTRUCTOR
	public Finanzas() {
		
	}
	
//	CONSTRUCTOR
//	public Finanzas(double valor) {
//		double cambio=valor;
//	}
	
//METODOS
	
	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	public double  dolaresToEuros(double dolares) {
		
		return dolares*cambio;
		 	
	}
	
	
	
	public void eurosToDolares( double euros) {
		
	}
	


	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		Finanzas alvaro=new Finanzas();
		
		System.out.println("Introduce dinero a comvertir");
		double cantidad=entrada.nextDouble();
		System.out.println("Introduce el tipo de cambio");
		double cambio=entrada.nextDouble();
		
		
		
//		alvaro.getCambio();
		alvaro.setCambio(cambio);
		System.out.println(alvaro.dolaresToEuros(cantidad));
	
	
	

	}

}


