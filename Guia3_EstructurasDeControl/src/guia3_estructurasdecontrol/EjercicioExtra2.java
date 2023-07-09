/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d,aux;
        System.out.println("Ingrese el valor de A:");
        a = leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        b = leer.nextInt();
        System.out.println("Ingrese el valor de C:");
        c = leer.nextInt();
        System.out.println("Ingrese el valor de D:");
        d = leer.nextInt();
        
        System.out.println("A:"+ a + " B:"+b + " C:"+c +" D:"+d);
        aux=b; b=c; c=d; d=aux; aux=a; a=c; c=aux;
        System.out.println("A:"+ a + " B:"+b + " C:"+c +" D:"+d);
    }
    
}
