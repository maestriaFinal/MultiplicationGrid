/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

/**
 *
 * @author maveces
 */
/*Clase que permite escribir en un archivo de texto*/
//Importamos clases que se usaran
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escribirArchivo {

    public static void main(String[] args) {

        //Un texto cualquiera guardado en una variable
        String saludo = "Hola";

        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("Multiplicacion_Matrices.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);

            //Escribimos en el archivo con el metodo write 
            escribir.write(saludo);

            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

    public void escribir(String linea) {

        //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
        File archivo = new File("Multiplicacion_Matrices.txt");
//        if (archivo.exists()) {
//            System.out.println("El fichero Multiplicacion_Matrices.txt ya existe");
//        } else {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("Multiplicacion_Matrices.txt", true));

                bw.write(linea);

                // Hay que cerrar el fichero
                bw.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

//        }
    }
}
