package Refuerzo;
/*Álvaro Comenge

Escribe un programa que pida el número actual de pasajeros de la nave. A
continuación, pedirá el número de tripulantes teóricos según la lista de pasajeros. Si el
número actual de pasajeros es superior al número teórico, deberá mostrar el mensaje
“¡Alerta, intrusos!” tantas veces como pasajeros de más se hayan detectado. En caso
contrario, se mostrará el tranquilizador mensaje “Ok, todo correcto”.
Ejemplo:
Pasajeros actuales: 45
Según la lista de pasajeros: 42 (¡¡3 pasajeros extra!!)
¡Alerta, instrusos!
¡Alerta, instrusos!
¡Alerta, instrusos!*/


import java.util.*;

public class PRG1_6 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Pasajeros actuales");
		int n_tripulantes=entrada.nextInt();
		System.out.println("Segun lista de pasajeros");
		int n_tripulantes_teoricos=entrada.nextInt();
			
		int sobrante=(n_tripulantes-n_tripulantes_teoricos);
		
			if(n_tripulantes>n_tripulantes_teoricos) {
				for(int i=0 ; i<sobrante;i++) {
					System.out.println("¡Alerta Intrusos!");
				}
			}else {	
			System.out.println("Ok, todo correcto");
			}
		
	entrada.close();

}
}}