
import java.util.Scanner;  // Importa la clase Scanner, utilizada para leer la entrada del usuario desde la consola.

public class ConvertirMoneda {  // Declaración de la clase ConvertirMoneda, que contiene el método para realizar conversiones de monedas.

    // Método estático 'convertir', que se encarga de convertir una cantidad de la moneda base a la moneda objetivo.
    public static void convertir(String monedaBase, String monedaObjetivo,
                                 ConsultarMoneda consulta, Scanner teclado,
                                 String nombreMonedaA, String nombreMonedaB) {
        double cantidad;  // Variable para almacenar la cantidad a convertir.
        double cantidadConvertida;  // Variable para almacenar el resultado de la conversión.
        boolean valorValido = false;  // Bandera para validar si la entrada del usuario es correcta.

        // Llama al método 'buscarMoneda' de la clase 'ConsultarMoneda' para obtener la tasa de conversión entre las dos monedas.
        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaObjetivo);

        // Muestra en pantalla la tasa de conversión obtenida desde la API.
        System.out.println("*****   TASA DE CONVERSION HOY   *****\n1 "
                + monedaBase + nombreMonedaA +
                " = " +
                monedas.conversion_rate() +  // Muestra la tasa de conversión.
                " " + monedaObjetivo +
                nombreMonedaB);

        // Bucle para validar la entrada del usuario hasta que ingrese una cantidad válida.
        while (!valorValido) {
            try {
                // Solicita al usuario que ingrese la cantidad de la moneda base que desea convertir.
                System.out.print("Ingrese los " + monedaBase + nombreMonedaA + " a convertir ---> ");
                cantidad = Double.parseDouble(teclado.nextLine());  // Lee y convierte la entrada del usuario a un valor double.
                valorValido = true;  // Si la conversión es exitosa, marca el valor como válido y sale del bucle.

                // Calcula la cantidad convertida multiplicando por la tasa de conversión.
                cantidadConvertida = cantidad * monedas.conversion_rate();

                // Redondea el resultado a 4 decimales.
                cantidadConvertida = Math.round(cantidadConvertida * 10000.0) / 10000.0;

                // Muestra el resultado de la conversión en pantalla.
                System.out.println(cantidad +
                        " " +
                        monedaBase +
                        nombreMonedaA +
                        " = " +
                        cantidadConvertida +
                        " " +
                        monedas.target_code() +
                        nombreMonedaB);

            } catch (NumberFormatException e) {
                // Si el usuario ingresa un valor no numérico, muestra un mensaje de error.
                System.out.println("ERROR: Entrada inválida. ");
            }
        }

        // Muestra una línea de separación y espera que el usuario presione cualquier tecla para continuar.
        System.out.println("************************************************");
        System.out.println("Presione cualquier tecla para continuar...");
        Scanner scanner = new Scanner(System.in);  // Crea una nueva instancia de Scanner para esperar la entrada del usuario.
        scanner.nextLine();  // Espera a que el usuario presione una tecla.
    }
}
