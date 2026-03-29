public class LibroDigital extends Libro {
    private String url; // URL para acceder al libro digital

    // Constructor que llama al super y agrega url
    public LibroDigital(int id, String titulo, String autor, int anioPublicacion, String genero, boolean disponible, String url) {
        super(id, titulo, autor, anioPublicacion, genero, disponible);
        this.url = url;
    }

    // Override del método mostrarInformacion para incluir URL
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Tipo: Digital");
        System.out.println("URL: " + url);
    }
}
