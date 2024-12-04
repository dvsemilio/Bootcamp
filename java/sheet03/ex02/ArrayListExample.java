/*ex02. ArrayList
Crea una lista de enteros usando ArrayList , añade algunos elementos; por
ejemplo, 10, 20 y 30 y calcula la suma de todos los números recorriendo la
lista.
La suma es: 60 */

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Crear una lista de enteros usando ArrayList
        ArrayList<Integer> lista = new ArrayList<>();

        // Añadir algunos elementos a la lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
/*explicación de porqué me pone una 'e'
 * java.​util.​ArrayList

public boolean add(E e)
Appends the specified element to the end of this list.

Parameters:

e - element to be appended to this list
Returns: true (as specified by Collection.add)

boolean java.util.ArrayList.add(Integer e)
Appends the specified element to the end of this list.

Specified by: add(...) in List, Overrides: add(...) in AbstractList

Parameters:

e element to be appended to this list
Returns:

true (as specified by Collection.add)
 */
        // Calcular la suma de todos los números recorriendo la lista
        int suma = 0;
        // Bucle for-each: Recorre cada elemento de la lista 'lista' y asigna el valor actual a la variable 'numero'
        for (int numero : lista) {
            // Suma el valor del elemento actual (numero) a la variable 'suma'
            suma += numero;
        }

        // Imprimir la suma de los números
        System.out.println("La suma es: " + suma);
    }
}
