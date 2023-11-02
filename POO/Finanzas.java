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
		System.out.println("Establece el tipo de cambio");
		double tipoCambio=entrada.nextDouble();
		alvaro.setTipoCambio(tipoCambio);
		
		System.out.println("Pulsa 1-De Dolar a Euro   \n\nPulsa 2-De Euro a Dolar");
		int n=entrada.nextInt();
		switch (n) {
		case 1:
//			System.out.println("¿Quieres introducir el tipo de cambio?Pulsa 1-Si \t  2-No");
//			int n1=entrada.nextInt();
//			switch (n1) {
//			case 1:
//				System.out.println("Establece el tipo de cambio");
//				double tipoCambio=entrada.nextDouble();
//				alvaro.setTipoCambio(tipoCambio);
//				no entiendo porque con el metodo setter ya me saca el resultado al tipocambio que le indico
			    System.out.println(alvaro.dolaresToEuros(cantidad)+" Euros");	
//				
//				break;
//			case 2:
//				System.out.println(alvaro.dolaresToEuros(cantidad));
//				break;
//			}
			break;
		case 2:
			System.out.println(	alvaro.eurosToDolares(cantidad)+" Dolares");
			break;

		default:
			System.out.println("Introduce la opcion Bien");
			break;
		}
		
		
		

//		System.out.println(alvaro.dolaresToEuros(cantidad));
//		System.out.println(alvaro.eurosToDolares(cantidad));
		

	}

	
}


