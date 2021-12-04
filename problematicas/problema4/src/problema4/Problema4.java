/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author Usuario iTC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int denominador = 1;
        int denominador2 = 3;
        String signo;
        String cadena = "";

        while (denominador <= limite) {
            // Generar 
            // 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 

            signo = "-";
            if (denominador == 5 || denominador == 9 || denominador == 13) {
                signo = "+";
            }

            cadena = String.format("%s%s %d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);
            denominador = denominador + 2;

        }

        cadena = cadena.substring(1);
        cadena = cadena.substring(3);
        System.out.println(cadena);

    }

}
