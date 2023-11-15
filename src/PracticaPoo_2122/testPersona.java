package PracticaPoo_2122;

import java.io.IOException;
import java.util.*;

public class testPersona {

	public static void main(String[] args) throws IOException {
		Scanner entrada=new Scanner(System.in);
		String n,nf;
		int e,p;
		char s;
		float a;
		
		Persona p1=new Persona();
		Persona p2=new Persona("Oscar",24,'g',60, 1.72F);
		Persona tmp=new Persona();
		
		
		System.out.println("Introduce nombre");
		n=entrada.next();
		p1.setPersona(n);
		System.out.println("Introduce edad");
		e=entrada.nextInt();
		p1.setEdad(e);
		System.out.println("Introduce sexo");
		s=entrada.next().charAt(0);
		p1.setSexo(s);
		System.out.println("Introduce peso");
		p=entrada.nextInt();
		p1.setPeso(p);
		System.out.println("Introduce altura");
		a=entrada.nextFloat();
		p1.setAltura(a);
		
//		char sexo=(char)System.in.read();
//		
//	String tutia= entrada.next();
		
		System.out.println("Constructor por defecto");
		p1.mostrar();
		System.out.println("****************************************");
		System.out.println("Constructor con argumentos");
		p2.mostrar();
		
		
	System.out.println(	p1.esMayor(p2, tmp));
		
	
	
		
		 
	}

}
