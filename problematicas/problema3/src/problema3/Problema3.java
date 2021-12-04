/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Generar e imprimir la siguiente serie:
        2 5 10 17 26 37
         */

        int contador = 1;
        int numero = 2;
        int suma = 0;
        String cadena = "";
        int limite = 37;
        do{ 

            numero = (suma + numero);
            cadena = String.format("%s%s ", cadena, numero);
            contador = contador + 2;
            suma = contador;
    } while (numero < limite);       
        System.out.printf("%s\n", cadena);
    }

}
