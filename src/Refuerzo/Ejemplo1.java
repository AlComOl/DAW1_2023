package Refuerzo;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero=new Scanner(System.in);
		System.out.println("Introduce numeros");
		int n1=numero.nextInt();
		int n2=numero.nextInt();
		
		
				
		suma(n1,n2);//void 
				
		
		int resultado=suma1(n1,n2);
		System.out.println("el resultado de la suma de los 2 numeros es "+ resultado);
		
	}
		public static void suma(int x,int y) {//void (lo que significa que no devuelve ningún valor)
											  //realizar ciertas operaciones dentro del metodo sin devolver ningún valor
			int resultado= x+y;
			System.out.println(resultado);
		
}
		public static int suma1(int x, int y) {//Su tipo de retorno es int, devolverá un valor de tipo entero
			int resultado; //este tipo de metodo se utiliza cuando quieres calcular algo y utilizarlo en otros lugares del programa
			resultado=x+y;
			
			return resultado; 
		}
}