package Practica151123;
import java.util.*;

public class TestJugador {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		byte opcion;
		String nombre;
		String sexo;
		int puntos,rebotes,asistencias,tapones,robosdebalon;
		
		
		Jugador j1= new Jugador();
		Jugador j2= new Jugador();
		j1.mostrar();
		
	do {
		System.out.println("\n 1-Crea un nuevo jugador(Introduce datos) \n 2-Salir");
		opcion=entrada.nextByte();
		
		switch (opcion) {
		
		case 1:
			System.out.println("Introduce nombre");
			nombre=entrada.next();
			j1.setNombre(nombre);
			System.out.println("Introduce sexo");
			sexo=entrada.next();
			j1.setSexo(sexo);
			System.out.println("Introduce puntos");
			puntos=entrada.nextInt();
			j1.setPuntos(puntos);
			System.out.println("Introduce rebotes");
			rebotes=entrada.nextInt();
			j1.setRebotes(rebotes);
			System.out.println("Introduce asistencias");
			asistencias=entrada.nextInt();
			j1.setRebotes(asistencias);
			System.out.println("Introduce tapones");
			tapones=entrada.nextInt();
			j1.setTapones(tapones);
			System.out.println("Introduce robos de balon");
			robosdebalon=entrada.nextInt();
			j1.setRobosdebalon(robosdebalon);
			
			
			
			
			
//			me falta poner poner el constructor de copia que compararia con otra funcion que no he puesto los 3 jugadores
			
			break;
		case 2:
			
			break;
		
		default:
			break;
		}
	} while (opcion!=2);
	}

}

