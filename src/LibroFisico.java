public class LibroFisico extends Libro {
    private String ubicacion; // Ubicación en la biblioteca, e.g., "Estante A1"

    // Constructor que llama al super y agrega ubicacion
    public LibroFisico(int id, String titulo, String autor, int anioPublicacion, String genero, boolean disponible, String ubicacion) {
        super(id, titulo, autor, anioPublicacion, genero, disponible);
        this.ubicacion = ubicacion;
    }

    // Override del método mostrarInformacion para incluir ubicación
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Tipo: Físico");
        System.out.println("Ubicación: " + ubicacion);
    }
}
