package EstructurasCondicionales;
/*****************************************************************

Autor: Álvaro Comenge

Fecha:9/10/23

Descripción:

Acepta la temperatura de 10 días, 5 por día, indicando cuantos días la temperatura media fue < 0.


******************************************************************/
import java.util.*;

public class PRG_29 {

	public static void main(String[] args) {
		double sumaTemp = 0,temp,m,cont=0;//sumaDiaBajo0=0
		
		Scanner entrada=new Scanner(System.in);
		//primer bucle para repetir los dias
		for(int i=1;i<11;i++) {
		System.out.println("Introduce cinco temperaturas tomadas durante el dia "+ i);
		//Un bucle anidado que repite las 5 temp diarias
			for(int j=0;j<5;j++) {
		temp=entrada.nextDouble();
		//va sumado y guardando la temp en sumaTemp
		sumaTemp+=temp;
		}
			//sacamos la media
			m=(sumaTemp/5);
			//inicializamos a 0 la suma de temperaturas
			sumaTemp=0;
			//con un if 
			if(m<0) {
			cont++;
			}
		// también con un ternario 
			//double ternario=(m<0)?cont+=1:(cont);
			
		   // sumaDiaBajo0=ternario;
		
				}
		System.out.println("Hay "+cont+" dias  donde la media ha sido inferior a 0 Grados Centigrados");
		entrada.close();
	}
	
	
}
