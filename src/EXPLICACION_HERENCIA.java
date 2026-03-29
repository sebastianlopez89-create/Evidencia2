/**
 * DIAGRAMA DE HERENCIA - SISTEMA DE BIBLIOTECA
 * 
 * ┌─────────────────────────────────────────────────────────────┐
 * │                        MATERIAL                              │
 * │                   (SUPERCLASE BASE)                          │
 * ├─────────────────────────────────────────────────────────────┤
 * │ Atributos:                                                   │
 * │  - id: int                                                   │
 * │  - titulo: String                                            │
 * │  - anioPublicacion: int                                      │
 * │  - disponible: boolean                                       │
 * │  - usuarioPrestamo: String                                   │
 * ├─────────────────────────────────────────────────────────────┤
 * │ Métodos:                                                     │
 * │  - actualizarDisponibilidad(boolean)                         │
 * │  - asignarUsuarioPrestamo(String)                            │
 * │  - getTitulo(): String                                       │
 * │  - isDisponible(): boolean                                   │
 * │  + mostrarInformacion() (POLIMÓRFICO)                        │
 * └─────────────────────────────────────────────────────────────┘
 *                          ▲
 *                          │ extends (HERENCIA)
 *        ┌─────────────────┴─────────────────┐
 *        │                                   │
 * ┌──────────────┐                  ┌──────────────┐
 * │    LIBRO     │                  │      CD      │
 * │  (SUBCLASE)  │                  │  (SUBCLASE)  │
 * ├──────────────┤                  ├──────────────┤
 * │ Atributos:   │                  │ Atributos:   │
 * │  - autor     │                  │  - artista   │
 * │  - genero    │                  │  - numeroCan.│
 * │              │                  │  - duracion  │
 * ├──────────────┤                  ├──────────────┤
 * │ Override:    │                  │ Override:    │
 * │ mostrarInfo()│                  │ mostrarInfo()│
 * └──────────────┘                  └──────────────┘
 * 
 * 
 * CLASE BIBLIOTECA:
 * ┌────────────────────────────────────────┐
 * │          BIBLIOTECA                    │
 * ├────────────────────────────────────────┤
 * │ - materiales: ArrayList<Material>      │ ◄─ POLIMORFISMO
 * │   (puede contener Libros y CDs)        │
 * │ - usuarios: ArrayList<Usuario>         │
 * ├────────────────────────────────────────┤
 * │ Métodos:                               │
 * │ - agregarMaterial(Material)            │
 * │ - mostrarMateriales()                  │
 * │ - mostrarLibros() (filtra Libros)      │
 * │ - mostrarCDs() (filtra CDs)            │
 * │ - prestarMaterialAUsuario()            │
 * └────────────────────────────────────────┘
 * 
 * 
 * CONCEPTO CLAVE: POLIMORFISMO
 * ============================
 * 
 * Cuando la Biblioteca almacena "ArrayList<Material> materiales",
 * puede guardar tanto Libros como CDs porque ambos son tipos de Material.
 * 
 * Cuando llama a "material.mostrarInformacion()", Java automáticamente
 * ejecuta la versión correcta:
 *  - Si es un Libro → ejecuta Libro.mostrarInformacion()
 *  - Si es un CD → ejecuta CD.mostrarInformacion()
 * 
 * ¡Esto es POLIMORFISMO en acción!
 * 
 * 
 * EJEMPLO DE USO:
 * ================
 * 
 * // Creamos objetos
 * Libro libro = new Libro(1, "Titulo", "Autor", 2020, "Género", true);
 * CD cd = new CD(2, "Album", "Artista", 2020, 10, "40:00", true);
 * 
 * Biblioteca biblioteca = new Biblioteca();
 * 
 * // Agregamos ambos a la biblioteca (ambos son Materiales)
 * biblioteca.agregarMaterial(libro);
 * biblioteca.agregarMaterial(cd);
 * 
 * // Mostramos todos
 * biblioteca.mostrarMateriales(); // Muestra ambos correctamente
 * 
 * // Filtramos solo libros
 * biblioteca.mostrarLibros(); // Muestra solo el libro
 * 
 * // Filtramos solo CDs
 * biblioteca.mostrarCDs(); // Muestra solo el CD
 */
