package Refuerzo;

public class OperadoresLogicos {

	public static void main(String[] args) {
//		OPERADORES LOGICOS 
//		Utilizamos los operadores logicos para construir condiciones complejas
//		AND: &&
//		OR: ||
//		NOT: !
//		valorBoleano1 && valorBoleano2 = valorBoleanoResultado;
//	__________________________________________________________________________________
		
//		AND:condicion1 && condicion2 && condicion3 
//		-Si se cumplen todas las condiciones devuelve el valor TRUE
//		OR: condicion1 || condicion2 || condicion3
//		-Si se cumple una condicion o mas devuelve el valor TRUE
//		NOT: !condicion1
//		-Devuelve el valor contrario TRUE
		
//________________________________________________________________________________
		
//		EJEMPLOS
	    
		boolean b1 = true && true ;//esto sera igual a TRUE  
		System.out.println(b1);
		boolean b2 = b1 && true && false;//esto sera igual a FALSE
		System.out.println(b2);
		boolean b3 = b2 || true;
		System.out.println(b3);//esto seria TRUE
		boolean b4 =!(b3 || false|| false);
		System.out.println(b4);//esto seria FALSE
	}

}
