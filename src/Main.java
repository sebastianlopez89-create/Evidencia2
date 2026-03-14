public class Main {
    public static void main(String[] args) {
        // Paso 1: crear un libro disponible para préstamo
        Libro libro1 = new Libro(
                1,
                "Cien años de soledad",
                "Gabriel Garcia Marquez",
                1967,
                "Novela",
                true );

        // Paso 2: crear un usuario que va a pedir el libro
        Usuario usuario1 = new Usuario(101, "Ana", "Lopez", 123456789);

        // Paso 3: mostrar cómo está el libro antes del préstamo
        System.out.println("Estado inicial del libro:");
        libro1.mostrarInformacion();

        // Paso 4: llamar al método prestarLibro
        // Aquí el usuario intenta prestar el libro.
        // Si el libro está disponible, cambia a no disponible.
        System.out.println("\nProbando el método prestarLibro...");
        usuario1.prestarLibro(libro1);

        // Paso 5: mostrar cómo quedó el libro después del préstamo
        // Aquí también se verá qué usuario tiene el libro prestado.
        System.out.println("\nEstado final del libro y usuario que lo tiene prestado:");
        libro1.mostrarInformacion();

        // Crear más libros para probar el límite de préstamo
        Libro libro2 = new Libro(2, "El principito", "Antoine de Saint-Exupéry", 1943, "Infantil", true);
        Libro libro3 = new Libro(3, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Novela", true);
        Libro libro4 = new Libro(4, "La Odisea", "Homero", -800, "Épico", true);

        // Prestar tres libros (debería funcionar)
        System.out.println("\nPréstamo del segundo libro:");
        usuario1.prestarLibro(libro2);
        System.out.println("\nPréstamo del tercer libro:");
        usuario1.prestarLibro(libro3);

        // Intentar prestar un cuarto libro (debería mostrar el mensaje de límite)
        System.out.println("\nIntentando prestar un cuarto libro:");
        usuario1.prestarLibro(libro4);
    }
}
