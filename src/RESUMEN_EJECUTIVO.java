/**
 * ================================================================
 * RESUMEN EJECUTIVO: SISTEMA DE BIBLIOTECA CON HERENCIA
 * ================================================================
 * 
 * ¿QUÉ SE HA REALIZADO?
 * =====================
 * 
 * Se ha creado un sistema completo de gestión de biblioteca que demuestra
 * los principios fundamentales de Programación Orientada a Objetos (POO):
 * 
 * ✅ HERENCIA
 * ✅ POLIMORFISMO
 * ✅ ENCAPSULACIÓN
 * ✅ SOBRECARGA Y SOBRESCRITURA
 * 
 * 
 * ESTRUCTURA DEL PROYECTO
 * =======================
 * 
 * 📁 src/
 * ├── 📄 MATERIAL.JAVA (Superclase - Base)
 * ├── 📄 LIBRO.JAVA (Subclase - Hereda de Material)
 * ├── 📄 CD.JAVA (Subclase - Hereda de Material)
 * ├── 📄 USUARIO.JAVA (Superclase - Base)
 * ├── 📄 USUARIOREGULAR.JAVA (Subclase - Hereda de Usuario)
 * ├── 📄 USUARIOPREMIUM.JAVA (Subclase - Hereda de Usuario)
 * ├── 📄 BIBLIOTECA.JAVA (Gestor - Usa Polimorfismo)
 * ├── 📄 MAIN.JAVA (Programa Principal - Demostración)
 * │
 * ├── 📚 ARCHIVOS DE DOCUMENTACIÓN:
 * ├── 📄 GUIA_HERENCIA_COMPLETA.JAVA
 * ├── 📄 EXPLICACION_HERENCIA.JAVA
 * ├── 📄 RESUMEN_VISUAL_SISTEMA.JAVA
 * ├── 📄 DIAGRAMA_UML_COMPLETO.JAVA
 * └── 📄 EJEMPLOS_PRACTICOS.JAVA
 * 
 * 
 * CONCEPTO 1: HERENCIA
 * ====================
 * 
 * ¿Qué es?
 * --------
 * La herencia permite que una clase (subclase) herede características
 * (atributos y métodos) de otra clase (superclase).
 * 
 * Ejemplo en nuestro código:
 * --------------------------
 * 
 * public class Libro extends Material {
 *     // Libro hereda todos los atributos y métodos de Material
 *     // Más sus propios atributos: autor, genero
 * }
 * 
 * Ventaja:
 * --------
 * ✓ NO repetimos código de Material en Libro ni en CD
 * ✓ Cambios en Material automáticamente afectan a Libro y CD
 * ✓ Código más limpio y organizado
 * 
 * 
 * CONCEPTO 2: POLIMORFISMO
 * ========================
 * 
 * ¿Qué es?
 * --------
 * Polimorfismo significa "muchas formas". Un método puede tener
 * comportamientos diferentes en diferentes clases.
 * 
 * Ejemplo en nuestro código:
 * --------------------------
 * 
 * // En Biblioteca.java
 * ArrayList<Material> materiales = new ArrayList<>();
 * materiales.add(new Libro(...));
 * materiales.add(new CD(...));
 * 
 * for (Material m : materiales) {
 *     m.mostrarInformacion();  // Ejecuta la versión correcta
 * }
 * 
 * Resultado automático:
 * - Si m es Libro → ejecuta Libro.mostrarInformacion()
 * - Si m es CD → ejecuta CD.mostrarInformacion()
 * 
 * Ventaja:
 * --------
 * ✓ Un solo ArrayList puede contener Libros y CDs
 * ✓ Cada uno se comporta diferente sin cambiar el código
 * ✓ Fácil agregar nuevos tipos (Revista, DVD, etc.)
 * 
 * 
 * CONCEPTO 3: SOBRECARGA (OVERLOADING)
 * ====================================
 * 
 * ¿Qué es?
 * --------
 * Múltiples métodos con el mismo nombre pero diferente número/tipo
 * de parámetros.
 * 
 * Ejemplo en nuestro código:
 * --------------------------
 * 
 * public class Usuario {
 *     // Sobrecarga de constructor
 *     public Usuario(int id, String nombre, String apellido, int id, int limite) { }
 *     public Usuario(int id, String nombre, String apellido, int id) { }
 *     // El segundo usa límite por defecto (3)
 *     
 *     // Sobrecarga de método
 *     public void prestarMaterial(Material m) { }
 *     public void prestarLibro(Libro l) { }
 *     public void prestarCD(CD c) { }
 * }
 * 
 * Ventaja:
 * --------
 * ✓ Flexibilidad: puedo usar constructor con o sin límite
 * ✓ Claridad: métodos específicos para Libro, CD, etc.
 * 
 * 
 * CONCEPTO 4: SOBRESCRITURA (OVERRIDE)
 * ===================================
 * 
 * ¿Qué es?
 * --------
 * Redefinir un método de la superclase en la subclase para
 * proporcionar comportamiento específico.
 * 
 * Ejemplo en nuestro código:
 * --------------------------
 * 
 * // Material.java
 * public void mostrarInformacion() {
 *     System.out.println("Material base...");
 * }
 * 
 * // Libro.java
 * @Override
 * public void mostrarInformacion() {
 *     System.out.println("=== LIBRO ===");
 *     System.out.println("Autor: " + autor);
 *     System.out.println("Género: " + genero);
 * }
 * 
 * // CD.java
 * @Override
 * public void mostrarInformacion() {
 *     System.out.println("=== CD ===");
 *     System.out.println("Artista: " + artista);
 * }
 * 
 * Ventaja:
 * --------
 * ✓ Cada subclase personaliza cómo muestra su información
 * ✓ Polimorfismo en acción: mismo método, diferentes resultados
 * 
 * 
 * CLASES PRINCIPALES Y SUS ROLES
 * ===============================
 * 
 * MATERIAL (Superclase)
 * ├─ Rol: Define propiedades comunes a todos los materiales
 * ├─ Atributos: id, titulo, anio, disponible, usuarioPrestamo
 * └─ Métodos: getTitulo(), isDisponible(), mostrarInformacion()
 * 
 * LIBRO (Subclase)
 * ├─ Rol: Representa libros específicamente
 * ├─ Atributos propios: autor, genero
 * ├─ Hereda de: Material
 * └─ Override: mostrarInformacion() (con detalles de libro)
 * 
 * CD (Subclase)
 * ├─ Rol: Representa CDs específicamente
 * ├─ Atributos propios: artista, numeroCanciones, duracion
 * ├─ Hereda de: Material
 * └─ Override: mostrarInformacion() (con detalles de CD)
 * 
 * USUARIO (Superclase)
 * ├─ Rol: Define propiedades comunes a todos los usuarios
 * ├─ Atributos: id, nombre, apellido, limitePrestamos
 * └─ Métodos: prestarMaterial(), mostrarInformacion()
 * 
 * USUARIOREGULAR (Subclase)
 * ├─ Rol: Usuario con límite de 3 materiales
 * ├─ Límite: 3 (definido en constructor)
 * └─ Override: mostrarInformacion() (muestra "Usuario Regular")
 * 
 * USUARIOPREMIUM (Subclase)
 * ├─ Rol: Usuario con límite de 5 materiales
 * ├─ Límite: 5 (definido en constructor)
 * └─ Override: mostrarInformacion() (muestra "Usuario Premium")
 * 
 * BIBLIOTECA
 * ├─ Rol: Gestor central del sistema
 * ├─ Almacena: ArrayList<Material> materiales (Polimorfismo)
 * └─ Funciones: Agregar, mostrar, prestar materiales
 * 
 * 
 * CASOS DE USO DEMOSTRADOS
 * ========================
 * 
 * 1. Agregar diferentes tipos de materiales
 *    biblioteca.agregarMaterial(libro);   ✓
 *    biblioteca.agregarMaterial(cd);      ✓
 * 
 * 2. Mostrar todos los materiales (cada uno con su formato)
 *    biblioteca.mostrarMateriales();      ✓
 * 
 * 3. Filtrar solo libros o solo CDs
 *    biblioteca.mostrarLibros();          ✓ (filtra instanceof)
 *    biblioteca.mostrarCDs();             ✓ (filtra instanceof)
 * 
 * 4. Prestar materiales con límite de usuario
 *    biblioteca.prestarMaterialAUsuario(material, usuario);
 *    ✓ Usuario regular: máximo 3
 *    ✓ Usuario premium: máximo 5
 * 
 * 5. Mostrar información personalizada
 *    usuario.mostrarInformacion();        ✓ (muestra tipo de usuario)
 *    material.mostrarInformacion();       ✓ (muestra tipo de material)
 * 
 * 
 * PATRÓN DE DISEÑO: POLIMORFISMO CON ArrayList<Material>
 * =======================================================
 * 
 * Código:
 * -------
 * for (Material m : biblioteca.getMateriales()) {
 *     m.mostrarInformacion();  // ← Polimorfismo aquí
 * }
 * 
 * Lo que sucede en tiempo de ejecución:
 * 
 * Si m es Libro:     Ejecuta Libro.mostrarInformacion()
 *                    Muestra: === LIBRO ===
 *                            Autor: ...
 *                            Género: ...
 * 
 * Si m es CD:        Ejecuta CD.mostrarInformacion()
 *                    Muestra: === CD DE MÚSICA ===
 *                            Artista: ...
 *                            Canciones: ...
 * 
 * Beneficio:
 * ----------
 * ✓ Un solo loop para todos los tipos
 * ✓ Cada tipo muestra su información correctamente
 * ✓ Fácil agregar nuevos tipos sin cambiar el loop
 * 
 * 
 * CÓMO EJECUTAR
 * =============
 * 
 * 1. Abre el proyecto en IntelliJ IDEA
 * 2. Ejecuta: Main.java
 * 3. Observa la salida del programa
 * 
 * La salida mostrará:
 * ✓ Información de usuarios (Regular y Premium)
 * ✓ Todos los materiales (Libros y CDs)
 * ✓ Solo libros
 * ✓ Solo CDs
 * ✓ Simulación de préstamos
 * ✓ Validación del límite de 3 para regulares, 5 para premium
 * 
 * 
 * EXTENSIBILIDAD: AGREGAR NUEVOS TIPOS
 * ====================================
 * 
 * Para agregar una nueva clase (ejemplo: Revista):
 * 
 * 1. Crear Revista.java:
 *    public class Revista extends Material {
 *        private int numero;
 *        private String mes;
 *        
 *        @Override
 *        public void mostrarInformacion() { ... }
 *    }
 * 
 * 2. En Main.java:
 *    Revista rev = new Revista(201, "Scientific", 45, 2024, "Marzo", true);
 *    biblioteca.agregarMaterial(rev);
 * 
 * 3. ¡Listo! Automáticamente:
 *    - Aparecerá en mostrarMateriales()
 *    - Tendrá todos los métodos heredados de Material
 *    - Su mostrarInformacion() personalizada se ejecutará
 * 
 * 
 * PALABRAS CLAVE USADAS
 * ====================
 * 
 * extends     → Indica herencia
 * super()     → Llama al constructor de la superclase
 * @Override   → Indica sobrescritura de método
 * instanceof  → Verifica tipo de objeto
 * final       → Indica que no se puede sobrescribir
 * private     → Encapsulación - solo acceso interno
 * public      → Acceso desde cualquier lugar
 * this        → Referencia al objeto actual
 * 
 * 
 * VALIDACIÓN DEL SISTEMA
 * ======================
 * 
 * ✅ Herencia implementada correctamente
 *    - Libro y CD heredan de Material
 *    - Usuario Regular y Premium heredan de Usuario
 * 
 * ✅ Polimorfismo funcional
 *    - ArrayList<Material> contiene Libros y CDs
 *    - mostrarInformacion() ejecuta la versión correcta
 * 
 * ✅ Sobrecarga implementada
 *    - Constructores sobrecargados en Usuario
 *    - Métodos sobrecargados en Usuario y Biblioteca
 * 
 * ✅ Sobrescritura implementada
 *    - @Override en mostrarInformacion() de Libro y CD
 * 
 * ✅ Límite de préstamos funciona
 *    - Usuarios regulares: máximo 3
 *    - Usuarios premium: máximo 5
 * 
 * ✅ Código compila sin errores
 * 
 * 
 * ================================================================
 * ¡EL SISTEMA ESTÁ COMPLETO Y LISTO PARA USAR!
 * ================================================================
 * 
 * Todos los archivos de documentación están en:
 * C:\\Users\\PERSONAL\\IdeaProjects\\Evidencia2.0\\src\\
 * 
 * Archivos de código:
 * - Material.java
 * - Libro.java
 * - CD.java
 * - Usuario.java
 * - UsuarioRegular.java
 * - UsuarioPremium.java
 * - Biblioteca.java
 * - Main.java
 * 
 * Archivos de documentación (lee estos para aprender):
 * - GUIA_HERENCIA_COMPLETA.java
 * - RESUMEN_VISUAL_SISTEMA.java
 * - EJEMPLOS_PRACTICOS.java
 * - DIAGRAMA_UML_COMPLETO.java
 * 
 */
