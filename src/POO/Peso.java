package POO;
import java.util.*;
/********************************************************************************************************************************************************************************************************************************************************************

Autor: Álvaro Comenge

Fecha: 8/11/23

Descripción:
	Crea la clase Peso, la cual tendrá las siguientes características: 
	 • Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
	 • En el constructor se le pasará el peso y la medida en la que se ha tomado (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
	 • Deberá de tener los siguientes métodos: 
	 – getLibras. Devuelve el peso en libras. 
	 – getLingotes. Devuelve el peso en lingotes. 
	 – getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales). 
	 Para la realización del ejercicio toma como referencia los siguientes datos: 1 Libra = 16 onzas = 453 gramos. 1 Lingote = 32,17 libras = 14,59 kg. 1 Onza = 0,0625 libras = 28,35 gramos. 1 Penique = 0,05 onzas = 1,55 gramos. 1 Quintal = 100 libras = 43,3 kg.
	 Crea además un método main para testear y verificar los métodos de esta clase.


************************************************************************************************************************************************************************************************************************************************************************/
public class Peso {
	final double Lb
//	Atributos
	
	private double Kilogramo;
	
//	Constructor //Introducimos el peso y la medida en el constructor conviertiendolo a KG 
//	independientemente de la unidad en la que este y guardandomos en Kilogramos
	private Peso(double peso, String medida) {
		
				Kilogramo=peso;
		//El condicional si es igual a la medida lo convierte a kilogramos guardandolo en el Atributo
			if(medida.equalsIgnoreCase("Lb")) {
				Kilogramo=peso*0.453;
			}
			if(medida.equalsIgnoreCase("Li")) {
				Kilogramo=peso*14.59;
			}
			if(medida.equalsIgnoreCase("Oz")) {
				Kilogramo=peso*0.2835;
			}
			if(medida.equalsIgnoreCase("P")) {
				Kilogramo=peso*0.00155;
			}
			if(medida.equalsIgnoreCase("Q")) {
				Kilogramo=peso*43.3;
			}
			if(medida.equalsIgnoreCase("K")) {
				Kilogramo=peso;
			}
			if(medida.equalsIgnoreCase("G")) {
				Kilogramo=peso/1000;
			}
			
	}
			
//			Metodo
//			al dividir los Kilogramos obtenidos entre el equibalente en libras nos convierte a libras.
			public double getLibras() {
				
				return Kilogramo/0.453;
		
			}
//			al dividir los Kilogramos obtenidos entre el equibalente en lingotes nos convierte a lingotes.
			public double getLingotes() {
				return Kilogramo/14.59;
			}
//			con un switch validamos la unidad y lo convertimos en el metodo
			public double getPeso(String medida) {
				 double valor=0;
				switch (medida) {
				case "Lb":
					valor=Kilogramo/0.453;
					break;
				case "Li":
					valor=Kilogramo/14.59;
					break;
				case "Oz":
					valor=Kilogramo/0.02835;
					break;
				case "P":
					valor=Kilogramo/0.0155;
					break;
				case "Q":
					valor=Kilogramo/43.3;
					break;
				case "K":
					valor=Kilogramo;
					break;
				case "G":
					valor=Kilogramo/0.001;
					break;
			
				default:
					System.out.println("Esta medida no esta configurada");
					break;
				}
				return 	valor;
				
			}
	public static void main(String[] args) {
		
		Peso c1=new Peso(1,"Lb");
//		comprobamos  paso a libras
		System.out.println(c1.getLibras()+" Libras");
//		comprobamos	 paso a lingotes	
		System.out.println(c1.getLingotes()+" Lingotes");
//		convertimos al peso introducido
		System.out.println(c1.getPeso("Lb"));
		
		
	}

}
