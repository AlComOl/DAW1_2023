package POO;
import java.util.*;
/****************************************************************************************
 
 	Autor: Álvaro Comenge

	Fecha: 7/11/23
	
	Descripción:
	
		Realice una clase Temperatura, la cual convierta grados Celsius a Farenheit y 
		viceversa. Para ello cree dos métodos double celsiusToFarenheit(double) y 
		farenheitToCelsius(double). Pruebe dicha clase.

 ****************************************************************************************/
public class Temperatura {
	
	//METODOS
	public static float celsiusToFarenheit(float valor) {
		
		return (valor*9/5)+32;
	}
	
	public static float farenheitToCelsius(float valor) {
		return  (valor-32)*5/9;
	}


	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
//		Temperatura alvaro=new Temperatura();
		
		System.out.println("Introduce tipo conversion \n 1-Celsius a Farenheit \n 2-Farenheit a Celsius");
		int opcion=entrada.nextInt();
		System.out.println("Introduce Temperatura");
		int temperatura=entrada.nextInt();
		switch (opcion) {
		case 1:
			//LLamamos a la funcion y le pasamos la temperatura introducida por teclado
			System.out.println(celsiusToFarenheit(temperatura)+" Fahrenheit"); 
			
			break;
		case 2:

			System.out.println(farenheitToCelsius(temperatura)+" Celsius");
			break;

		default:
			break;
		}
		
	entrada.close();	

	}

}


