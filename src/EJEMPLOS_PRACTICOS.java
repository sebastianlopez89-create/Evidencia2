/**
 * ================================================================
 * EJEMPLOS PRÁCTICOS: USANDO EL SISTEMA DE BIBLIOTECA
 * ================================================================
 * 
 * Este archivo muestra cómo usar las clases y demuestra
 * los conceptos de herencia, polimorfismo y sobrecarga.
 * 
 * 
 * EJEMPLO 1: Crear y usar un Libro
 * =================================
 * 
 * // Crear un libro
 * Libro libro1 = new Libro(
 *     1,                          // id
 *     "Cien años de soledad",     // titulo
 *     "Gabriel García Márquez",   // autor
 *     1967,                       // anioPublicacion
 *     "Novela",                   // genero
 *     true                        // disponible
 * );
 * 
 * // Usar métodos heredados de Material
 * libro1.getTitulo();               // ← Heredado
 * libro1.isDisponible();            // ← Heredado
 * libro1.actualizarDisponibilidad(false);  // ← Heredado
 * 
 * // Usar método propio
 * String autor = libro1.getAutor();
 * 
 * // Mostrar información (override de Material)
 * libro1.mostrarInformacion();
 * // Salida:
 * // === LIBRO ===
 * // Id: 1
 * // Título: Cien años de soledad
 * // Autor: Gabriel García Márquez
 * // Año de publicación: 1967
 * // Género: Novela
 * // Disponibilidad: Disponible
 * // Prestado a: Ninguno
 * 
 * 
 * EJEMPLO 2: Crear y usar un CD
 * ==============================
 * 
 * // Crear un CD
 * CD cd1 = new CD(
 *     101,              // id
 *     "Abbey Road",     // titulo
 *     "The Beatles",    // artista
 *     1969,             // anioPublicacion
 *     17,               // numeroCanciones
 *     "47:31",          // duracionTotal
 *     true              // disponible
 * );
 * 
 * // Usar métodos heredados de Material
 * cd1.getTitulo();                 // ← Heredado
 * cd1.isDisponible();              // ← Heredado
 * 
 * // Usar método propio
 * String artista = cd1.getArtista();
 * 
 * // Mostrar información (override de Material)
 * cd1.mostrarInformacion();
 * // Salida:
 * // === CD DE MÚSICA ===
 * // Id: 101
 * // Título: Abbey Road
 * // Artista: The Beatles
 * // Año de publicación: 1969
 * // Número de canciones: 17
 * // Duración total: 47:31
 * // Disponibilidad: Disponible
 * // Prestado a: Ninguno
 * 
 * 
 * EJEMPLO 3: Polimorfismo - Almacenar diferentes tipos
 * ====================================================
 * 
 * // Crear una lista que almacena Material (superclase)
 * ArrayList<Material> materiales = new ArrayList<>();
 * 
 * // Agregar Libro (es un Material)
 * Libro libro = new Libro(1, "El Quijote", "Cervantes", 1605, "Novela", true);
 * materiales.add(libro);
 * 
 * // Agregar CD (es un Material)
 * CD cd = new CD(101, "Abbey Road", "Beatles", 1969, 17, "47:31", true);
 * materiales.add(cd);
 * 
 * // ¡Ambos están en la misma lista!
 * // Esto es POLIMORFISMO: diferentes tipos en mismo contenedor
 * 
 * // Iterar y mostrar cada uno correctamente
 * for (Material material : materiales) {
 *     material.mostrarInformacion();
 *     // Automáticamente ejecuta la versión correcta:
 *     // - Libro.mostrarInformacion() para el Libro
 *     // - CD.mostrarInformacion() para el CD
 * }
 * 
 * 
 * EJEMPLO 4: Usar Biblioteca (el contenedor principal)
 * ===================================================
 * 
 * // Crear la biblioteca
 * Biblioteca biblioteca = new Biblioteca();
 * 
 * // Crear materiales
 * Libro l1 = new Libro(1, "Don Quijote", "Cervantes", 1605, "Novela", true);
 * Libro l2 = new Libro(2, "Cien años", "Márquez", 1967, "Novela", true);
 * CD cd1 = new CD(101, "Abbey Road", "Beatles", 1969, 17, "47:31", true);
 * 
 * // Agregar a la biblioteca
 * biblioteca.agregarLibro(l1);        // También puede ser agregarMaterial()
 * biblioteca.agregarLibro(l2);
 * biblioteca.agregarMaterial(cd1);    // Método más genérico
 * 
 * // Mostrar TODOS los materiales
 * biblioteca.mostrarMateriales();
 * // Muestra los 3 materiales, cada uno con su formato
 * 
 * // Mostrar solo LIBROS
 * biblioteca.mostrarLibros();
 * // Muestra solo l1 y l2
 * 
 * // Mostrar solo CDs
 * biblioteca.mostrarCDs();
 * // Muestra solo cd1
 * 
 * 
 * EJEMPLO 5: Sobrecarga de constructores en Usuario
 * ==================================================
 * 
 * // Constructor SIN especificar límite (usa 3 por defecto)
 * Usuario usuario1 = new Usuario(1, "Ana", "López", 123456789);
 * // Equivalente a: new Usuario(1, "Ana", "López", 123456789, 3)
 * 
 * // Constructor CON límite específico
 * Usuario usuario2 = new Usuario(2, "Carlos", "Gómez", 987654321, 5);
 * 
 * // O crear subclases (recomendado para claridad)
 * UsuarioRegular u1 = new UsuarioRegular(1, "Ana", "López", 123456789);
 * // Automáticamente tiene límite 3
 * 
 * UsuarioPremium u2 = new UsuarioPremium(2, "Carlos", "Gómez", 987654321);
 * // Automáticamente tiene límite 5
 * 
 * 
 * EJEMPLO 6: Verificación de tipo con instanceof
 * ===============================================
 * 
 * ArrayList<Material> materiales = biblioteca.getMateriales();
 * 
 * for (Material m : materiales) {
 *     if (m instanceof Libro) {
 *         Libro libro = (Libro) m;  // Cast: convertir a Libro
 *         System.out.println("Libro encontrado: " + libro.getAutor());
 *     }
 *     else if (m instanceof CD) {
 *         CD cd = (CD) m;  // Cast: convertir a CD
 *         System.out.println("CD encontrado: " + cd.getArtista());
 *     }
 * }
 * 
 * 
 * EJEMPLO 7: Sobrecarga de métodos en Usuario
 * ============================================
 * 
 * Usuario usuario = new UsuarioRegular(1, "Ana", "López", 123456789);
 * 
 * // Crear un libro y un CD
 * Libro libro = new Libro(1, "El Quijote", "Cervantes", 1605, "Novela", true);
 * CD cd = new CD(101, "Abbey Road", "Beatles", 1969, 17, "47:31", true);
 * 
 * // Prestar usando el método genérico
 * usuario.prestarMaterial(libro);  // Método genérico
 * usuario.prestarMaterial(cd);
 * 
 * // O usar métodos sobrecargados específicos
 * usuario.prestarLibro(libro);     // Sobrecarga: específico para Libro
 * usuario.prestarCD(cd);           // Sobrecarga: específico para CD
 * 
 * // Todos hacen lo mismo: llaman a prestarMaterial()
 * // Esto es SOBRECARGA: mismo nombre, diferente parámetro
 * 
 * 
 * EJEMPLO 8: Demostración completa
 * =================================
 * 
 * // 1. Crear biblioteca
 * Biblioteca biblioteca = new Biblioteca();
 * 
 * // 2. Crear materiales
 * Libro l1 = new Libro(1, "1984", "George Orwell", 1949, "Distopía", true);
 * Libro l2 = new Libro(2, "Brave New World", "Huxley", 1932, "Distopía", true);
 * CD cd = new CD(101, "Dark Side", "Pink Floyd", 1973, 10, "42:49", true);
 * 
 * // 3. Agregar a biblioteca
 * biblioteca.agregarMaterial(l1);
 * biblioteca.agregarMaterial(l2);
 * biblioteca.agregarMaterial(cd);
 * 
 * // 4. Crear usuarios
 * UsuarioRegular usuario = new UsuarioRegular(1, "Juan", "Pérez", 111222333);
 * 
 * // 5. Prestar materiales
 * System.out.println("Prestando 1984...");
 * biblioteca.prestarMaterialAUsuario(l1, usuario);
 * 
 * System.out.println("\nPrestando Dark Side...");
 * biblioteca.prestarMaterialAUsuario(cd, usuario);
 * 
 * // 6. Mostrar estado
 * System.out.println("\nMateriales disponibles:");
 * biblioteca.mostrarMateriales();
 * // El CD y el Libro mostrarán "No disponible" y "Prestado a: Juan Pérez"
 * 
 * System.out.println("\nInformación del usuario:");
 * usuario.mostrarInformacion();
 * // Muestra: 2 materiales prestados
 * 
 * 
 * ================================================================
 * CONCEPTOS CLAVE DEMOSTRADOS:
 * ================================================================
 * 
 * ✓ HERENCIA
 *   - Libro y CD extienden (heredan de) Material
 *   - Heredan atributos: id, titulo, disponible, etc.
 *   - Heredan métodos: getTitulo(), isDisponible(), etc.
 * 
 * ✓ POLIMORFISMO
 *   - ArrayList<Material> contiene Libros y CDs
 *   - material.mostrarInformacion() ejecuta la versión correcta
 * 
 * ✓ SOBRECARGA (OVERLOADING)
 *   - Usuario tiene: prestarMaterial(), prestarLibro(), prestarCD()
 *   - Todos hacen lo mismo pero con parámetros diferentes
 *   - Constructores sobrecargados: con/sin límite de préstamos
 * 
 * ✓ SOBRESCRITURA (OVERRIDE)
 *   - Libro.mostrarInformacion() reemplaza Material.mostrarInformacion()
 *   - CD.mostrarInformacion() reemplaza Material.mostrarInformacion()
 * 
 * ✓ ENCAPSULACIÓN
 *   - Atributos privados: id, titulo, disponible (solo acceso via métodos)
 *   - Métodos públicos: getTitulo(), mostrarInformacion()
 * 
 * ================================================================
 */
