package EstructurasCondicionales;
import java.util.*;
public class probar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//DECLARACION
		
		int n1,n2,temp,res;
		
		//ENTRADA
		System.out.println("Introduce 2 numeros enteros, positivos y distintos");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		
		//PROCESO//SALIDAS
		
		if(n1<0 || n2<0 || n1==n2) {
			System.out.println("El numero es incorrecto");
		}else if(n1>n2 || n1%n2==0) {
				System.out.println(n1+" es multiplo "+n2);
			}else if(n1<n2) {
				//ponemos al menor en temp
				temp=n1;
				n1=n2;
				res=n1%temp;
				//si el res es divisible //Salida
				if(res==0) {
					System.out.println(n1+" es multiplo de "+ temp);
				}else {
					System.out.println("Los numeros no son multiplos");
				}
			}
		

		
		
		entrada.close();
	}

}