package EjerciciosClase.src;
import java.util.*;

public class horoscopoChino {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el año de nacimiento");
		int ano=entrada.nextInt();
		
		int achino =ano%12;
		
		switch (achino) {
		case 4:
			System.out.println("RATA");
			break;
		case 5:
			System.out.println("BUEY");
			break;
		case 6:
			System.out.println("TIGRE");
			break;
		case 7:
			System.out.println("CONEJO");
			break;	
		case 8:
			System.out.println("DRAGON");
			break;
		case 9:
			System.out.println("SERPIENTE");
			break;
		case 10:
			System.out.println("CABALLO");
			break;
		case 11:
			System.out.println("CABRA");
			break;
		case 12:
			System.out.println("MONO");
			break;
		case 1:
			System.out.println("GALLO");
			break;
		case 2:
			System.out.println("PERRO");
			break;
		case 3:
			System.out.println("CERDO");
			break;
	

		default:
			break;
		}
	}

}
