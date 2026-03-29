public class UsuarioPremium extends Usuario {
    // Constructor que llama al super con límite 5
    public UsuarioPremium(int idUsuario, String nombre, String apellido, int numeroIdentificacion) {
        super(idUsuario, nombre, apellido, numeroIdentificacion, 5);
    }

    // Override del método mostrarInformacion para polimorfismo
    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario Premium:");
        System.out.println("ID: " + getIdUsuario());
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Número de Identificación: " + getNumeroIdentificacion());
        System.out.println("Límite de Préstamos: 5");
        System.out.println("Libros Prestados: " + cantidadLibrosPrestados());
    }
}
