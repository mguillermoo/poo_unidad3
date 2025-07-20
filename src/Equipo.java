// Clase que representa un equipo de fútbol
// Implementa Serializable para permitir la serialización de instancias
public class Equipo implements java.io.Serializable {

    private String nombre;

    // Constructor de la clase Equipo
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre del equipo
    public String getNombre() {
        return nombre;
    }
}
