import java.util.ArrayList;

public class Usuario {
    //Atributos de tipo privado como id
    private int idUsuario;
    private String nombre;
    private  String apellido;
    private int numeroIdentificacion;
    //Instanciar la clase Libro para relacionar el usuario con un libro
    private ArrayList<Libro> librosPrestados = new ArrayList<>();
    //Constructor para inicializar los atributos
    public Usuario(int idUsuario, String nombre, String apellido, int numeroIdentificacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
    }
//Metodos a implementar para prestar un libro al usuario
    public void prestarLibro(Libro libro) {
        if (librosPrestados.size() >= 3) {
            System.out.println("El usuario ya tiene 3 libros prestados y no puede prestar más.");
            return;
        }
        if (libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.actualizarDisponibilidad(false);
            libro.asignarUsuarioPrestamo(nombre + " " + apellido);
            System.out.println("Libro prestado por el usuario: " + nombre + " " + apellido);
            libro.mostrarInformacion();
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }
    // Método para obtener el nombre completo del usuario
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

}