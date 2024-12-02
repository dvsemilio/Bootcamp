public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 25);

        // Mostrar los detalles iniciales
        persona.mostrarDetalles();

        // Usar los métodos setter para modificar el nombre y la edad
        persona.setNombre("Carlos");
        persona.setEdad(30);

        // Obtener y mostrar los valores modificados
        System.out.println("Nombre modificado: " + persona.getNombre());
        System.out.println("Edad modificada: " + persona.getEdad());
        // Se puede usar mostrarDetalles() otra vez
    }
}
