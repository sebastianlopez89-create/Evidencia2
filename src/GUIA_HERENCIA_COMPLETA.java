/**
 * ================================================================
 * GUÍA COMPLETA: HERENCIA EN SISTEMA DE BIBLIOTECA
 * ================================================================
 * 
 * PROBLEMA:
 * ---------
 * Una biblioteca tiene muchos tipos de materiales (Libros, CDs, Revistas, etc.)
 * Todos comparten características comunes pero algunos tienen detalles específicos.
 * 
 * ¿Cómo organizamos el código sin repetir?
 * RESPUESTA: ¡HERENCIA!
 * 
 * 
 * 1. ¿QUÉ ES HERENCIA?
 * ====================
 * 
 * Herencia es la capacidad de que una clase "herede" (reciba) atributos y
 * métodos de otra clase.
 * 
 * Estructura:
 * 
 *     Superclase (Padre)
 *         ▲
 *         │ extends
 *         │
 *     Subclase (Hijo)
 * 
 * 
 * 2. ESTRUCTURA EN NUESTRO PROYECTO
 * ==================================
 * 
 * MATERIAL (Superclase/Clase Base)
 * ├── Atributos comunes a TODOS los materiales:
 * │   ├── id
 * │   ├── titulo
 * │   ├── anioPublicacion
 * │   ├── disponible
 * │   └── usuarioPrestamo
 * │
 * ├── Métodos comunes:
 * │   ├── actualizarDisponibilidad()
 * │   ├── asignarUsuarioPrestamo()
 * │   ├── getTitulo()
 * │   ├── isDisponible()
 * │   └── mostrarInformacion() (polimórfico)
 * │
 * └── Subclases que heredan de Material:
 *     ├── LIBRO
 *     │   ├── Atributos adicionales:
 *     │   │   ├── autor
 *     │   │   └── genero
 *     │   └── Métodos override:
 *     │       └── mostrarInformacion() (con detalles de libro)
 *     │
 *     └── CD
 *         ├── Atributos adicionales:
 *         │   ├── artista
 *         │   ├── numeroCanciones
 *         │   └── duracionTotal
 *         └── Métodos override:
 *             └── mostrarInformacion() (con detalles de CD)
 * 
 * 
 * 3. CÓMO FUNCIONA LA HERENCIA
 * =============================
 * 
 * PASO 1: Crear la clase base (Material)
 * ------
 * public class Material {
 *     private int id;
 *     private String titulo;
 *     // ... más atributos comunes ...
 *     
 *     public void mostrarInformacion() { ... }
 * }
 * 
 * 
 * PASO 2: Crear clases que extiendan Material
 * -----
 * public class Libro extends Material {  ◄-- "extends Material" = hereda de Material
 *     private String autor;
 *     private String genero;
 *     
 *     // Constructor llama a super() para inicializar Material
 *     public Libro(int id, String titulo, String autor, int anio, String genero, boolean disp) {
 *         super(id, titulo, anio, disp);  ◄-- Llama constructor de Material
 *         this.autor = autor;
 *         this.genero = genero;
 *     }
 *     
 *     // Override: Libro personaliza cómo mostrar su información
 *     @Override
 *     public void mostrarInformacion() {
 *         super.mostrarInformacion();  ◄-- Llama método de Material
 *         System.out.println("Autor: " + autor);
 *         System.out.println("Género: " + genero);
 *     }
 * }
 * 
 * 
 * PASO 3: Crear otra subclase
 * ----
 * public class CD extends Material {  ◄-- También hereda de Material
 *     private String artista;
 *     private int numeroCanciones;
 *     
 *     // Similar al Libro...
 * }
 * 
 * 
 * 4. POLIMORFISMO EN ACCIÓN
 * ==========================
 * 
 * ANTES (sin herencia):
 * --------------------
 * ArrayList<Libro> libros = new ArrayList<>();     // Solo libros
 * ArrayList<CD> cds = new ArrayList<>();           // Solo CDs
 * ArrayList<Revista> revistas = new ArrayList<>(); // Solo revistas
 * // Problema: Código repetido, difícil de mantener
 * 
 * 
 * AHORA (con herencia):
 * --------------------
 * ArrayList<Material> materiales = new ArrayList<>();  // ¡Todos!
 * 
 * materiales.add(new Libro(...));  // Agrega un Libro
 * materiales.add(new CD(...));     // Agrega un CD
 * 
 * // Iteramos igual para todos
 * for (Material material : materiales) {
 *     material.mostrarInformacion();  // Polimorfismo: ejecuta la versión correcta
 * }
 * 
 * // Salida automáticamente diferente:
 * // Si es Libro → ejecuta Libro.mostrarInformacion()
 * // Si es CD → ejecuta CD.mostrarInformacion()
 * 
 * 
 * 5. PALABRAS CLAVE IMPORTANTES
 * =============================
 * 
 * extends: Indica que una clase hereda de otra
 * --------
 * public class Libro extends Material { }
 *                    ▲
 *                    └─ Libro hereda de Material
 * 
 * super(): Llama al constructor de la superclase
 * -------
 * super(id, titulo, anio, disponible);  ◄-- Inicializa Material
 * 
 * @Override: Anotación que indica que un método está siendo sobrescrito
 * --------
 * @Override
 * public void mostrarInformacion() { }  ◄-- Este método reemplaza al de Material
 * 
 * instanceof: Verifica si un objeto es instancia de una clase
 * ----------
 * if (material instanceof Libro) {  ◄-- ¿Es un Libro?
 *     // Hacer algo específico para libros
 * }
 * 
 * 
 * 6. VENTAJAS DE LA HERENCIA
 * ==========================
 * 
 * ✓ Reutilización de código: No repetimos atributos/métodos comunes
 * ✓ Organización: Estructura clara de qué es qué
 * ✓ Mantenimiento: Cambiar código en Material afecta a todos automáticamente
 * ✓ Polimorfismo: Tratamos a Libros y CDs igual en listas, pero cada uno actúa diferente
 * ✓ Extensibilidad: Fácil agregar nuevos tipos (Revista, Película, etc.)
 * 
 * 
 * 7. DIAGRAMA DE RELACIONES EN NUESTRO CÓDIGO
 * ============================================
 * 
 *              ┌─────────────┐
 *              │  MATERIAL   │ (Superclase)
 *              └─────────────┘
 *                     ▲
 *                  extends
 *                  /     \
 *                 /       \
 *              LIBRO      CD  (Subclases)
 *     
 *     BIBLIOTECA usa ArrayList<Material>
 *     que puede contener tanto Libros como CDs
 * 
 * 
 * 8. EJEMPLO PRÁCTICO PASO A PASO
 * ================================
 * 
 * // 1. Crear una biblioteca
 * Biblioteca biblioteca = new Biblioteca();
 * 
 * // 2. Crear un Libro (es un Material)
 * Libro libro = new Libro(1, "El Quijote", "Cervantes", 1605, "Novela", true);
 * 
 * // 3. Crear un CD (es un Material)
 * CD cd = new CD(2, "Abbey Road", "The Beatles", 1969, 17, "47:31", true);
 * 
 * // 4. Agregar a la biblioteca (ambos son Materials)
 * biblioteca.agregarMaterial(libro);
 * biblioteca.agregarMaterial(cd);
 * 
 * // 5. Mostrar todos
 * biblioteca.mostrarMateriales();
 * // Resultado: Muestra el Libro con "Autor: Cervantes, Género: Novela"
 * //            Muestra el CD con "Artista: The Beatles, Canciones: 17"
 * 
 * // ¡Sin duplicación de código y cada uno muestra su info!
 * 
 * 
 * 9. COMPARACIÓN: CON HERENCIA vs SIN HERENCIA
 * =============================================
 * 
 * SIN HERENCIA (❌ No recomendado):
 * ├── Clase Libro
 * │   ├── id ❌ duplicado
 * │   ├── titulo ❌ duplicado
 * │   ├── disponible ❌ duplicado
 * │   ├── autor
 * │   └── genero
 * │
 * └── Clase CD
 *     ├── id ❌ duplicado
 *     ├── titulo ❌ duplicado
 *     ├── disponible ❌ duplicado
 *     ├── artista
 *     └── numeroCanciones
 * 
 * CON HERENCIA (✓ Recomendado):
 * ├── Material (base)
 * │   ├── id ✓ una sola vez
 * │   ├── titulo ✓ una sola vez
 * │   ├── disponible ✓ una sola vez
 * │
 * ├── Libro (hereda de Material)
 * │   ├── autor
 * │   └── genero
 * │
 * └── CD (hereda de Material)
 *     ├── artista
 *     └── numeroCanciones
 * 
 * 
 * 10. REGLAS IMPORTANTES
 * ======================
 * 
 * ✓ Una clase solo puede extender UNA superclase directa
 *   (Libro extends Material OK)
 *   (Libro extends Material, Imprimible NO - Java no lo permite)
 * 
 * ✓ Una clase puede ser extendida por muchas subclases
 *   (Material puede tener Libro, CD, Revista, Película...)
 * 
 * ✓ Las subclases heredan atributos y métodos públicos/protegidos
 *   (No hereda atributos privados directamente, pero puede acceder via getters)
 * 
 * ✓ Los constructores NO se heredan, debe llamar a super()
 *   (Cada subclase debe tener su propio constructor)
 * 
 * ✓ @Override es opcional pero recomendado para claridad
 * 
 * 
 * ================================================================
 * ¡AHORA COMPRENDERÁS EL CÓDIGO EN LA CLASE MATERIAL.JAVA!
 * ================================================================
 */
