// Clase Libro que extiende (hereda) de Material
public class Libro extends Material {
    // Atributos específicos de Libro
    private String autor;
    private String genero;

    // Constructor que llama a super() para inicializar Material
    public Libro(int id, String titulo, String autor, int anioPublicacion, String genero, Boolean disponible) {
        super(id, titulo, anioPublicacion, disponible); // Llama al constructor de Material
        this.autor = autor;
        this.genero = genero;
    }
    // ...existing code...
    
    //Metodos para actualizar el estado de disponibilidad del libro
    // (heredados de Material, aquí solo los sobrescribimos si es necesario)

    // Método para obtener el autor del libro
    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    // Override del método mostrarInformacion para agregar info específica de Libro
    @Override
    public void mostrarInformacion() {
        System.out.println("=== LIBRO ===");
        System.out.println("Id: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + getAnioPublicacion());
        System.out.println("Género: " + genero);

        if (isDisponible()) {
            System.out.println("Disponibilidad: Disponible");
            System.out.println("Prestado a: Ninguno");
        } else {
            System.out.println("Disponibilidad: No disponible");
            System.out.println("Prestado a: " + usuarioPrestamo);
        }
    }
}
