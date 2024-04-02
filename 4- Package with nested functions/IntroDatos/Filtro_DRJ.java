/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT03_ASIX_asix_DRJ.IntroDatos;

/**
 *
 * @author Dami
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Filtro_DRJ {
    /* Esta clase contiene las funciones de pideEntero y pideDouble, las cuales
    dan soporte tanto al menú como a las distintas funciones de otras clases
    y packages
    */
    public static int pideEntero_DRJ(String pregunta_DRJ){
    /* Esta función pide un nùmero entero en el menú para que el usuario
    lo introduzca y ejecute las opciones ofrecidas. Luego procesa ese número
    y devuelve al usuario el producto. A su vez, si no se introduce un número
    entero, indica que hay error y solicita el valor nuevamente. También aplica
    esta lógica con las demás funciones que necesitan ingreso de valores por
    pantalla
    */
        int numero_DRJ=0;
        boolean bool_DRJ;
        do{
            System.out.println(pregunta_DRJ);
         try {
             BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
             numero_DRJ = Integer.parseInt(br.readLine());
             bool_DRJ=false;
        } catch (Exception ex) {
            bool_DRJ=true;
            System.out.println("Valor incorrecto");
        }
    } while (bool_DRJ==true);
      return numero_DRJ;
    }  
    
        public static double pideDouble_DRJ(String pregunta_DRJ){
    /* Esta función es similar a pideEntero pero con Double y no con Int. 
    Se aplica en funciones de estilo Double
    */
        double numero_DRJ=0;
        boolean bool_DRJ;
        do{
            System.out.println(pregunta_DRJ);
         try {
             BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
             numero_DRJ = Double.parseDouble(br.readLine());
             bool_DRJ=false;
        } catch (Exception ex) {
            bool_DRJ=true;
            System.out.println("Valor incorrecto. Tiene que ser un valor decimal");
        }
    } while (bool_DRJ==true);
      return numero_DRJ;
    }  
}


