package PrePracticaHerencia;

public  class Animal implements AccionesGeneral{
	
	private int pin;
	
	public Animal(int pin) {
		this.pin=pin;
	}

	@Override
	public void hablar() {
		
		System.out.println("Hola soy un Animal "+pin+" que me comunico , pero no hablo");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("Hola soy un Animal "+pin +" me desplazo de muchas maneras");
		
	}

	@Override
	public void jugar() {
		System.out.println("Hola soy un Animal"+pin +" y juego por personal a veces");
		
	}

	@Override
	public void alimentarse() {
	
		System.out.println("Soy un Animal"+pin+" que me alimento ");
		
	}

	@Override
	public void dormir() {

		 System.out.println("Hola soy un Animal"+pin+" y duermo");
		
	}

}
