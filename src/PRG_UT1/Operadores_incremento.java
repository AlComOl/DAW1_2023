package PRG_UT1;

public class Operadores_incremento {
	
	public static void main (String[] args) {
	int dia = 27;
	int hoy= dia++;
	int manana=++hoy;
	int pasadomanana=++hoy;
	//int otrodia = (++hoy)++; No compila
	
	int a =15;
	//este operador lo que hace es a nivel de binario añadir los ceros
	a=a<<3;
	
	enum Ing{Sal,Aceite,Lechuga};
	
	
	
	
	System.out.print(Ing.Aceite);
	
	
}
}