/*
Crear un programa que dado un número determine si es par o impar.
*/
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
