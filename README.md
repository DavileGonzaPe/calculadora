Calculadora

El proyecto consiste en una API REST que permite hacer operaciones matemáticas de suma y resta, y que utiliza Spring Boot y Maven. También utiliza una librería externa llamada "tracer" para hacer logging.

Requisitos

Java 17
Maven 3.6.0 o superior

Instalación

1.- Clona este repositorio: git clone https://github.com/DavileGonzaPe/calculadora.git

2.- Abre una terminal en la carpeta raíz del proyecto.

3.- Ejecuta el siguiente comando: 

mvn clean package

Este comando compilará el proyecto y generará un archivo JAR en la carpeta target/.

4.- De nuevo, desde una terminal y en la carpeta raiz del proyecto, ejecuta el siguiente comando:

java -jar target/calculadora-0.0.1.jar

5.- La aplicación estará disponible en http://localhost:8080.

Endpoints

La aplicación tiene los siguientes endpoints:

/ - Página de bienvenida

/suma - Suma dos números

/resta - Resta dos números
