package POO;
/****************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:11/11/23


Descripción:
	
Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del restaurante. 
Implementa los siguientes métodos:
 • public void addChocos(int x): Añade x kilos de chocos a los ya existentes.
 • public void addPapas(int x): Añade x kilos de papas a los ya existentes. 
 • public int getComensales(): Devuelve el número de clientes que puede atender el restaurante (este es el método anterior).
 • public void showChocos(): Muestra por pantalla los kilos de chocos que hay en el almacen.
 • public void showPapas(): Muestra por pantalla los kilos de papas que hay en el almacen. 	



***********************************************************************************************************************************/


public class RestauranteMjecano2 {
	//Atributos
	private int kpapas;
	private int kchocos;
//	Constructor
	public RestauranteMjecano2() {
		kpapas=0;
		kchocos=0;
	}


	public double getKpapas() {
		return kpapas;
	}
	public void setKpapas(int kpapas) {//public void addPapas(int x): Añade x kilos de papas a los ya existentes. 
		this.kpapas += kpapas;
	}
	public double getKchocos() {
		return kchocos;
	}
	public void setKchocos(int kchocos) {//public void addChocos(int x): Añade x kilos de chocos a los ya existentes. 
		this.kchocos += kchocos;
	}
	public String getComensales(double chocos, double papas) {//public int getComensales(): Devuelve el número de clientes que puede atender el restaurante
		int	personasPapas= (int)(papas/3);	
		int personasChoco= (int)(chocos/0.5);

		return"Con la cantidad  de chocos introducida el restaurante puede ateneder a "+ personasChoco +" personas "+"\n y con la cantidad de papas introducida "+personasPapas;
		 
		}
	public void showChocos() {//public void showChocos(): Muestra por pantalla los kilos de chocos que hay en el almacen. 
		System.out.println(this.getKchocos());
	}
	
	public void showPapas() {//public void showPapas(): Muestra por pantalla los kilos de papas que hay en el almacen.
		System.out.println(this.getKpapas());
		}
	
	
	
	public static void main(String[] args) {
		
		RestauranteMjecano2 r2= new RestauranteMjecano2();
	
//	System.out.println(r2.getKchocos());
//	System.out.println(r2.getKpapas());
//	r2.setKchocos(20);
//	r2.setKpapas(10);
//	System.out.println(r2.getKchocos());
//	System.out.println(r2.getKpapas());
//	
//	
//	
//	System.out.println(r2.getKchocos());
//	System.out.println(r2.getKpapas());
	
	System.out.println("*****************************************");
	
//	r2.showChocos();
//	r2.showPapas();
//	r2.setKchocos(10);
//	r2.setKpapas(10);
//	r2.showChocos();
//	r2.showPapas();
	System.out.println(r2.getComensales(10, 10));
	
//	r2.showChocos();
//	r2.showPapas();
	
	
			
	}

}
