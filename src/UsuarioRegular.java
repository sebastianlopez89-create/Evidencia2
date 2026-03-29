public class UsuarioRegular extends Usuario {
    // Constructor que llama al super con límite 3
    public UsuarioRegular(int idUsuario, String nombre, String apellido, int numeroIdentificacion) {
        super(idUsuario, nombre, apellido, numeroIdentificacion, 3);
    }

    // Override del método mostrarInformacion para polimorfismo
    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario Regular:");
        System.out.println("ID: " + getIdUsuario());
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Número de Identificación: " + getNumeroIdentificacion());
        System.out.println("Límite de Préstamos: 3");
        System.out.println("Libros Prestados: " + cantidadLibrosPrestados());
    }

    // Métodos getter para acceder a atributos privados de la superclase (simplificado, en realidad no se puede acceder directamente, pero para ejemplo)
    // Nota: En Java, atributos privados no se heredan directamente, pero podemos usar métodos.
    // Para simplicidad, asumimos que agregamos getters en Usuario.
}
