package EjerciciosClase.src;
import java.util.*;

public class bacterias {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double bacterias, nmaximo,dia=0;
		System.out.println("Introduce bacterias");
		bacterias=entrada.nextInt();
		System.out.println("Introduce numero maximo bacterias");
		nmaximo=entrada.nextInt();
		
		
		while(bacterias<nmaximo) {
			if(bacterias<=700) {
				bacterias*=3;
				dia++;
		
//				System.out.println(bacterias+"bacterias dia "+ dia);
			}
			else if(bacterias>700&&bacterias<3000) {
				dia=0;
				bacterias=bacterias*1.0/3;
				dia++;
//				System.out.println(bacterias+"bacterias dia "+ dia);
			}
			else if(bacterias>3000 && bacterias<4000 ) {
				bacterias=bacterias*1.0/78;
				dia++;
			
//				System.out.println(bacterias+"bacterias dia "+ dia);
			}
			else if(bacterias>4000 ) {
				bacterias=bacterias-(bacterias-1/10);
				dia++;
				
				
			}
			System.out.println(bacterias+"bacterias dia "+ dia);
		}
//			System.out.println("bacterias dia "+bacterias);
//			System.out.println(dia);
			
		}
	}
	


