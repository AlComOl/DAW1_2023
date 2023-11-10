package EstructurasCondicionales;
import java.util.*;

public class probar {
//    public static void main(String[] args) {
//        Scanner tec = new Scanner(System.in);
//        int n,m,i,acumula=0;
//
//        System.out.println("Introduce el numero");
//        n = tec.nextInt();
//        System.out.println("Introduce el numero");
//        m = tec.nextInt();
////        if(n<m) {
////        	n=m;
////        	m=n;
////        }
//        acumula=n;
//        for(i=0;n<m;i++) {
//        	n-=m;//acumula=acumula-m
//        System.out.println(acumula);
//        }
//        System.out.println(i);
//       
//    }
//}

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n,igual=0,mayor=0,menor=0,caracter=0;
		
	  
	
            for(int i=10;i>0;i--) {
            	System.out.println("Introduce el numero");	
            	n=entrada.nextInt();
            	
            	if(n==0) {
            		igual++;
            	}else if(n<0) {
            		menor++;
            	}else if(n>0){
            		mayor++;
            	}else {
            		caracter++;
            	}
            }
            System.out.println("Hay "+igual+" numeros igules "+mayor +" numeros mayores "+menor+" numeros menores que 0 , y caracteres mal introducidos "+caracter);
            entrada.close();
                  }
      }