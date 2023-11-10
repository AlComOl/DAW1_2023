package POO;

public class TestPajaro {

	public static void main(String[] args) {
		ClasePajaro p;
		p = new ClasePajaro();
		ClasePajaro p1= new ClasePajaro('a', (byte)1);
		p.setEdad((byte)5);
		//System.out.println("Edad: " + p.edad);
		p.printEdad();
		p1.printEdad();

	}

}
