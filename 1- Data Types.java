/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad01;

/**
 *
 * @author Dami
 */
public class Ejercicio02 {
     public static void main(String[] args){
         /*2.1.	Para cada uno de  los tipos de dato simple añade dentro de 
        la función main de Ejercicio02  un comentario indicando el tipo de dato.
        Además  para cada tipo de dato simple declara una variable de ese tipo, 
        le asignas un valor corrrecto cualquiera, y  debes mostrar un mensaje 
        donde se explique las características del tipo de dato y se muestre el 
        valor de la variable. */
         
        //boolean: 1 byte. Almacena valores true/false.
        boolean I_DRJ=true;
        System.out.println("boolean: 1 byte. Almacena valores true/false. Ejemplo:"+I_DRJ);
        
        //byte: 1 byte. Almacena un valor entero entre -128 y 127.
        byte II_DRJ=126;
        System.out.println("byte: 1 byte. Almacena un valor entero entre -128 y 127. Ejemplo:"+II_DRJ);
        
        //char: 2bytes. Carácter Unicode de 16 bits.
        char III_DRJ;
        char a = 12;
        III_DRJ=a;
        System.out.println("char: 2bytes. Carácter Unicode de 16 bits. Ejemplo:"+III_DRJ);
        
        //short: 2bytes. Almacena un valor entero entre -32768 y +32767.
        short IV_DRJ=32766;
        System.out.println("short: 2bytes. Almacena un valor entero entre -32768 y +32767. Ejemplo:"+IV_DRJ); 
        
        //int: 4bytes. Almacena un valor entero entre -2.147.483.648 y 2.147.483.647.
        int V_DRJ=2000000;
        System.out.println("int: 4bytes. Almacena un valor entero entre -2.147.483.648 y 2.147.483.647. Ejemplo"+V_DRJ);
        
        //long: 8bytes. Almacena un valor entero entre -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807.
        long VI_DRJ=2000000000;
        System.out.println("long: 8bytes. Almacena un valor entero entre -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807. Ejemplo"+VI_DRJ);
        
        //float: 4bytes. Almacena valores decimales con precision de 7 digitos.
        float VII_DRJ=1.455648798F;
        System.out.println("float: 4bytes. Almacena valores decimales con precision de 7 digitos. Ejemplo"+VII_DRJ);
        
        //double: 8 bytes. Almacena valores decimales con precision de 16 digitos.
        double IX_DRJ=1.45321564885545652145632547;
        System.out.println("double: 8 bytes. Almacena valores decimales con precision de 16 digitos. Ejemplo:"+IX_DRJ);
        
        /* 2.2.	Dentro de la clase de nombre Ejercicio02, añade un ejemplo 
        utilizando  cada uno de los operadores aritméticos,  cada uno de los 
        operadores  relacionales, cada uno de los operadores lógicos, cada uno 
        de los operadores unitarios y cada uno de los operadores de asignación. 
        Indicando con un comentario y con un mensaje por consola cual será el 
        resultado de cada uno de ellos. */
        
        //declaracion de variables iniciales
        int num_1DRJ=1, num_2DRJ=2;
        
        //operadores aritmeticos binarios
        System.out.println("el resultado de" + num_1DRJ + "+" + num_2DRJ + "es ="+ (num_1DRJ + num_2DRJ));
        System.out.println("el resultado de" + num_1DRJ + "-" + num_2DRJ + "es ="+ (num_1DRJ - num_2DRJ));
        System.out.println("el resultado de" + num_1DRJ + "*" + num_2DRJ + "es ="+ (num_1DRJ * num_2DRJ));
        System.out.println("el resultado de" + num_1DRJ + "/" + num_2DRJ + "es ="+ (num_1DRJ / num_2DRJ));
        System.out.println("el resto de" + num_1DRJ + "%" + num_2DRJ + "es ="+ (num_1DRJ - num_2DRJ));
        
        //operadores aritmeticos unarios
        System.out.println("postincremento++ de " + num_1DRJ + " es =" + (num_1DRJ++));
        System.out.println("++preincremento de " + num_1DRJ + " es =" + (++num_1DRJ));
        System.out.println("--predecremento de " + num_1DRJ + " es =" + (--num_1DRJ));
        System.out.println("postdecremento-- de " + num_1DRJ + " es =" + (num_1DRJ--));
        System.out.println("incremento de " + num_1DRJ + " es =" + (+num_1DRJ));
        System.out.println("decremento de " + num_1DRJ + " es =" + (-num_1DRJ));
        
         //operadores aritmeticos de asignacion
         int num_3DRJ = 3;
         System.out.println("se le asigna el valor de 5 a la variable inicializada en 3, dando por resultado " +(num_3DRJ+=5));
         System.out.println("se le rehusa el valor de 5 a la variable inicializada en definida en 8, dando por resultado " +(num_3DRJ-=5));
         System.out.println("se le multiplica el valor de 5 a la variable inicializada en definida en 3, dando por resultado " +(num_3DRJ*=5));
         System.out.println("se le divide el valor de 5 a la variable inicializada en definida en 15, dando por resultado " +(num_3DRJ/=5));
         System.out.println("se asigna el resto de 3 a la variable inicializada en definida en 3, dando por resultado " +(num_3DRJ%=3));
         
         //operadores relacionales
        System.out.println(num_1DRJ + " == " + num_2DRJ + (num_1DRJ==num_2DRJ));
        System.out.println(num_1DRJ + " != " + num_2DRJ + (num_1DRJ!=num_2DRJ));  
        System.out.println(num_1DRJ + " < " + num_2DRJ + (num_1DRJ<num_2DRJ));
        System.out.println(num_1DRJ + " > " + num_2DRJ + (num_1DRJ>num_2DRJ));
        System.out.println(num_1DRJ + " <= " + num_2DRJ + (num_1DRJ<=num_2DRJ));
        System.out.println(num_1DRJ + " >= " + num_2DRJ + (num_1DRJ>=num_2DRJ));
        
        //operadores logicos
        System.out.println("true && true es " + (true&&true));
        System.out.println("true && false es " + (true&&false));
        System.out.println("false && true es " + (false&&true));
        System.out.println("false && false es " + (false&&false));
        System.out.println("true || true es " + (true||true));
        System.out.println("true || false es " + (true||false));
        System.out.println("false || true es " + (false||true));
        System.out.println("false || false es " + (false||false));
        System.out.println("si ! es verdadero, es " + (!true));
        System.out.println("si ! es falso, es " + (!false));
     }
}
