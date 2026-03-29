/**
 * ================================================================
 * RESUMEN VISUAL: SISTEMA COMPLETO DE BIBLIOTECA CON HERENCIA
 * ================================================================
 * 
 * 
 * ESTRUCTURA DE CLASES:
 * ====================
 * 
 * ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
 * ┃              JERARQUÍA DE MATERIALES                        ┃
 * ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫
 * ┃                                                             ┃
 * ┃                    ┌─────────────┐                          ┃
 * ┃                    │  MATERIAL   │ ← Superclase (Base)     ┃
 * ┃                    │  (Padre)    │                          ┃
 * ┃                    └──────┬──────┘                          ┃
 * ┃                           │                                 ┃
 * ┃              ┌────────────┴────────────┐                    ┃
 * ┃              │                         │                    ┃
 * ┃         ┌────▼────┐             ┌─────▼────┐              ┃
 * ┃         │  LIBRO  │             │    CD    │              ┃
 * ┃         │(Subclase│             │(Subclase)│              ┃
 * ┃         │  Hijo)  │             │  Hijo)   │              ┃
 * ┃         └─────────┘             └──────────┘              ┃
 * ┃                                                             ┃
 * ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
 * 
 * 
 * FLUJO DE DATOS EN LA BIBLIOTECA:
 * ================================
 * 
 *     Usuario Regular  ──┐
 *                         │
 *     Usuario Premium  ──┤
 *                         │     ┌────────────────┐
 *                         └────►│   BIBLIOTECA   │
 *                               └────────────────┘
 *                                       │
 *                                       ├──► ArrayList<Material>
 *                                       │    ├── Libro 1
 *                                       │    ├── Libro 2
 *                                       │    ├── CD 1
 *                                       │    └── CD 2
 *                                       │
 *                                       ├──► mostrarMateriales()
 *                                       │    └── Usa polimorfismo
 *                                       │
 *                                       ├──► mostrarLibros()
 *                                       │    └── Filtra instanceof Libro
 *                                       │
 *                                       └──► mostrarCDs()
 *                                            └── Filtra instanceof CD
 * 
 * 
 * CLASES Y SUS RESPONSABILIDADES:
 * ===============================
 * 
 * ┌─────────────────────────────────────────────────────────────┐
 * │ MATERIAL                                                    │
 * │ Responsabilidad: Definir atributos y métodos comunes       │
 * ├─────────────────────────────────────────────────────────────┤
 * │ Atributos:                                                  │
 * │  • id: int (identificador único)                            │
 * │  • titulo: String (nombre del material)                     │
 * │  • anioPublicacion: int (año de creación)                   │
 * │  • disponible: boolean (¿está disponible para prestar?)    │
 * │  • usuarioPrestamo: String (quién lo tiene actualmente)    │
 * │                                                              │
 * │ Métodos:                                                    │
 * │  • actualizarDisponibilidad(boolean): void                 │
 * │  • asignarUsuarioPrestamo(String): void                    │
 * │  • getTitulo(): String                                      │
 * │  • isDisponible(): boolean                                  │
 * │  • getId(): int                                             │
 * │  • mostrarInformacion(): void (polimórfico)               │
 * └─────────────────────────────────────────────────────────────┘
 *                              △
 *                              │ extends
 *         ┌────────────────────┴────────────────────┐
 *         │                                         │
 * ┌───────────────────────────┐         ┌─────────────────────────┐
 * │ LIBRO                     │         │ CD                      │
 * │ Responsabilidad: Representar│         │ Responsabilidad: Repr. │
 * │ libros en la biblioteca    │         │ CDs/discos en biblio   │
 * ├───────────────────────────┤         ├─────────────────────────┤
 * │ Atributos heredados:      │         │ Atributos heredados:    │
 * │ ✓ id, titulo, año, ...    │         │ ✓ id, titulo, año, ... │
 * │                           │         │                        │
 * │ Atributos propios:        │         │ Atributos propios:     │
 * │ • autor: String           │         │ • artista: String      │
 * │ • genero: String          │         │ • numeroCanciones: int │
 * │                           │         │ • duracionTotal: String│
 * │ Métodos override:         │         │ Métodos override:      │
 * │ • mostrarInformacion()    │         │ • mostrarInformacion() │
 * │   (muestra + autor/genero)│         │   (muestra + artista)  │
 * └───────────────────────────┘         └─────────────────────────┘
 * 
 * 
 * COMPARACIÓN DE INSTANCIACIÓN:
 * =============================
 * 
 * // Crear un Libro (es un Material)
 * Libro libro = new Libro(1, "El Quijote", "Cervantes", 1605, "Novela", true);
 * 
 * // Crear un CD (es un Material)
 * CD cd = new CD(101, "Abbey Road", "Beatles", 1969, 17, "47:31", true);
 * 
 * // Ambos son Materiales, así que pueden ir en la misma lista
 * Material m1 = new Libro(...);  ✓ Válido: Libro es Material
 * Material m2 = new CD(...);     ✓ Válido: CD es Material
 * 
 * ArrayList<Material> lista = new ArrayList<>();
 * lista.add(m1);
 * lista.add(m2);
 * 
 * // Polimorfismo en acción
 * for (Material m : lista) {
 *     m.mostrarInformacion();  // Cada uno muestra su versión
 * }
 * 
 * 
 * PALABRA CLAVE: instanceof (Verificación de tipo)
 * ================================================
 * 
 * for (Material material : biblioteca.getMateriales()) {
 *     if (material instanceof Libro) {
 *         System.out.println("Es un Libro!");
 *         Libro libro = (Libro) material;  // Cast: convertir a Libro
 *         System.out.println("Autor: " + libro.getAutor());
 *     }
 *     else if (material instanceof CD) {
 *         System.out.println("Es un CD!");
 *         CD cd = (CD) material;  // Cast: convertir a CD
 *         System.out.println("Artista: " + cd.getArtista());
 *     }
 * }
 * 
 * 
 * FLUJO DE EJECUCIÓN: mostrarMateriales()
 * =======================================
 * 
 * Código en Biblioteca.java:
 * 
 *     public void mostrarMateriales() {
 *         for (Material material : materiales) {
 *             material.mostrarInformacion();  // ← ¿Cuál versión se ejecuta?
 *         }
 *     }
 * 
 * En tiempo de ejecución (POLIMORFISMO):
 * 
 *     Si material es instancia de Libro
 *        → Ejecuta Libro.mostrarInformacion()
 *           Imprime: === LIBRO ===
 *                    Id: 1
 *                    Título: El Quijote
 *                    Autor: Cervantes  ← Específico de Libro
 *                    Género: Novela    ← Específico de Libro
 * 
 *     Si material es instancia de CD
 *        → Ejecuta CD.mostrarInformacion()
 *           Imprime: === CD DE MÚSICA ===
 *                    Id: 101
 *                    Título: Abbey Road
 *                    Artista: Beatles    ← Específico de CD
 *                    Canciones: 17       ← Específico de CD
 * 
 * 
 * ¿CÓMO FUNCIONA super()?
 * =======================
 * 
 * Libro.java:
 * 
 *     public Libro(...) {
 *         super(id, titulo, anioPublicacion, disponible);
 *         // ↑ Llama al constructor de Material para inicializar
 *         //   los atributos heredados: id, titulo, año, disponible
 *         
 *         this.autor = autor;  // Inicializa atributo propio
 *         this.genero = genero;
 *     }
 * 
 * Resultado:
 *     - Los 4 primeros parámetros van a Material (vía super)
 *     - Los 2 últimos van a Libro (autor y genero)
 * 
 * 
 * VENTAJAS RESUMIDAS:
 * ===================
 * 
 * 1. MENOS CÓDIGO
 *    Material define una vez: id, titulo, disponible
 *    Libro y CD heredan automaticamente
 * 
 * 2. FÁCIL MANTENIMIENTO
 *    Cambiar cómo se actualiza disponibilidad:
 *    - Cambias Material.actualizarDisponibilidad()
 *    - Automáticamente afecta Libro y CD
 * 
 * 3. POLIMORFISMO
 *    ArrayList<Material> puede guardar Libros Y CDs
 *    Cada uno muestra su info de forma diferente
 * 
 * 4. FÁCIL DE EXTENDER
 *    Quieres agregar Revistas? Creas:
 *    public class Revista extends Material { ... }
 *    ¡Funciona automáticamente con todo!
 * 
 * 
 * ================================================================
 * ¡ESTO ES LA ESENCIA DE LA PROGRAMACIÓN ORIENTADA A OBJETOS (POO)!
 * ================================================================
 */
