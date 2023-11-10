package EjerciciosClasePoo;

public class TestRectangulo {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Rectangulo r = new Rectangulo (7,5);
			System.out.println(i);
		
			
			System.runFinalization(); //sin estas líneas el programa
			System.gc();
		}
		System.out.println("Antes de finalizar");
		}
	}


