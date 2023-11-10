package POO;
import java.util.*;

/****************************************************************************************************************************

	Autor: Álvaro Comenge

	Fecha:04/11/23


	Descripción:
		Realiza una clase MiNumero que proporcione el doble, triple y cuádruple de un número proporcionado en su constructor 
		(realiza un método para doble, otro para triple y otro para cuádruple). Haz que la clase tenga un método main 
		y comprueba los distintos métodos.
 
	
	
	
***********************************************************************************************************************************/
public class MiNumero {
	
//	Atributos
	
	private double numero;
	
//CONSTRUCTOR
	
	public MiNumero(double valor) {//proporcionamos el numero como parametro o argumento 
		this.numero=valor;
		
	}
	
//METODOS 
	public double getDoble() {
		
		return this.numero*=2;
	}
	public double getTriple() {
		
		return this.numero*=3;
	}
	public double getCuatriple() {
		
		return this.numero*=4;
	}

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		
		System.out.println("Introduce un valor");
		double valor=entrada.nextDouble();
		MiNumero Alvaro = new MiNumero(valor);
		System.out.println("Pulsa: \n 1-Para aplicar el metodo Doble(Calculara el doble del numero)		\n 2-Para aplicar el metodo Triple(calculara el triple del numero)		\n 3-Para aplicar el metodo Cuatriple(calculara el cuatriple del numero) ");
		int decision=entrada.nextInt();
		switch (decision) {//aplicamos la funcion que necesitemos.
		case 1:
			System.out.println(	Alvaro.getDoble());
			break;
		case 2:
			System.out.println(	Alvaro.getTriple());
			break;
		case 3:
			System.out.println(	Alvaro.getCuatriple());
			break;

		default:
			System.out.println("No exixte esa opcion todavia");
			break;
		}

	}

}
