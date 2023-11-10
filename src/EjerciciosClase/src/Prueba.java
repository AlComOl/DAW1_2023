package EjerciciosClase.src;
public class Prueba{
	
boolean puedeGrabar = false;
void escucharCinta() {
System.out.println("Escuchándose cinta");
}
void grabarCinta()
{
System.out.println("Grabándose cinta");
}
public class Test {
public static void main(String[] args)
{
	Prueba r=new Prueba();
r.escucharCinta();
if(r.puedeGrabar)
r.grabarCinta();
}
}
}