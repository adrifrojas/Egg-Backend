/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos, dias, horas;
        System.out.println("Ingrese un tiempo en minutos:");
        minutos = leer.nextInt();
        horas = minutos / 60;
        dias = 0;
        
     
        if (horas >= 24) {
            dias++;
            horas = horas - 24;
            System.out.println("Son " + dias + " dias y " + horas + " horas");
        }else{
            System.out.println("Son " + horas + "horas");
        }
    }
}
