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
            System.out.println("La lista de notas está vacia");
            return;
        }

        for (int i = 0; i < notas.size(); i += 1) {
            System.out.println((i + 1) + ". " + notas.get(i));
        }

    }

}
