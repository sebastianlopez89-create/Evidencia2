/**
 * ================================================================
 * README - SISTEMA DE BIBLIOTECA CON HERENCIA EN JAVA
 * ================================================================
 * 
 * 📋 DESCRIPCIÓN DEL PROYECTO
 * =============================
 * 
 * Este proyecto implementa un sistema completo de gestión de biblioteca
 * que demuestra los principios fundamentales de Programación Orientada
 * a Objetos (POO) en Java:
 * 
 * - HERENCIA
 * - POLIMORFISMO
 * - ENCAPSULACIÓN
 * - SOBRECARGA
 * - SOBRESCRITURA
 * 
 * El sistema permite:
 * ✓ Gestionar diferentes tipos de materiales (Libros, CDs)
 * ✓ Registrar usuarios con diferentes categorías
 * ✓ Controlar préstamos con límites personalizados
 * ✓ Mostrar información de forma polimórfica
 * 
 * 
 * 📁 ESTRUCTURA DE ARCHIVOS
 * ==========================
 * 
 * ARCHIVOS DE CÓDIGO (Funcional):
 * ├─ Material.java          ← Superclase base para materiales
 * ├─ Libro.java             ← Subclase de Material
 * ├─ CD.java                ← Subclase de Material
 * ├─ Usuario.java           ← Superclase base para usuarios
 * ├─ UsuarioRegular.java    ← Subclase de Usuario (límite 3)
 * ├─ UsuarioPremium.java    ← Subclase de Usuario (límite 5)
 * ├─ Biblioteca.java        ← Gestor central (usa polimorfismo)
 * ├─ Main.java              ← Programa principal (EJECUTA ESTO)
 * └─ Prestamo.java          ← Clase auxiliar de préstamo
 * 
 * ARCHIVOS DE DOCUMENTACIÓN (Educativo):
 * ├─ README.java            ← Este archivo
 * ├─ GUIA_HERENCIA_COMPLETA.java
 * ├─ RESUMEN_VISUAL_SISTEMA.java
 * ├─ DIAGRAMA_UML_COMPLETO.java
 * ├─ EJEMPLOS_PRACTICOS.java
 * ├─ RESUMEN_EJECUTIVO.java
 * ├─ INDICE_COMPLETO_PROYECTO.java
 * ├─ EXPLICACION_HERENCIA.java
 * └─ LibroFisico.java       ← Ejemplo adicional
 *    LibroDigital.java      ← Ejemplo adicional
 * 
 * 
 * 🚀 CÓMO USAR
 * =============
 * 
 * OPCIÓN 1: Ejecutar en IntelliJ IDEA
 * ------------------------------------
 * 1. Abre IntelliJ IDEA
 * 2. Abre el proyecto: C:\Users\PERSONAL\IdeaProjects\Evidencia2.0
 * 3. Click derecho en Main.java
 * 4. Selecciona "Run 'Main.main()'"
 * 5. Observa la salida en la consola
 * 
 * OPCIÓN 2: Ejecutar desde línea de comandos (PowerShell)
 * -------------------------------------------------------
 * cd C:\Users\PERSONAL\IdeaProjects\Evidencia2.0\src
 * javac *.java
 * java Main
 * 
 * 
 * 📖 CÓMO APRENDER (GUÍA DE LECTURA)
 * ====================================
 * 
 * PARA PRINCIPIANTES (Recomendado):
 * ---------------------------------
 * 
 * DÍA 1: Conceptos Básicos
 * ├─ 1. Lee EXPLICACION_HERENCIA.java (5 minutos)
 * │     └─ Entiende diagrama simple de herencia
 * │
 * ├─ 2. Lee GUIA_HERENCIA_COMPLETA.java (30 minutos)
 * │     ├─ ¿Qué es herencia?
 * │     ├─ ¿Qué es polimorfismo?
 * │     ├─ Estructura de nuestro proyecto
 * │     └─ Palabras clave importantes
 * │
 * └─ 3. Mira Main.java
 *      └─ Lee los comentarios para entender flujo
 * 
 * DÍA 2: Visualización y Ejemplos
 * ├─ 1. Lee RESUMEN_VISUAL_SISTEMA.java (20 minutos)
 * │     └─ Ve cómo interactúan las clases
 * │
 * ├─ 2. Lee EJEMPLOS_PRACTICOS.java (25 minutos)
 * │     └─ 8 ejemplos concretos de cómo usar el sistema
 * │
 * └─ 3. Ejecuta Main.java
 *      └─ Observa cómo funcionan los ejemplos
 * 
 * DÍA 3: Profundización
 * ├─ 1. Lee código de Material.java y Libro.java
 * │     └─ Entiende herencia en práctica
 * │
 * ├─ 2. Lee código de Usuario.java y UsuarioRegular.java
 * │     └─ Entiende sobrecarga y sobrescritura
 * │
 * ├─ 3. Lee código de Biblioteca.java
 * │     └─ Entiende polimorfismo con ArrayList<Material>
 * │
 * └─ 4. Lee RESUMEN_EJECUTIVO.java
 *      └─ Resumen completo de todo el sistema
 * 
 * DÍA 4: Profesionalización
 * ├─ 1. Lee DIAGRAMA_UML_COMPLETO.java
 * │     └─ Notación estándar de profesionales
 * │
 * ├─ 2. Experimenta modificando el código
 * │     ├─ Cambia límites de usuario
 * │     ├─ Agrega un nuevo tipo de material
 * │     └─ Modifica Main para nuevos casos de uso
 * │
 * └─ 3. Lee INDICE_COMPLETO_PROYECTO.java
 *      └─ Referencia completa del proyecto
 * 
 * 
 * 🎯 CONCEPTOS CLAVE DEMOSTRADOS
 * ================================
 * 
 * 1. HERENCIA (extends)
 *    ├─ Libro extends Material
 *    ├─ CD extends Material
 *    ├─ UsuarioRegular extends Usuario
 *    └─ UsuarioPremium extends Usuario
 *    └─ Ventaja: Reutilización de código
 * 
 * 2. POLIMORFISMO (Muchas formas)
 *    ├─ ArrayList<Material> contiene Libro y CD
 *    ├─ material.mostrarInformacion()
 *    │   ├─ Si es Libro → muestra info de Libro
 *    │   └─ Si es CD → muestra info de CD
 *    └─ Ventaja: Un código para múltiples tipos
 * 
 * 3. ENCAPSULACIÓN (private/protected)
 *    ├─ Atributos privados: id, titulo, etc.
 *    ├─ Acceso via métodos públicos: getTitulo()
 *    └─ Ventaja: Control de acceso y validación
 * 
 * 4. SOBRECARGA (Mismo nombre, diferentes parámetros)
 *    ├─ Constructor Usuario(id, nombre, apellido, id)
 *    ├─ Constructor Usuario(id, nombre, apellido, id, limite)
 *    └─ Ventaja: Flexibilidad en la interfaz
 * 
 * 5. SOBRESCRITURA (Override - Redefinir en subclase)
 *    ├─ Material.mostrarInformacion()
 *    ├─ Libro.mostrarInformacion() @Override
 *    ├─ CD.mostrarInformacion() @Override
 *    └─ Ventaja: Comportamiento específico por tipo
 * 
 * 
 * 📊 DIAGRAMA RÁPIDO DE HERENCIA
 * ================================
 * 
 *              MATERIAL                    USUARIO
 *                 △                          △
 *                 │ extends                  │ extends
 *        ┌────────┴────────┐       ┌────────┴────────┐
 *        │                 │       │                 │
 *      LIBRO             CD    REGULAR             PREMIUM
 * 
 * 
 * ✨ CARACTERÍSTICAS DEL SISTEMA
 * ================================
 * 
 * ✓ Material.java
 *   └─ Superclase: Define atributos y métodos comunes
 * 
 * ✓ Libro.java
 *   ├─ Extiende: Material
 *   ├─ Agrega: autor, genero
 *   └─ Override: mostrarInformacion()
 * 
 * ✓ CD.java
 *   ├─ Extiende: Material
 *   ├─ Agrega: artista, numeroCanciones, duracionTotal
 *   └─ Override: mostrarInformacion()
 * 
 * ✓ Usuario.java
 *   ├─ Superclase: Define atributos y métodos para usuarios
 *   ├─ Atributos: id, nombre, apellido, limitePrestamos
 *   └─ Métodos: prestarMaterial(), mostrarInformacion()
 * 
 * ✓ UsuarioRegular.java
 *   ├─ Extiende: Usuario
 *   ├─ Límite de préstamo: 3
 *   └─ Override: mostrarInformacion()
 * 
 * ✓ UsuarioPremium.java
 *   ├─ Extiende: Usuario
 *   ├─ Límite de préstamo: 5
 *   └─ Override: mostrarInformacion()
 * 
 * ✓ Biblioteca.java
 *   ├─ ArrayList<Material> materiales (POLIMORFISMO)
 *   ├─ Métodos:
 *   │  ├─ agregarMaterial()
 *   │  ├─ mostrarMateriales() - muestra todos con polimorfismo
 *   │  ├─ mostrarLibros() - filtra con instanceof
 *   │  ├─ mostrarCDs() - filtra con instanceof
 *   │  └─ prestarMaterialAUsuario()
 *   └─ Permite gestionar mixto de Libro, CD, etc.
 * 
 * 
 * 🔍 VALIDACIONES DEL SISTEMA
 * =============================
 * 
 * ✅ Código compila sin errores
 * ✅ Herencia implementada correctamente
 * ✅ Polimorfismo funciona en ArrayList<Material>
 * ✅ Límites de préstamo funcionan:
 *    ├─ Usuario Regular: máximo 3 materiales
 *    └─ Usuario Premium: máximo 5 materiales
 * ✅ Métodos override funcionan correctamente
 * ✅ Sobrecarga de constructores funciona
 * ✅ Main.java ejecuta sin errores
 * ✅ Salida legible y organizada
 * 
 * 
 * 🎓 EJERCICIOS PARA APRENDER
 * =============================
 * 
 * Ejercicio 1: Agregar Revista (Nivel: Fácil)
 * -------------------------------------------
 * 1. Crea una clase Revista que extienda Material
 * 2. Agrega atributos: numero (int), mes (String)
 * 3. Override: mostrarInformacion()
 * 4. En Main, crea una Revista y agrégala a biblioteca
 * 5. Observa cómo aparece automáticamente con su formato
 * 
 * Ejercicio 2: Cambiar Límites (Nivel: Fácil)
 * ------------------------------------------
 * 1. En UsuarioRegular.java, cambia 3 → 2
 * 2. Ejecuta Main
 * 3. Observa cómo el 3er préstamo falla para usuario regular
 * 4. Prueba diferentes números
 * 
 * Ejercicio 3: Agregar método devolverMaterial (Nivel: Medio)
 * -----------------------------------------------------------
 * 1. En Usuario.java, agrega método devolverMaterial(Material)
 * 2. Implementa lógica para remover de lista
 * 3. Marca el material como disponible
 * 4. En Main, prueba devolución y re-préstamo
 * 
 * Ejercicio 4: Buscar por tipo (Nivel: Medio)
 * -------------------------------------------
 * 1. En Biblioteca, agrega método: obtenerLibrosPorAutor(String)
 * 2. Usa instanceof para filtrar Libros
 * 3. Compara autor con getAutor()
 * 4. Retorna lista de libros encontrados
 * 
 * Ejercicio 5: Crear Usuario Estudiante (Nivel: Medio)
 * ---------------------------------------------------
 * 1. Crea UsuarioEstudiante que extienda Usuario
 * 2. Límite de préstamo: 2 (menos que regular)
 * 3. Override: mostrarInformacion()
 * 4. En Main, prueba con un UsuarioEstudiante
 * 
 * 
 * 🐛 SOLUCIÓN DE PROBLEMAS
 * =========================
 * 
 * Problema: No compila
 * Solución: Asegúrate que todos los .java estén en src/
 *           Verifica que extends esté escrito correctamente
 *           Revisa que super() esté en los constructores
 * 
 * Problema: ClassNotFoundException
 * Solución: Compila: javac *.java
 *           Ejecuta: java Main (sin .class)
 *           Verifica estés en el directorio src/
 * 
 * Problema: Límite no funciona
 * Solución: Verifica Usuario.prestarMaterial() usa limitePrestamos
 *           Revisa UsuarioRegular/Premium pasan límite al super()
 * 
 * Problema: CD no aparece en mostrarCDs()
 * Solución: Verifica uso de instanceof CD
 *           Asegúrate material es realmente un CD
 *           Revisa que CD esté en ArrayList de materiales
 * 
 * 
 * 📞 AYUDA RÁPIDA
 * ================
 * 
 * extends
 * -------
 * public class Libro extends Material { }
 *           ▲
 *           └─ Herencia: Libro recibe todo de Material
 * 
 * super()
 * -------
 * super(id, titulo, anio, disponible);
 * └─ Llama constructor de superclase
 * 
 * @Override
 * ---------
 * @Override
 * public void mostrarInformacion() { }
 * └─ Redefine método de superclase
 * 
 * instanceof
 * ----------
 * if (material instanceof Libro) { }
 * └─ Verifica si material es Libro
 * 
 * ArrayList<Material>
 * -------------------
 * ArrayList<Material> lista = new ArrayList<>();
 * lista.add(new Libro(...));  // Válido: Libro es Material
 * lista.add(new CD(...));     // Válido: CD es Material
 * └─ Polimorfismo: pueden convivir en la lista
 * 
 * 
 * 📝 NOTAS IMPORTANTES
 * =====================
 * 
 * • Atributos privados en Material no se ven directamente en Libro
 *   → Acceder via getters (getTitulo(), getId(), etc.)
 * 
 * • Atributos protected en Material SÍ se ven en subclases
 *   → usuarioPrestamo es protected, accesible en Libro y CD
 * 
 * • Los constructores NO se heredan
 *   → Cada subclase debe tener su propio constructor
 *   → Debe llamar a super() para inicializar superclase
 * 
 * • @Override es opcional pero RECOMENDADO
 *   → Ayuda detectar errores si nombre del método cambia
 * 
 * • Una clase solo extiende UNA superclase
 *   → Libro extends Material (OK)
 *   → Libro extends Material, Imprimible (ERROR en Java)
 * 
 * 
 * 🎉 ¡ÉXITO!
 * ===========
 * 
 * Has completado un sistema POO funcional que demuestra:
 * ✓ Herencia
 * ✓ Polimorfismo
 * ✓ Encapsulación
 * ✓ Sobrecarga
 * ✓ Sobrescritura
 * 
 * Próximos pasos:
 * 1. Ejecuta Main.java
 * 2. Lee los documentos educativos
 * 3. Realiza los ejercicios
 * 4. Experimenta con el código
 * 5. ¡Aprende más de POO!
 * 
 * ================================================================
 * Última actualización: 2024
 * Versión: 1.0 - COMPLETA
 * ================================================================
 */
