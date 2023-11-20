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
		Jugador j2= new Jugador("Juan","22569695W","H",2,3,5,6,7);
		Jugador j3= new Jugador(j2);
		
		
	do {
		System.out.println("\n 1-Crea un nuevo jugador(Introduce datos)\n 2-Mostrar jugadores  \n 3-Salir");
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
			entrada.nextLine();
			j1.setPuntos(puntos);
			System.out.println("Introduce rebotes");
			rebotes=entrada.nextInt();
			entrada.nextLine();
			j1.setRebotes(rebotes);
			System.out.println("Introduce asistencias");
			asistencias=entrada.nextInt();
			entrada.nextLine();
			j1.setAsistencias(asistencias);
			System.out.println("Introduce tapones");
			tapones=entrada.nextInt();
			entrada.nextLine();
			j1.setTapones(tapones);
			System.out.println("Introduce robos de balon");
			robosdebalon=entrada.nextInt();
			entrada.nextLine();
			j1.setRobosdebalon(robosdebalon);
			break;
		case 2:
			j1.mostrar();
			j2.mostrar();
			j3.mostrar();
			break;
		
		default:
			break;
		}
	} while (opcion!=3);
	}

}

