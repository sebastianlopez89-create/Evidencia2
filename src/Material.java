// Clase base (superclase) que representa cualquier material en la biblioteca
public class Material {
    // Atributos comunes a todos los materiales
    private int id;
    private String titulo;
    private int anioPublicacion;
    private boolean disponible;
    protected String usuarioPrestamo;  // protected para que subclases accedan

    // Constructor
    public Material(int id, String titulo, int anioPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
        this.usuarioPrestamo = "Ninguno";
    }

    // Métodos comunes para todos los materiales
    public void actualizarDisponibilidad(boolean disponible) {
        this.disponible = disponible;
    }

    public void asignarUsuarioPrestamo(String usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getId() {
        return id;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Método polimórfico que subclases pueden override
    public void mostrarInformacion() {
        System.out.println("=== MATERIAL ===");
        System.out.println("Id: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        
        if (disponible) {
            System.out.println("Disponibilidad: Disponible");
            System.out.println("Prestado a: Ninguno");
        } else {
            System.out.println("Disponibilidad: No disponible");
            System.out.println("Prestado a: " + usuarioPrestamo);
        }
    }
}
