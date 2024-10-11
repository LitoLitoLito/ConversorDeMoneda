# Vamos a crear una versión del README en formato HTML
html_readme_content = """
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversor de Monedas</title>
</head>
<body>
    <h1>Conversor de Monedas</h1>
    <p>Este proyecto es una aplicación en Java que permite convertir monedas entre varios tipos (USD, ARS, BRL, COP, etc.) utilizando una API de tasas de cambio. La aplicación se ejecuta en la terminal e interactúa con el usuario para ingresar la cantidad a convertir y mostrar la tasa de conversión actual.</p>

    <h2>Requisitos</h2>
    <ul>
        <li><strong>Java 11 o superior</strong></li>
        <li><strong>Dependencias:</strong></li>
        <ul>
            <li>Gson para el manejo de JSON</li>
            <li>HttpClient para realizar solicitudes HTTP (nativo de Java 11)</li>
        </ul>
    </ul>

    <h2>Instalación</h2>
    <ol>
        <li>Clonar este repositorio:</li>
        <pre><code>git clone https://github.com/tu-usuario/conversor-monedas.git
cd conversor-monedas
</code></pre>
<li>Asegúrate de tener <strong>Java 11</strong> o superior instalado en tu sistema.</li>
<li>Si estás usando un IDE como <strong>IntelliJ</strong> o <strong>Eclipse</strong>, importa el proyecto como un proyecto de Java.</li>
<li>Agrega la dependencia de Gson en tu entorno:</li>
<p>Si estás usando <strong>Maven</strong>, agrega lo siguiente en el archivo <code>pom.xml</code>:</p>
<pre><code>
<dependency>
<groupId>com.google.code.gson</groupId>
<artifactId>gson</artifactId>
<version>2.8.8</version>
</dependency>
</code></pre>
<p>Si no estás usando Maven, puedes descargar la librería desde <a href="https://github.com/google/gson">Gson</a> e incluirla manualmente.</p>
</ol>

    <h2>Configuración de la API</h2>
    <p>Este proyecto utiliza la <strong>API de ExchangeRate-API</strong> para obtener las tasas de conversión. Debes registrarte en <a href="https://www.exchangerate-api.com/">https://www.exchangerate-api.com/</a> para obtener una clave de API y reemplazarla en la URL dentro del código.</p>
    <p>En la clase <code>ConsultarMoneda</code>, reemplaza la clave API por la tuya:</p>
    <pre><code>
URI direccion = URI.create("https://v6.exchangerate-api.com/v6/TU_CLAVE_DE_API/pair/" + monedaBase + "/" + monedaObjetivo);
</code></pre>

    <h2>Uso</h2>
    <ol>
        <li>Ejecuta el proyecto desde tu IDE o terminal usando el siguiente comando:</li>
        <pre><code>javac App.java
java App
</code></pre>
<li>El programa mostrará un menú con las opciones de conversión de moneda:</li>
<pre><code>
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
</code></pre>
<li>Elige la opción correspondiente para realizar la conversión. Luego, ingresa la cantidad de dinero que deseas convertir. El programa te mostrará la tasa de conversión actual y el resultado.</li>
</ol>

    <h2>Explicación del código</h2>
    <h3>Clase <code>App</code></h3>
    <p>Esta es la clase principal que inicia el programa y gestiona la interacción con el usuario mediante un menú de opciones. Utiliza la clase <code>ConsultarMoneda</code> para obtener la tasa de conversión y la clase <code>ConvertirMoneda</code> para realizar la conversión.</p>

    <h3>Clase <code>ConsultarMoneda</code></h3>
    <p>Esta clase se encarga de realizar la solicitud a la API de Exchange Rate, construyendo la URL con las monedas base y objetivo, y devolviendo la tasa de conversión obtenida en formato JSON.</p>

    <h3>Clase <code>ConvertirMoneda</code></h3>
    <p>Aquí es donde se realiza el cálculo de la conversión. Solicita al usuario la cantidad a convertir, valida la entrada, y realiza el cálculo usando la tasa de conversión proporcionada por <code>ConsultarMoneda</code>.</p>

    <h2>Ejemplo de ejecución</h2>
    <p>Si seleccionas la opción 1 (USD a ARS), el programa mostrará la tasa de conversión actual para el dólar estadounidense al peso argentino:</p>
    <pre><code>
*****   TASA DE CONVERSION HOY   *****
1 USD = 100.25 ARS
Ingrese los USD a convertir ---> 50
50 USD = 5012.5 ARS
</code></pre>

    <h2>Contribución</h2>
    <p>Si deseas contribuir a este proyecto:</p>
    <ol>
        <li>Haz un fork del repositorio.</li>
        <li>Crea una nueva rama (<code>git checkout -b nueva-funcionalidad</code>).</li>
        <li>Haz tus cambios y confirma (<code>git commit -m 'Añadir nueva funcionalidad'</code>).</li>
        <li>Haz push a la rama (<code>git push origin nueva-funcionalidad</code>).</li>
        <li>Abre un Pull Request.</li>
    </ol>

    <h2>Licencia</h2>
    <p>Este proyecto está licenciado bajo la <a href="LICENSE">MIT License</a>.</p>
</body>
</html>
"""

# Guardamos el contenido en un archivo README.html
with open("/mnt/data/README.html", "w") as file:
file.write(html_readme_content)

"/mnt/data/README.html"
