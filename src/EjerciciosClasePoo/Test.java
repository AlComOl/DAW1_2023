package EjerciciosClasePoo;



public class Test {


	int x,y;
	
	Test(int a,int b){
		x=a;
		y=b;
	}
	
	
	public static void main(String[] args) {
//		CREAMOS UN OBJETO DE TIPO Test LLAMADO t1
		Test t1=new Test(2,5);
		
//CREAMOS UN OBJETO DE TIPO test LLAMADO t2 apuntando a t1
//por lo tanto  t2 x , y valdran lo mismo que t1 x,y		
		Test t2=t1;
//pasamos el valor de y de t1 o t2(es lo mismo) a t1.x 		
		t1.x=t2.y;
		
		System.out.println(t2.x);
		System.out.println(t2.y);
		
		}
	}