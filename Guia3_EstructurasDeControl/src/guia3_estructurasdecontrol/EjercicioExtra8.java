/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,total,par, impar;
        par =0;
        impar =0;
        total =0;
        do {
            System.out.println("Ingrese un numero");
            n = leer.nextInt();
            if (n%2==0) {
                par ++;
            }else{
                impar ++;
            }
            total +=1;
        } while (n % 5 !=0 );
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
        System.out.println("Total de numeros ingresados: " + total);
    }
    
}
