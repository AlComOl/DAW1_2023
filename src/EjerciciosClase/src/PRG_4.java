package src.pruebasClase;


import java.util.*;

public class PRG_4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		//DECLARACION
		float n1,n2, suma,resta,prod,div;
		System.out.println("Introduce primer numero");
		//ENTRADA
		n1 = entrada.nextFloat();
		System.out.println("Introduce segundo numero");
		n2 = entrada.nextFloat();
		//PROCESO
		 suma=n1+n2;
		 resta=n1-n2;
		 prod=n1*n2;
		 div=n1/n2;
		//SALIDA
		System.out.println("\n El valor de la suma es: "+suma+"\n El valor de la resta  es: "+resta+"\n El valor del producto "+prod+"\n El valor de la división es: "+div);
	
		entrada.close();
	}

}
