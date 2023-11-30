package Pez;

public class ClasePez {

	private String nombre;
	
	public String getClasePez() {
		
		return this.nombre;
	}
	public void setNombre(String param) {
		
		this.nombre=param;
	}
	
	public boolean equals(Object o) {
		boolean igual;
		if(this==o) {
			 igual =true;
			
		}else {
			igual =false;
		}
	
		return igual;
//		@Override
//		public ClasePez clone() throws CloneNotSupportedException{
//			return (ClasePez) super.clone();
//		}
	
}
}