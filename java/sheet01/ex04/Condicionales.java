/*Ejercicio 4: Condicionales
Escribe un programa que tome un número entero como entrada (solicitado al
usuario) y determine si es positivo, negativo o cero. Llama a la clase
Condicionales . */

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nùmero ENTERO, listillo");
        if (entrada.hasNextInt()) {
            int numero = entrada.nextInt();
            
            if (numero > 0) {
                System.out.println("el número es positivo");
            } else if (numero < 0) {
                System.out.println("el número es negativo");
            } else{
                System.out.println("el número es 0");
            }
        } else {
            System.out.println("te dije un NUMERO ENTERO....PENDEJO");
        }
    }
}
