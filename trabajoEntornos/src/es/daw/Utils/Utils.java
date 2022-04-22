/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.daw.Utils;

import static es.daw.Entornos.numeroNotas;
import static es.daw.Entornos.sc;

/**
 *
 * @author lrand
 */
public class Utils {
        public static double[] introducirNotas(int numNotas) {
        double[] copiaNotas = new double[numNotas];
        //bucle para pedir al usuario tantas nota como haya indicado
        for (int i=0; i < numeroNotas; i++){
            
            boolean notaIncorrecta = true;
            
            do{
                System.out.println("Introduce la nota ("+(i+1)+"): ");
                
                double nota = sc.nextDouble();
                
                //comprobando que la nota va entre 0 y 10
                if (nota < 0 || nota > 10)
                    System.out.println("Has introducido una nota incorrecta. Debe ser entre 0 y 10 (incluidos)");
                else{
                    copiaNotas[i] = nota;
                    notaIncorrecta = false;
                }
            }while(notaIncorrecta);
            
        }
        return copiaNotas;
    }
        
         /**
     * calcularMedia
     * @param notas
     * @return 
     */
    public static double calcularMedia(double[] notas){
        
        double suma = 0; //variable que almacena el sumatorio de todas las notas
        double media = 0; //variable que almacena la nota media
        
        for(int i=0; i< notas.length; i++){
            //suma += notas[i];
            suma = suma + notas[i];
        }
        
        media = suma / notas.length;
        
        return media;
    }
    


}
