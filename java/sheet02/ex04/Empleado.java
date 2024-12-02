/*Ejercicio 4: Polimorfismo
Ejercicio: Crea una clase Empleado que herede de Persona y sobrescribe el
método mostrarDetalles para incluir el salario . Usa el polimorfismo para mostrar
los detalles de una lista de personas que incluye estudiantes y empleados.
Investigación: ¿Existe algo llamado @Override ? De existir, intenta usarlo en tu
código.
public class Main {
public static void main(String[] args) {
Persona[] personas = {
new Estudiante("Ana", 20, "Ingeniería"),
new Empleado("Luis", 30, 50000),
new Persona("Marta", 40)
};
// Recorre el array para mostrar los detalles de lo
s objetos y hacer uso del polimorfismo
}
} */
public class Empleado extends Persona {
    private double salario;

    // Constructor que llama al constructor de la clase padre
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    // Método getter y setter para el salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobreescribir el método mostrarDetalles para incluir el salario
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de la clase padre
        System.out.println("Salario: " + salario);
    }
}
