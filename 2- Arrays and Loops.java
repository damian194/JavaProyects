
package Actividad02;

/**
 *
 * @author Dami
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int[] array_DRJ = new int[7];
        int option;
        
        // Pide 7 valores enteros entre 10 y 50
        for (int i_DRJ = 0; i_DRJ < 7; i_DRJ++) {
            do {
                System.out.print("Introduce el valor #" + (i_DRJ+1) + " entre 10 y 50: ");
                array_DRJ[i_DRJ] = input.nextInt();
            } while (array_DRJ[i_DRJ] < 10 || array_DRJ[i_DRJ] > 50);
        }
        
        // Mostrar los valores del array
        System.out.print("Los valores introducidos son: ");
        for (int i_DRJ = 0; i_DRJ < array_DRJ.length; i_DRJ++) {
            System.out.print(array_DRJ[i_DRJ] + " ");
        }
        System.out.println();
        
        // Mostrar menú y realizar operaciones según opción elegida
        do {
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
            System.out.println("1- Indicar cuantos valores entre 22 y 32 hay en el array.");
            System.out.println("2- Calcular la media aritmética de los 7 números.");
            System.out.println("3- Mostrar el número más alto del array.");
            System.out.println("4- Mostrar el contenido del array de la última a la primera posición.");
            System.out.println("0- Finalizar.");
            option = input.nextInt();
            
            switch (option) {
                case 1 -> {
                    int count_DRJ = 0;
                    for (int i_DRJ = 0; i_DRJ < array_DRJ.length; i_DRJ++) {
                        if (array_DRJ[i_DRJ] >= 22 && array_DRJ[i_DRJ] <= 32) {
                            count_DRJ++;
                        }
                    }
                    System.out.println("Hay " + count_DRJ + " valores entre 22 y 32 en el array.");
                }
                case 2 -> {
                    int sum_DRJ = 0;
                    for (int i_DRJ = 0; i_DRJ < array_DRJ.length; i_DRJ++) {
                        sum_DRJ += array_DRJ[i_DRJ];
                    }
                    double average_DRJ = (double) sum_DRJ / array_DRJ.length;
                    System.out.println("La media aritmética de los 7 números es " + average_DRJ);
                }
                case 3 -> {
                    int max_DRJ = array_DRJ[0];
                    for (int i_DRJ = 1; i_DRJ < array_DRJ.length; i_DRJ++) {
                        if (array_DRJ[i_DRJ] > max_DRJ) {
                            max_DRJ = array_DRJ[i_DRJ];
                        }
                    }
                    System.out.println("El número más alto del array es " + max_DRJ);
                }
                case 4 -> {
                    System.out.print("El contenido del array de la última a la primera posición es: ");
                    for (int i_DRJ = array_DRJ.length-1; i_DRJ >= 0; i_DRJ--) {
                        System.out.print(array_DRJ[i_DRJ] + " ");
                    }
                    System.out.println();
                }
                case 0 -> System.out.println("Hasta luego");
                default -> System.out.println("Opción incorrecta. Introduce una opción válida.");
            }
            System.out.println(); // Salto de línea para separar menú de la operación siguiente
        } while (option != 0);
    }
}

