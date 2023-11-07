package POO;
import java.util.*;
/****************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:05/11/23


Descripción:
	Realiza una clase Número que almacene un número entero y tenga las siguientes características: 
	• Constructor por defecto que inicializa a 0 el número interno. 
	• Constructor que inicializa el número interno. 
	• Método aniade que permite sumarle un número al valor interno.
	• Método resta que resta un número al valor interno.
 	• Método getValor. Devuelve el valor interno. 
	• Método getDoble. Devuelve el doble del valor interno.
	• Método getTriple. Devuelve el triple del valor interno. • Método setNumero. Inicializa de nuevo el valor interno.




***********************************************************************************************************************************/
public class Numero {
	//Atributos
	
	private int num;
	
	//Constructor por defecto que inicializa a 0 el num interno.
	
		public Numero() {
			num=0;
		}
	//Constructor que inicializa el número interno.
		public Numero(int valor) {
			num=valor;
		}
		
		//Metodos
		//Permite sumar un numero al valor interno.
		public int sumarNumero(int valor) {
			
			return num+valor;
		}
		//Permite restar un numero al valor interno
		public int restarNumero(int valor) {
			
			return num-valor;
		}
		
		//Metodo get valor (devuelve el valor interno )
		
		public int getValor() {
			
			return num;
		}
		
		//Metodo get Doble , devuelve el doble del valor
		
		public int getDoble() {
			
			return num*2;
			
		}
		
		//Metodo get triple , devuelve el triple del valor interno
		
		public int getTriple() {
			
			return num*3;
			
		}
		//Metodo que establece un nuevo valor		
		public void setNumero(int valor) {
			
		num =valor;
		}
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte e;
		Numero a1= new Numero();
		do {
			
		
		System.out.println("\n 1-Aniade y Suma el numero introducido al valor interno. \n 2-Metodo aniade que permite restarle un numero al valor interno. \n 3-Metodo devuelve el doble del valor.  \n 4-Metodo devuelve el triple del valor. \n 5-Inicializa de nuevo el valor interno. \n 6-SALIR"  );
		 e=entrada.nextByte();
		switch (e) {
		case 1:
			System.out.println("Anaide numero y  sumar al valor interno");
			int num=entrada.nextInt();
			System.out.println(a1.sumarNumero(num));
			break;
		case 2:
			System.out.println("Anaide numero y resta al valor interno ");
			int num2=entrada.nextInt();
			System.out.println(a1.restarNumero(num2));
			break;
		case 3:
			System.out.println(a1.getDoble());
			break;
		case 4:
			System.out.println(a1.getTriple());
			break;
		case 5:
			System.out.println("Inicializa el valor interno");
			int num3=entrada.nextInt();
			a1.setNumero(num3);
			break;
			
		default:
//			System.out.println("Los valores no estan configuradon");
			break;
		}
		
		} while (e!=6);
		
	
		
//		System.out.println(a1.getValor());
//		a1.setNumero(5);
//		System.out.println(a1.getValor());
//		System.out.println("Metodo aniade que permite sumarle un numero al valor interno.");
//		System.out.println(a1.sumarNumero(2));
//		System.out.println("Metodo aniade que permite restarle un numero al valor interno.");
//		System.out.println(a1.restarNumero(2));
//		System.out.println("Metodo devuelve el doble del valor.");
//		System.out.println(a1.getDoble());
//		System.out.println("Metodo devuelve el triple del valor.");
//		System.out.println(a1.getTriple());
//		//Establecemos el valor internoa 3.
//		a1.setNumero(3);
//		System.out.println("Obtenemos el valor interno");
//		System.out.println(a1.getValor());
//		
//		System.out.println();
//		
	}

}
