import java.util.Scanner;  // Importa la clase Scanner, que permite leer la entrada del usuario desde la consola.

public class App {  // Declaración de la clase principal "App".
    public static void main(String[] args) {  // Método principal que ejecuta el programa.
        Scanner teclado = new Scanner(System.in);  // Crea un objeto Scanner llamado "teclado" para recibir entradas del usuario.
        ConsultarMoneda consulta = new ConsultarMoneda();  // Crea un objeto "consulta" de la clase ConsultarMoneda (se asume que esta clase consulta datos de monedas).
        int elegirOpcion = 0;  // Variable entera para almacenar la opción elegida por el usuario.

        // Bucle while que se repite hasta que el usuario elija la opción 7 (Salir).
        while (elegirOpcion != 7) {
            // Muestra el menú de opciones en la consola.
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
            System.out.println("* (7) Salir                                           *");
            System.out.println("*                                                     *");
            System.out.println("*******************************************************");

            // Pide al usuario que ingrese una opción válida.
            System.out.print("Elija una opción válida ---> ");

            elegirOpcion = teclado.nextInt();  // Lee la opción elegida por el usuario como un número entero.
            teclado.nextLine();  // Consume el salto de línea después de ingresar el número (para evitar problemas al leer más entradas después).

            // Estructura switch para ejecutar diferentes acciones según la opción elegida por el usuario.
            switch (elegirOpcion) {
                case 1:
                    // Llama al método convertir para convertir de Dólar a Peso Argentino.
                    ConvertirMoneda.convertir("USD", "ARS", consulta, teclado,
                            " (Estadounidense)", " (Argentinos)");
                    break;
                case 2:
                    // Llama al método convertir para convertir de Peso Argentino a Dólar.
                    ConvertirMoneda.convertir("ARS", "USD", consulta, teclado,
                            " (Argentinos)", " (Dólar)");
                    break;
                case 3:
                    // Llama al método convertir para convertir de Dólar a Real Brasileño.
                    ConvertirMoneda.convertir("USD", "BRL", consulta, teclado,
                            " (Dólar)", " (Brasileño)");
                    break;
                case 4:
                    // Llama al método convertir para convertir de Real Brasileño a Dólar.
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado,
                            " (Brasileño)", " (Dólar)");
                    break;
                case 5:
                    // Llama al método convertir para convertir de Dólar a Peso Colombiano.
                    ConvertirMoneda.convertir("USD", "COP", consulta, teclado,
                            " (Dólar)", " (Colombiano)");
                    break;
                case 6:
                    // Llama al método convertir para convertir de Peso Colombiano a Dólar.
                    ConvertirMoneda.convertir("COP", "USD", consulta, teclado,
                            " (Colombiano)", " (Dólar)");
                    break;
                case 7:
                    // Si el usuario elige la opción 7, finaliza el programa.
                    System.out.println("Finalizando...");
                    System.out.println("Finalizando...");
                    System.out.println("Finalizando...");
                    break;
                default:
                    // Si el usuario ingresa una opción no válida, muestra un mensaje de error.
                    System.out.println("Opción NO VÁLIDA");
                    break;
            }
        }
    }
}
