/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos, edad, totalHijos, totalEdad;
        totalHijos = 0;
        totalEdad = 0 ;
        
        System.out.println("Ingrese la cantidad de familias: ");
        familias = leer.nextInt();
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia n°" + (i+1));
            hijos = leer.nextInt();
            
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo n°" + (j+1));
                edad = leer.nextInt();
                totalEdad += edad;
            }
            totalHijos += hijos;
        }
        System.out.println("La edad media de los hijos de las familias es: " + (totalEdad / totalHijos));
    }
    
}
