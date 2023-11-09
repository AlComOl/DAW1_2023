package POO;
import java.util.*;
/**************************************************************************************************************************

	Autor: Álvaro Comenge

	Fecha: 8/11/23

	Descripción:

	Modifica clase satélite de la cuestión 4, añadiendo los siguientes métodos y creando una clase de prueba:
 		• Método void variaAltura(double desplazamiento): Este método acepta un parámetro que será positivo o negativo 
 		dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
 		• Método boolean enOrbita(): Este método devolverá false si el satélite está en tierra, y true en caso contrario. 
 		• Método void variaPosicion(double variap, double variam): Este método permite modificar los atributos de posición 
   		(meridiano y paralelo) mediante los parámetros variap y variam.
   		Estos parámetros serán valores positivos o negativos relativos que harán al satélite modificar su posición.

*****************************************************************************************************************************/
public class Satelite {
//     Atributos
		private double meridiano;
		private double paralelo;
		private double distancia_tierra;
//		Constructor  
		public Satelite(double m, double p, double d){
			meridiano=m;
			paralelo=p;
			distancia_tierra=d;
		}
//		Constructor 
		public Satelite(){
			meridiano=paralelo=distancia_tierra=0;
		}
//		Metodos
		public void setPosicion(double m, double p, double d){
			meridiano=m;
			paralelo=p;
			distancia_tierra=d;
		}
		public void printPosicion(){
			System.out.println("El satélite se encuentra en el paralelo " + paralelo + " Meridiano "+meridiano+" a una distancia de la tierra de "+ distancia_tierra+"Kilómetros");
		}
		
//		Método void variaAltura(double desplazamiento)
		
		public void variaAltura(double desplazamiento) {
			double	colision=distancia_tierra+desplazamiento;
			if(colision>0) {
				distancia_tierra+=desplazamiento;
			}else {
				System.out.println("Movimiento no permitido COLISION");
				
			}
		}
//		Método boolean enOrbita(): Este método devolverá false si el satélite está en tierra, y true en caso contrario.
		
		public boolean enOrbita() {
			
			if(distancia_tierra<=0) {
				 boolean orbita=false;
			}
			boolean orbita=true;
			
			return orbita;
		}
//		Método void variaPosicion(double variap, double variam) mediante los parámetros variap y variam. 
		
		public void variaPosicion(double variap, double variam) {
			paralelo+=variap;
			meridiano+=variam;
		}
		
		
		
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		byte decision=0;
		Satelite curiosity=new Satelite();
		do {
			System.out.println("\n 1-Introduce posicion del satelite \n 2-Variar Altura \n 3-Saber si esta en Orbita \n 4-Modificar Paralelo y Meridiano \n 5-Pedir Coordenadas \n 6-SALIR");
			decision=entrada.nextByte();
			switch (decision) {
			case 1:
				System.out.println("Introduce la Paralelo del satelite");
				byte p=entrada.nextByte();
				System.out.println("Introduce la Meridiano del satelite");
				byte m=entrada.nextByte();
				System.out.println("Introduce la Altura del satelite");
				byte a=entrada.nextByte();
					curiosity.setPosicion(p, m, a);	
				break;
			case 2:
				System.out.println("Introduce la Altura");
				byte a1=entrada.nextByte();
				curiosity.variaAltura(a1);
				break;
			case 3:
				System.out.println("Si esta en Orbita es TRUE");
				System.out.println(curiosity.enOrbita());
				break;
			case 4:
				System.out.println("Introduce Paralelo (movimiento relativo)");
				byte p1=entrada.nextByte();
				System.out.println("Introduce Meridiano (movimiento relativo)");
				byte m1=entrada.nextByte();
				curiosity.variaPosicion(p1, m1);
				break;
			case 5:
				curiosity.printPosicion();
				break;
			default:
				System.out.println("Opciones no configuradas");
				break;
			}
		} while (decision!=6);
		
	}

}
