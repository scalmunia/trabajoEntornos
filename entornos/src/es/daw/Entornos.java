
package es.daw;

import static es.daw.Utils.Utils.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Programa para introducir notas y calculo de nota media 
 * @author Andrea Sara y Verónica
 * @version 1.0
 * @since 04/04/2022
 * 
 */
public class Entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] notas = null; //este es el array de doubles donde se va a guardar las notas. Todavía no sé cuantas notas va a introducir el usuario

        System.out.println("¿Cuántas notas quieres introducir?");
        numeroNotas = sc.nextInt();

        // inicializo el array
        notas = introducirNotas(numeroNotas);

        double media = 0;

        media = calcularMedia(notas);

        System.out.println("La nota media obtenida es: " + media);

        // ---------- DIFERENTES FORMAS DE "FORMATEAR" UN DECIMAL ---------------------
        // REDONDEO, TRUNCAR...
        //Formateando a dos decimales
        DecimalFormat df = new DecimalFormat("0.00");
        //df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("La nota media con dos decimales: " + df.format(media));

        //Redondeando al entero más próximo
        System.out.println("La nota media redondeada al entero más próximo es: " + Math.round(media));

        //Quedándonos con el entero (sin redondear)
        //int mediaEntera = (int)media;
        int mediaEntera = (int) media;

        System.out.println("La nota media entera obtenida es:" + mediaEntera);
        // ------------------------------------------

        // Cargar en un array de String los textos de las calificaciones
        String[] calificaciones = new String[10];
        //calificaciones = inicializaStringTextos(calificaciones);
        inicializaStringTextos(calificaciones);

        System.out.println("Mensaje del profesor: " + calificaciones[mediaEntera - 1]);

    }

    public static void inicializaStringTextos(String[] calificaciones) {
        //public static String[] inicializaStringTextos(String[] calificaciones){
        calificaciones[0] = "Debes estudiar mucho mucho más";
        calificaciones[1] = "Debes estudiar mucho más";
        calificaciones[2] = "Debes practicar";
        calificaciones[3] = "Casi apruebas";
        calificaciones[4] = "Aprobado";
        calificaciones[5] = "Bien";
        calificaciones[6] = "Muy bien";
        calificaciones[7] = "Notable";
        calificaciones[8] = "Sobresaliente";
        calificaciones[9] = "Perfecto";

        //return calificaciones;
    }

    public static final Scanner sc = new Scanner(System.in);
    public static int numeroNotas;

}
