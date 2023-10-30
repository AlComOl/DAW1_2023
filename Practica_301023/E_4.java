package Practica_301023;

public class E_4 {

	public static void main(String[] args) {
		
		char vasc=0;
		String hexa = " ";
		String octa = " ";
		
		for(int i=0;i<128;i++) {
			System.out.println();
			vasc=(char)i;
			System.out.print(i+ "    ");
			 System.out.print(vasc+"   ");
			 System.out.print( hexa=Integer.toHexString(i)+"   ");
			 System.out.print( octa=Integer.toOctalString(i));
			
		}
		

	}

}
