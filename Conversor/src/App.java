import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda(); // Inicializa la clase para consultar la API
        Historial historial = new Historial(); // Inicializa el historial de conversiones
        int opcion = 0;
        do {
            System.out.println("*******************************************************");
            System.out.println("*                CONVERSOR DE MONEDA                  *");
            System.out.println("*******************************************************");
            System.out.println("*                                                     *");
            System.out.println("* (1) Dólar Estadounidense  ---> Peso Argentino       *");
            System.out.println("* (2) Peso Argentino       ---> Dólar Estadounidense  *");
            System.out.println("* (3) Dólar Estadounidense  ---> Real Brasileño       *");
            System.out.println("* (4) Real Brasileño        ---> Dólar Estadounidense *");
            System.out.println("* (5) Dólar Estadounidense  ---> Peso Colombiano      *");
            System.out.println("* (6) Peso Colombiano       ---> Dólar Estadounidense *");
            System.out.println("* (7) Ver historial de conversiones                   *");
            System.out.println("* (8) Salir                                           *");
            System.out.println("*                                                     *");
            System.out.println("*******************************************************");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, teclado,
                            " (Dólares)", " (Argentinos)", historial);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, teclado,
                            " (Argentinos)", " (Dólares)", historial);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, teclado,
                            " (Dólares)", " (Reales)", historial);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado,
                            " (Reales)", " (Dólares)", historial);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, teclado,
                            " (Dólares)", " (Colombianos)", historial);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, teclado,
                            " (Colombianos)", " (Dólares)", historial);
                    break;
                case 7:
                    historial.mostrarHistorial();
                    break;
                case 8:
                    System.out.println("Gracias por utilizar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 8);
    }
}
