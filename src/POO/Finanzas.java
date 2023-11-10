package POO;
import java.util.*;
public class Finanzas {
	
//	ATRIBUTOS
	private double tipoCambio=1.35;
	
// CONSTRUCTOR
	public Finanzas() {
		
	}
	
//	CONSTRUCTOR
	public Finanzas(double valor) {
		double tipoCambio=valor;
	}
	
//METODOS

	public double  dolaresToEuros(double cantidad) {
		
		return cantidad*tipoCambio/1;
		 	
	}
	
	
	
	public double eurosToDolares( double cantidad) {
		return cantidad*1/tipoCambio;
	}
	
	
	
//	METODOS GETTER Y SETTER
	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}


	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		Finanzas alvaro=new Finanzas();
		
		System.out.println("Introduce dinero a comvertir");
		double cantidad=entrada.nextDouble();
		System.out.println("Quieres establecer el tipo de cambio \n 1-Si 2-No");
		int tc=entrada.nextInt();
		switch (tc) {
		case 1:
			System.out.println("Introduce tipo de cambio");
			double tipoCambio=entrada.nextDouble();
			alvaro.setTipoCambio(tipoCambio);
			break;
		case 2:
			
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		
		System.out.println("Pulsa 1-De Dolar a Euro   \n\nPulsa 2-De Euro a Dolar");
		int n=entrada.nextInt();
		switch (n) {
		case 1:
		    System.out.println(alvaro.dolaresToEuros(cantidad)+" Euros");	
			break;
		case 2:
			System.out.println(	alvaro.eurosToDolares(cantidad)+" Dolares");
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;
		}

	}

	
}


