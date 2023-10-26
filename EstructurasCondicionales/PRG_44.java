package EstructurasCondicionales;

import java.util.Scanner;

/*****************************************************************

	Autor: Alvaro Comenge
	Fecha:11/10/23
	Descripcion: Algoritmo que determina si dos números enteros positivos 
	son amigos. (Dos números son amigos si la suma de los divisores del primero,
	excepto él mismo, es igual al segundo, y viceversa.)	 
	******************************************************************/
public class PRG_44 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int n1,n2,divisorN1=0,divisorN2=0,sumadiv1=0,sumadiv2=0;
	
		System.out.println("Introduce dos  numero para ver si son amigos");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		
		for(int i=1;n1>i;i++) {
			
			if(n1%i==0) {//si el resto es igual a 0
				System.out.println(n1+"%"+i+"="+(n1%i));
				
				divisorN1=n1/i;//divide el numero entre la iteracion
				System.out.println(n1+"/"+i+"="+(n1/i));
				
				sumadiv1+=i;//divisorN1= divisorN1; almacena en suma div
				
				System.out.println(sumadiv1);
			}
		}
		System.out.println("**********************************************");
				for(int i=1;n2>i;i++) {
			
						if(n2%i==0) {
							System.out.println(n2+"%"+i+"="+(n2%i));
				
							divisorN2=n2/i;
							System.out.println(n2+"/"+i+"="+(n2/i));
				
							sumadiv2+=i;//divisorN1= divisorN1;
				
							System.out.println(sumadiv2);
						}
				}
			if(sumadiv1==n2 && sumadiv2==n1) {// si la suma de divisores que es la iteracion es igual al numero 2 y viceversa son amigos 
				System.out.println("Los numeros son amigos");
			}else {
				System.out.println("Los numeros no son amigos");
			}
		entrada.close();
	}
}