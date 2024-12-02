/*Ejercicio 1: Clase y Objeto
Crea una clase Persona con los atributos nombre y edad (modificador default) y
con un constructor para inicializar estos atributos. Añade un método
mostrarDetalles para mostrar los detalles de la persona. Luego, crea un objeto
de la clase llamando al constructor con nombre Juan y edad 25 en el main y
muestra sus detalles llamando al método mostrarDetalles.
Nombre: Juan
Edad: 25 */
public class Persona {
    String nombre; // Atributo nombre con modificador default
    int edad;      // Atributo edad con modificador default

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
