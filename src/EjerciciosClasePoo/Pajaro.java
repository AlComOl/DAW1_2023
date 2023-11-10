package EjerciciosClasePoo;

public class Pajaro {
	private static int numPajaros = 0; //atributo estático
	private char color;
	private String nombre;
	private byte edad;
	
	//metodos estaticos
	static void nuevoPajaro(){
	numPajaros++;
	}
	static void muestraPajaros(){
	System.out.println(numPajaros);
	}
	//constructores
	public Pajaro() {
	color = 'v';
	edad = 0;
	numPajaros++;
	}
	public Pajaro(char c, int e) {
	color = c;
	edad = (byte)e;
	nuevoPajaro();
	}
	public static void main(String[] args){
	Pajaro p1, p2;
	p1 = new Pajaro();
	p2 = new Pajaro('a', 3);
	p1.muestraPajaros();
	p2.muestraPajaros();
	}
}
