package EstructurasCondicionales;
import java.util.*;
public class PRG_18 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int producto=0;
		System.out.println("Introcuce 2 numerros");
		int n=entrada.nextInt();
		int m=entrada.nextInt();
			
		for(int i=0; i<m;i++) {
			producto+=n;
		}
		System.out.println(producto);
	}

}
