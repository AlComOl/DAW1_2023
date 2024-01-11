package Practica100124;


public final class ControlpH extends ControlInstalacion {

   
   
   
   private double minimo;
   
   
   public ControlpH(double mi, double max,String nombre , double dato) {
       super(nombre , dato);
       
       this.minimo=mi;
       this.maximo=max;
       
   }
   
   public double getDato() {
       return dato;
   }
//   tarea 1.6
   public void setLectura(double dato1) {
       this.dato = dato1;
   }
   public double getMinimo(){
       return minimo;
   }
   public double getMaximo() {
       return maximo;
   }
   private double maximo;
   
   
   @Override
   public void procesarValor() {
       
       
   }
   @Override
   public String getLectura() {
       return "El nombre es "+nombre+"La lectura es "+dato;
   }

   @Override
   public void setLectura() {
	// TODO Auto-generated method stub
	
}

}
