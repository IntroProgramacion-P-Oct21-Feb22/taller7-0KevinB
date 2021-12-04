/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        int contador = 1;
        double estatura;
        boolean bandera = true;
        String cadena = "";
        do {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            cadena = String.format("%s%s. %s, %s, edad: %s, estatura: %s\n"
                     ,cadena, contador,  nombre, posicion, edad, estatura);
            contador = contador + 1;
            System.out.println("Ingrese -111 para terminar");
            int salida = entrada.nextInt();
            entrada.nextLine();
            if (salida == -111) {
                bandera = false;
            }
        } while (bandera);
        System.out.printf("%s\n", cadena);
    }

}
