package PracticaPoo_2022;

public class Vehiculo {
	
//	Atributos
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private float precioCompra;
	private int anoFabric;
	
	
//	Constructor por defecto
	public Vehiculo() {
		  this.marca=" ";
		  this.modelo=" ";
		  this.color=" ";
		  this.precioCompra=0;
		  this.anoFabric=0;
		  generarMatricula();
		 
	}
//	Constructor con argumentos
	public Vehiculo(String marca,String modelo, String color,float precioCompra,int anoFabric) {
		  this.marca=marca ;
		  this.modelo=modelo;
		  this.color=color;
		  this.precioCompra=precioCompra;
		  this.anoFabric=anoFabric;
		 
		  
		 
	}
//	Constructor de copia
//	siempre que haga una intancia con constructor de copia los atributos seran del constructor del obgeto pasado por parametro en el constructor de copia
	public Vehiculo(Vehiculo r) {
		this.marca=r.getMarca();
		this.modelo=r.getModelo();
		this.color=r.getColor();
		this.precioCompra=r.getPrecioCompra();
		this.anoFabric=r.getAnoFabric();
		
		
	}
//	Metodos Setters Getter
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getAnoFabric() {
		return anoFabric;
	}
	public void setAnoFabric(int anoFabric) {
		this.anoFabric = anoFabric;
	}
//	void mostrar() método que muestra la información de un vehículo por pantalla.
	public void mostrar() {
		System.out.println("Marca:\n \n \t"+getMarca()+"\n \n" +" Modelo: \n \n \t"+getModelo()+"\n \n Color: \n \n \t"+getColor()+"\n \n Precio PVP \n \n \t"+getPrecioCompra()+"\n \n Ano Fabricacion \n \n \t"+getAnoFabric()+"\n \n  Matricula :\n \n \t"+generarMatricula());
		
	}
	public String toString() {
		String info;
		info=getMarca()+"\n"+getModelo()+"\n"+getColor()+"\n"+getPrecioCompra()+"\n"+getAnoFabric()+"\n";
		return info;
	}
	
	public int anosVehiculo() {
		return 2023-getAnoFabric();
	}
	
	public float valorActual() {
		float valor=0;
		if(anosVehiculo()<=1) {
		valor= precioCompra;
		
		}else if(anosVehiculo()<2) {
			valor= getPrecioCompra()*84/100;
		}else if(anosVehiculo()<3) {
			valor= getPrecioCompra()*67/100;
		}else if(anosVehiculo()<4) {
			valor= getPrecioCompra()*56/100;
		}else if(anosVehiculo()<5) {
			valor= getPrecioCompra()*47/100;
		}else if(anosVehiculo()<6) {
			valor= getPrecioCompra()*39/100;
		}else if(anosVehiculo()<7) {
			valor= getPrecioCompra()*34/100;
		}else if(anosVehiculo()<8) {
			valor= getPrecioCompra()*28/100;
		}else if(anosVehiculo()<9) {
			valor= getPrecioCompra()*24/100;
		}else if(anosVehiculo()<10) {
			valor= getPrecioCompra()*19/100;
		}else if(anosVehiculo()<11) {
			valor= getPrecioCompra()*17/100;
		}else if(anosVehiculo()<12) {
			valor= getPrecioCompra()*13/100;
		}else {
			valor= getPrecioCompra()*10/100;
		}
		
		return valor;
	}
//	para matricula tenéis que crear un método privado que genere una cadena compuesta por un número de 3 cifras entre 000 y 999 y tres letras.
	public  String generarMatricula() {
		//generamos un nuevo obgeto de StringBuilder que 
		StringBuilder matricula =new StringBuilder();
		
		for(int i=0;i<3;i++) {
			char letras=(char)(Math.random()*26+'A');
			matricula.append(letras);
		}
		
		for(int i=0;i<3;i++) {
			int numeros=(int)(Math.random()*10);
			matricula.append(numeros);
		}
		
		return matricula.toString();
		
	}
//	Añade otro método a la clase int relacion( Vehiculo v) que nos indique la antigüedad de un vehículo respecto al otro. Por ejemplo, si ejecutásemos
	
	public int relacion(Vehiculo v) {//pasomo el obgeto para que compara su año de fabricacion con el año de fabricacion del año de fabricacion que tenemos 
		int antiguedad=0;
		if(this.getAnoFabric()==v.anoFabric) {
			antiguedad=0;
		}else if(this.getAnoFabric()>v.anoFabric) {
			antiguedad=1;
		}else {
			antiguedad=-1;
		}
			
		return antiguedad;
	}
}
