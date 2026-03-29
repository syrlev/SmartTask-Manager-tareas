# Proyecto SmartTask - Sistema de Gestion de Tareas

## Descripcion
SmartTask es una aplicacion de consola desarrollada en Java que implementa los fundamentos de la Programacion Orientada a Objetos (POO). El sistema permite la administracion de tareas mediante una arquitectura robusta y desacoplada.

## Caracteristicas Tecnicas
* **Arquitectura POO:** Uso de clase abstracta (Tarea) y especializacion mediante herencia (TareaNormal, TareaUrgente).
* **Desacoplamiento:** Logica de negocio centralizada en la clase GestorTareas, independiente de la interfaz de usuario.
* **Robustez:** Implementacion de bloques try-catch para la validacion de entradas por consola, asegurando la estabilidad del programa ante errores de usuario.
* **Integracion Legacy:** Sistema de IDs autoincrementales iniciando en 1000 y formatos de salida especificos para compatibilidad con sistemas externos.

## Estructura del Proyecto
* **src/smarttask/**: Contiene el codigo fuente (.java) del sistema.
* **test/smarttask/**: Contiene las pruebas unitarias desarrolladas con JUnit 5.
* **log_ejecucion.txt**: Registro de una sesion de uso real del programa.
* **log_tests.txt**: Reporte de los resultados obtenidos tras la ejecucion de las pruebas unitarias.

## Requisitos de Ejecucion
* Java JDK 17 o superior.
* JUnit 5 para la ejecucion de pruebas unitarias.
* IDE recomendado: Eclipse o IntelliJ IDEA.
