package EstructurasCondicionales;
import java.util.*;

public class Julia_41 {

    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

            int j, n;
            boolean primo;

            System.out.println("Introduce el número n:");
            n=tec.nextInt();

                System.out.println("Los primos son:");

                for (int i=1; i<=n; i++){

                    primo=true;

                    for(j=2 ; j<i && primo==true ;j++)

                        if (i%j==0)
                            primo=false;

                    if (primo)
                    System.out.println(i+",");

        }

        tec.close();

    }

}