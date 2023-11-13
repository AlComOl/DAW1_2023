package POO;
import java.util.*;
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
public class Racional {
	
	//Atrubutos
	private int numerador;
	private int denominador;
	
	
	public Racional() {
		numerador=1;
		denominador=1;
	}
	
//	Constructor con argumentos
	
	public Racional(int numerador, int denominador){
		
		this.numerador=numerador;
		this.denominador=denominador;
		
	}
//	Metodos getters y setters

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
//	Metodos para Sumar 
	public void suma (Racional r) {
		
	}
	public void  sumaRacionales(int numerador2,int denominador2) {
		this.numerador=this.numerador*denominador2+numerador2*this.denominador;
		this.denominador*=denominador2;
	
		System.out.println(this.numerador+"/"+this.denominador);
		System.out.println(simplificar());
	}
//	Metodo para restar racionales
	public void restarRacionales(int numerador2,int denominador2){
		this.numerador=this.numerador*denominador2-numerador2*this.denominador;
		this.denominador*=denominador2;
		System.out.println(this.numerador+"/"+this.denominador);
	}
//	Metodos para Multiplicar racionalesMetodos para dividir racionales
	public void multRacionales(int numerador2,int denominador2) {
		this.numerador*=numerador2;
		this.denominador*=denominador2;
		System.out.println(this.numerador+"/"+this.denominador);
	}
	
	public void divRacionales(int numerador2,int denominador2) {
		this.numerador*=denominador2;
		this.denominador*=numerador2;
		System.out.println(this.numerador+"/"+this.denominador);
//		System.out.println(simplificar());
	}
	
//	metodo simplifica
	
	private  String simplificar(){
        int numSimplificado, denSimplificado, mcd;
//        boolean simplificado=false;

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
//            simplificado=true;
        }
        return numerador +"/"+ denominador;
	
    } 
//	

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num=0, deno=0, opcion=0,num1=0, deno1=0;
		Racional r1=new Racional();
		
		
		System.out.println("Introduce numerador ");
			num=entrada.nextInt();
			r1.setNumerador(num);
		System.out.println("Introduce denominador");
			deno=entrada.nextInt();
			r1.setDenominador(deno);
		
		System.out.println("Introduce el segundo racional numerador 2");
			num1=entrada.nextInt();
			
		System.out.println("Introduce el segundo racional denominador 2");
			deno1=entrada.nextInt();
			
			do {
		System.out.println("1-Sumar racionales \n 2-Restar racionales \n 3-Multiplicar racionales  \n 4-Dividir racionales \n 5-Simplifica \n 6-SALIR");
		opcion=entrada.nextInt();
		
		switch (opcion) {
		
		case 1 : //suma
			r1.sumaRacionales(num1,deno1);
			break;
		case 2://resta
			r1.restarRacionales(num1, deno1);
			break;
		case 3://multiplicacion
			r1.multRacionales(num1, deno1);
			break;
		case 4://division
			r1.divRacionales(num1, deno1);
			break;
		case 5://simplificar
			r1.simplificar();
			break;
		default:
			
			break;
		}
		}while(opcion!=6);

	}

}
