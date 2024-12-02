public class Main {
    public static void main(String[] args) {
        // Crear una lista de personas que incluye estudiantes y empleados
        Persona[] personas = {
            new Estudiante("Ana", 20, "Ingeniería"),
            new Empleado("Luis", 30, 50000),
            new Persona("Marta", 40)
        };

        // Recorrer el array para mostrar los detalles de los objetos usando polimorfismo e interfaces
        for (Persona persona : personas) {
            // Verifica si el objeto actual es una instancia de Imprimible usando instanceof
            if (persona instanceof Imprimible) {
                // Si lo es, llama al método imprimir para mostrar los detalles específicos
                ((Imprimible) persona).imprimir();
            } else {
                // Si no, usa el método mostrarDetalles de la clase Persona
                persona.mostrarDetalles();
            }
            System.out.println(); // Salto de línea para separar los detalles de cada persona
        }
    }
}
