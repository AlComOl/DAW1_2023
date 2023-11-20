package EjerciciosClase.src;
import java.util.*;

public class Estudiante {
//	Atributos	
	private String nombre;
	private int edad;
	private String carnet;
	private String carrera;
	private double notaMedia;
	
//Constructor por defecto;
	public Estudiante() {
		this.nombre = "";
		this.edad=0;
		this.carnet="";
		this.carrera="";
		this.notaMedia=0;
	}
		
//Constructor parametrizado;
	public Estudiante(String param1, int param2, String param3 , String param4, double param5) {
		this.nombre=param1;
		this.edad=param2;
		this.carnet=param3;
		this.carrera=param4;
		this.notaMedia=param5;
		
	}
	
//Constructor de copia
	public Estudiante(Estudiante e) {
		this.nombre =e.nombre;
		this.edad=e.edad;
		this.carnet=e.carnet;
		this.carrera=e.carrera;
		this.notaMedia=e.notaMedia;
	}
//Metodos
	
	public String getNombre() {
		return this.nombre;

	}
	public void setnombre(String n) {
		this.nombre=n;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int e) {
		this.edad=e;
	}

	public String getCarnet() {
		return carnet;
	}
	public void setcarnet(String ca) {
		this.carnet=ca;
	}
	
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String ca) {
		this.carrera=ca;
	}
	public double getnotaMedia() {
		return notaMedia;
	}
	
	public void setnotaMedia(double notaM) {
		this.notaMedia=notaM;
	}
//	Metodo mostrar
	public String mostrar() {
		
		return  getNombre()+" la edad es "+getEdad()+" el numero de carnet de estudiante es "+getCarnet()+" la carrera que ha elegido es "+getCarrera()+" la nota media es "+getnotaMedia();
	}
//	Metodo compara
	
	public boolean esEstudianteSobresaliente(Estudiante e) {
		boolean sobresaliente=false;
		if(this.notaMedia>=e.getnotaMedia())
			sobresaliente= true;
		
		
		return sobresaliente;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		byte menu=0;
		int e, param2=0,param5=0,nota=0;
		String n,carnet,carrera, param1="", param3="",param4="";
		Estudiante e1=new Estudiante();
		Estudiante e2=new Estudiante(param1,param2,param3,param4,param5);
		Estudiante e3=new Estudiante(e2);
		
		do {
			System.out.println(" \n 1-Modificar estudiante \n 2-Mostrar estudiantes \n 3-Estudiantes con Sobresaliente");
			menu=entrada.nextByte();
			switch (menu) {
			case 1:
				System.err.println("Introduce datos Estudiante 1");
				System.out.println("Nombre");
				 n=entrada.nextLine();
				 n=entrada.nextLine();
				 e1.setnombre(n);
				System.out.println("Edad");
				 e=entrada.nextInt();
				 entrada.nextLine();
				 e1.setEdad(e);
				System.out.println("Carnet Estudiante");
				 carnet=entrada.nextLine();
				 e1.setcarnet(carnet);
				System.out.println("Carrera que eligio");
				 carrera=entrada.nextLine();
				 e1.setCarrera(carrera);
				System.out.println("Nota media");
				 nota=entrada.nextInt();
				 e1.setnotaMedia(nota);
				 System.err.println("Introduce datos Estudiante 2");
				 System.out.println("Nombre");
				 param1= entrada.nextLine();
				 param1= entrada.nextLine();
				 System.out.println("Edad");
				 param2=entrada.nextInt();
				 entrada.nextLine();
				 
				 System.out.println("Carnet Estudiante");
				 param3=entrada.nextLine();
				 param3=entrada.nextLine();
				
				 System.out.println("Carrera que eligio");
				 param4=entrada.nextLine();
				 param4=entrada.nextLine();
				 System.out.println("Nota media");
				 param5=entrada.nextInt();
				 
				 e2=new Estudiante(param1,param2,param3,param4,param5);
				break;
			case 2:
			System.out.println(	e1.mostrar());
			System.out.println(	e2.mostrar());
			System.out.println(	e3.mostrar());
				break;
			case 3:
		System.out.println(	e1.esEstudianteSobresaliente(e3));
				break;

			default:
				break;
			}
			
		} while (menu!=0);
		

	}

}
