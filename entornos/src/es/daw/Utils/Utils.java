
package es.daw.Utils;

import static es.daw.Entornos.numeroNotas;
import static es.daw.Entornos.sc;

/**
 *Programa para introducir notas y calculo de nota media 
 * @author Andrea Sara y Verónica
 * @version 1.0
 * @since 04/04/2022
 * 
 */
public class Utils {
    /**
     * Metodo para introducir las notas de los alumnos
     * @param numNotas
     * @return un array de notas
     */
    public static double[] introducirNotas(int numNotas) {
        double[] copiaNotas = new double[numNotas];
        //bucle para pedir al usuario tantas nota como haya indicado
        for (int i = 0; i < numeroNotas; i++) {

            boolean notaIncorrecta = true;

            do {
                System.out.println("Introduce la nota (" + (i + 1) + "): ");

                double nota = sc.nextDouble();

                //comprobando que la nota va entre 0 y 10
                if (nota < 0 || nota > 10) {
                    System.out.println("Has introducido una nota incorrecta. Debe ser entre 0 y 10 (incluidos)");
                } else {
                    copiaNotas[i] = nota;
                    notaIncorrecta = false;
                }
            } while (notaIncorrecta);

        }
        return copiaNotas;
    }

    /**
     * Metodo para calcular la nota media
     *
     * @param notas
     * @return la nota media
     */
    public static double calcularMedia(double[] notas) {

        double suma = 0; //variable que almacena el sumatorio de todas las notas
        double media = 0; //variable que almacena la nota media

        for (int i = 0; i < notas.length; i++) {
            //suma += notas[i];
            suma = suma + notas[i];
        }

        media = suma / notas.length;

        return media;
    }

}
