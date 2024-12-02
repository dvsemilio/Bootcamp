public class Main {
    public static void main(String[] args) {
        // Crear una lista de animales que incluye perros y gatos
        Animal[] animales = {
            new Perro(),
            new Gato()
        };

        // Recorrer el array para mostrar los sonidos de los animales
        for (Animal animal : animales) {
            // Bucle for-each: Recorre cada elemento del array 'animales' y asigna el valor actual a la variable 'animal'
            // Este bucle 'for-each' se utiliza para iterar sobre cada elemento en el array 'animales'. Cada elemento del array se asigna a la variable 'animal' en cada iteración.
            // Llama al método hacerSonido() del objeto actual 'animal'
            animal.hacerSonido();
            // Gracias al polimorfismo, el método hacerSonido() que se llama es la versión específica de la clase del objeto actual ('Perro' o 'Gato'). Este método imprime el sonido correspondiente a cada animal.
        }
    }
}
