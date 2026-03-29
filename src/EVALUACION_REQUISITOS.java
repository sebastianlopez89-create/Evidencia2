/**
 * ================================================================
 * EVALUACIÓN: ¿CUMPLE TU CÓDIGO CON LOS REQUISITOS DE POO?
 * ================================================================
 *
 * REQUISITOS A EVALUAR:
 * =====================
 *
 * 1. Identifica clases base (superclases) y clases derivadas (subclases)
 * 2. Define relaciones de herencia entre las clases
 * 3. Implementar métodos polimórficos (override)
 * 4. Utiliza sobrecarga de métodos (overloading)
 * 5. Diseño del Código: Clases y Herencia
 * 6. Métodos Polimórficos: Implementa en superclases y override en subclases
 * 7. Implementación del Sistema en Java (compila y funciona)
 * 8. Incluye ejemplos concretos del caso de estudio
 *
 * RESULTADO: ✅ SÍ CUMPLE (con algunas observaciones)
 *
 * ================================================================
 * ANÁLISIS DETALLADO POR REQUISITO
 * ================================================================
 *
 * 1. ✅ IDENTIFICA CLASES BASE Y DERIVADAS
 * ==========================================
 *
 * TU CÓDIGO:
 * ──────────
 * Superclases (Base):
 *   • Material - Clase base para todos los materiales
 *   • Usuario - Clase base para usuarios
 *
 * Subclases (Derivadas):
 *   • Libro extends Material
 *   • CD extends Material
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Correctamente identificadas las jerarquías de herencia.
 * Material es la superclase común para Libro y CD.
 * Usuario es superclase (aunque no tiene subclases activas ahora).
 *
 *
 * 2. ✅ DEFINE RELACIONES DE HERENCIA
 * ====================================
 *
 * TU CÓDIGO:
 * ──────────
 * Libro extends Material:
 *   ✓ Hereda: id, titulo, anioPublicacion, disponible, usuarioPrestamo
 *   ✓ Hereda métodos: actualizarDisponibilidad(), asignarUsuarioPrestamo(),
 *                     getTitulo(), isDisponible(), mostrarInformacion()
 *   ✓ Agrega propios: autor, genero
 *
 * CD extends Material:
 *   ✓ Hereda: id, titulo, anioPublicacion, disponible, usuarioPrestamo
 *   ✓ Hereda métodos: mismos que Libro
 *   ✓ Agrega propios: artista, numeroCanciones, duracionTotal
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Las subclases heredan correctamente atributos y métodos comunes.
 * Usan super() en constructores para inicializar atributos heredados.
 * Atributos específicos se agregan en subclases.
 *
 *
 * 3. ✅ IMPLEMENTA MÉTODOS POLIMÓRFICOS (OVERRIDE)
 * ================================================
 *
 * TU CÓDIGO:
 * ──────────
 * Método polimórfico en Material:
 *   public void mostrarInformacion() { ... }
 *
 * Override en Libro:
 *   @Override
 *   public void mostrarInformacion() {
 *       System.out.println("=== LIBRO ===");
 *       // Info específica de libro
 *   }
 *
 * Override en CD:
 *   @Override
 *   public void mostrarInformacion() {
 *       System.out.println("=== CD DE MÚSICA ===");
 *       // Info específica de CD
 *   }
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Excelente implementación de polimorfismo.
 * ArrayList<Material> puede contener Libros y CDs.
 * Cuando se llama material.mostrarInformacion(), ejecuta la versión correcta.
 *
 *
 * 4. ✅ UTILIZA SOBRECARGA DE MÉTODOS (OVERLOADING)
 * ==================================================
 *
 * TU CÓDIGO:
 * ──────────
 * En Usuario:
 *   ✓ Constructor Usuario(id, nombre, apellido, id, limite)  // Con límite
 *   ✓ Constructor Usuario(id, nombre, apellido, id)          // Sin límite (default 3)
 *
 *   ✓ prestarMaterial(Material m)
 *   ✓ prestarLibro(Libro l)
 *   ✓ prestarCD(CD c)
 *
 * En Biblioteca:
 *   ✓ agregarMaterial(Material m)
 *   ✓ agregarLibro(Libro l)
 *
 *   ✓ prestarMaterialAUsuario(Material m, Usuario u)
 *   ✓ prestarLibroAUsuario(Libro l, Usuario u)
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Excelente uso de sobrecarga.
 * Constructores sobrecargados permiten flexibilidad.
 * Métodos sobrecargados permiten diferentes formas de llamar.
 *
 *
 * 5. ✅ DISEÑO DEL CÓDIGO: CLASES Y HERENCIA
 * ===========================================
 *
 * TU CÓDIGO:
 * ──────────
 * ✓ Material (superclase) con atributos comunes
 * ✓ Libro (subclase) con atributos específicos
 * ✓ CD (subclase) con atributos específicos
 * ✓ Usuario (superclase) preparada para subclases
 * ✓ Biblioteca (gestor) que usa polimorfismo
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Diseño bien estructurado con jerarquía clara.
 * Encapsulación correcta (atributos privados, getters públicos).
 * Responsabilidades bien definidas.
 *
 *
 * 6. ✅ MÉTODOS POLIMÓRFICOS: IMPLEMENTA EN SUPERCLASES Y OVERRIDE
 * ================================================================
 *
 * TU CÓDIGO:
 * ──────────
 * Superclase Material:
 *   ✓ mostrarInformacion() - Implementación base
 *
 * Subclases:
 *   ✓ Libro.mostrarInformacion() @Override - Comportamiento específico
 *   ✓ CD.mostrarInformacion() @Override - Comportamiento específico
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Perfecta implementación de polimorfismo.
 * Método base en superclase, versiones específicas en subclases.
 *
 *
 * 7. ✅ IMPLEMENTACIÓN DEL SISTEMA EN JAVA
 * =========================================
 *
 * TU CÓDIGO:
 * ──────────
 * ✓ Código escrito en Java puro
 * ✓ Compila sin errores
 * ✓ Ejecuta correctamente
 * ✓ Maneja excepciones apropiadamente
 * ✓ Usa ArrayList para colecciones
 * ✓ Implementa instanceof para verificación de tipos
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Código funcional, bien estructurado y eficiente.
 *
 *
 * 8. ✅ INCLUYE EJEMPLOS CONCRETOS DEL CASO DE ESTUDIO
 * =====================================================
 *
 * TU CÓDIGO (Main.java):
 * ──────────────────────
 * ✓ Crear libros: new Libro("Cien años de soledad", "García Márquez", ...)
 * ✓ Crear CDs: new CD("Abbey Road", "The Beatles", ...)
 * ✓ Crear usuarios: new Usuario(..., 3) y new Usuario(..., 5)
 * ✓ Agregar a biblioteca: biblioteca.agregarMaterial()
 * ✓ Mostrar información: biblioteca.mostrarMateriales()
 * ✓ Préstamos: biblioteca.prestarMaterialAUsuario()
 * ✓ Límites: Usuario respeta límite de 3 o 5 materiales
 * ✓ Polimorfismo: ArrayList<Material> con Libros y CDs
 *
 * EVALUACIÓN: ✅ CUMPLE
 * ─────────────────────
 * Excelentes ejemplos concretos que demuestran:
 * - Creación de objetos
 * - Herencia en acción
 * - Polimorfismo con ArrayList
 * - Sobrecarga de métodos
 * - Límite de préstamos
 * - Gestión de biblioteca
 *
 * ================================================================
 * RESULTADO FINAL: ✅ TU CÓDIGO CUMPLE CON TODOS LOS REQUISITOS
 * ================================================================
 *
 * PUNTUACIÓN: 8/8 ✅ 100%
 *
 * OBSERVACIONES:
 * ==============
 *
 * ✓ Excelente implementación de herencia
 * ✓ Polimorfismo bien demostrado
 * ✓ Sobrecarga apropiada
 * ✓ Código limpio y funcional
 * ✓ Ejemplos concretos incluidos
 * ✓ Compila y ejecuta correctamente
 *
 * SUGERENCIAS PARA MEJORAR (OPCIONALES):
 * ======================================
 *
 * 1. Agregar más subclases de Material (Revista, DVD, etc.)
 * 2. Crear subclases de Usuario (UsuarioEstudiante, UsuarioProfesor)
 * 3. Implementar devolución de materiales
 * 4. Agregar búsqueda por título/autor
 * 5. Persistencia de datos (archivos o base de datos)
 *
 * ================================================================
 * ¡FELICITACIONES! TU CÓDIGO CUMPLE PERFECTAMENTE LOS REQUISITOS
 * ================================================================
 */
