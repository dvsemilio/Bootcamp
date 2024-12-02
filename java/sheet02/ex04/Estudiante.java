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

    // Sobreescribir el método mostrarDetalles para incluir el grado
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de la clase padre
        System.out.println("Grado: " + grado);
    }
}
