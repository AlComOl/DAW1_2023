package POO;
import java.util.*;
/****************************************************************************************
 
 	Autor: Álvaro Comenge

	Fecha: 1/11/23
	
	Descripción:
	
		Realice una clase Temperatura, la cual convierta grados Celsius a Farenheit y 
		viceversa. Para ello cree dos métodos double celsiusToFarenheit(double) y 
		farenheitToCelsius(double). Pruebe dicha clase.

 ****************************************************************************************/
public class Temperatura {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		Temperatura alvaro=new Temperatura();
		
		System.out.println("Introduce tipo conversion \n 1-Celsius a Farenheit \n 2-Farenheit a Celsius");
		int opcion=entrada.nextInt();
		System.out.println("Introduce Temperatura");
		float temperatura=entrada.nextFloat();
		switch (opcion) {
		case 1:
			//LLamamos a la funcion y le pasamos la temperatura introducida por teclado
			System.out.println(alvaro.celsiusToFarenheit(temperatura)+" Fahrenheit");
			break;
		case 2:

			System.out.println(alvaro.farenheitToCelsius(temperatura)+" Celsius");
			break;

		default:
			break;
		}
		
	entrada.close();	

}
	//CONSTRUCTOR QUE NO HACE NADA 
	public Temperatura() {
		
	}
		
	//METODOS
		public  float celsiusToFarenheit(float valor) {
			
			return (valor*9/5)+32;
		}
		
		public float farenheitToCelsius(float valor) {
			return  (valor-32)*5/9;
		}

	}
