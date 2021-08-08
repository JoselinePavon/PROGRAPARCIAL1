package com.company;

import java.util.Scanner;
public class CalculadoraBasic {

    public static void sum(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Se le piden los datos al usuario
        System.out.println("\tS U M A   D E   2   N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();


        result = dato1 +  dato2;


        System.out.println("El resultado de la suma es: " + result);
    }

    public static void subtract(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tR E S T A   D E   2   N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();


        result = dato1 -  dato2;


        System.out.println("El resultado de la Resta es: " + result);
    }


    public static void multiply(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tM U L T I P L I C A C I O N   D E  2  N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();


        result = dato1 *  dato2;


        System.out.println("El resultado de la Multiplicacion es: " + result);
    }


    public static void divide(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tD I V I S I O N   D E   2   N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();


        result = dato1 /  dato2;


        System.out.println("El resultado de la Division es: " + result);
    }
}

