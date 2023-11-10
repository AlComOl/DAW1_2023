package EjerciciosClasePoo;
import java.util.*;
public class FiananzasJulia {
    private double dolarEuro;

    public FiananzasJulia() { //Guardamosla tasa que hay para cambiar de dolares a euros
        dolarEuro = 1.36;
    }

    public FiananzasJulia(double dolarEuro) {  //Permite configurar la tasa dolar-euro
        this.dolarEuro = dolarEuro;
    }
   
    public double dolaresToEuros(double dolares) { //Permite convertir los dolares en euros
        return dolares / dolarEuro;
    }
   
    public double eurosToDolares(double euros) { //Permite convertir los euros en dolares
        return euros * dolarEuro;
    }

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        double cantidad;
        int menu;

        System.out.println("Dime la cantidad de dinero que quieres convertir: ");
        cantidad = tec.nextDouble(); //Se pide la cantidad, y luego uando se pasa como argumento se decide si serán euros o dolares

        System.out.println("Quieres convertir de 1: Dolares a Euros, 2: Euros a Dolares");
        menu = tec.nextInt();

        FiananzasJulia finanzas = new FiananzasJulia();

        switch (menu) { //Se da la opcion de convertir los euros en dolares, o los dolares en euros

            case 1:
                double euros = finanzas.dolaresToEuros(cantidad); //Se pasa cantidad como argumento
                System.out.println(cantidad + " dolares equivalen a " + euros + " euros");

            break;
            case 2:
                double dolares = finanzas.eurosToDolares(cantidad);
                System.out.println(cantidad + " euros equivalen a " + dolares + " dolares");

            break;

        }

    }

}