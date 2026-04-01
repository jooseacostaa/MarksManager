import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestorNotas gestor = new GestorNotas();

        boolean salir = false;

        mostrarMenuIntro();

        while (!salir) {

            int opcion = leerOpcion(sc);
            salir = procesarOpcion(opcion, gestor, sc);
            mostrarOpciones();

        }

        sc.close();

    }

    public static void mostrarMenuIntro() {

        System.out.println("""
                --- GESTOR DE CALIFICACIONES ---
                1. Añadir calificación
                2. Ver calificaciones
                3. Calcular la media
                4. Mostrar aprobadas
                5. Mostrar suspendidas
                6. Eliminar nota
                7. Salir
                """);

    }

    public static void mostrarOpciones() {
        System.out.println("1.Añadir nota - " +
                "2.Ver notas - " +
                "3.Calcular media - " +
                "4.Mostrar aprobadas - " +
                "5.Mostrar suspendidas - " +
                "6.Eliminar nota - " +
                "7.Salir");
    }

    public static int leerOpcion(Scanner sc) {

        System.out.println("Seleccione una opción");

        while (!sc.hasNextInt()) {
            System.out.println("Error: introduce un número válido");
            sc.next();
        }

        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;

    }

    public static boolean procesarOpcion(int opcion, GestorNotas gestor, Scanner sc) {

        switch (opcion) {

            case 1:
                System.out.println("Nombre de la asignatura:");
                String asignatura = sc.nextLine();

                System.out.println("Nota:");
                double calificacion = Double.parseDouble(sc.nextLine());

                gestor.agregarNota(asignatura, calificacion);
                System.out.println("La calificación añadida correctamente");
                break;

            case 2:
                gestor.listarNotas();
                break;

            case 3:
                double media = gestor.calcularMedia();
                System.out.println("La media es: " + media);
                break;

            case 4:
                System.out.println("Las asignaturas aprobadas son las siguientes: ");
                gestor.listarAprobadas();
                break;

            case 5:
                System.out.println("Las asignaturas suspendidas son las siguientes: ");
                gestor.listarSuspendidas();
                break;

            case 6:
                gestor.listarNotas();
                System.out.println("Introduzca el número de la nota que quiera eliminar");

                int indice = leerOpcion(sc);
                gestor.eliminarNota(indice);

                System.out.println("Calificación eliminada correctamente");
                break;

            case 7:
                System.out.println("Saliendo del programa...");
                return true;

            default:
                System.out.println("Opción no válida");
        }

        return false;

    }

}