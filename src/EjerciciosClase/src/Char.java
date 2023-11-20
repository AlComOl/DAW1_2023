package EjerciciosClase.src;
import java.io.IOException;
import java.util.*;

public class Char   {

	public static void main(String[] args) throws IOException {

		        char car1, car;
		        System.out.print("Introduzca primer carácter: ");
		        car1 = (char)System.in.read(); //lee un carácter
		         System.in.read();
		         System.in.read();//saltar el intro que ha quedado en el buffer                                
		        System.out.print("Introduzca segundo carácter: ");
		        car = (char)System.in.read(); //lee el segundo carácter
		        System.in.read(); 
		        System.out.println(car);
		        System.out.println(car1);
		        
		        if(car1 == car){
		           System.out.println("Son iguales");   
		        }else{
		           System.out.println("No son iguales");
		        }        
		    }
		
        
//        if(car1==car2){
//           System.out.println("Son iguales");   
//        }else{
//           System.out.println("No son iguales");
//
//	}

}

