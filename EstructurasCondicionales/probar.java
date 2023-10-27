package EstructurasCondicionales;
import java.util.*;

public class probar {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, div = 2;

        System.out.print("Introduce el numero a descomponer factorialmente: ");
        num = tec.nextInt();

        System.out.print("Los factores del numero " + num + " son: ");
        while(num != 1) {

            while(num % div == 0){
                System.out.print(div + ", ");
                num = num / div;
            }
                div++;
        }
    }
}