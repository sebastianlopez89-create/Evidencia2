import java.util.ArrayList;

public class Biblioteca {
    // Lista de materiales en la biblioteca (libros, CDs, etc.)
    // Usamos Material como tipo genérico para todos los tipos de materiales
    private ArrayList<Material> materiales;
    // Lista de usuarios registrados
    private ArrayList<Usuario> usuarios;

    // Constructor
    public Biblioteca() {
        materiales = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Método para agregar un material (Libro, CD, etc.)
    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    // Método sobrecargado para agregar un libro (compatibilidad con código anterior)
    public void agregarLibro(Libro libro) {
        materiales.add(libro);
    }

    // Método para agregar un usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para mostrar todos los materiales (libros, CDs, etc.)
    public void mostrarMateriales() {
        System.out.println("========== Lista de materiales en la biblioteca ==========");
        for (Material material : materiales) {
            material.mostrarInformacion(); // Polimorfismo: cada tipo muestra su info
            System.out.println("----------------------");
        }
    }

    // Método sobrecargado para mostrar solo libros
    public void mostrarLibros() {
        System.out.println("========== Lista de LIBROS en la biblioteca ==========");
        for (Material material : materiales) {
            if (material instanceof Libro) { // Verificar si es un Libro
                material.mostrarInformacion();
                System.out.println("----------------------");
            }
        }
    }

    // Método nuevo para mostrar solo CDs
    public void mostrarCDs() {
        System.out.println("========== Lista de CDs en la biblioteca ==========");
        for (Material material : materiales) {
            if (material instanceof CD) { // Verificar si es un CD
                material.mostrarInformacion();
                System.out.println("----------------------");
            }
        }
    }

    // Método para prestar un material a un usuario
    public void prestarMaterialAUsuario(Material material, Usuario usuario) {
        // Verifica si el usuario tiene menos materiales que su límite y material disponible
        if (usuario.cantidadLibrosPrestados() < usuario.getLimitePrestamos() && material.isDisponible()) {
            usuario.prestarMaterial(material);
            System.out.println("Préstamo realizado correctamente.");
        } else if (usuario.cantidadLibrosPrestados() >= usuario.getLimitePrestamos()) {
            System.out.println("El usuario ya tiene " + usuario.getLimitePrestamos() + " materiales prestados y no puede prestar más.");
        } else {
            System.out.println("El material no está disponible para préstamo.");
        }
    }

    // Método sobrecargado para prestar un libro (compatibilidad)
    public void prestarLibroAUsuario(Libro libro, Usuario usuario) {
        prestarMaterialAUsuario(libro, usuario);
    }
}
