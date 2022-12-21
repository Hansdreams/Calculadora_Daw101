/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package examen.calculadora_gustavobautista;

import java.util.Scanner;

/**
 *
 * @author DAW101
 */
public class Calculadora_GustavoBautista {

    static Scanner scanner = new Scanner(System.in);
    static float numero1 = 0, numero2 = 0; //Variables de entrada
    
    public static void main(String[] args) {
        
        int opcion = -1; //opción del menú
        
        System.out.println("Bienvenido al programa Calculadora_GustavoBautista");
        System.out.println("Disfruten el programa");
       
        while (opcion != 0) {
                System.out.println("Elige opción:\n" + ""
                        + "1.- Sumar\n"
                        + "2.- Restar\n"
                        + "3.- Multiplicar\n"
                        + "4.- Dividir\n"
                        + "0.- Salir");

                System.out.println("Selecciona una opción de 0 a 4");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        pideNumeros();
                        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    }
                    case 2 -> {
                        pideNumeros();
                        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    }
                    case 3 -> {
                        pideNumeros();
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    }
                    case 4 -> {
                        pideNumeros();
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no disponible");
                }

                System.out.println("\n");
        }

    }

    //Método para recoger las variables de entrada
    public static void pideNumeros() {
        System.out.println("Introduce el primer número:");
        numero1 = scanner.nextFloat();

        System.out.println("Introduce el segundo número:");
        numero2 = scanner.nextFloat();

    }
    
}
