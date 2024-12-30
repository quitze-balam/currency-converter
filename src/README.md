Convertidor de Divisas

Descripción

Este proyecto es una aplicación de línea de comandos desarrollada en Java que permite realizar conversiones de divisas utilizando datos obtenidos de una API. Los usuarios pueden ingresar códigos de moneda (formato ISO 4217) y un monto para realizar la conversión.

Características

Conversión entre diversas monedas como USD, EUR, MXN, ARS, entre otras.

Validación de datos ingresados por el usuario para evitar errores.

Opciones para realizar varias conversiones en una sola ejecución o salir del programa.

Interfaz amigable en consola.

Tecnologías Utilizadas

Java: Lenguaje principal.

Gson: Biblioteca para manejar la serialización y deserialización de JSON.

API de Tipos de Cambio: Fuente de los datos de conversión (debe configurarse).

Requisitos

Java 8 o superior.

Conexión a internet para acceder a la API.

Biblioteca Gson incluida en el proyecto. Puedes agregarla con Maven:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

Instalación y Ejecución

Clona este repositorio:

git clone https://github.com/tu-usuario/convertidor-divisas.git

Importa el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA o Eclipse).

Asegúrate de incluir la dependencia de Gson en tu configuración.

Compila y ejecuta el archivo Principal.java.

Uso

Al iniciar la aplicación, se mostrará una lista de divisas disponibles con sus códigos ISO.

El programa solicitará:

El código de la moneda de origen.

El código de la moneda de destino.

El monto a convertir.

El programa mostrará el resultado de la conversión.

Puedes elegir realizar otra conversión o salir del programa.

Ejemplo de Ejecución

¡BIENVENID@ AL CONVERTIDOR DE DIVISAS!
************************************************

Codigos de divisa:

→ MXN = Peso mexicano
→ USD = Dolar estadounidense
→ EUR = Euro
→ ARS = Peso argentino
→ ...

(Si conoce el codigo ISO de la divisa, por favor escribalo)
************************************************

Por favor escriba la información necesaria:
Indique el codigo de la moneda a cambiar: USD
Indique el codigo de la moneda a la que desea hacer el cambio: ARS
Indique el monto a cambiar: 100

Resultado: 100 USD = 35000 ARS

¿Qué desea hacer?
Salir [1] | Continuar [0]

Estructura del Proyecto

Principal.java: Contiene el método principal y la lógica del flujo del programa.

Cambio.java: Representa el modelo para manejar la información de conversión.

ConsultaTipoDeCambio.java: Gestiona las consultas a la API para obtener los tipos de cambio.

Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o deseas mejorar algo, por favor abre un issue o crea un pull request.

Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más información.

Autor

[Quitze Balam Ortiz Mares]Ingeniero de pruebas y entusiasta de la programación en Java.