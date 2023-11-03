package POO;
import java.util.*;
/***************************************************************************
 *@author acome
 *
 	Autor: Álvaro Comenge

	Fecha: 1/11/23
	
	Descripción:
	
		Realice una clase Temperatura, la cual convierta grados Celsius a Farenheit y 
		viceversa. Para ello cree dos métodos double celsiusToFarenheit(double) y 
		farenheitToCelsius(double). Pruebe dicha clase.

 **************************************************************************/

public class TemperaturaCons {
	//Atributos
	private double temperatura;
	private String escala;
	
	//CONSTRUCTOR
	public TemperaturaCons(double valor, String tipo) {
		temperatura=valor;
		escala=tipo;
	}
	//METODOS
	public double celsiusToFarenheit(double valor) {
		
		return (valor*9/5)+32; 
	}
	public double farenheitToCelsius(double valor) {
		
		return  (valor-32)*5/9; 
	}
	
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		
		System.out.println("Introduce temperatura en Celsius o Fahrenheit");
		double temperatura=entrada.nextDouble();
		System.out.println("Introcuce escala de temperatura a ser convetida la temperatura");
		String escala= entrada.next();
		//INSTANCIA DE CLASE TEMPERATURACONS
		TemperaturaCons alvaro= new TemperaturaCons(temperatura,escala);
//		Si los grados son Farenheit llamamos al metodo para convertir a celsius
		if(escala.equalsIgnoreCase("Fahrenheit")) {			
			System.out.println(alvaro.farenheitToCelsius(temperatura)+" Fahrenheit");
//		Si los grados son Celsius llamamos al metodo para convertir a farenheit			
		}else if(escala.equalsIgnoreCase("Celsius")){
			System.out.println(alvaro.celsiusToFarenheit(temperatura)+ " Celsius");
//		Si introduce otro valor le decimos que no esta configurado			
		}else if(escala!="Celsius"||escala!="Fahrenheit") {
			System.out.println("No tenemos la funcion configurada todavia");
		}
		entrada.close();
	}

}
