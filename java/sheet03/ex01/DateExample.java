/*ex01. Manejo de Fechas (Date)
Crea una aplicación que muestre la fecha actual en varios formatos. Llama al
archivo DateExample.java y para formatear las fechas usa SimpleDateFormat .
Formato 1: 16/07/2024
Formato 2: 2024-07-16 09:09:04
Formato 3: mar, jul 16 2024 */

import java.text.SimpleDateFormat;
import java.util.Date;
//Date representa una fecha y hora específica.

public class DateExample {
    public static void main(String[] args) {
        // Crear un objeto Date que contiene la fecha y hora actual
        Date fechaActual = new Date();

        // Formato 1: 16/07/2024
        // Definir el formato "dd/MM/yyyy" para obtener una fecha en el formato "16/07/2024"
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        // Formatear la fecha actual según el formato definido
        String fechaFormateada1 = formato1.format(fechaActual);
        // Imprimir la fecha formateada en el primer formato
        System.out.println("Formato 1: " + fechaFormateada1);

        // Formato 2: 2024-07-16 09:09:04
        // Definir el formato "yyyy-MM-dd HH:mm:ss" para obtener una fecha y hora en el formato "2024-07-16 09:09:04"
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Formatear la fecha actual según el formato definido
        String fechaFormateada2 = formato2.format(fechaActual);
        // Imprimir la fecha formateada en el segundo formato
        System.out.println("Formato 2: " + fechaFormateada2);

        // Formato 3: mar, jul 16 2024
        // Definir el formato "EEE, MMM dd yyyy" para obtener una fecha en el formato "mar, jul 16 2024"
        //EEE es el día de la semana de forma abreviada, sale en español porque es el idioma del sistema.
        //se puede cambiar el idioma con SimpleDateFormat formato = new SimpleDateFormat("EEE, MMM dd yyyy", new Locale("es", "ES"));
        SimpleDateFormat formato3 = new SimpleDateFormat("EEE, MMM dd yyyy");
        // Formatear la fecha actual según el formato definido
        String fechaFormateada3 = formato3.format(fechaActual);
        // Imprimir la fecha formateada en el tercer formato
        System.out.println("Formato 3: " + fechaFormateada3);
    }
}
