# Vamos a crear el contenido del archivo README basado en la descripción anterior
readme_content = """
# Conversor de Monedas

Este proyecto es una aplicación en Java que permite convertir monedas entre varios tipos (USD, ARS, BRL, COP, etc.) utilizando una API de tasas de cambio. La aplicación se ejecuta en la terminal e interactúa con el usuario para ingresar la cantidad a convertir y mostrar la tasa de conversión actual.

## Requisitos

- **Java 11 o superior**
- **Dependencias:**
    - `Gson` para el manejo de JSON
    - `HttpClient` para realizar solicitudes HTTP (nativo de Java 11)

## Instalación

1. Clonar este repositorio:

   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas.git
   cd conversor-monedas
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
URI direccion = URI.create("https://v6.exchangerate-api.com/v6/TU_CLAVE_DE_API/pair/" + monedaBase + "/" + monedaObjetivo);
javac App.java
java App
*******************************************************
*                CONVERSOR DE MONEDA                  *
*******************************************************
*                                                     *
* (1) Dólar Estadounidense  ---> Peso Argentino       *
* (2) Peso Argentino       ---> Dólar Estadounidense  *
* (3) Dólar Estadounidense  ---> Real Brasileño       *
* (4) Real Brasileño        ---> Dólar Estadounidense *
* (5) Dólar Estadounidense  ---> Peso Colombiano      *
* (6) Peso Colombiano       ---> Dólar Estadounidense *
* (7) Salir                                           *
*                                                     *
*******************************************************
Elija una opción válida ---> 
*****   TASA DE CONVERSION HOY   *****
1 USD = 100.25 ARS
Ingrese los USD a convertir ---> 50
50 USD = 5012.5 ARS
