package POO;
import java.util.*;

public class Numero {
	//Atributos
	
	private int num;
	
	//Constructor por defecto que inicializa a 0 el num interno.
	
		public Numero() {
			num=0;
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
		System.out.println("Método aniade que permite sumarle un número al valor interno.");
		System.out.println(a1.sumarNumero(2));
		System.out.println("Método aniade que permite restarle un número al valor interno.");
		System.out.println(a1.restarNumero(2));
		System.out.println("Método devuelve el doble del valor.");
		System.out.println(a1.getDoble());
		System.out.println("Método devuelve el triple del valor.");
		System.out.println(a1.getTriple());
		//Establecemos el valor internoa 3.
		a1.setNumero(3);
		System.out.println("Obtenemos el valor interno");
		System.out.println(a1.getValor());
	
	}

}
