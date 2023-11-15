package POO;
import java.util.*;
/***************************************************************************

 	Autor: Álvaro Comenge

	Fecha: 1/11/23
	
	Descripción:
	
		Realice una clase Temperatura, la cual convierta grados Celsius a Farenheit y 
		viceversa. Para ello cree dos métodos double celsiusToFarenheit(double) y 
		farenheitToCelsius(double). Pruebe dicha clase.

 **************************************************************************/

public class TemperaturaNew {
//	//Atributos
//	private double temperatura;
////	private String escala;
//	
//	//CONSTRUCTOR
//	public TemperaturaNew(double valor, String tipo) {
//		if(tipo.equals("Celsius")) {
//			System.out.println(((valor*9/5)+32)+" Farenheit");
//		}else if(tipo.equals("Farenheit")) {
//			System.err.println((farenheitToCelsius()+"Celsius"));
//		}
//		temperatura=valor;
//
//	}
//	//METODOS
//
//	public double farenheitToCelsius() {
//		
//		return  (temperatura-32)*5/9; 
//	}
//	
//	
//	public static void main(String[] args) {
//		Scanner entrada=new Scanner(System.in);
//		int cantidad=0;
//		String tipo="";
//		
//		
//		System.out.println("Introduce Temperatura");
//		cantidad=entrada.nextInt();
//		System.out.println("Introduce Escala");
//		tipo=entrada.next();
//		
//		TemperaturaNew a1=new TemperaturaNew(cantidad,tipo);
//	
//		entrada.close();
	 private double temperatura;

	   public TemperaturaNew(double var1, String var3) {
		   this.temperatura = var1;
	      if (var3.equals("Celsius")) {
	         System.out.println(this.celsiusToFarenheit()+"farenheit");
	      } else if (var3.equals("Farenheit")) {
	         System.out.println(this.farenheitToCelsius() + "Celsius");
	      }

	    
	   }

	   public double farenheitToCelsius() {
	      return (this.temperatura - 32.0) * 5.0 / 9.0;
	   }
	   public double celsiusToFarenheit() {
		   return this.temperatura * 9.0 / 5.0 + 32.0;
	   }

	   public static void main(String[] var0) {
	      Scanner entrada = new Scanner(System.in);
	     
	      String var3 = "";
	      System.out.println("Introduce Temperatura");
	      int var1 = entrada.nextInt();
	      System.out.println("Introduce Escala");
	      var3 = entrada.next();
	      new TemperaturaNew((double)var1, var3);
	      entrada.close();
	   }
	}
	
	


