/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

/**
 *
 * @author Lic
 */
public class main {

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < 100; i++) {
            java.util.Random random = new java.util.Random();
            int r = random.nextInt(10);
            s1 += r;
        }
        System.out.println(s1 + " " + s1.length());

        for (int i = 0; i < 100; i++) {
            java.util.Random random = new java.util.Random();
            int r = random.nextInt(10);
            s2 += r;
        }
        System.out.println(s2 + " " + s2.length());

        java.math.BigInteger i1 = new java.math.BigInteger(s1);
        java.math.BigInteger i2 = new java.math.BigInteger(s2);

        java.math.BigInteger i4 = i1.multiply(i2);

        System.out.println(i4.toString().length() + " " + i4.toString());
    }
}
