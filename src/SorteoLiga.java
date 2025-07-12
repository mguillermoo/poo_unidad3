import java.util.*;

public class SorteoLiga {

    private List<Equipo> equipos;
    private List<Partido> partidos;

    // Constructor de la clase SorteoLiga
    public SorteoLiga(List<Equipo> equipos) {
        this.equipos = equipos;
        this.partidos = new ArrayList<>();
    }

    // Método para iniciar el sorteo
    public void realizarSorteo() {
        // Mezcla aleatoriamente los equipos
        Collections.shuffle(equipos);
        emparejarEquiposRecursivo(equipos, 0);
    }

    // Método recursivo para emparejar equipos de dos en dos
    private void emparejarEquiposRecursivo(List<Equipo> lista, int index) {
        if (index >= lista.size() - 1) {
            return;
        }
        // Crea un partido entre dos equipos consecutivos
        Partido partido = new Partido(lista.get(index), lista.get(index + 1));
        partidos.add(partido);
        emparejarEquiposRecursivo(lista, index + 2);
    }

    // Método para mostrar todos los partidos generados
    public void mostrarPartidos() {
        for (int i = 0; i < partidos.size(); i++) {
            System.out.println("Partido " + (i + 1) + ": " + partidos.get(i).mostrar());
        }
    }
}