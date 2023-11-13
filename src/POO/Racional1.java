package POO;

import java.util.Scanner;

public class Racional1 {
//	atributos 
	
	private int numerador;
	private int  denominador;
//Constructor por defecto , lo necesitamos para cuando metamos sumar loc valores en r3
	public  Racional1(){
		numerador=1;
		denominador=1;
		
	}
	
//	constructor argumentos

	public  Racional1(int numerador1, int denominador1) {
		this.numerador=numerador1;
		this.denominador=denominador1;
	}
	
//	metodo 
	
//	public void suma(Racional1 r) {
//		this.numerador=this.numerador*r.denominador+r.numerador*this.denominador;
//		this.denominador*=r.denominador;
//		
//	}
	//Setters y Getters para obtener y introducir valores
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
		
		Racional1 r3=new Racional1();//instancia de r3
		
		r3.numerador=this.numerador*r.denominador+r.numerador*this.denominador;
		r3.denominador= this.denominador*r.denominador;
//		System.out.println(simplificar());
		return r3;
	}
//	Funcion para restar obgetos
	 public Racional1 resta(Racional1 r) {
		 
		Racional1 r3= new Racional1();
		
		r3.numerador=this.numerador*r.denominador-this.denominador*r.numerador;
		r3.denominador=this.denominador*r.denominador;
		
	System.out.println(	simplificar());
		
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
	 private  Boolean simplificar(){
	        int numSimplificado, denSimplificado, mcd;
	        boolean simplificado=false;

	        numSimplificado= numerador;
	        denSimplificado= denominador;

	        while (denSimplificado != 0) {
	            int res= numSimplificado % denSimplificado;
	            numSimplificado = denSimplificado;
	            denSimplificado=res;
	        }

	        mcd= denSimplificado;

	        if(mcd>1){
	            numerador/=mcd;
	            denominador/=mcd;
	            simplificado=true;
	        }
//	        return numerador +"/"+ denominador;
	        return simplificado;
		
	    } 
	
	
	
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num=0, deno=0, opcion=0,num1=0, deno1=0;
		
		Racional1 r1=new Racional1(16,8);
		Racional1 r2=new Racional1(14,5);
		Racional1 r3=new Racional1();
		
		r3=r1.suma(r2);
		r3=r1.resta(r2);
		r3=r1.multiplicacion(r2);
		r3=r1.division(r2);
		
		
		
		System.out.println(r3.getNumerador());
		System.out.println(r3.getDenominador());
		
}
}