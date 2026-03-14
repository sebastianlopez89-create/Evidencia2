import java.util.ArrayList;

public class Biblioteca {
    // Lista de libros en la biblioteca
    private ArrayList<Libro> libros;
    // Lista de usuarios registrados
    private ArrayList<Usuario> usuarios;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para agregar un usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
            System.out.println("----------------------");
        }
    }

    // Método para prestar un libro a un usuario
    public void prestarLibroAUsuario(Libro libro, Usuario usuario) {
        // Verifica si el usuario tiene menos de 3 libros prestados
        if (usuario.cantidadLibrosPrestados() < 3 && libro.isDisponible()) {
            usuario.prestarLibro(libro);
            System.out.println("Préstamo realizado correctamente.");
        } else if (usuario.cantidadLibrosPrestados() >= 3) {
            System.out.println("El usuario ya tiene 3 libros prestados y no puede prestar más.");
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }
}
