/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Operacionesmates_DRJ to edit this template
 */
package ACT03_ASIX_asix_DRJ.operaciones.aritmeticas;

/**
 *
 * @author Dami
 */
public class Operacionesmates_DRJ {
    /* Esta clase también se encarga de contener funciones que realizan
    operaciones matemáticas, pero en este caso aritméticas
    */
    public static void muestraseno_DRJ (Double valor_DRJ){
    /* Esta función, valiéndose de la sintaxis del main, pide un valor entero
    y devuelve el seno del mismo
    */
        double sin_DRJ = Math.sin(valor_DRJ);
        System.out.println("el valor del seno de" + valor_DRJ + "es: " + sin_DRJ);
    }
    public static void Calcularaiz_DRJ (Double valorr_DRJ){
    /* Esta función, también valiéndose de la sintaxis del main, pide un valor entero
    y devuelve la raíz cuadrada del mismo. Sin embargo, en este caso la sintaxis del main
    consta de un bucle do while con un if anidado. Mientras que la primer estructura restringe
    el ingreso de números solo a positivos, la segunda aporta un mensaje de error en caso de
    no respetarse esto
    */
        double raiz_DRJ = Math.sqrt(valorr_DRJ);
        System.out.println("la raiz cuadrada de" + valorr_DRJ + "es: " + raiz_DRJ);
    }
}
