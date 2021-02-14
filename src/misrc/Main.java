package misrc;

import java.io.IOException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            
            cls();
            System.out.print("\nMENU");
            System.out.print("\n====");
            System.out.print("\n(1) sagastegui suma");
            System.out.print("\n(2) sagastegui resta");
            System.out.print("\n(3) walter multiplicación");
            System.out.print("\n(4) walter división");
            System.out.print("\n(0) Salir\n");

            System.out.print("\nOpcion? ");
            opcion = sc.next().trim().charAt(0);

            switch (opcion) {
                case '1':
                    cls();
                    sagasteguisuma();
                    pause();
                    break;
                case '2':
                    cls();
                    sagasteguiresta();
                    pause();
                    break;
                case '3':
                    cls();
                    waltermultiplicacion();
                    pause();
                    break;
                case '4':
                    cls();
                    walterdivision();
                    pause();
                    break;
                case '0':
                    cls();
                    System.exit(0);
                    break;
            }
        } while (true);

    }

    public static void sagasteguisuma() {
        System.out.print("\nSUMA");
        System.out.print("\n====");
        System.out.println("\nOK SUMA");
        
    }

    public static void sagasteguiresta() {
        System.out.print("\nRESTA");
        System.out.print("\n=====");
        System.out.println("\nOK RESTA");
    }

    public static void waltermultiplicacion() {
        System.out.print("\nMULTIPLICACION");
        System.out.print("\n==============");
        System.out.println("\nOK MULTIPLICACION DECIDO CAMBIARLO");
    }

    public static void walterdivision() {
        System.out.print("\nDIVISION");
        System.out.print("\n========");
        System.out.println("\nOK DIVISION REVISADO Y ACTUALIZADO");
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
