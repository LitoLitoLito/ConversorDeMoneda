
import com.google.gson.Gson;  // Importa la librería Gson, utilizada para convertir cadenas JSON a objetos Java y viceversa.
import java.net.URI;  // Importa la clase URI, que permite manejar y construir direcciones web (URLs).
import java.net.http.HttpClient;  // Importa la clase HttpClient, que se utiliza para realizar solicitudes HTTP.
import java.net.http.HttpRequest;  // Importa la clase HttpRequest, que representa una solicitud HTTP.
import java.net.http.HttpResponse;  // Importa la clase HttpResponse, que representa la respuesta de una solicitud HTTP.

public class ConsultarMoneda {  // Declaración de la clase ConsultarMoneda que maneja las consultas a una API de tasas de cambio.

    // Método que realiza la búsqueda de una tasa de conversión entre dos monedas.
    public Monedas buscarMoneda(String monedaBase, String monedaObjetivo) {
        // Construye la URI (dirección) para realizar la solicitud a la API de Exchange Rate, usando la moneda base y la moneda objetivo.
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6df0a441f5f2c8c29b9bbdcb/pair/" +
                monedaBase +  // Inserta el código de la moneda base en la URL (ej. "USD").
                "/" +
                monedaObjetivo);  // Inserta el código de la moneda objetivo en la URL (ej. "ARS").

        // Crea un nuevo cliente HTTP para enviar la solicitud.
        HttpClient client = HttpClient.newHttpClient();

        // Construye una solicitud HTTP usando la dirección creada.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)  // Especifica la URI para la solicitud.
                .build();  // Finaliza la construcción de la solicitud.

        try {
            // Envía la solicitud HTTP y espera la respuesta como una cadena de texto.
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Convierte la respuesta en formato JSON a un objeto de tipo `Monedas` usando Gson.
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            // Si ocurre alguna excepción durante la solicitud o la conversión, lanza una excepción personalizada.
            throw new RuntimeException("No se encontró la Moneda");
        }
    }
}
