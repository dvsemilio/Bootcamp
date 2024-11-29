/*Ejercicio 7: Funciones
Escribe una función que tome dos números enteros como parámetros (no se le
pregunta al usuario) y devuelva su suma. Llama a esta función desde el método
main y muestra el resultado. Llama a la clase Funciones . */

public class Funciones {
    public static void main(String[] args) {
        // Llama a la función suma y muestra el resultado
        Funciones fun = new Funciones();
        System.out.println(fun.suma(12,14));
        }
        // Define la función suma
        public int suma(int numero1, int numero2) {
            return numero1 + numero2;
        }
}
