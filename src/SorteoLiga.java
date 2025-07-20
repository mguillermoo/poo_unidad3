import java.util.*;

public class SorteoLiga {
    // Guarda los partidos en formato texto plano, cada enfrentamiento en una línea
    public void guardarPartidosComoTexto(String archivo) throws java.io.IOException {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(archivo))) {
            for (int i = 0; i < partidos.size(); i++) {
                writer.println("Partido " + (i + 1) + ": " + partidos.get(i).mostrar());
            }
        }
    }
    // Método para serializar y guardar la lista de partidos en un archivo
    public void guardarPartidos(String archivo) throws java.io.IOException {
        // Serializa la lista de partidos usando ObjectOutputStream
        try (java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream(archivo))) {
            out.writeObject(partidos);
        }
    }

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