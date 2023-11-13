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
	nif=setRandomNif();
	sexo='D';
	peso=0;
	altura=0;
	
	}
	
//	Constructor con argumentos
	public Persona(String nombre, int edad, String nif,char sexo,int peso,float altura) {
		this.persona=nombre;
		this.edad=edad;
		this.nif=nif;
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
		
		System.out.println("Persona: \n "+getPersona()+"\n "+"Edad: \n \t"+getEdad()+"\n "+"Nif : \n  \t"+getNif()+"\n"+"Persona: \n \t"+getSexo()+"\n"+"Peso: \n \t"+getPeso()+"\n "+"Altura: \n \t "+getAltura()+"\n "+"IMC: \n \t "+calcularIMC()+Infopeso());
	}
	
//	para el NIF tenéis que crear un método privado que genere un numero de 8 cifras entre 11111111 y 99999999 y una vez generado tenéis que calcular la letra que corresponde a ese número.
	
	public String setRandomNif() {
		
		StringBuilder nif =new StringBuilder();
		
		for(int i=0;i<8;i++) {
		int numerodni=(int)(Math.random()*10);
			nif.append(numerodni);
			}
		
//		int modulo23=nif%23;
		
		
//		if(modulo23==0) {
//			String=ltra=T;
		
		return nif.toString();
		
		
	}
	public float calcularIMC() {
		float imc ;
		imc=getPeso()/getAltura();
		
		if(imc<18.5) {
			System.out.println("Esta por debajo del peso");
		}else if(imc<24.9) {
			System.out.println("Saludable");
		}else if(imc<29.9) {
			System.out.println("Con sobrepeso");
		}else if(imc<39.9) {
			System.out.println("   Obeso");
		}else {
			System.out.println("Obesidad extrema o de alto riesgo");
		}
		return imc;
	}
	public String Infopeso() {
		String info="";
		if(calcularIMC()<18.5) {
		info="Esta por debajo del peso";
		}else if(calcularIMC()<24.9) {
		info="Saludable";
		}else if(calcularIMC()<29.9) {
		info="Con sobrepeso";
		}else if(calcularIMC()<39.9) {
		info="Obeso";
		}else {
			System.out.println("Obesidad extrema o de alto riesgo");
		}
		return  info;
	}
	
	
}