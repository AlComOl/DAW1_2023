package UsoHerenciaClases.Super;

public class ClaseHija extends ClasePadre{


private boolean atributo = false;

public ClaseHija(int parametro) {
super(parametro+2); //tiene que ser la primera línea del constructor
//y sólo puede usarse una vez por contructor
System.out.println(parametro);
}
	

	public void imprimir(){
		System.out.println(atributo);
		System.out.println(super.atributo);
	}
}
