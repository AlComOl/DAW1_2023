package Practica100124;



public  class ControlPotencia extends ControlInstalacion {

   
   private static final double MAX = 100;
   private static final double MIN = 100;
   
   public ControlPotencia(String nombre , double dato) {
       super(nombre , dato);
   }
   
   
   public void setLectura(double dato1) {
       this.dato = dato;
   }
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

