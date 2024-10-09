import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       ConsultarMoneda consulta = new ConsultarMoneda();
       int elegirOpcion = 0;
       while (elegirOpcion != 1){
           System.out.println("************************************************\n" +
                   "Sea bienvenido/a al CONVERSOR DE MONEDA =]\n\n" +
                   "(1) Dólar ------> Peso Argentino.\n" +
                   "(2) Peso Argentino ------> Dólar.\n" +
                   "(3) Dólar ------> Real Brasileño.\n" +
                   "(4) Real Brasileño ------> Dólar.\n" +
                   "(5) Dólar -----> Peso Colombiano.\n" +
                   "(6) Peso Colombiano -----> Dólar.\n" +
                   "(7) Salir.\n\n" +
                   "ELIJA una opción válida ---> ");
           elegirOpcion = teclado.nextInt();
           teclado.nextLine();

           switch (elegirOpcion){
               case 1:
                   ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                   break;
               case 2: ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                   break;
               case 3: ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                   break;
               case 4: ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                   break;
               case 5: ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                   break;
               case 6: ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                   break;
               case 8:
                   System.out.println("Finalizando...");
                   break;
               default:
                   System.out.println("Opción NO VÁLIDA");
                   break;
           }

       }
    }
}
