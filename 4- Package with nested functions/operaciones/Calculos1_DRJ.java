/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT03_ASIX_asix_DRJ.operaciones;

import ACT03_ASIX_asix_DRJ.IntroDatos.Filtro_DRJ;

/**
 *
 * @author Dami
 */
public class Calculos1_DRJ {
    /* Esta clase es la encargada de contener las funciones encargadas
    de averiguar distintos valores matemáticos a través de operaciones
    */
    public static void muestraPI_DRJ(){
    /* Esta función muestra el valor de PI al elegir la opción correspondiente
    en el menú del main
    */
        Double pi_DRJ=Math.PI;
        System.out.println("el valor de PI es" + " " + pi_DRJ);
    }
    
    public static void muestraValorRedondeado_DRJ (){
    /* Esta función pide que se introduzca un valor numérico mediante pideDouble
    y lo redondea
    */
    double redondeo_DRJ = Filtro_DRJ.pideDouble_DRJ("introduce valor numerico a redondear");
        long valorredondeado_DRJ = Math.round(redondeo_DRJ);
    System.out.println("el valor redondeado es" + " " + valorredondeado_DRJ);

}
    public static void muestraValorAleatorio_DRJ (){ 
    /* Esta función pide que se introduzca un valor numérico mediante pideEntero
    y devuelve un número aleatorio entre 0 y ese número introducido por consola
    */
    int valoraleatorio_DRJ = Filtro_DRJ.pideEntero_DRJ("introduce un numero entero");
    System.out.println("El número aleatorio entre 0 y el número por ti elegido es" + Math.random()*valoraleatorio_DRJ);       
    }
}