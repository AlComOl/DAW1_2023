package EjerciciosClase.src;
import java.util.*;

public class Pelicula {
//	Atributos
	private int codPelicula=1;
	private String titulo;
	private String director;
	private int anoProduccion;
	private int codGenero;
//	Constructor por defecto
	public Pelicula() {
		codPelicula=generacodPel();
		titulo=" ";
		director=" ";
		anoProduccion=0;
		codGenero=0;
		
	}
//	Contructor con argumentos
	
	public Pelicula(int codPe,String titulo,String director,int ano,int codge) {
		this.codPelicula=codPe;
		this.titulo=titulo;
		this.director=director;
		this.anoProduccion=ano;
		this.codGenero=codge;
	}
//	Contructor de copia 
	public Pelicula(Pelicula p) {
		this.codPelicula=p.codPelicula+1;
		this.titulo=p.titulo;
		this.director=p.director;
		this.anoProduccion=p.anoProduccion;
		this.codGenero=p.codGenero;
	}
//Setters Getters
	public int getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnoProduccion() {
		return anoProduccion;
	}

	public void setAnoProduccion(int anoProduccion) {
		this.anoProduccion = anoProduccion;
	}

	public int getCodGenero() {
		return codGenero;
	}

	public void setCodGenero(int codGenero) {
		this.codGenero = codGenero;
	}
//	generar codigo
	
	public int  generacodPel() {
		this.codPelicula=codPelicula+1;
		return this.codPelicula;
	}
	
	
//	mostrar
	
	public void mostrar() {
		
		System.out.println("El codigo de la pelicula es "+getCodPelicula()+"El titulo "+getTitulo()+" su director "+getDirector()+" el año de produccion "+getAnoProduccion()+" el codigo del genero es "+getCodGenero());
	}
//comparar
	
	public int comparar(Pelicula p, Pelicula pe ) {
		int info;
		if(p.anoProduccion>pe.anoProduccion) {
		 info=p.anoProduccion;
		}else {
			info=pe.anoProduccion;
		}
		return info;
	}
		

	public static void main (String []args) {
		Scanner entrada=new Scanner(System.in);
		int cp, ap,g;
		String t,d;
		
		Pelicula p1= new Pelicula();
		
		Pelicula p2= new Pelicula(12, "Los inmortales","Andres Rueda",1945, 34);
		
		Pelicula p3= new Pelicula(p1);
		
	
		
		int opcion;
		do {
			
			System.out.println(" 1-Modificar pelicula \n 2-Mostrar todas las peliculas \n 3-Mostrar pelicula mas antigua \n 0-SALIR");
			opcion = entrada.nextByte();
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce el codigo pelicula");
				cp=entrada.nextInt();
				entrada.nextLine();
				p1.setCodPelicula(cp);
				System.out.println("Introduce el titulo");
				t=entrada.nextLine();
				p1.setTitulo(t);
				System.out.println("Introduce el director");
				d=entrada.nextLine();
				p1.setDirector(d);
				System.out.println("Introduce el ano producion");
				ap=entrada.nextInt();
				entrada.nextLine();
				p1.setAnoProduccion(ap);
				System.out.println("Introduce genero");
				g=entrada.nextInt();
				entrada.nextLine();
				p1.setCodGenero(g);
				
				break;
			case 2:
				p1.mostrar();
				p2.mostrar();
				p3.mostrar();
				
				break;
			case 3:
			System.out.println(	p1.comparar(p1, p2));
				break;
						

			default:
				break;
			}
			
		}while(opcion != 0 );
	}
	
}
