package UtilidadesMates;

public class Potenciar {

//	metodo
	
	public double potenciar(int param1,int param2) {
		int aux=1;
		for(int i=1;i<=param2;i++) 
			aux*=param1;
		 
		 return aux;
		
	}
}
