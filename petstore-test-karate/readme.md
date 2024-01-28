Instrucciones para Ejecutar Pruebas Karate

1. **Configuración Inicial:**
   - Asegúrate de tener Java instalado en tu sistema.
   - Configura Gradle en tu entorno si aún no lo has hecho.

2. **Clonar el Proyecto:**
   - Clone el repositorio de pruebas Karate desde el repositorio remoto.

     ```bash
     git clone https://github.com/cristianca23/CoderPadDevsu
     ```

3. **Navegar al Directorio del Proyecto:**
   - Accede al directorio del proyecto.

     ```bash
     cd petstore-test-karate
     ```

4. **Configurar Archivo de Gradle:**
   - Abre el archivo `build.gradle`
   - Asegúrate de que las dependencias de Karate estén compilando correctamente.

5. **Agregar Pruebas Karate:**
   - Coloca tus archivos de características de Karate en el directorio `src/test/java/karate`.

6. **Ejecutar Pruebas Karate:**
   - Abre una terminal en el directorio del proyecto.
   - Ejecuta el siguiente comando para ejecutar todas las pruebas.

     ```bash
     ./gradlew test
     ```

7. **Resultados de Pruebas:**
   - Revisa la salida en la consola para ver los resultados de las pruebas.
   - Los informes de prueba también se generan en el directorio `build/reports/tests`.
   - Tambien puedes revisar los informes generados por  cucumber con el comando 
   ```bash
     ./gradlew clean test aggregate
     ```
8. **Personalizar Ejecución:**
   - Puedes personalizar la ejecución de pruebas según tus necesidades modificando el archivo `KarateRunner.java` o ajustando el comando Gradle.

9. **Consideraciones Finales:**
   - Asegúrate de tener conexión a Internet las pruebas hacen solicitudes a servicios externos.

¡Listo! Ahora puedes ejecutar y gestionar las pruebas Karate