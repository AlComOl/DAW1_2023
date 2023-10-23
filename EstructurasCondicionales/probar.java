package EstructurasCondicionales;
import java.util.Scanner;

public class probar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int n, primos=0;
    boolean esPrimo=false;
    
    System.out.println("Introducje numero");
    n=entrada.nextInt();
    
    System.out.println("son primos :");
    for(int i=n;i>0;i--) {
    	esPrimo=true;
    	for(int x=2;x<i;x++) {
    		System.out.println(i);
    		if(i%x==0) {
    			System.out.println(i+"%"+x+"=");
   			esPrimo=false;
//    			System.out.println(esPrimo);
    		}
    	}
    	if(esPrimo) {
        	primos=i;
      	System.out.println(""+primos);
    	}
    
    }
  }
}