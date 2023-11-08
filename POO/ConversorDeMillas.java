package POO;
import java.util.*;
/************************************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:8/11/23


Descripción:
	Crea una clase con un método millasAMetros() que toma como parámetro de entrada un valor en millas marinas y las convierte a metros. 
	Una vez tengas este método escribe otro millasAKilometros() que realice la misma conversión, pero esta vez exprese el resultado en kilómetros.
	 Nota: 1 milla marina equivale a 1852 metros.



*****************************************************************************************************************************************************/
public class ConversorDeMillas {
	
//Metodos
	public double millasAMetros(double valor) { //Crea una clase con un método millasAMetros() V.entrada millas marinas V.salida metros
		
		return 1852*valor;
	}
	
	public double millasAKilometros(double valor) {//Metodo para pasar de millas a Kilometros V.entrada millas marinas V.salida Kilometros
		
		return (1852*valor)/1000;
	}
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); 
		
		ConversorDeMillas e7=new ConversorDeMillas();
		
		System.out.println("\n 1-Convertir de millas a metros \n 2-Convertir de Millas a Kilometros");
		int eleccion=0;
		eleccion=entrada.nextInt();
		System.out.println("Introduce las millas a convertir");
		double millas= entrada.nextDouble();
		switch (eleccion) {
		case 1:
			System.out.println(e7.millasAMetros(millas)+" Metros");
			break;
		case 2:
			System.out.println(e7.millasAKilometros(millas)+" Kilometros");
			break;

		default:
			System.out.println("Opcion no configurada");
			break;
		}
		entrada.close();
	}

}
