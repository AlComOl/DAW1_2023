package EjerciciosClasePoo;
import java.util.*;
public class MiNumeroJieqin {

	 public static class MiNumero{
	     
	     private int numero;


	 //Constructor
	     public MiNumero(){
	         numero = 5;
	     }

	 //Metodos
	     public int doble(){
	         return this.numero * 2;
	     }
	     public int triple(){
	         return this.numero * 3;
	     }
	     public int cuadruple(){
	         return this.numero * 4;
	     }
	 }
	 /*******************************************************************************************/
	 //Main



	 public static void main(String[] args) {
	         //Scanner tec = new Scanner(System.in);

	         MiNumero num = new MiNumero();

	         System.out.println(num.doble());
	         System.out.println(num.triple());
	         System.out.println(num.cuadruple());
	     }


	     }
	 
