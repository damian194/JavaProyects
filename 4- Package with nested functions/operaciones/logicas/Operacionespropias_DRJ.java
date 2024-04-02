/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT03_ASIX_asix_DRJ.operaciones.logicas;

import ACT03_ASIX_asix_DRJ.IntroDatos.Filtro_DRJ;


/**
 *
 * @author Dami
 */
public class Operacionespropias_DRJ {
    /* Esta clase también se encarga de contener funciones que realizan
    operaciones matemáticas, pero en este caso plenamente lógicas
    */
    public static void media3Numeros_DRJ() {
    /* Esta función, junto a la siguiente "calcularMedia_DRJ", solicita que se ingrese
    por consola 3 números mediante pideDouble, y luego calcula la media de los mismos
    */
        double num1_DRJ, num2_DRJ, num3_DRJ, media_DRJ;
        num1_DRJ = Filtro_DRJ.pideDouble_DRJ("Introduce el primer número: ");
        num2_DRJ = Filtro_DRJ.pideDouble_DRJ("Introduce el segundo número: ");
        num3_DRJ = Filtro_DRJ.pideDouble_DRJ("Introduce el tercer número: ");
        media_DRJ = calcularMedia_DRJ(num1_DRJ, num2_DRJ, num3_DRJ);
        System.out.println("La media de los tres números es: " + media_DRJ);
    }

    public static double calcularMedia_DRJ(double num1_DRJ, double num2_DRJ, double num3_DRJ) {
        return (num1_DRJ + num2_DRJ + num3_DRJ) / 3;
    }
    public static void muestraNombreDia_DRJ() {
    /* Esta función solicita que se ingrese un número mediante pideEntero, el cual devolverá como valor,
    a través de la estructura switch, el nombre de uno de los 7 días de la semana
    */
    int numDia_DRJ = Filtro_DRJ.pideEntero_DRJ("Introduce el número de día de la semana (1-7): ");
    switch (numDia_DRJ) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Número de día no válido.");
            break;
    }
}
}
