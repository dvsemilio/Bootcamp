/*Ejercicio 3: Herencia
Ejercicio: Crea una clase Estudiante que herede de Persona y añade un atributo
grado de tipo texto. Incluye un método para mostrar los detalles del estudiante,
incluyendo los detalles de la persona. La clase estudiante tendrá que tener un
constructor que llame al del padre. Al igual que una sobreescritura del método
mostrarDetalles.
Crea un Estudiante con nombre Ana de edad 20 y grado Ingeniería y muestra
los detalles del mismo.

Ejercicios de Java - Programación Orientada a Objetos (sheet02) 2
Consejo: Investiga sobre el uso de la palabra reservada super . */
public class Estudiante extends Persona {
    private String grado;

    // Constructor que llama al constructor de la clase padre
    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    // Método getter y setter para el grado
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    // Sobreescribir el método mostrarDetalles para incluir los detalles del estudiante
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de la clase padre
        System.out.println("Grado: " + grado);
    }
}
