
public record Monedas(  // Declaración de un `record` en Java llamado "Monedas".
                        // Los records son una característica de Java que permite
                        // definir clases inmutables de manera más concisa.
                        String base_code,   // Campo "base_code" de tipo String,
                                            // que representa el código de la moneda base
                                            // (por ejemplo, "USD" para dólar).
                        String target_code, // Campo "target_code" de tipo String,
                                            // que representa el código de la moneda objetivo
                                            // (por ejemplo, "ARS" para peso argentino).
                        double conversion_rate  // Campo "conversion_rate" de tipo double,
                                            // que representa la tasa de conversión entre la moneda base
                                            // y la moneda objetivo (por ejemplo, 1 USD = 350 ARS).
) {
    // El cuerpo del record queda vacío porque los records en Java
    // generan automáticamente los métodos como `constructor`, `equals()`, `hashCode()`, y `toString()`.
}
