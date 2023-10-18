package EstructurasCondicionales;
import java.util.*;
public class PRG_12 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int dia , mes, anyo;
		boolean correcta=true;
		System.out.println("Introduce dia");
		dia=entrada.nextInt();
		System.out.println("Introduce mes");
		mes=entrada.nextInt();
		System.out.println("Introduce anyo");
		anyo=entrada.nextInt();
				
		if(dia<1||dia<31) {
			correcta=false;
		}else if(mes<1||mes>12){
			correcta=false;
		}
		
		switch (mes) {
		case 4,6,9,11://30dias
			if(dia>30) {
				correcta=false;
			}
			break;
		case 2://30dias
			if(anyo%4==0&&anyo%100!=0||anyo%400==0) {
				if(dia<29)
				correcta=false;
			}else if(dia>28) {
				correcta=false;
			
			
			
			}	
		}
		
		if(correcta) {
			System.out.println("correcta");
		}else {
			System.out.println("Incorrecta");
		}
	}

}
