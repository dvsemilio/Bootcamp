public class Empleado extends Persona implements Imprimible {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Salario: " + salario);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo detalles del empleado:");
        mostrarDetalles();
    }
}
