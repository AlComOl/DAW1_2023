package EjerciciosClasePoo;

public class CochePildoras {
	
//	Atributos
	
	private int ruedas,largo,ancho,motor,peso;
	private boolean asientos_cuero,climatizador;
	
//	Constructor
public CochePildoras() {
	this.ruedas=4;
	this.largo=1900;
	this.ancho=1000;
	this.motor=1500;
	this.peso=900;
}
//	getters y setters


public int getRuedas() {
	return ruedas;
}


public void setRuedas(int ruedas) {
	this.ruedas = ruedas;
}


public int getLargo() {
	return largo;
}


public void setLargo(int largo) {
	this.largo = largo;
}


public int getAncho() {
	return ancho;
}


public void setAncho(int ancho) {
	this.ancho = ancho;
}


public int getMotor() {
	return motor;
}


public void setMotor(int motor) {
	this.motor = motor;
}


public int getPeso() {
	return peso;
}


public void setPeso(int peso) {
	this.peso = peso;
}

public String configuraAsientos() {
	if(asientos_cuero==true) {
		
		return "El coche lleva asientos de cuero";
	}else {
		
		return "El coche lleva sientos de serie";
	}
	
}
public void configuraAsientos(String asientos_cuero) {
	
	if(asientos_cuero=="si") {
		this.asientos_cuero=true;
	}else {
		this.asientos_cuero=false;
	}
}


	

	}


