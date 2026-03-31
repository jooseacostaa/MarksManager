public class Nota {

    private String asignatura;
    private double calificacion;

    public Nota(String asignatura, double calificacion) {

        this.asignatura = asignatura;

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Error: La nota debe estar entre 0 e 10");
        } else {
            this.calificacion = calificacion;
        }

    }

    public String getAsignatura() {
        return asignatura;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {

        return asignatura + " - " + String.format("%.2f", calificacion);

    }

}