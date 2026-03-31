import java.util.ArrayList;

public class GestorNotas {

    private ArrayList<Nota> notas;

    public GestorNotas() {
        this.notas = new ArrayList<>();
    }

    public void agregarNota(String asignatura, double calificacion) {
        notas.add(new Nota(asignatura, calificacion));
    }

    public void listarNotas() {

        if (notas.isEmpty()) {
            System.out.println("La lista de notas está vacía");
            return;
        }

        for (int i = 0; i < notas.size(); i += 1) {
            System.out.println((i + 1) + ". " + notas.get(i));
        }

    }

    public double calcularMedia() {

        if (notas.isEmpty()) {
            return 0;
        }

        double sumaNotas = 0;

        for (Nota n : notas) {
            sumaNotas += n.getCalificacion();
        }

        return sumaNotas / notas.size();

    }

    public void listarAprobadas() {

        if (notas.isEmpty()) {
            System.out.println("La lista de notas está vacía");
            return;
        }

        int asignaturasAprobadas = 0;
        System.out.println("--- APROBADAS ---");
        for (Nota n : notas) {

            if (n.getCalificacion() >= 5) {
                System.out.println(n);
                asignaturasAprobadas += 1;
            }

        }

        if (asignaturasAprobadas == 0) {
            System.out.println("No has aprobado ninguna");
        }

    }

    public void listarSuspendidas() {

        if (notas.isEmpty()) {
            System.out.println("La lista de notas está vacía");
            return;
        }

        int asignaturasSuspendidas = 0;
        System.out.println("--- SUSPENDIDAS ---");
        for (Nota n : notas) {
            if (n.getCalificacion() < 5) {
                System.out.println(n);
                asignaturasSuspendidas += 1;
            }
        }

        if (asignaturasSuspendidas == 0) {
            System.out.println("¡Felicidades has aprobado todas las asignaturas!");
        }

    }

    public boolean eliminarNota(int indice) {

        if (indice < 1 || indice > notas.size()) {
            System.out.println("El índice no es valido");
            return false;
        }

        notas.remove(indice - 1);
        return true;

    }

}
