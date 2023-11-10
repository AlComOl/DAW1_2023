package Practica_301023;
import java.io.*;
public class E_2 {

		    
		    public static void main(String[] args) throws IOException {
		        
		        char c1, c2;
		        
		        System.out.println("Introduce dos colores primarios");
		        System.out.println("Opciones validas -> Rojo \"R\", Verde \"V\", Azul \"A\"");
		        System.out.println("A continuación introduce la inicial de un color primario: ");
		        c1 = (char) System.in.read();
		        System.out.println("Introduce la inicial de otro color primario: ");
		        c2 = (char) System.in.read();
		        c2 = (char) System.in.read();
		        
		        if(c1 == 'R'){
		            if(c2 == 'R'){
		                System.out.println("El color resultante es Rojo \"R\"");
		            }else if(c2 == 'V'){
		                System.out.println("El color resultante es Amarillo \"A\"");
		            }else{
		                System.out.println("El color resultante es Morado \"M\"");
		            }
		            
		        }else if(c1 == 'V'){
		            if(c2 == 'R'){
		                System.out.println("El color resultante es Amarillo \"A\"");
		            }else if(c2 == 'V'){
		                System.out.println("El color resultante es Verde \"V\"");
		            }else{
		                System.out.println("El color resultante es Turqusa \"T\"");
		            }
		        }else if(c1 == 'A'){
		            if(c2 == 'R'){
		                System.out.println("El color resultante es Morado \"M\"");
		            }else if(c2 == 'V'){
		                System.out.println("El color resultante es Turquesa \"T\"");
		            }else{
		                System.out.println("El color resultante es Azul \"A\"");
		            }
		        }
		    }
		    
		}

	}

}
