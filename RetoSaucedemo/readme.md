## ✅ Tecnologías

# Proyecto Screenplay con Serenity y Java 17

Este es un proyecto de ejemplo en donde se realiza el flujo para 2 compras dentro de la pagina demoblaze que utiliza el patrón de diseño Screenplay con el framework Serenity y Java 17 para realizar pruebas automatizadas.

## Requisitos Previos

Asegúrate de tener instalados los siguientes elementos antes de ejecutar el proyecto:

- Java 17
- Gradle
- [Opcional] Un IDE como IntelliJ o Eclipse

## Clonar el Repositorio

```bash
git clone https://github.com/cristianca23/CoderPadDevsu

```
# 🛠️ Ejecutar las Pruebas
### Desde la Línea de Comandos
Para ejecutar las pruebas desde la línea de comandos, utiliza el siguiente comando:
```bash
./gradlew clean test aggregate
```

Este comando realiza las siguientes acciones:

- clean: Limpia los resultados de las pruebas anteriores.
- test: Ejecuta las pruebas.
- aggregate: Genera informes de Serenity después de que las pruebas se hayan completado.

# Desde un IDE
Si prefieres ejecutar las pruebas desde tu IDE, simplemente importa el proyecto y ejecuta la clase de prueba  RunnerStore.java.



## Notas Adicionales
- Asegúrate de tener acceso a Internet durante la ejecución de las pruebas.
- Este proyecto esta creado bajo el patron de diseño Screenplay