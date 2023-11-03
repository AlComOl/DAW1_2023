package POO;
import java.util.*;

public class Finanzas2 {
	//ATRIBUTOS
	private double dolarEuro;
	//CONSTRUCTOR Finanzas2 () por defecto,  establecerá cambio Dólar-Euro 1.36.
	public Finanzas2() {
		dolarEuro=1.36;
	}
//	//CONSTRUCTOR Finanzas (double), permitirá configurar el cambio dólar-euro.
	public Finanzas2(double valor) {
		dolarEuro=valor;
	}
//	METODOS
//	metodos que convierten  dólares a euros y viceversa
	public double dolarToEuro(double dolar) {
	
		return	dolar*dolarEuro;
	}
	
	public double euroToDolar(double euro) {
				
		return euro/dolarEuro;
	}
//	mediante el metodo introduzco el cambio sin SETERS ni GETTERS
	public void setcambio(double valor) {
		dolarEuro=valor;
	}
	public double getcambio() {
		return dolarEuro;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Finanzas2 Alvaro=new Finanzas2();
		
		System.out.println("Introduce el valor a comvertir");
		double cantidad=entrada.nextDouble();
		
		System.out.println("Pulsa: \n 1-Si quieres establecer el tipo de cambio \n 2-Si quieres el cambio por defecto");
		int eleccion=entrada.nextInt();
		
		switch (eleccion) {
		case 1:
			System.out.println("Introduce cambio");
			double valor=entrada.nextDouble();
			Alvaro.setcambio(valor);//Establece el cambio del constructor sobrecargado
			System.out.println("Pulsa \n 1-Si quieres convertir de Dolares a Euros \n 2-Si quieres convertir de Euros a Dolares");
			int dolares=entrada.nextInt();
			
			if(dolares==1) {
			System.out.println(Alvaro.dolarToEuro(cantidad));//Muestra conversion del metodo
			}else if(dolares==2) {
			System.out.println(Alvaro.euroToDolar(cantidad));//Conversion del reves
			}
			break;
		case 2:
			System.out.println("El tipo de cambio esta a :"+Alvaro.getcambio());//Muestro el cambio que esta guardado en el 1ºconstructor
			System.out.println("Pulsa \n 1-Si quieres convertir de Dolares a Euros \n 2-Si quieres convertir de Euros a Dolares");
			int euros=entrada.nextInt();
			
			if(euros==1) {
			System.out.println(Alvaro.dolarToEuro(cantidad));
			}else if(euros==2) {
			System.out.println(Alvaro.euroToDolar(cantidad));
			}
			break;

		default:
			break;
		}

			
			
		}

	}


