package multiplicacion;

/**
 *
 * @author Lic
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MultiplicaMatrices {

    public static void main(String args[]) {

        Random r = new Random();
        Scanner in = new Scanner(System.in);
        escribirArchivo escribe = new escribirArchivo();
        //se instancia la calse que lee el archivo de propiedades
        leerPropiedades propiedades = new leerPropiedades();
        System.out.println("ingrese numero de filas de la primera matriz");

        //int x1=in.nextInt();
        System.out.println(propiedades.getValor("filaA"));
        int x1 = Integer.parseInt(propiedades.getValor("filaA"));
        int z1 = Integer.parseInt(propiedades.getValor("columnaA"));
        int x2 = Integer.parseInt(propiedades.getValor("filaB"));
        int z2 = Integer.parseInt(propiedades.getValor("columnaB"));

        int[][] m1 = new int[x1][z1];
        System.out.println("tamanio La matriz 1   " + x1 + " X " + z1);
        int[][] m2 = new int[x2][z2];
        System.out.println("tamanio La matriz 2 " + x2 + " X " + z2);

        ArrayList<String> mR = new ArrayList<String>();
        System.out.println("tamanio La matriz resultante " + x1 + " X " + z2);

        System.out.println("La matriz 1 ");
        escribe.escribir("La matriz 1" + "\n");
        for (int i = 0; i < x1; i++) {
            System.out.print("[ ");
            escribe.escribir("[ ");
            for (int j = 0; j < z1; j++) {
                m1[i][j] = r.nextInt(9);
                System.out.print(m1[i][j] + " ");
                escribe.escribir(m1[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
            escribe.escribir("]" + "\n");
        }
        System.out.println("La matriz 2");
        escribe.escribir("La matriz 2" + "\n");
        for (int i = 0; i < x2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < z2; j++) {
                m2[i][j] = r.nextInt(9);
                System.out.print(m2[i][j] + " ");
                escribe.escribir(m2[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
            escribe.escribir("]" + "\n");
        }

        System.out.println("La matriz resultante es: ");
        escribe.escribir("La matriz resultante es: " + "\n");

        int gg = 0;

        for (int pp = 0; pp < x1; pp++) {
            int ll = 0;

            for (int j = 0; j < z1; j++) {
                escribe.escribir("[ " );
                for (int h = 0; h < z2; h++) {
                    for (int zz = 0; zz < z2; zz++) {
                        mR.add(String.valueOf(m1[pp][j] * m2[h][zz]));
                        escribe.escribir(m1[pp][j] * m2[h][zz] + " | ");
                    }
                }
                escribe.escribir("]" + "\n");
            }

            // Declaramos el Iterador e imprimimos los Elementos del ArrayList
            Iterator<String> nombreIterator = mR.iterator();
            System.out.print("[ ");
//            escribe.escribir("[ " + "\n");
            while (nombreIterator.hasNext()) {
                String elemento = nombreIterator.next();
                System.out.print(elemento + " | ");
//                escribe.escribir(elemento + " | ");
            }
            System.out.println("]");
//            escribe.escribir("]");
        }
    }

}
