/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas;
        double altura, sumaB, sumaG, promedioB, promedioG, contB, contG;
        sumaB =0;
        sumaG = 0;
        contB = 0;
        contG = 0;
        
        
        System.out.println("Ingrese la cantidad de personas:");
        personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("altura de la persona n°: " + (i+1));
            altura = leer.nextInt();
            if (altura < 160) {
                sumaB += altura;
                contB +=1;
            }
            sumaG += altura;
            contG +=1;
            
        }
        promedioB = sumaB /contB;
        promedioG = sumaG / contG;
        System.out.println("El promedio de estaturas menores a 160 es: " + promedioB);
        System.out.println("El promedio de estaturas general es: " + promedioG);
        
    }
    
}
