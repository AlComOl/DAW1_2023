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
		System.out.println(getMarca()+"\n"+getModelo()+"\n"+getColor()+"\n"+getPrecioCompra()+"\n"+getAnoFabric());
		
	}
	public String toString() {
		String info;
		info=getMarca()+"\n"+getModelo()+"\n"+getColor()+"\n"+getPrecioCompra()+"\n"+getAnoFabric();
		return info;
	}
}
