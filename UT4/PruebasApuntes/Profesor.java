package PruebasApuntes;

public class Profesor {
	protected String nombre;
	int edad;
	protected int añosAntiguedad;
}
//ESTO CREA UNA SUBCLASE
	class Catedratico extends Profesor{ 
	int añosCatedratico;
	public double obtenerSalario(){
	return (925 + añosAntiguedad * 33.25 + 47.80 * añosCatedratico);
	}
	public void imprimirSalario(){
	System.out.println("El salario de "+nombre+" de "+edad+" años es "+obtenerSalario()+" €");
	}
}