package com.company;

import java.util.Scanner;
public class returnMenu {

    public static Boolean backMenu() {
        Scanner in = new Scanner(System.in);
        int option = 0;
        System.out.println("\nDesea regresar al menu Principal: " +
                "\n1. Si" +
                "\n2. Salir del Programa\n" +
                "\nElija una Opcion: ");
        option = in.nextInt();
        if (option==1) {
            return true;
        } else {
            System.out.println("Saliendo del programa...");
            return false;
        }
    }
}
