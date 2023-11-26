package EjerciciosClasePoo;

public class TestCochePildoras {

	public static void main(String[] args) {
		
		CochePildoras coche=new CochePildoras();
		
		
		coche.setLargo(1900);
		coche.setAncho(1000);
		coche.setRuedas(5);
		
		System.out.println(coche.getAncho());
		System.out.println(coche.getRuedas());
		
		coche.configuraAsientos("Si");
		System.out.println(coche.configuraAsientos());
		


	}
}
