package Actividad04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static ACT03_ASIX_asix_DRJ.IntroDatos.Filtro_DRJ.*;
/*
 * @author Dami
 */
public class Ejercicio01 {
    public static String separador_DRJ = File.separator;
    public static String rutaProyecto_DRJ = System.getProperty("user.dir");
    public static String saltoLinea_DRJ = System.getProperty("line.separator");
    public static String rutaCarpeta_DRJ = rutaProyecto_DRJ + separador_DRJ + "misficheros_DRJ";    
    
    public static void main(String[] args) throws IOException {
           
        crearcarpeta_DRJ();
        crearfichero_DRJ();
        crearfichero2_DRJ();
        int opcion_DRJ;        
        do {
            System.out.println("\n------ Elige una opcion del menu ------");
            System.out.println("1. Nombres de Archivos");
            System.out.println("2. Contenido de un Archivo");
            System.out.println("3. Modificacion de un Archivo");
            System.out.println("4. Borrado de un Archivo");
            System.out.println("5. Cambiar nombre de un Archivo");
            System.out.println("0. Salir");
        
        opcion_DRJ = pideValorMinMax_DRJ(0,5);
        
        switch (opcion_DRJ) {
            case 1:
                listaArchivos_DRJ(rutaCarpeta_DRJ, separador_DRJ);
                break;
            case 2:
                mostrarArchivo_DRJ(rutaCarpeta_DRJ, separador_DRJ);
                break;
            case 3:
                modificarArchivo_DRJ(rutaCarpeta_DRJ, separador_DRJ);
                break;
            case 4:
               borrarArchivo_DRJ(rutaCarpeta_DRJ, separador_DRJ);
                break;
            case 5:
               renombrarArchivo_DRJ(rutaCarpeta_DRJ, separador_DRJ);
                break;
            case 0:
                System.out.println("Adios.");
        }
        
    } while (opcion_DRJ !=0);
}    
    
    public static int pideValorMinMax_DRJ (int valorMinimo_DRJ, int valorMaximo_DRJ) {
        int valor_DRJ = 0;
        do {
            valor_DRJ = pideEntero_DRJ ("Introduce el valor entre "+valorMinimo_DRJ+" y "+valorMaximo_DRJ+"");
            if ((valor_DRJ < valorMinimo_DRJ) || (valor_DRJ > valorMaximo_DRJ)) {
                    System.out.println("El valor debe ser un valor entre " + valorMinimo_DRJ + " y " + valorMaximo_DRJ);
            }
        } while (valor_DRJ < valorMinimo_DRJ || (valor_DRJ > valorMaximo_DRJ));
          return valor_DRJ;
    }
    
   
    
    public static void crearcarpeta_DRJ() {
            File carpetaFormacion_DRJ = new File(rutaCarpeta_DRJ);
            if (!carpetaFormacion_DRJ.exists()) {
            carpetaFormacion_DRJ.mkdir();
        }
   }
    
   public static void crearfichero_DRJ() throws IOException {
       String rutaFichero_DRJ = rutaCarpeta_DRJ + separador_DRJ + "misdatos_DRJ.txt";
       File carpetaFormacion_DRJ = new File(rutaFichero_DRJ);
       FileWriter fw = new FileWriter(carpetaFormacion_DRJ);
       BufferedWriter bw = new BufferedWriter (fw);
       bw.write("Damian" + saltoLinea_DRJ + "Rodriguez");
       bw.flush();
       bw.close();
   }    
   
      public static void crearfichero2_DRJ() throws IOException {
       String rutaCarpeta_DRJ = rutaProyecto_DRJ + separador_DRJ + "misficheros_DRJ" + separador_DRJ + "miubicacion_DRJ.txt";
       File carpetaFormacion_DRJ = new File(rutaCarpeta_DRJ);
       FileWriter fw = new FileWriter(carpetaFormacion_DRJ);
       BufferedWriter bw = new BufferedWriter (fw);
       bw.write("Benimaclet" + saltoLinea_DRJ + "Valencia");
       bw.flush();
       bw.close();
   }    

    public static String[] listaArchivos_DRJ(String rutaCarpeta_DRJ, String separador_DRJ) {
        File carpeta_DRJ = new File (rutaCarpeta_DRJ); 
        String[] archivos_DRJ = carpeta_DRJ.list();
        System.out.println("Contenido de la carpeta misarchivos_DRJ");
        for (int k_DRJ = 0; k_DRJ < archivos_DRJ.length; k_DRJ++) {
             String nombreItem_DRJ = archivos_DRJ[k_DRJ];
             File item_DRJ = new File(rutaCarpeta_DRJ + separador_DRJ + nombreItem_DRJ);
             if (item_DRJ.isFile()) {
                 System.out.println((k_DRJ + 1) + "- " + nombreItem_DRJ);
             }
        }
        
        return (archivos_DRJ);
    }

    private static void mostrarArchivo_DRJ(String rutaCarpeta_DRJ, String separador_DRJ) {
        String archivos_DRJ[] = listaArchivos_DRJ(rutaCarpeta_DRJ, separador_DRJ);
        if (archivos_DRJ.length > 0) {
            System.out.println("indica el numero de archivos que quieres ver");
            int numArchivo_DRJ = pideValorMinMax_DRJ(1, archivos_DRJ.length);
            numArchivo_DRJ--;
            String rutaArchivo_DRJ = archivos_DRJ [numArchivo_DRJ];
            try {
                FileReader fr = new FileReader(rutaCarpeta_DRJ + separador_DRJ + rutaArchivo_DRJ);
                BufferedReader br = new BufferedReader(fr);
                String linea_DRJ = " ";
                linea_DRJ = br.readLine();
                while (linea_DRJ !=null) {
                    System.out.println(linea_DRJ);
                    linea_DRJ = br.readLine(); 
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
        }
      } else {
            System.out.println("carpeta vacia");
        }
     
    }
 
    public static void modificarArchivo_DRJ(String rutaCarpeta_DRJ, String separador_DRJ) throws IOException {
    String[] archivos_DRJ = listaArchivos_DRJ(rutaCarpeta_DRJ, separador_DRJ);
    int numArchivo_DRJ = pideValorMinMax_DRJ(1, archivos_DRJ.length);
    String nombreArchivo_DRJ = archivos_DRJ[numArchivo_DRJ-1];
    String rutaArchivo_DRJ = rutaCarpeta_DRJ + separador_DRJ + nombreArchivo_DRJ;
    System.out.println("Introduce el nuevo contenido para el archivo " + nombreArchivo_DRJ + ":");
    BufferedReader reader_DRJ = new BufferedReader(new InputStreamReader(System.in));
    String nuevoContenido_DRJ = reader_DRJ.readLine();
    FileWriter fw = new FileWriter(rutaArchivo_DRJ);
    BufferedWriter bw = new BufferedWriter (fw);
    bw.write(nuevoContenido_DRJ);
    bw.flush();
    bw.close();
    System.out.println("El archivo " + nombreArchivo_DRJ + " ha sido modificado exitosamente.");
}

public static void borrarArchivo_DRJ(String rutaCarpeta_DRJ, String separador_DRJ) throws IOException {
    String[] archivos_DRJ = listaArchivos_DRJ(rutaCarpeta_DRJ, separador_DRJ);
    if (archivos_DRJ.length == 0) {
        System.out.println("No hay archivos disponibles para borrar.");
        return;
    }
    System.out.println("Elige el archivo que quieres borrar (introduce el número):");
    int archivoSeleccionado = pideValorMinMax_DRJ(1, archivos_DRJ.length);
    String archivoABorrar_DRJ = archivos_DRJ[archivoSeleccionado - 1];
    System.out.println("¿Estás seguro que quieres borrar el archivo " + archivoABorrar_DRJ + "? (S/N)");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String respuesta_DRJ = br.readLine();
    if (!respuesta_DRJ.equalsIgnoreCase("S")) {
        System.out.println("Operación cancelada.");
        return;
    }
    File archivo_DRJ = new File(rutaCarpeta_DRJ + separador_DRJ + archivoABorrar_DRJ);
    if (archivo_DRJ.delete()) {
        System.out.println("El archivo " + archivoABorrar_DRJ + " ha sido eliminado con éxito.");
    } else {
        System.out.println("Error al eliminar el archivo " + archivoABorrar_DRJ + ".");
    }
}

    
public static void renombrarArchivo_DRJ(String rutaCarpeta_DRJ, String separador_DRJ) throws IOException {
    String[] archivos_DRJ = listaArchivos_DRJ(rutaCarpeta_DRJ, separador_DRJ);
    int numArchivo_DRJ = pideValorMinMax_DRJ(1, archivos_DRJ.length);
    File archivoAnterior_DRJ = new File(rutaCarpeta_DRJ + separador_DRJ + archivos_DRJ[numArchivo_DRJ-1]);
    System.out.println("Introduce el nuevo nombre para el archivo:");
    String nuevoNombre_DRJ = pideCadena_DRJ();
    File archivoNuevo_DRJ = new File(rutaCarpeta_DRJ + separador_DRJ + nuevoNombre_DRJ);
    if (archivoNuevo_DRJ.exists()) {
        System.out.println("NOMBRE NO VÁLIDO");
        renombrarArchivo_DRJ(rutaCarpeta_DRJ, separador_DRJ);
    } else {
        archivoAnterior_DRJ.renameTo(archivoNuevo_DRJ);
        System.out.println("El archivo se ha renombrado correctamente.");
        listaArchivos_DRJ(rutaCarpeta_DRJ, separador_DRJ);
    }
}
    public static String pideCadena_DRJ()  throws IOException {{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String cadena_DRJ = br.readLine();
    return cadena_DRJ;
}

}
}
