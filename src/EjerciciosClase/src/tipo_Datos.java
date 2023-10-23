package pruebasClase;

import java.util.*;
public class tipo_Datos {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		//no se puede MAL
		//float unfloat = 0.17;
		// BIEN
		float unfloat1 = 0.17F;
		//BIEN
		float unDouble = -0.175F;
		//No se puede hacer la raiz de un numero negativo la salida es NAN 
		System.out.println(Math.sqrt(-1));
		//Infinito
		System.out.println(1.1e200*1.1e200);
		//CHAR
		//El tipo de dato CHAR se 
			//caracteres
					char varable_caracter;
					
			//Asignacion
					varable_caracter ='Q';
			//con comillas simples un caracter, sin comillas simples el valor del caracter en la tabla ASCI	
			//Declaracion con Inicializacion
					char segunda_variable_caracter = 126;
					
					
		System.out.println(varable_caracter);
		System.out.println(segunda_variable_caracter);
		//Tambien podemos hacer un casting para cambiar el valor del numero de la tabla ASCI al caracter correspondiente
		System.out.println((int)segunda_variable_caracter);
		//Tambien podemos hacerlo del rebes y pasar del  valor del caracter al caracter mediante el casting con  CHAR
		System.out.println((char)segunda_variable_caracter);
		//Para convertir la cadena en un entero o int
		//int num =Integer.parseInt("123");
		
		//comversion implicita
		
		int longitud =3;
		int res1=3;
		float res;
		float espacio=4, expresion;
		
		espacio = longitud;
		res= longitud+espacio;
	//	res1=longitud+espacio;//no dejaria porque res1 es int y es mas pequeño que espacio que es 
		//float no cabria con lo cual no podria hacer el casting implicito
		
		//de esta manera comveritira de int a doble parapoder sumarlo.Me he quedado en la pagina 42
		int n1 = 12;
		float n2 = 1.2F;
		 	n2+=n1;
		 	System.out.println(n2);
		 	
		 	char c = 'a',c2 ;
		 	int I=23, i2;
		 	short s;
		 	double d;
		 	i2=c;
		 	//s=c;//no se puede meter un int en un short es mas pequeño 
		 	d=c;
		 	s=678;
		 	double dou =123.67;
		 	int dest = (int)dou;
		 	dou = 3.40282347e+50;
		 	int in=257;
		 	byte b;
		 	b=(byte) in;
		 	
		 	System.out.println(b);///no la entiendo muy bien
		 	
		 	
		 	int c1=20;
		 	int c4=500000000;
		 	int c5;
		 	
		 	c5=c1*c4;
		 	
		 	System.out.println(c5);
		 	
		 	float c14 = 0.1000000006F;
		 	float c15 =0.1000000008F;
		 	
		 	if (c14 == c15)
		 		System.out.println("c1 y c2 son iguales");
		 		else
		 		System.out.println("c1 y c2 son distintos");
		
	//PARA PASAR A ESTRIN	
//	System.out.println("Introduce numero");
//	
//	int	x=entrada.nextInt();
//		
//	String	cadena=Integer.toString(x);
//		
//		System.out.println(x);
		//Ejercicio 3 de ejercicios propuestos
		 	float r; int i=0; char c12=0;
		 	//i= c12+i;
		 	r=i/10;
	System.out.println(r);	 
	//EJERCICIO NUMERO 2
	//Si cambio el tipo de dato a long me dara el resultado mal , porque mete el resultado de la operacion 
	//que es int en long , hay que hacer castint y poner long 
	int c23=20;
	int c24=500000000;
	long c25;
	c25=(long)c23*c24;
	boolean bo =true;
	byte e =3;
	byte v=e;
	short n=12433;
	v=(byte) n;
	System.out.println(c25);
	
	double c145 = 0.100000006F;
	double c246 = 0.100000008F;
	if (c145 == c246)
	System.out.println("c1 y c2 son iguales");
	else
	System.out.println("c1 y c2 son distintos");
	
	
	
	
	//EJERCICIO  NUMERO 3
	
	
	//EJERCICIO NUMERO 4 
	
//	double largo = 0 , corto1=0,corto2=0;
//	
//	System.out.println("Dame el lado largo");
//	entrada.nextDouble();
//    System.out.println("Dame el lado largo");
//	entrada.nextDouble();
//	System.out.println("Dame el lado largo");
//	entrada.nextDouble();
//	
//	if(Math.pow(largo,2)==Math.pow(corto1, 2) + Math.pow(corto2,2)) {
//		System.out.println("Son iguales ");
//	}else {
//		System.out.println("no son iguales");
//	}
	//EJERCICIO 6
	 
	 
	 
	 
	 
	 
	 
	
	}
}
