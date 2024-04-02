
package Actividad02;

/**
 *
 * @author Dami
 */

public class Ejercicio02 {
    public static void main(String[] args) throws Exception{
        
        // Declaración e inicialización del array bidimensional puntos_DRJ
        double[][] puntos_DRJ = {
            {8.1, 3.2, 9.8},
            {5.4, 8.5, 7.3},
            {10, 9.6, 6.2},
            {4.7, 7.2, 8.8}
        };
        
        // Mostrar todos los puntos dentro del array puntos_DRJ
        System.out.println("Valoraciones de los expertos:");
        for (int i_DRJ = 0; i_DRJ < puntos_DRJ.length; i_DRJ++) {
            for (int j_DRJ = 0; j_DRJ < puntos_DRJ[i_DRJ].length; j_DRJ++) {
                System.out.print(puntos_DRJ[i_DRJ][j_DRJ] + "\t");
            }
            System.out.println();
        }
        
        // Mostrar todas las puntuaciones del primer experto
        System.out.print("Puntuaciones indicadas por el primer experto: ");
        for (int i_DRJ = 0; i_DRJ < puntos_DRJ[0].length; i_DRJ++) {
            System.out.print(puntos_DRJ[0][i_DRJ] + " ");
        }
        System.out.println();
        
        // Media obtenida por la segunda canción
        double mediasegundacancion_DRJ = 0;
        for (int i_DRJ = 0; i_DRJ < puntos_DRJ.length; i_DRJ++) {
            mediasegundacancion_DRJ += puntos_DRJ[i_DRJ][1];
        }
        mediasegundacancion_DRJ /= puntos_DRJ.length;
        System.out.println("Media de la segunda canción: " + mediasegundacancion_DRJ);
        
        // Peor valor de la tercera canción
        double peorvalorterceracancion_DRJ = puntos_DRJ[0][2];
        for (int i_DRJ = 1; i_DRJ < puntos_DRJ.length; i_DRJ++) {
            if (puntos_DRJ[i_DRJ][2] < peorvalorterceracancion_DRJ) {
                peorvalorterceracancion_DRJ = puntos_DRJ[i_DRJ][2];
            }
        }
        System.out.println("Peor valor de la tercera canción: " + peorvalorterceracancion_DRJ);
        
    }
}