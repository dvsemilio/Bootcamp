/*ex03. LinkedList
Crea una lista enlazada de cadenas, añade algunos elementos (Hola, Mundo y
Java) y recórrela para imprimir cada elemento.
Hola
Mundo
Java */

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Crear una lista enlazada de cadenas usando LinkedList
        /*LinkedList es una estructura de datos que permite el almacenamiento dinámico de elementos.
Esta línea declara y crea una nueva instancia de LinkedList que contendrá elementos del tipo String. */
        LinkedList<String> lista = new LinkedList<>();
        // Aquí estamos declarando y creando una nueva instancia de LinkedList que contendrá elementos del tipo String.
        // Añadir algunos elementos a la lista
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        // Usamos el método add() para agregar elementos a la lista. En este caso, añadimos las cadenas "Hola", "Mundo" y "Java" a la lista enlazada.
        // Recorrer la lista e imprimir cada elemento
        // Bucle for-each: Recorre cada elemento de la lista 'lista' y asigna el valor actual a la variable 'cadena'
        for (String cadena : lista) {
            // Este bucle for-each recorre cada elemento en la lista 'lista'.
            // En cada iteración, el valor del elemento actual se asigna a la variable 'cadena'.
            // Imprimir el valor del elemento actual (cadena)
            System.out.println(cadena);
            // Imprimimos el valor del elemento actual usando System.out.println.
        }
    }
}
