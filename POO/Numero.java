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
		public Numero(int valor) {
			
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
		
		public int setNumero(int valor) {
			
		return	num =valor;
		}
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Numero a1= new Numero();
		System.out.println("Metodo aniade que permite sumarle un numero al valor interno.");
		System.out.println(a1.sumarNumero(2));
		System.out.println("Metodo aniade que permite restarle un numero al valor interno.");
		System.out.println(a1.restarNumero(2));
		System.out.println("Metodo devuelve el doble del valor.");
		System.out.println(a1.getDoble());
		System.out.println("Metodo devuelve el triple del valor.");
		System.out.println(a1.getTriple());
		//Establecemos el valor internoa 3.
		a1.setNumero(3);
		System.out.println("Obtenemos el valor interno");
		System.out.println(a1.getValor());
	
	}

}
