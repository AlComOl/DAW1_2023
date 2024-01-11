package Practica100124;


import java.util.*;

public class TestPractica {

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int opcion;
       double d=0, mi,max;
       String n="";
       do {
           System.out.println("Introcuce opcion \n 1-Introducir valores de medición\n 2-Procesar medición.\n 3-Consultar el rango del pH a controlar \n 4-Cambiar el rango del pH a controlar \n 5-Salir del programa");
           opcion=sc.nextInt();
           sc.nextLine();
           switch (opcion) {
           case 1:
               System.out.println("Introduce nombre");
               n=sc.nextLine();
               
               System.out.println("Introduce dato");
               d=sc.nextDouble();
               sc.nextLine();
               ControlPotencia piscina1=new ControlPotencia(n,d);
               
               break;
           case 2:
               
               
               break;
           case 3:
               System.out.println("Introduce nombre");
               mi=sc.nextDouble();
               sc.nextLine();
               System.out.println("Introduce dato");
               max=sc.nextDouble();
               sc.nextLine();
               ControlpH pH1=new ControlpH(mi,max,n,d);
               
               break;

           default:
               break;
           }
           
       }while(opcion!=5);

   }

}

