package POO;
/*La clase Racional encapsula un numerador y un denominador enteros. De tal forma que pueda almacenar ½, ¾, 5/8, etc

Haz un menú para guardar dos racionales y una opción para mostrar su suma, multiplicación, (resta, y división).

Menú

1. Sumar racionales

2. Multiplicar racionales

0. Salir

Ejemplo: r3 = r1.suma(r2);

Introduce un método para simplificar las operaciones.
 * 
 */
import java.util.Scanner;

public class Racional1 {
//	atributos 
	
	private int numerador;
	private int  denominador;
//Constructor por defecto , lo necesitamos para cuando metamos sumar los valores en r3
	public  Racional1(){
		numerador=1;
		denominador=1;
		
	}
	
//	constructor argumentos

	public  Racional1(int numerador1, int denominador1) {
		this.numerador=numerador1;
		this.denominador=denominador1;
	}
	
//	Constructor de copia 
	
	public Racional1(Racional1 r) {
		this.numerador=r.numerador;
		this.denominador=r.denominador;
	}

	

	//Setters y Getters para obtener e introducir valores
	public int getNumerador() {
			return numerador;
	}

	public void setNumerador(int numerador) {
			this.numerador = numerador;
	}

	public int getDenominador() {
			return denominador;
	}

	public void setDenominador(int denominador) {
			this.denominador = denominador;
	}
	
//	en vez de hacer una funcion void es una funcion devuelve un obgeto
	public Racional1 suma(Racional1 r) {
		
		Racional1 r3=new Racional1();
//		el numerador es iguel al numerador introducido *el denominador pasado como argumento+ numerador pasado como argumento *el numerador introducido
		r3.numerador=this.numerador*r.denominador+r.numerador*this.denominador;
		r3.denominador= this.denominador*r.denominador;

		r3.simplificar();
		
		return r3;
	}
//	Funcion para restar obgetos
	public Racional1 resta(Racional1 r) {
		 
		Racional1 r3= new Racional1();
		
		r3.numerador=this.numerador*r.denominador-this.denominador*r.numerador;
		r3.denominador=this.denominador*r.denominador;
		
		
		
		return r3;
	 }
	 
	 public Racional1 multiplicacion(Racional1 r) {
		 
		 Racional1 r3= new Racional1();
		 
		 r3.numerador=this.numerador*r.numerador;
		 r3.denominador=this.denominador*r.denominador;
		 
		 return r3;
	 }
	 
	 public Racional1 division(Racional1 r) {
		 
		 Racional1 r3= new Racional1();
		 
		 r3.numerador=this.numerador*r.denominador;
		 r3.denominador=this.denominador*r.numerador;
		 
		 return r3;
	 }
	 private boolean simplificar(){
	        int numSimplificado,denSimplificado, mcd;
	        boolean simplificado=false;

	        numSimplificado= numerador;
	        denSimplificado= denominador;
//uclides
	        while (denSimplificado != 0) {
	            int res= numSimplificado % denSimplificado;
	            numSimplificado = denSimplificado;
	            denSimplificado=res;
	        }

	        mcd= numSimplificado;

	        if(mcd>1){
	            numerador/=mcd;
	            denominador/=mcd;
	            simplificado=true;
	        }
	        return simplificado;
	    }
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		int numerador1 = 0,numerador2=0,denominador2=0,denominador1=0;
		byte decision=0;
		Racional1 r1=new Racional1();
		Racional1 r2=new Racional1();
		Racional1 r3=new Racional1();
		
		System.out.println("Introduce numerador1 y denominador1");
		numerador1=entrada.nextInt();
		r1.setNumerador(numerador1);
		denominador1=entrada.nextInt();
		r1.setDenominador(denominador1);
		System.out.println("Introduce numerador1 y denominador1");
		numerador2=entrada.nextInt();
		r2.setNumerador(numerador2);
		denominador2=entrada.nextInt();
		r2.setDenominador(denominador2);
		
			System.out.println("Menu \n 1.Sumar Racionales \n 2.Restar Racionales \n 3.Multiplicar Racionales \n 4-Dividir Racionales \n 0.SALIR ");
				decision=entrada.nextByte();
			switch (decision) {
			case 1:
			   r3=r1.suma(r2);
			   	System.out.println(r3.getNumerador());
				System.out.println(r3.getDenominador());
				break;
			case 2:
				r3=r1.resta(r2);
				System.out.println(r3.getNumerador());
				System.out.println(r3.getDenominador());
				break;
			case 3:
				r3=r1.multiplicacion(r2);
				System.out.println(r3.getNumerador());
				System.out.println(r3.getDenominador());
				break;
			case 4:
				r3=r1.division(r2);
				System.out.println(r3.getNumerador());
				System.out.println(r3.getDenominador());
				break;
			case 5:
//				SALIR
				break;

			default:
				break;
			}

		
}
}