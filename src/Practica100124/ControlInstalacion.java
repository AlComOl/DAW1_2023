package Practica100124;
	 

	public abstract class ControlInstalacion implements Controles{

//	    atributos 
	    protected String nombre;
	    protected double dato;
	//constructores    
	    public ControlInstalacion() {
	        
	    }
	    
	    public ControlInstalacion(String nombre , double dato) {
	        this.nombre=nombre;
	        this.dato=dato;
	    }
//	    metodo abstracto
	    
	    public abstract void  procesarValor();
	    
	    public abstract  void setLectura(double dato);

	    public String getLectura() {
	        return "El nombre es "+nombre+"La lectura es "+dato;
	    }

	//
	  
	        
	    
	}


