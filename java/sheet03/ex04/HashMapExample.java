import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Crear un mapa que asocie nombres de personas con su edad
        HashMap<String, Integer> mapa = new HashMap<>();

        // Añadir algunos elementos al mapa
        mapa.put("Juan", 30);
        mapa.put("Ana", 25);
        mapa.put("Luis", 35);

        // Imprimir todas las entradas del mapa
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            // Obtener el nombre (clave) y la edad (valor) de la entrada actual
            String nombre = entrada.getKey();
            int edad = entrada.getValue();

            // Imprimir el nombre y la edad en el formato solicitado
            System.out.println(nombre + " tiene " + edad + " años.");
        }
    }
}
