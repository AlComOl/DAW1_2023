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
//	Constructor Ejercicio siguiente
	public Cosumo() {
		kmsRecorridos=0;
		litrosConsumidos=0;
		vMed=0;
		pGas=0;
	}
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
	public double consumoEuros() { // Consumo medio del vehículo (en euros cada 100 kilómetros).
		return ((litrosConsumidos*pGas)*100)/kmsRecorridos;
	}
	
//	Para la clase anterior implementa los siguientes métodos, los cuales podrán modificar los valores 
//	de los atributos de la clase: • setKms • setLitros • setVmed • setPgas
	
	public void setKms(double valor){
		this.kmsRecorridos=valor;
	}
	public void setLitros(double valor) {
		this.litrosConsumidos=valor;
	}
	public void setVmed(double valor) {
		this.vMed=valor;
	}
	public void setPgas(double valor) {
		this.pGas=valor;
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cosumo consumoAudi = new Cosumo(100,20,100,1.70);
		consumoAudi.setKms(50);
		consumoAudi.setLitros(1);
		consumoAudi.setVmed(130);
		consumoAudi.setPgas(1.46);
		
		System.out.println(consumoAudi.getTiempo()+" horas");
		System.out.println(consumoAudi.consumoMedio()+" l a los 100 kilometros");
		System.out.println(consumoAudi.consumoEuros()+" Euros a los 100 Kilometros");
		
		
		entrada.close();
	}

}
