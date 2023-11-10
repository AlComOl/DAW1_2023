package EstructurasCondicionales;

/*******************************************************************************************************

Autor: Álvaro Comenge

Fecha:10/10/23


	Descripción:

	Calculo de una factura del teléfono. Acepta la lectura anterior, la lectura actual
	y el número de llamadas. Los gastos fijos se calculan multiplicando por 4 el nº de llamadas.
	Los gastos de consumo se calculan por tramos, hasta 100 pasos a 7 céntimos el paso,
	los que pasen de 100 hasta 250 a 6 céntimos el paso y los que pasen de 250 a 4 céntimos el paso. 
	Finalmente se calcula el IVA y se visualizan los gastos fijos, de consumo, el IVA y el total de la factura.
	
	
********************************************************************************************************/
import java.util.*;

public class PRG_13 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		double g_variable=0;
		final double IVA= 21,MENOS100=0.7,HASTA250=0.6,MAS250=0.4;
		
		//ENTRADA
		System.out.println("Introcuce la lectura anterior");
		int lectura_anterior=entrada.nextInt();
		System.out.println("Introduce lectura actual");
		int lectura_actual=entrada.nextInt();
		System.out.println("Introduce el numero de llamadas");		int n_llamadas= entrada.nextInt();	
		
		//CALCULA PASOS GASTOS FIJOS Y VARIABLES
		int pasos=lectura_actual-lectura_anterior;
		double g_fijos=n_llamadas*4;
		
		if(pasos<=100) {
			 g_variable=(pasos*0.07);
		}else if(pasos<=250){
			 g_variable=100*0.07+(pasos-100)*HASTA250;
		}else if(pasos>250) {
			 g_variable=100*0.07+150*0.06+(pasos-250)*MAS250;
		}
		
		
		
		//CALCULA GASTOS TOTALES+IVA Y SIN IVA
		double g_totales_SinIVA=(g_variable+g_fijos);
		//CALCULA EL IVA
		double p_IVA=(g_totales_SinIVA*IVA/100);
		double g_totales=(g_totales_SinIVA+p_IVA);
		
		
		
	//SALIDA	
		System.out.println(        "\t CONCEPTO                       \t     VALOR Euros "   );
		System.out.println("     ");
		System.out.println("El importe de los gastos fijos               \t "+g_fijos+" euros");
		System.out.println("El importe de los gastos variables           \t "+ g_variable+" euros");
		System.out.println("El importe del IVA del total de la factura es\t "+p_IVA+" euros");
		System.out.println("El importe total de la factura + IVA es      \t "+ g_totales+" euros");
	
		entrada.close();
	}
}
