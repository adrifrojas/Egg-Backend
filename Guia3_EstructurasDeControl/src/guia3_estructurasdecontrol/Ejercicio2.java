/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.next();
        if (frase.equalsIgnoreCase("Eureka")) {
            System.out.println("Correcto!!!");
        }else{
            System.out.println("Incorrecto!!!");
        }
    }
}
