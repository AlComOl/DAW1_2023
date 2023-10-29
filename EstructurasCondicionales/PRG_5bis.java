package EstructurasCondicionales;
import java.util.*;
public class PRG_5bis {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce 3 nuemros para ver la relacion de igualdad");
		int n=entrada.nextInt();
		int n1=entrada.nextInt();
		int n2=entrada.nextInt();
		
		
		if(n==n1&&n1==n2) {
			System.out.println("Todos iguales");
		}else if(n==n1&&n1!=n2) {
			System.out.println(n+", "+n1+" son iguales");
		}else if(n!=n1&&n1==n2) {
			System.out.println(n1+", "+n2+" son iguales");
		}else if(n==n2) {
			System.out.println(n2+", "+n2+" son iguales");
		}else {
			System.out.println("Todos son distintos");
		}
		}
	}


