public class Prestamo {
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
    }

    public void realizarPrestamo() {
        if (libro.isDisponible()) {
            libro.actualizarDisponibilidad(false);
            libro.asignarUsuarioPrestamo(usuario.getNombreCompleto());
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + usuario.getNombreCompleto() + ".");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible para préstamo.");
        }
    }
}
