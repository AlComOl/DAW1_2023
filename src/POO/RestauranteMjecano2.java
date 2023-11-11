package POO;

public class RestauranteMjecano2 {
	//Atributos
	private int kpapas;
	private int kchocos;
	
	public RestauranteMjecano2() {
		kpapas=0;
		kchocos=0;
	}


	public double getKpapas() {
		return kpapas;
	}
	public void setKpapas(int kpapas) {
		this.kpapas += kpapas;
	}
	public double getKchocos() {
		return kchocos;
	}
	public void setKchocos(int kchocos) {
		this.kchocos += kchocos;
	}
	public static  String disponivilidad(double chocos, double papas) {
		int	personasPapas= (int)(papas/3);	
		int personasChoco= (int)(chocos/0.5);

		return"Con la cantidad  de chocos introducida el restaurante puede ateneder a "+ personasChoco +"personas "+"\n y con la cantidad de papas introducida "+personasPapas;
		 
		}
	
	public static void main(String[] args) {
		
		RestauranteMjecano2 r2= new RestauranteMjecano2();
		
	System.out.println(r2.getKchocos());
	System.out.println(r2.getKpapas());
	r2.setKchocos(20);
	r2.setKpapas(10);
	System.out.println(r2.getKchocos());
	System.out.println(r2.getKpapas());
	
	System.out.println(r2.disponivilidad(15, 20));
	
	System.out.println(r2.getKchocos());
	System.out.println(r2.getKpapas());
			
	}

}
