package Refuerzo;

public class refuerzo {

	public static void main(String[] args) {
		 
		String mi_nombre="Alvaro";
		
	
		//.length()
		System.out.println(mi_nombre + " tiene "+ mi_nombre.length()+ " letras");
		//.charAt()
		System.out.println("En la posicion 3 de la palabra "+ mi_nombre + " esta la letra "+mi_nombre.charAt(2));
		//Para sacar la ultima letra del una palabra con .length medimos y lo 
		//metemos detro de ultima_letra después por medio de charAt "que muestra la posicion 
		// que deseamos ponemos (ultima_letra -1 ), donde ultima letra es el valor total de la palabra
		//menos 1 , porque el metodo empieza a contar desde 0 , y restando 1 nos dara la letra exacta.
		int ultima_letra= mi_nombre.length();
		System.out.println("La ultima letra de la palabra "+"'" + mi_nombre.charAt(ultima_letra-1)+"'");
		
		//substring
		//.equals devuelve un valor boleano
		System.out.println();
		
		//.equalsIgnoreCase()
		
		}
		
		
	}
 
	
	

