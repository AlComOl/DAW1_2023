package Refuerzo;

import java.util.*;
public class Usuarios_Login {
	

		
		//Atributos
	private String	nombre;
	private String contrasena;
	private String pantalla;
		//Constructores
	     public Usuarios_Login() {
		
		}
		public Usuarios_Login(String n, String c)  {
			nombre=n;
			contrasena=c;
		}
		
		//Metodos
		
		//establece nombre
		public void setNombre(String n) {
			nombre=n;
		}
		
		//devuelve nombre
		public String getNombre() {
			return nombre;
		}
		
		//establece contraseña	
		public void setContasena(String c) {
			contrasena=c;
		}
		
		//devuelve contraseña
		public String getContrasena() {
			return contrasena;
		}
		
		
		public String pantalla() {
			System.out.println("Elige una opcion");
			System.out.println("0 --> Darse de Alta");
			System.out.println("1 --> Ver cuenta");
			System.out.println("2 --> Borrar cuenta");
			System.out.println("3 --> Salir");
			System.out.println("Elige una opcion");
			
			return pantalla;
			
		}
		
		//resetear nombre
		
		public void setResetNombre() {
	    	 
	    	nombre= null;
	    }
		
		//devuelve nombre reseteado
		public String getResetNombre() {
	    	
	    	return getResetNombre();
	    }
		
		//borra contraseña
	    public void setResetContrasena() {
	    	
	    	contrasena= null;
	    }
	    // devuelve la contraseña
	    public String getresetContrasena() {
	    
	    	return  getresetContrasena();
	    }
	
		
	
	
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Usuarios_Login u1 = new Usuarios_Login();
		
			
		
		
		
		
		int men = 0;
		do {
			u1.pantalla();
		
		
		int menu=entrada.nextInt();
	
		switch (menu) {
	
		case 0:
			System.out.println("Estas Dandote de alta en el sistema \n Ingresa tu nombre");
			u1.setNombre(entrada.next());
			System.out.println(" Estas Dandote de alta en el sistema  \n Ingresa tu contraseña");
			u1.setContasena(entrada.next());
			System.out.println("Te has dado de alta satisfactoriamente");
			//u1.pantalla();
			//entrada.nextInt();
		break;
		case 1:
			System.out.println("comprobacion de credenciales");
			System.out.println("USER : " + u1.getNombre()); 
			System.out.println("PASSWORD : " +u1.getContrasena());	
			//u1.pantalla();
			//entrada.nextInt();
		break;
		case 2:
			System.out.println("Borramos cuentas");
			u1.setResetContrasena();
			u1.setResetNombre();
			System.out.println("Has borrado los crecenciales satisfatoriamente");
			
		break;
		case 3:
			System.out.println("Adios");
			men=entrada.nextInt();
			
			
		break;
		}
		
		}while(men !=3);
		entrada.close();
		
	}
}

	