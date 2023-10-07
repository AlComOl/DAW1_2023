package EstructurasCondicionales;
/*************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:6/10/23


	Descripción:

	En un determinado comercio se realiza un descuento dependiendo del precio de cada producto. Si el precio es inferior
	a 6 euros, no se hace descuento; si es mayor o igual a 6 euros y menos que 60 euros, se hace un 5 por 100 de descuento,
    y si es mayor o igual a 60 euros, se hace un 10 por 100 de descuento. Hacer el algoritmo que lee el precio de un producto 
    y nos calcula y escribe su precio final.
	
	
*****************************************************************************************************************************/

import java.util.*;
public class PRG_31 {

	public static void main(String[] args) {
		
			Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce el precio de producto");
			double precio=entrada.nextDouble();
			
			if(precio<=6)
				System.out.println("El precio es de " + precio );
			else if(precio<=6||precio<60)
				System.out.println("El precio es de "+ (precio-(precio*5/100))+ " Euros");
			else if(precio>=60)
				System.out.println("El precio es de "+ (precio-(precio*10/100))+ " Euros");
			entrada.close();
	}

}
