package Refuerzo;
/*
           Álvaro Comenge 
  
  
  
  
  		Escribe un programa que pida al usuario dos números enteros (sin importar el orden)
		y que muestre la cantidad de múltiplos de 5 que hay entre ellos.
 */
 import java.util.*;
public class Refuerzo1_1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce 2 numeros enteros");
		int n = entrada.nextInt();
		int n1 = entrada.nextInt();
		System.out.println("Adivina la multiplicacionentre ambos");
		int respuesta = entrada.nextInt();
		
		int res=n*n1;
		
		String ternario=(respuesta==res)?"Has acertado":"has fallado";
	
		System.out.println(ternario);
		
		

	}

}
