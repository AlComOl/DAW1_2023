package PracticaPoo_2122;

public class Persona {
//	Atributos
	private String persona=" ";
	private int edad=0;
	private String nif=" ";
	private char sexo='D';
	private int peso=0;
	private float altura=0;
	
//	Constructor por defecto
	
	public Persona() {
	persona=" ";
	edad=0;
	setNif(setRandomNif());
	sexo='D';
	peso=0;
	altura=0;
	
	}

//	Constructor con argumentos
	public Persona(String nombre, int edad,char sexo,int peso,float altura) {
		this.persona=nombre;
		this.edad=edad;
		setNif(setRandomNif());
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
		
	}
//	SETTERS Y GETTERS
	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if(sexo=='H'||sexo=='M') {
			this.sexo = sexo;
		}else {
			System.out.println("Por defecto asignamos D");
			sexo='D';
		}
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

//	void mostrar() método que muestra la información de una persona por pantalla
	
	public void mostrar() {
		
		System.out.println("Persona: \n "+getPersona()+"\n "+"Edad: \n \t"+getEdad()+"\n "+"Nif : \n  \t"+getNif()+"\n"+"Persona: \n \t"+getSexo()+"\n"+"Peso: \n \t"+getPeso()+"\n "+"Altura: \n \t "+getAltura()+"\n "+"IMC: \n \t "+calcularIMC()+" \n \t ");
	}
	
//	para el NIF tenéis que crear un método privado que genere un numero de 8 cifras entre 11111111 y 99999999 y una vez generado tenéis que calcular la letra que corresponde a ese número.
	
	public String setRandomNif() {
		
		
		
		int numerodni=(int)(Math.random()*(99999999-11111111+1)+11111111);
		
		int nif=numerodni%23;
		String letra="";
		switch (nif) {
		case 0:
			letra="T";
			break;
		case 1:
			letra="R";
			break;
		case 2:
			letra="W";
			break;
		case 3:
			letra="A";
			break;
		case 4:
			letra="G";
			break;
		case 5:
			letra="M";
			break;
		case 6:
			letra="Y";
			break;
		case 7:
			letra="F";
			break;
		case 8:
			letra="P";
			break;
		case 9:
			letra="D";
			break;
		case 10:
			letra="X";
			break;
		case 11:
			letra="B";
			break;
		case 12:
			letra="N";
			break;
		case 13:
			letra="J";
			break;
		case 14:
			letra="Z";
			break;
		case 15:
			letra="S";
			break;
		case 16:
			letra="Q";
			break;
		case 17:
			letra="V";
			break;
		case 18:
			letra="H";
			break;
		case 19:
			letra="L";
			break;
		case 20:
			letra="C";
			break;
		case 21:
			letra="K";
			break;
		case 22:
			letra="E";
			break;
			
		default:
			break;
		}
		String numerodnifinal=numerodni+letra;
		
		return numerodnifinal;
	}
	public float calcularIMC() {
		float imc ;
		imc=(float) (getPeso()/(Math.pow(2,getAltura())));
		
		if(imc<18.5) {
			System.out.println("Esta por debajo del peso");
		}else if(imc<24.9) {
			System.out.println("Saludable");
		}else if(imc<29.9) {
			System.out.println("Con sobrepeso");
		}else if(imc<39.9) {
			System.out.println("Obeso");
		}else {
			System.out.println("Obesidad extrema o de alto riesgo");
		}
		return imc;
	}

	public boolean esMayor(Persona p, Persona tmp) {
		boolean edad = true;
		
		if(this.getEdad()==p.getEdad()) {
				edad=false;
				
		}else if(this.getEdad()>p.getEdad()){
				edad=true;
				tmp.setEdad(this.getEdad());
		}else {
			edad=false;
			tmp.setEdad(p.getEdad());
		}
		return edad;
	}
	
}
