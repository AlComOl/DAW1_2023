package POO;
import java.util.*;
/********************************************************************************************************************************************************************************************************************************************************************

Autor: Álvaro Comenge

Fecha: 8/11/23

Descripción:
	Implementa una clase Consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes características: 
	• Atributos: 
	– kms. Kilómetros recorridos por el coche. 
	– litros. Litros de combustible consumido. 
	– vmed. Velocidad media. 
	– pgas. Precio de la gasolina. 
	• Métodos: 
	– getTiempo. Indicará el tiempo empleado en realizar el viaje. 
	– consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros). 
	– consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
	 No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más apropiado para cada atributo.

************************************************************************************************************************************************************************************************************************************************************************/
public class Cosumo {
//	Atributos
	private double kmsRecorridos;
	private double litrosConsumidos;
	private double vMed;
	private double pGas;
//	Constructor
	public Cosumo(double kms,double litros, double vMed, double pGas) {
		this.kmsRecorridos=kms;
		this.litrosConsumidos=litros;
		this.vMed=vMed;
		this.pGas=pGas;
	}
//	Metodos
	public double getTiempo() {
		
		return kmsRecorridos/vMed;
		
	}
	public double consumoMedio() {//Consumo medio del vehículo (en litros cada 100 kilómetros)
		
		return (litrosConsumidos*100)/kmsRecorridos;
		
	}
	public double consumoEuros() {
		return ((litrosConsumidos*pGas)*100)/kmsRecorridos;
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cosumo consumoAudi = new Cosumo(100,20,100,1.70);
		
		System.out.println(consumoAudi.getTiempo()+" horas");
		System.out.println(consumoAudi.consumoMedio()+" l a los 100 kilometros");
		System.out.println(consumoAudi.consumoEuros()+" Euros a los 100 Kilometros");
		
		
		entrada.close();
	}

}
