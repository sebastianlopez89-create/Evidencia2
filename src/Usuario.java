import java.util.ArrayList;

public class Usuario {
    //Atributos de tipo privado como id
    private int idUsuario;
    private String nombre;
    private  String apellido;
    private int numeroIdentificacion;
    private int limitePrestamos;
    //Lista para almacenar materiales (libros, CDs, etc.) prestados al usuario
    private ArrayList<Material> materialesPrestados = new ArrayList<>();
    //Constructor para inicializar los atributos
    public Usuario(int idUsuario, String nombre, String apellido, int numeroIdentificacion, int limitePrestamos) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.limitePrestamos = limitePrestamos;
    }
    // Constructor sobrecargado sin límite, por defecto 3
    public Usuario(int idUsuario, String nombre, String apellido, int numeroIdentificacion) {
        this(idUsuario, nombre, apellido, numeroIdentificacion, 3);
    }

    // Método nuevo: Prestar un Material (Libro, CD, etc.)
    public void prestarMaterial(Material material) {
        if (materialesPrestados.size() >= limitePrestamos) {
            System.out.println("El usuario ya tiene " + limitePrestamos + " materiales prestados y no puede prestar más.");
            return;
        }
        if (material.isDisponible()) {
            materialesPrestados.add(material);
            material.actualizarDisponibilidad(false);
            material.asignarUsuarioPrestamo(nombre + " " + apellido);
            System.out.println("Material prestado por el usuario: " + nombre + " " + apellido);
            material.mostrarInformacion();
        } else {
            System.out.println("El material no está disponible para préstamo.");
        }
    }

    // Método sobrecargado: Prestar un Libro (compatibilidad con código anterior)
    public void prestarLibro(Libro libro) {
        prestarMaterial(libro);
    }

    // Método sobrecargado: Prestar un CD
    public void prestarCD(CD cd) {
        prestarMaterial(cd);
    }
    // Método para obtener el nombre completo del usuario
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
     // Método para saber cuántos materiales tiene prestados el usuario
    public int cantidadLibrosPrestados() {
        return materialesPrestados.size();
    }

    // Getter para obtener el límite de préstamos
    public int getLimitePrestamos() {
        return limitePrestamos;
    }

    // Getter para obtener el ID del usuario
    public int getIdUsuario() {
        return idUsuario;
    }

    // Getter para obtener el número de identificación
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    // Método polimórfico para mostrar información del usuario
    public void mostrarInformacion() {
        String tipo = (limitePrestamos == 3) ? "Regular" : "Premium";
        System.out.println("Usuario " + tipo + ":");
        System.out.println("ID: " + idUsuario);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Número de Identificación: " + numeroIdentificacion);
        System.out.println("Límite de Préstamos: " + limitePrestamos);
        System.out.println("Materiales Prestados: " + cantidadLibrosPrestados());
    }
}