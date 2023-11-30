package Pez;

public class TestClasePez {

	public static void main(String[] args) {
		ClasePez pez1 =new ClasePez();
		ClasePez pez2 =new ClasePez();
		
		pez1.setNombre("Felipe");
		pez2.setNombre("triqui");
		
	System.out.println(	pez1.getClasePez());
	System.out.println(	pez2.getClasePez());
		
		
		
	System.out.println(	pez1.equals(pez2));
	
	

	}

}
