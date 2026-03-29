public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("====== SISTEMA DE GESTIÓN DE BIBLIOTECA ======\n");

        // ===== CREAR LIBROS =====
        System.out.println("1. Creando LIBROS...\n");
        Libro libro1 = new Libro(1, "Cien años de soledad", "Gabriel Garcia Marquez", 1967, "Novela", true);
        Libro libro2 = new Libro(2, "El principito", "Antoine de Saint-Exupéry", 1943, "Infantil", true);
        Libro libro3 = new Libro(3, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Novela", true);

        // ===== CREAR CDs =====
        System.out.println("2. Creando CDs...\n");
        CD cd1 = new CD(101, "Abbey Road", "The Beatles", 1969, 17, "47:31", true);
        CD cd2 = new CD(102, "Dark Side of the Moon", "Pink Floyd", 1973, 10, "42:49", true);

        // ===== AGREGAR MATERIALES A LA BIBLIOTECA =====
        System.out.println("3. Agregando materiales a la biblioteca...\n");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarMaterial(cd1);
        biblioteca.agregarMaterial(cd2);

        // ===== CREAR USUARIOS =====
        System.out.println("4. Creando usuarios...\n");
        Usuario usuario1 = new Usuario(101, "Ana", "Lopez", 123456789, 3);  // Usuario regular: límite 3
        Usuario usuario2 = new Usuario(102, "Carlos", "Gomez", 987654321, 5);  // Usuario premium: límite 5

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // ===== MOSTRAR INFORMACIÓN DE USUARIOS =====
        System.out.println("\n5. Información de usuarios:\n");
        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();

        // ===== MOSTRAR TODOS LOS MATERIALES =====
        System.out.println("\n\n6. Todos los materiales en la biblioteca:\n");
        biblioteca.mostrarMateriales();

        // ===== MOSTRAR SOLO LIBROS =====
        System.out.println("\n\n7. Solo LIBROS en la biblioteca:\n");
        biblioteca.mostrarLibros();

        // ===== MOSTRAR SOLO CDs =====
        System.out.println("\n\n8. Solo CDs en la biblioteca:\n");
        biblioteca.mostrarCDs();

        // ===== DEMOSTRACIÓN DE PRÉSTAMOS =====
        System.out.println("\n\n9. DEMOSTRANDO PRÉSTAMOS (Polimorfismo en acción):\n");

        System.out.println("--- Préstamo de LIBRO a Usuario Regular ---");
        biblioteca.prestarLibroAUsuario(libro1, usuario1);

        System.out.println("\n--- Préstamo de CD a Usuario Regular ---");
        biblioteca.prestarMaterialAUsuario(cd1, usuario1);

        System.out.println("\n--- Préstamo de otro LIBRO a Usuario Regular ---");
        biblioteca.prestarLibroAUsuario(libro2, usuario1);

        System.out.println("\n--- Intentando prestar un 4to material a Usuario Regular (debería fallar) ---");
        biblioteca.prestarMaterialAUsuario(libro3, usuario1);

        System.out.println("\n--- Préstamo de CD a Usuario Premium (puede prestar hasta 5) ---");
        biblioteca.prestarMaterialAUsuario(cd2, usuario2);

        // ===== ESTADO FINAL =====
        System.out.println("\n\n10. ESTADO FINAL DE USUARIOS:\n");
        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();

        System.out.println("\n\n11. MATERIALES DISPONIBLES FINALES:\n");
        biblioteca.mostrarMateriales();

        System.out.println("\n====== FIN DEL PROGRAMA ======");
    }
}
