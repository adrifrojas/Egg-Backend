/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, numLimite, suma;
        suma = 0;
        System.out.println("Ingrese un numero limite positivo:");
        numLimite = leer.nextInt();
        
        while (numLimite >= suma){
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma += num;
        }
        System.out.println("Excedio el numero");
    }
}
