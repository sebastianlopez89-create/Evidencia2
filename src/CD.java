// Clase CD que extiende (hereda) de Material
public class CD extends Material {
    // Atributos específicos de CD
    private String artista;
    private int numeroCanciones;
    private String duracionTotal; // En formato "mm:ss"

    // Constructor que llama a super() para inicializar Material
    public CD(int id, String titulo, String artista, int anioPublicacion, int numeroCanciones, String duracionTotal, boolean disponible) {
        super(id, titulo, anioPublicacion, disponible); // Llama al constructor de Material
        this.artista = artista;
        this.numeroCanciones = numeroCanciones;
        this.duracionTotal = duracionTotal;
    }

    // Getters para atributos específicos
    public String getArtista() {
        return artista;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public String getDuracionTotal() {
        return duracionTotal;
    }

    // Override del método mostrarInformacion para agregar info específica de CD
    @Override
    public void mostrarInformacion() {
        System.out.println("=== CD DE MÚSICA ===");
        System.out.println("Id: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + artista);
        System.out.println("Año de publicación: " + getAnioPublicacion());
        System.out.println("Número de canciones: " + numeroCanciones);
        System.out.println("Duración total: " + duracionTotal);

        if (isDisponible()) {
            System.out.println("Disponibilidad: Disponible");
            System.out.println("Prestado a: Ninguno");
        } else {
            System.out.println("Disponibilidad: No disponible");
            System.out.println("Prestado a: [Usuario que lo tiene]");
        }
    }
}
