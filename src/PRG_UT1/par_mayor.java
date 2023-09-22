package PRG_UT1;
import java.util.*;
public class par_mayor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.err.println("Introduce un numero");
		int res;
		int n=entrada.nextInt();
		
		res=n%2;
		
		if(res==0) {
			System.out.println("El par mas proximo a "+n+" es "+(n+2));
			
		}else {
			System.out.println("El par mas proximo a "+n+" es "+(n+1));
		}
			
		
	}

}
