import java.util.*;

public class PRG_44 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int aux=0,aux1=0;
		System.out.println("Introduce 1 numero");
		int n=entrada.nextInt();
		System.out.println("Introduce 1 numero");
		int m=entrada.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				aux+=i;	
			}
		}
		for(int j=1;j<=m;j++) {
			if(n%j==0) {
				aux1+=j;	
			}
		}
		if(aux==aux1) {
			System.out.println("Son amigos");
		}else {
			System.out.println("no son amigos");
		}
	}

}
