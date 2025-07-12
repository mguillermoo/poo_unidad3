
public class Partido {

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
