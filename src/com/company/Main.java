package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Main.menu();
    }


            public static void menu() {
                int option = 0;
                Scanner in = new Scanner(System.in);
                do {

                    System.out.println("\nCalculadora Digital ¡Seleccione la operacion que desea realizar!\n" +
                            "\n");
                    System.out.println("Calculadora Basica:\n" +
                            " 1.Suma\n" +
                            " 2.Resta\n" +
                            " 3.Multiplicacion\n" +
                            " 4.Division\n\n" +
                            "Calculadora Avanzada:\n" +
                            " 5.Raiz Cuadrada\n" +
                            " 6.Potencia\n" +
                            " 7.Seno\n" +
                            " 8.Coseno\n" +
                            " 9.Tangente\n" +
                            "10. Salir del Programa");
                    System.out.println("Elije una de las Opciones : ");option = in.nextInt();


                    switch (option) {
                        case 1:
                            CalculadoraBasic.sum();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }

                        case 2:
                            CalculadoraBasic.subtract();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 3:
                            CalculadoraBasic.multiply();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 4:
                            CalculadoraBasic.divide();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 5:
                            CalculadoraAvanzada.raiz();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 6:
                            CalculadoraAvanzada.power();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 7:
                            CalculadoraAvanzada.sen();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 8:
                            CalculadoraAvanzada.cosine();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 9:
                            CalculadoraAvanzada.tangent();
                            if (returnMenu.backMenu()) {
                                break;
                            } else {
                                option = 10;
                                break;
                            }
                        case 10:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Esta opcion no existe");

                    }
                } while (option != 10);
            }


        }
