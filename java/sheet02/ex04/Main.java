public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
            new Estudiante("Ana", 20, "Ingeniería"),
            new Empleado("Luis", 30, 50000),
            new Persona("Marta", 40)
        };

        for (Persona persona : personas) {
            persona.mostrarDetalles();
            System.out.println(); // Salto de línea para separar los detalles de cada persona
        }
/*Sintaxis: for (Tipo variable : array/colección)
 Este es un bucle for mejorado (también conocido como "for-each") 
 en Java, que se usa para iterar sobre arrays o colecciones
  sin necesidad de manejar explícitamente índices.
Funcionalidad: Este bucle recorre cada elemento 
del array personas y asigna el valor actual a la 
variable persona en cada iteración.
En cada iteración, se llama al método mostrarDetalles()
 del objeto persona.
Este método imprime los detalles del objeto persona 
actual, ya sea un Estudiante, Empleado o simplemente 
una Persona.
Este bucle es un excelente ejemplo de cómo utilizar 
el polimorfismo en Java para manejar diferentes 
tipos de objetos en una colección de manera uniforme,
 y cómo mejorar la legibilidad de la salida con un 
 salto de línea entre cada conjunto de detalles.
*/   }
}
