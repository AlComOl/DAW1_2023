package UsoHerenciaClases;

 class Vehiculo {
	 private int numRuedas = 4;
	 private int numPuertas=4;
	 protected boolean llevoRadio=true;
	 public Vehiculo(){
	 showinfo();
	 }
	 public Vehiculo(int numPuertas,int numRuedas){
		 this.numPuertas=numPuertas;
		 this.numRuedas=numRuedas;
		 showinfo();
	 }
	 public void showinfo(){
		 System.out.println("Soy un vehiculo de "+ numPuertas +" puertas y "+numRuedas+" ruedas");
	 }
	 public void conducir(){
	 System.out.println("Conduzco con mis " + numRuedas + " ruedas.");
	 if (llevoRadio) System.out.println("Voy escuchando la radio");
	 }
 }
 	class Coche extends Vehiculo{
 		public Coche(){
 			System.out.println("Soy un coche");
 		}
 		@Override
 		public void conducir() {
 			cierraPuertas();
 			super.conducir();
 		}
 		public void cierraPuertas(){
 			System.out.println("Cierro las puertas.");
 		}
 	}
 	/*Subclase que sobreescribe el valor de un campo y hace una llamada a un
 	constructor especifico para inicializar otras variables*/
 	class Moto extends Vehiculo{
 	public Moto(){
 	super(0,2);
 	llevoRadio=false;
 	System.out.println("Soy una moto");
 	}
 	}
 	
 	
	 
