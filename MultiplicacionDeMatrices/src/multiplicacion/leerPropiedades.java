/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

/**
 *
 * @author Lic Miguel Veces
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class leerPropiedades {

    protected static Properties propiedades;

    public static String getValor(String llave) {
        if (propiedades == null) {
            propiedades = new Properties();
            try {
                System.out.println("Path;" + new File("configuracion.properties").getAbsolutePath());
                propiedades.load(new FileInputStream(new File("configuracion.properties").getAbsolutePath()));
            } catch (FileNotFoundException e) {
                System.out.println("Error el archivo de configuracion (configuracion.properties) no existe. " + e);
            } catch (IOException e) {
                System.out.println("Error al intentar leer el archivo de configuracion (configuracion.properties) no existe." + e);
            }
        }

        return propiedades.getProperty(llave);
    }
    
    public static void main(String[] args) {

        leerPropiedades prop = new leerPropiedades();
        String valor = prop.getValor("fila");
        System.out.println(valor);
    }

//    public static void main(String[] args) {
//
//        Properties propiedades = new Properties();
//        InputStream entrada = null;
//
//        try {
//
//            entrada = new FileInputStream("configuracion.properties");
//
//            // cargamos el archivo de propiedades
//            propiedades.load(entrada);
//
//            // obtenemos las propiedades y las imprimimos
//            System.out.println(propiedades.getProperty("basedatos"));
//            System.out.println(propiedades.getProperty("usuario"));
//            System.out.println(propiedades.getProperty("clave"));
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (entrada != null) {
//                try {
//                    entrada.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
}
