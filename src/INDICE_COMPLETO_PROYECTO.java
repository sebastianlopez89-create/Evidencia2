/**
 * ================================================================
 * ÍNDICE COMPLETO DEL PROYECTO - SISTEMA DE BIBLIOTECA
 * ================================================================
 * 
 * UBICACIÓN DEL PROYECTO:
 * =======================
 * C:\Users\PERSONAL\IdeaProjects\Evidencia2.0\src\
 * 
 * 
 * ARCHIVOS DE CÓDIGO (PRINCIPALES)
 * =================================
 * 
 * 1️⃣  Material.java
 *     ├─ Descripción: Clase superclase base
 *     ├─ Tipo: Clase abstracta de propósito general
 *     ├─ Atributos heredados: id, titulo, anio, disponible, usuarioPrestamo
 *     ├─ Métodos: getTitulo(), isDisponible(), actualizarDisponibilidad()
 *     └─ Concepto POO: HERENCIA - Base para Libro y CD
 * 
 * 2️⃣  Libro.java
 *     ├─ Descripción: Clase que representa libros
 *     ├─ Hereda de: Material
 *     ├─ Atributos propios: autor, genero
 *     ├─ Métodos override: mostrarInformacion()
 *     └─ Concepto POO: HERENCIA + SOBRESCRITURA (OVERRIDE)
 * 
 * 3️⃣  CD.java
 *     ├─ Descripción: Clase que representa CDs de música
 *     ├─ Hereda de: Material
 *     ├─ Atributos propios: artista, numeroCanciones, duracionTotal
 *     ├─ Métodos override: mostrarInformacion()
 *     └─ Concepto POO: HERENCIA + SOBRESCRITURA (OVERRIDE)
 * 
 * 4️⃣  Usuario.java
 *     ├─ Descripción: Clase superclase para tipos de usuarios
 *     ├─ Atributos: id, nombre, apellido, limitePrestamos
 *     ├─ Métodos: prestarMaterial(), prestarLibro(), prestarCD()
 *     ├─ Constructores sobrecargados
 *     └─ Concepto POO: SOBRECARGA (OVERLOADING) de constructores y métodos
 * 
 * 5️⃣  UsuarioRegular.java
 *     ├─ Descripción: Usuario con límite de 3 materiales
 *     ├─ Hereda de: Usuario
 *     ├─ Límite: 3
 *     ├─ Métodos override: mostrarInformacion()
 *     └─ Concepto POO: HERENCIA + POLIMORFISMO
 * 
 * 6️⃣  UsuarioPremium.java
 *     ├─ Descripción: Usuario con límite de 5 materiales
 *     ├─ Hereda de: Usuario
 *     ├─ Límite: 5
 *     ├─ Métodos override: mostrarInformacion()
 *     └─ Concepto POO: HERENCIA + POLIMORFISMO
 * 
 * 7️⃣  Biblioteca.java
 *     ├─ Descripción: Gestor central del sistema
 *     ├─ Almacena: ArrayList<Material> (POLIMORFISMO)
 *     ├─ Métodos principales:
 *     │  ├─ agregarMaterial(Material)
 *     │  ├─ agregarLibro(Libro)
 *     │  ├─ mostrarMateriales()
 *     │  ├─ mostrarLibros() (usa instanceof)
 *     │  ├─ mostrarCDs() (usa instanceof)
 *     │  └─ prestarMaterialAUsuario()
 *     └─ Concepto POO: POLIMORFISMO + COMPOSICIÓN
 * 
 * 8️⃣  Main.java
 *     ├─ Descripción: Programa principal - Demostración
 *     ├─ Demuestra:
 *     │  ├─ Creación de objetos (Libro, CD, Usuarios)
 *     │  ├─ Herencia en acción
 *     │  ├─ Polimorfismo (ArrayList<Material>)
 *     │  ├─ Límites de préstamo
 *     │  └─ Métodos override
 *     └─ Concepto POO: Aplicación completa de todos los conceptos
 * 
 * 
 * ARCHIVOS DE DOCUMENTACIÓN (EDUCATIVOS)
 * ======================================
 * 
 * 📚 GUIA_HERENCIA_COMPLETA.java
 *    ├─ Contenido:
 *    │  ├─ ¿Qué es herencia?
 *    │  ├─ Estructura base de nuestro proyecto
 *    │  ├─ Cómo funciona la herencia
 *    │  ├─ Polimorfismo en acción
 *    │  ├─ Palabras clave importantes
 *    │  ├─ Ventajas de la herencia
 *    │  ├─ Ejemplo práctico paso a paso
 *    │  └─ Reglas importantes
 *    └─ Útil para: ENTENDER los conceptos teóricos
 * 
 * 📚 EXPLICACION_HERENCIA.java
 *    ├─ Contenido:
 *    │  ├─ Diagrama ASCII visual
 *    │  ├─ Concepto clave: Polimorfismo
 *    │  └─ Ejemplo de uso
 *    └─ Útil para: VISUALIZAR la estructura rápidamente
 * 
 * 📚 RESUMEN_VISUAL_SISTEMA.java
 *    ├─ Contenido:
 *    │  ├─ Estructura de clases completa
 *    │  ├─ Flujo de datos en la biblioteca
 *    │  ├─ Responsabilidades de cada clase
 *    │  ├─ Comparación con/sin herencia
 *    │  ├─ Palabra clave instanceof
 *    │  └─ Ventajas resumidas
 *    └─ Útil para: VER el sistema en su totalidad
 * 
 * 📚 DIAGRAMA_UML_COMPLETO.java
 *    ├─ Contenido:
 *    │  ├─ Diagrama UML en texto ASCII
 *    │  ├─ Relaciones de herencia
 *    │  ├─ Composición (Biblioteca contiene Materiales)
 *    │  ├─ Flujo de interacción
 *    │  ├─ Cómo identificar herencia en código
 *    │  └─ Archivos correspondientes
 *    └─ Útil para: PROFESIONALES - notación UML
 * 
 * 📚 EJEMPLOS_PRACTICOS.java
 *    ├─ Contenido:
 *    │  ├─ Ejemplo 1: Crear y usar un Libro
 *    │  ├─ Ejemplo 2: Crear y usar un CD
 *    │  ├─ Ejemplo 3: Polimorfismo - almacenar diferentes tipos
 *    │  ├─ Ejemplo 4: Usar Biblioteca
 *    │  ├─ Ejemplo 5: Sobrecarga de constructores
 *    │  ├─ Ejemplo 6: instanceof
 *    │  ├─ Ejemplo 7: Sobrecarga de métodos
 *    │  └─ Ejemplo 8: Demostración completa
 *    └─ Útil para: PRACTICAR con código real
 * 
 * 📚 RESUMEN_EJECUTIVO.java
 *    ├─ Contenido:
 *    │  ├─ Qué se ha realizado
 *    │  ├─ Estructura del proyecto
 *    │  ├─ Explicación de cada concepto (Herencia, Polimorfismo, etc.)
 *    │  ├─ Clases principales y sus roles
 *    │  ├─ Casos de uso demostrados
 *    │  ├─ Patrón de diseño
 *    │  ├─ Cómo ejecutar
 *    │  ├─ Extensibilidad
 *    │  ├─ Validación del sistema
 *    │  └─ Palabras clave usadas
 *    └─ Útil para: REFERENCIA RÁPIDA
 * 
 * 
 * FLUJO RECOMENDADO DE LECTURA
 * ============================
 * 
 * Para PRINCIPIANTES:
 * 1️⃣  Lee EXPLICACION_HERENCIA.java (5 min)
 * 2️⃣  Lee GUIA_HERENCIA_COMPLETA.java (20 min)
 * 3️⃣  Estudia RESUMEN_VISUAL_SISTEMA.java (15 min)
 * 4️⃣  Ve ejemplos en EJEMPLOS_PRACTICOS.java (10 min)
 * 5️⃣  Ejecuta Main.java y observa la salida
 * 6️⃣  Modifica Main.java para experimentar
 * 
 * Para PROFESIONALES:
 * 1️⃣  Mira DIAGRAMA_UML_COMPLETO.java (10 min)
 * 2️⃣  Revisa el código de Material.java, Libro.java, CD.java
 * 3️⃣  Entiende Biblioteca.java (uso de polimorfismo)
 * 4️⃣  Lee RESUMEN_EJECUTIVO.java para validación
 * 
 * 
 * CONCEPTOS POO DEMOSTRADOS
 * =========================
 * 
 * ✅ HERENCIA (extends)
 *    Demostrada en:
 *    ├─ Libro extends Material
 *    ├─ CD extends Material
 *    ├─ UsuarioRegular extends Usuario
 *    └─ UsuarioPremium extends Usuario
 * 
 * ✅ POLIMORFISMO (muchas formas)
 *    Demostrada en:
 *    ├─ ArrayList<Material> contiene Libro y CD
 *    ├─ material.mostrarInformacion() se ejecuta diferente
 *    └─ En tiempo de ejecución Java elige la versión correcta
 * 
 * ✅ ENCAPSULACIÓN (private/protected)
 *    Demostrada en:
 *    ├─ Atributos privados: id, titulo, etc.
 *    ├─ Métodos públicos: getTitulo(), mostrarInformacion()
 *    └─ Atributos protegidos: usuarioPrestamo (acceso a subclases)
 * 
 * ✅ SOBRECARGA (OVERLOADING)
 *    Demostrada en:
 *    ├─ Constructor Usuario con/sin límite
 *    ├─ Métodos prestarMaterial(), prestarLibro(), prestarCD()
 *    └─ Métodos agregarMaterial(), agregarLibro()
 * 
 * ✅ SOBRESCRITURA (OVERRIDE)
 *    Demostrada en:
 *    ├─ Libro.mostrarInformacion() reemplaza Material.mostrarInformacion()
 *    ├─ CD.mostrarInformacion() reemplaza Material.mostrarInformacion()
 *    ├─ UsuarioRegular.mostrarInformacion() reemplaza Usuario.mostrarInformacion()
 *    └─ UsuarioPremium.mostrarInformacion() reemplaza Usuario.mostrarInformacion()
 * 
 * ✅ COMPOSICIÓN (Biblioteca contiene Materiales)
 *    Demostrada en:
 *    ├─ ArrayList<Material> materiales
 *    └─ Biblioteca gestiona múltiples materiales
 * 
 * 
 * CÓMO EJECUTAR Y VALIDAR
 * =======================
 * 
 * Paso 1: Compilar el proyecto
 * ---------------------------
 * cd C:\Users\PERSONAL\IdeaProjects\Evidencia2.0\src
 * javac *.java
 * 
 * Paso 2: Ejecutar Main.java
 * -------------------------
 * java Main
 * 
 * Paso 3: Observar la salida
 * --------------------------
 * La salida debe mostrar:
 * ├─ Información de usuarios (Regular y Premium)
 * ├─ Todos los materiales (Libros y CDs)
 * ├─ Solo libros
 * ├─ Solo CDs
 * ├─ Simulación de préstamos
 * └─ Validación de límites (3 para Regular, 5 para Premium)
 * 
 * 
 * MODIFICACIONES SUGERIDAS PARA APRENDER
 * =====================================
 * 
 * Experimento 1: Agregar tipo Revista
 * -----------------------------------
 * 1. Crea Revista.java que extienda Material
 * 2. Agrega atributos: numero, mes
 * 3. Override mostrarInformacion()
 * 4. En Main, crea una Revista y agrega a biblioteca
 * 
 * Experimento 2: Cambiar límites de usuario
 * -----------------------------------------
 * 1. Abre UsuarioRegular.java
 * 2. Cambia "super(..., 3)" a "super(..., 2)"
 * 3. Ejecuta Main y observa cómo falla el 3er préstamo
 * 
 * Experimento 3: Agregar devolución de materiales
 * -----------------------------------------------
 * 1. En Usuario, agrega método "devolverMaterial(Material)"
 * 2. Implementa lógica para remover de lista y marcar disponible
 * 3. En Main, prueba devolución y re-préstamo
 * 
 * 
 * ================================================================
 * TODO ESTÁ LISTO - ¡COMIENZA A APRENDER!
 * ================================================================
 * 
 * El proyecto contiene:
 * ✓ 8 archivos de código funcional
 * ✓ 7 archivos de documentación educativa
 * ✓ Ejemplos completos de POO
 * ✓ Diagrama UML en texto
 * ✓ Ejercicios sugeridos para aprender
 * 
 * Requisitos cumplidos:
 * ✅ Herencia implementada (Biblioteca - Material - Libro/CD)
 * ✅ Polimorfismo funcional (ArrayList<Material>)
 * ✅ Sobrecarga de métodos y constructores
 * ✅ Sobrescritura de métodos (@Override)
 * ✅ Límite de 3 libros para usuarios regulares
 * ✅ Sistema simple y fácil de entender para principiantes
 * ✅ Código compilable y ejecutable
 * ✅ Documentación completa incluida
 * 
 */
