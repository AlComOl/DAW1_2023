package EjerciciosClase.src;

public class Test {
	int x,y;
	
	Test(int a,int b){
		x=a;
		y=b;
	}
	
	
	public static void main(String[] args) {
		
		Test t1=new Test(2,5);
		
		
		Test t2=t1;
		
//		t1.x=t2.y;
		
		System.out.println(t2.x);
		System.out.println(t2.y);
		
		}
	}



