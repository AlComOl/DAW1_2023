package PrePracticaHerencia;

public class Persona implements AccionesHumano,AccionesGeneral{
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	
//	me da eror al sobre escribir estos metos 
	@Override
	public void hablar() {
	System.out.println("Soy una PERSONA "+nombre+"y hablo");
		
	}
	
	public void desplazarse() {
		System.out.println("Soy una PERSONA "+nombre+" y me desplazo ");
		
	}

	
	public void jugar() {
		System.out.println("Soy una PERSONA "+nombre+" y juego ");
		
	}

	
	public void alimentarse() {
		System.out.println("Soy una PERSONA "+nombre+" y me alimento");
		
	}

	
	public void dormir() {
		System.out.println("Soy una PERSONA "+nombre+"y duermo");
		
	}

	@Override
	public void bailar() {
		System.out.println("Soy una PERSONA "+nombre+"y bailo");
		
	}

	@Override
	public void tocarInstrumentos() {
		System.out.println("Soy una PERSONA "+nombre+"y bailo");
	}

	@Override
	public void estudiar() {
		System.out.println("Soy una PERSONA "+nombre+" y estudio");
		
	}

	@Override
	public void trabajar() {
		System.out.println("Soy una PERSONA y trabajo");
		
	}

}
