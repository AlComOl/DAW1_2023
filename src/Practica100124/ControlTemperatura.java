package Practica100124;



public class ControlTemperatura extends ControlInstalacion {

   
   private double maxtemp;
   private double mintemp;
   
   public ControlTemperatura(String nombre , double dato1) {
       super(nombre , dato1);
   }
   
   
   public void setLectura(double dato) {
       this.dato = dato;
   }
   @Override
   public void procesarValor() {
       
       
   }
   public String getLectura() {
	return nombre;
		
		
	}
 
  


@Override
public void setLectura() {
	// TODO Auto-generated method stub
	
}

}

