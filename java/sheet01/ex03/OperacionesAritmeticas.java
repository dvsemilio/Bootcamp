/*Ejercicio 3: Operaciones Aritméticas
Escribe un programa que tome dos números enteros como entrada (solicitando
esos números al usuario), realice operaciones aritméticas básicas (suma, resta,
multiplicación y división) y muestre los resultados. Quizás debas importar el
paquete de java.util.Scanner . Llama a la clase OperacionesAritmeticas . */
import java.util.Scanner;
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double numeroUno = entrada.nextDouble();
        System.out.println("Introduce el segundo número");
        double numeroDos = entrada.nextDouble();
        System.out.println("la suma es: "+(numeroUno+numeroDos));
        System.out.println("la resta es: "+(numeroUno+numeroDos));
        System.out.println("la multiplicación es: "+(numeroUno*numeroDos));
        if (numeroUno == 0 || numeroDos == 0) {
            System.out.println("no se puede dividir por 0");
        } else {
            System.out.println("la división es: "+(numeroUno/numeroDos));
        }
    }
}
