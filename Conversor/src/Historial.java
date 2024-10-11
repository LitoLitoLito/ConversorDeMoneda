import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Historial {
    Scanner teclado1 = new Scanner(System.in);
    private final List<String> historial;

    public Historial() {
        this.historial = new ArrayList<>();
    }

    public void agregarRegistro(String monedaBase,
                                String monedaObjetivo,
                                double cantidadBase,
                                double cantidadConvertida) {
        LocalDateTime fechaHora = LocalDateTime.now(); // Obtiene la fecha y hora actual

        // Formato visual descriptivo del registro.
        String registro = String.format(
                "\n--------------------------------------\n" +
                        " Conversión realizada el: %s\n" +   // Fecha y hora de la conversión
                        " Cantidad convertida: %.2f %s\n" +  // Cantidad de moneda base
                        " Resultado: %.4f %s\n" +            // Cantidad convertida en moneda objetivo
                        "--------------------------------------",
                fechaHora, cantidadBase, monedaBase, cantidadConvertida, monedaObjetivo);

        historial.add(registro); // Agrega el registro al historial
    }


    public void mostrarHistorial() {
        System.out.println("************ HISTORIAL DE CONVERSIONES ************");
        if (historial.isEmpty()) {
            System.out.println("No hay conversiones registradas.");
            System.out.println("Presione enter para continuar...");
            teclado1.nextLine();
            System.out.println("**************************************************");
        } else {
            for (String registro : historial) {
                System.out.println(registro); // Muestra cada registro del historial
                System.out.println("**************************************************");
            }
            System.out.println("Presione enter para continuar...");
            teclado1.nextLine();
        }


        System.out.println("************************************************");

    }
}
