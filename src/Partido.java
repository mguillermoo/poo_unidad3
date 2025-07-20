
// Implementa Serializable para permitir la serialización de instancias
public class Partido implements java.io.Serializable {

    private Equipo equipoA;
    private Equipo equipoB;

    // Constructor de la clase Partido
    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
    }

    // Método para mostrar el enfrentamiento
    public String mostrar() {
        return equipoA.getNombre() + " vs " + equipoB.getNombre();
    }

}
