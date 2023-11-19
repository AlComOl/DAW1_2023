package Practica151123;

public class Jugador {
//Atributos
	private String nombre;
	private String nif;
	private String sexo;
	private int puntos;
	private int rebotes;
	private int asistencias;
	private int tapones;
	private int robosdebalon;
//	Constructor por defecto
	
	public Jugador() {
		this.nombre=" ";
		this.generarDni();
		this.sexo="H";
		this.puntos=0;
		this.rebotes=0;
		this.asistencias=0;
		this.tapones=0;
		this.robosdebalon=0;
	}
	
//	constructor parametrizado 
	public Jugador(String valor,String valor2,int valor3,int valor4,int valor5,int valor6,int valor7) {
		this.nombre=valor;
		this.sexo=valor2;
		this.puntos=valor3;
		this.rebotes=valor4;
		this.asistencias=valor5;
		this.tapones=valor6;
		this.robosdebalon=valor7;
		generarDni();
	}
//	constructor de copia 
	public Jugador(Jugador j) {
		this.nombre=j.nombre;
		this.sexo=j.sexo;
		this.puntos=j.puntos;
		this.rebotes=j.rebotes;
		this.asistencias=j.asistencias;
		this.tapones=j.tapones;
		this.robosdebalon=j.robosdebalon;
		
	}
//	metodos setters y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(sexo!="H"||sexo!="M") {
			this.sexo="D";
		}else {
		this.sexo = sexo;
		}
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getRebotes() {
		return rebotes;
	}

	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	public int getTapones() {
		return tapones;
	}

	public void setTapones(int tapones) {
		this.tapones = tapones;
	}

	public int getRobosdebalon() {
		return robosdebalon;
	}

	public void setRobosdebalon(int robosdebalon) {
		this.robosdebalon = robosdebalon;
	}
//	metodo void mostrar

	
	  public void mostrar(){
		  
//			return "El din de la persona es " + generarDni() +" El nombre de la persona "+getNombre()+"   El sexo de la persona es "+getSexo()+"   El judador sera DOBLEDOBLE: "+dobleDoble()+"   El Juagador seara TripleTriple :"+tripleTriple();
	        System.out.println("El din de la persona es " + getNif() +" El nombre de la persona "+getNombre()+"   El sexo de la persona es "+getSexo()+"   El judador sera DOBLEDOBLE: "+dobleDoble()+"   El Juagador seara TripleTriple :"+tripleTriple());
	    } 
//	metodo generar dni
	  public void generarDni() {
          final int A=1111111111 , B=999999999;
        	  
          int numeroAleatorio = (int) (Math. random()*(A-B +1)*B);
          
          int resultado=(int)numeroAleatorio%23;
        
         switch (resultado) {
         	case 1:
			this.nif=numeroAleatorio+"T";
			break;
         	case 2:
         	this.nif=numeroAleatorio+"R";
			break;
         	case 3:
         	this.nif=numeroAleatorio+"W";
			break;
         	case 4:
         	this.nif=numeroAleatorio+"A";
			break;
         	case 5:
         	this.nif= numeroAleatorio+"G";
			break;
         	case 6:
         	this.nif=numeroAleatorio+"M";
			break;
         	case 7:
         	this.nif=numeroAleatorio+"Y";
			break;
         	case 8:
         	this.nif=numeroAleatorio+"F";
			break;
         	case 9:
         	this.nif=numeroAleatorio+"P";
			break;
         	case 10:
         	this.nif=numeroAleatorio+"D";
			break;
         	case 12:
         	this.nif=numeroAleatorio+"X";
			break;
         	case 13:
         	this.nif=numeroAleatorio+"B";
    		break;
            case 14:
            this.nif=numeroAleatorio+"N";
    		break;
            case 15:
            this.nif=numeroAleatorio+"J";
    		break;
            case 16:
            this.nif=numeroAleatorio+"J";
    	    break;
            case 17:
            this.nif=numeroAleatorio+"Z";
    	    break;
            case 18:
            this.nif=numeroAleatorio+"S";
    	    break;
            case 19:
            this.nif=numeroAleatorio+"Q";
    		break;
            case 20:
            this.nif=numeroAleatorio+"V";
    		break;
             case 21:
            this.nif=numeroAleatorio+"H";
    		break;
            case 22:
            this.nif=numeroAleatorio+"L";
    		break;
            
		default:
			System.out.println("No se puede generar");
			break;
		}
          
          }
          
	
      
  
	  
//	  metodo triple triple 
	  public boolean tripleTriple() {
		  boolean valor1= false;
		  int contador=0;
		  if(this.puntos>=10) {
			  contador++;
		  }
			  if(this.rebotes>=10) {
				  contador++;
			  }
			  	if(this.asistencias>=10) {
			  		contador++;
			  	}
			  	  if(this.tapones>=10) {
			  		  contador++;
			  	  }
			  		if(this.robosdebalon>=10) {
			  			contador++;
			  		}
			  		
			  		if(contador>=2) {
			  			valor1=true;
		  }
		  return valor1;
		  
	  }
	  
//	  metodo doble doble 
	  
	  public boolean dobleDoble() {
		  boolean valor= false;
		  int contador=0;
		  if(this.puntos>=10) {
			  contador++;
		  }
			  if(this.rebotes>=10) {
				  contador++;
			  }
			  	if(this.asistencias>=10) {
			  		contador++;
			  	}
			  	  if(this.tapones>=10) {
			  		  contador++;
			  	  }
			  		if(this.robosdebalon>=10) {
			  			contador++;
			  		}
			  		
			  		if(contador>=3) {
			  			valor=true;
		  }
		  return valor;
	  }
		  }
	  
	 
	  
	 

