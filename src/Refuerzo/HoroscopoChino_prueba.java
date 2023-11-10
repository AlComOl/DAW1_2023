package Refuerzo;
import java.util.*;


public class HoroscopoChino_prueba {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int anoNacimiento;
		int rata=1900;
		
		System.out.println("Ano de nacimiento");
		anoNacimiento=entrada.nextInt();
		
		
		
		for(int i=0;i<100;i++) {
			rata+=12;
			
			if(rata==anoNacimiento) {
				System.out.println("rata");
			}if(rata+1==anoNacimiento) {
				System.out.println("buey");
			}if(rata+2==anoNacimiento) {
				System.out.println("tigre");
			}if(rata+3==anoNacimiento) {
				System.out.println("conejo");
			}if(rata+4==anoNacimiento) {
				System.out.println("Daragon");
			}if(rata+5==anoNacimiento) {
				System.out.println("serpiente");
			}if(rata+6==anoNacimiento) {
				System.out.println("caballo");
			}if(rata+7==anoNacimiento) {
				System.out.println("cabra");
			}if(rata+8==anoNacimiento) {
				System.out.println("mono");
			}if(rata+9==anoNacimiento) {
				System.out.println("gallo");
			}if(rata+10==anoNacimiento) {
				System.out.println("perro");
			}if(rata+10==anoNacimiento) {
				System.out.println("cerdo");
			}
			
			
		}
		

	}

}
