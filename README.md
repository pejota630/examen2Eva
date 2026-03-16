# Parcial 2 — Sistema de Gestión de Empleados

Descripción
- Proyecto Java simple que gestiona empleados con validaciones, separación de responsabilidades y pruebas unitarias (JUnit 5).
- Objetivos: refactorizar clase Empleado, extraer lógica de gestión a Empleados, centralizar cargos y constantes, y añadir pruebas mediante análisis de caja negra.

Autor y versión
- Autor: (Pedro Jose Benitez)
- Versión: 1.0

Estructura del proyecto
- Empleado.java        — clase modelo con getters/setters y validaciones
- Empleados.java       — gestión de la colección (atributo lista, darAltaEmpleado, aumentarSalario, mostrarListado)
- Cargos.java          — lista de cargos válidos (constantes)
- Constantes.java      — textos y valores fijos (mensajes y convenio)
- SistemaGestionEmpleados.java — application main
- test\EmpleadoTest.java — tests JUnit 5
- TESTING.md           — análisis de caja negra y casos de prueba

Requisitos
- JDK 11+ instalado
- (Opcional para tests) junit-platform-console-standalone JAR descargado desde Maven Central

Compilar y ejecutar (Windows, sin Maven/Gradle)
1. Abrir PowerShell o CMD en la carpeta del proyecto (ej: c:\Users\324593\Downloads\)
2. Crear carpeta de salida:
   mkdir out
3. Compilar clases:
   javac -d out *.java
4. Ejecutar:
   cd out
   java SistemaGestionEmpleados

Uso
- La aplicación solicita un porcentaje de aumento; introduce un número (por ejemplo 10) y se mostrará la lista de empleados con salarios actualizados.

Ejecutar tests (JUnit 5 — modo standalone)
1. Descargar junit-platform-console-standalone (ej: junit-platform-console-standalone-1.9.3.jar) y colocar en:
   c:\Users\324593\Downloads\lib\junit-platform-console-standalone-1.9.3.jar
2. Compilar código y tests:
   cd c:\Users\324593\Downloads
   javac -d out -cp .;c:\Users\324593\Downloads\lib\junit-platform-console-standalone-1.9.3.jar *.java test\*.java
3. Ejecutar tests:
   java -jar c:\Users\324593\Downloads\lib\junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

Notas sobre tests
- Los tests están basados en el análisis de caja negra documentado en TESTING.md. Cubren casos válidos y no válidos para nombre, cargo y salario.

Generar JavaDoc
- javadoc -d docs *.java
- Abrir docs\index.html en el navegador.

Buenas prácticas y diseño
- Validaciones centralizadas en Empleado (setters y constructor).
- Empleados contiene la lista (atributo lista) y la lógica de negocio relacionada con colecciones.
- Cargos y Constantes evitan magic strings/numbers y facilitan traducción o cambios.

Subir a GitHub (resumen de comandos)
1. git init
2. git add .
3. git commit -m "Refactorización: Empleado, Empleados, Cargos, Constantes y tests"
4. git branch -M main
5. git remote add origin https://github.com/<tu_usuario>/Parcial-2.git
6. git push -u origin main

Enlaces útiles
- Maven Central (junit-platform-console-standalone): https://search.maven.org

TESTING.md
- Consulte TESTING.md para tablas de análisis de parámetros, casos válidos y no válidos.

