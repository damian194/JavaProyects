/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT03_ASIX_asix_DRJ.main;

import ACT03_ASIX_asix_DRJ.operaciones.aritmeticas.Operacionesmates_DRJ;
import ACT03_ASIX_asix_DRJ.IntroDatos.Filtro_DRJ;
import ACT03_ASIX_asix_DRJ.operaciones.Calculos1_DRJ;
import ACT03_ASIX_asix_DRJ.operaciones.logicas.Operacionespropias_DRJ;

/**
 *
 * @author Dami
 */
public class Ejercicio01_DRJ {

    /* Esta clase contiene la función main, es decir, la encargada de ejecutar 
    las demás funciones de las distintas clases, así como de ofrecer un menú
    al usuario y opciones de interacción según las diferentes propuestas 
    ofrecidas
    */
    
    public static void main(String[] args) {
        /*
        Función main; ejecuta el código
        */

        int opcion_DRJ;
        do {
            mostrarmenu_DRJ();
            opcion_DRJ = Filtro_DRJ.pideEntero_DRJ("introduce valor numerico deseado");

            switch (opcion_DRJ) {
                case 1:
                    Calculos1_DRJ.muestraPI_DRJ();
                    break;
                case 2:
                    Calculos1_DRJ.muestraValorRedondeado_DRJ();
                    break;
                case 3:
                    Calculos1_DRJ.muestraValorAleatorio_DRJ();
                    break;
                case 4:
                    double angulo_DRJ = Filtro_DRJ.pideDouble_DRJ("introduce el ángulo del que quieras averiguar el seno");
                    Operacionesmates_DRJ.muestraseno_DRJ(angulo_DRJ);
                    break;
                case 5:
                    double numero1_DRJ;
                    do {
                        numero1_DRJ = Filtro_DRJ.pideDouble_DRJ("Introduce un número positivo del que quieras saber la raiz ");
                        if (numero1_DRJ <= 0) {
                            System.out.println("Introduce un número positivo, por favor.");
                        }
                    } while (numero1_DRJ < 0);
                    Operacionesmates_DRJ.Calcularaiz_DRJ(numero1_DRJ);
                    break;
                case 6:
                    Operacionespropias_DRJ.media3Numeros_DRJ();
                    break;
                case 7:
                    Operacionespropias_DRJ.muestraNombreDia_DRJ();
                    break;
                case 0:
                    break;
            }

        } while (opcion_DRJ
                != 0);
    }

    private static void mostrarmenu_DRJ() {
        /*
        Función local encargada de simplificar el código al momento
        de ofrecer las distintas opciones del menú por pantalla
        */
        System.out.println("Qué quieres hacer?");
        System.out.println("1- muestra el número PI.");
        System.out.println("2- muestra valor redondeado.");
        System.out.println("3- genera valor aleatorio.");
        System.out.println("4- seno de un angulo.");
        System.out.println("5- raíz cuadrada de un número positivo.");
        System.out.println("6- media de 3 numeros");
        System.out.println("7- el día de la semana.");
        System.out.println("0- salir");
    }
}
