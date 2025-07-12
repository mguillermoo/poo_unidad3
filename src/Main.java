import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- Menú de Etapas del Torneo ----------");
        System.out.println("1) Octavos de final (16 equipos)");
        System.out.println("2) Cuartos de final (8 equipos)");
        System.out.println("3) Semifinales (4 equipos)");
        System.out.println("4) Final (2 equipos)");
        System.out.print("Ingrese el número de la etapa: ");
        String etapa = scanner.nextLine().toLowerCase();

        int numEquipos = 0;
        switch (etapa) {
            case "1":
                numEquipos = 16;
                break;
            case "2":
                numEquipos = 8;
                break;
            case "3":
                numEquipos = 4;
                break;
            case "4":
                numEquipos = 2;
                break;
            default:
                System.out.println("Etapa no válida.");
                scanner.close();
                return;
        }



    }
}
