import java.util.*;

public class PRG_16 {
	public static void main(String[] args) throws java.io.IOException {
		Scanner entrada = new Scanner(System.in);
		int caracter;
		
		String binario, hexadecimal;
		 
		 System.err.println("Introduce un caracter");
		 //Introduzco el caracter como char y lo meto en un int;
		 caracter= (char) System.in.read();
		 
		 //de int lo paso a Binario y hexadecimal con las funciones
		 binario= Integer.toBinaryString(caracter);
		 hexadecimal=Integer.toHexString(caracter);
		 
		 System.out.println("El caracter en Binario es "+binario);
		 System.out.println("El caracter en Binario es "+hexadecimal);
		 
	}
}
