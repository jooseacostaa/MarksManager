import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }

    public static void mostrarMenuIntro() {

        System.out.println("""
                --- GESTOR DE CALIFICACIONES ---
                Pulse una tecla según la opción que quiera realizar
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

        return sc.nextInt();

    }

}