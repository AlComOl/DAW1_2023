package src.EjerciciosClase.src;


	import java.util.Scanner;

	public class BolParInpar {

		public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			int pares=0, impares=0;
			boolean par=false;
			
			for (int i=1;i<=100;i++){
				if(par) {
					pares+=i;
					
				}else { 
					impares+=i;
				}
				par=!par;
			}
				
			System.out.println("suma pares"+pares);
			System.out.println("suma impares"+impares);
		}


	}

