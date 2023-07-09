/*Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2, mul, respuesta, aux;
        n1 = (int) (Math.random()*9);
        n2 = (int) (Math.random()*9);
        mul = n1 * n2;
        aux = 0;
        do {
            System.out.println("Adivine el resultado, Ingrese un numero: ");
            respuesta = leer.nextInt();
            if (respuesta == mul) {
                System.out.println("Adivinaste!!!");
            }else{
                if (respuesta != mul && aux < 2) {
                    System.out.println("vuelve a intentarlo!");
                }
            }
            aux ++;
        } while ( aux<=2 || respuesta == mul);
        
        if (respuesta != mul && aux>2) {
            System.out.println("Fallaste!!! el numero era: " + mul);
            System.out.println(n1 + "y" + n2);
        }
    }
}
