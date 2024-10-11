import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaObjetivo,
                                 ConsultarMoneda consulta, Scanner teclado,
                                 String nombreMonedaA, String nombreMonedaB,
                                 Historial historial) {
        double cantidad;
        double cantidadConvertida;
        boolean valorValido = false;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaObjetivo);

        System.out.println("*****   TASA DE CONVERSION HOY   *****\n1 "
                + monedaBase + nombreMonedaA +
                " = " +
                monedas.conversion_rate() +
                " " + monedaObjetivo +
                nombreMonedaB);

        while (!valorValido) {
            try {
                System.out.print("Ingrese los " + monedaBase + nombreMonedaA + " a convertir ---> ");
                cantidad = Double.parseDouble(teclado.nextLine());
                valorValido = true;

                cantidadConvertida = cantidad * monedas.conversion_rate();
                cantidadConvertida = Math.round(cantidadConvertida * 10000.0) / 10000.0;

                System.out.println(cantidad +
                        " " +
                        monedaBase +
                        nombreMonedaA +
                        " = " +
                        cantidadConvertida +
                        " " +
                        monedas.target_code() +
                        nombreMonedaB);

                // Agrega la conversión al historial
                historial.agregarRegistro(monedaBase, monedaObjetivo, cantidad, cantidadConvertida);

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Entrada inválida. ");
            }
        }

        System.out.println("************************************************");
        System.out.println("Presione enter para continuar...");
        teclado.nextLine();
    }
}
