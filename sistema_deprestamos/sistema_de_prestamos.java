import java.util.Scanner;

public class sistema_de_prestamos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String fechaHoy, nombreEstudiante, documentoEstudiante, direccionEstudiante;
        String telefonoEstudiante, correoEstudiante, matriculado;
        String tituloLibro, autorLibro, editorialLibro;
        int numPaginas, tiempoPrestamo;

        System.out.print("Fecha de registro (DD/MM/AAAA): ");
        fechaHoy = leer.nextLine();

        System.out.print("Ingrese su nombre: ");
        nombreEstudiante = leer.nextLine();

        System.out.print("Ingrese su documento de identidad: ");
        documentoEstudiante = leer.nextLine();

        System.out.print("Ingrese su dirección: ");
        direccionEstudiante = leer.nextLine();

        System.out.print("Ingrese su teléfono: ");
        telefonoEstudiante = leer.nextLine();

        System.out.print("Ingrese su correo electrónico: ");
        correoEstudiante = leer.nextLine();

        System.out.print("¿Está matriculado? (si/no): ");
        matriculado = leer.nextLine().toLowerCase();

        // Condicional: validar si puede prestar
        if (!matriculado.equals("si")) {
            System.out.println("No puede acceder al préstamo si no está matriculado.");
            System.out.println("Intregantes: Estefania Cataño, Carolina Bolivar, Luenyi, Cristian Tovar");
            return;
        }

        System.out.print("Ingrese el título del libro: ");
        tituloLibro = leer.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        autorLibro = leer.nextLine();

        System.out.print("Ingrese la editorial: ");
        editorialLibro = leer.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        numPaginas = leer.nextInt();

        System.out.print("Ingrese la cantidad de días del préstamo: ");
        tiempoPrestamo = leer.nextInt();

        if (tiempoPrestamo > 7) {
            System.out.println("El tiempo maximo de préstamo es de 7 días a partir de la fecha registrada.");
            System.out.println("Intregantes: Estefania Cataño, Carolina Bolivar, Luenyi, Cristian Tovar");
        } else {
            System.out.println("\n--- RESUMEN DEL PRÉSTAMO ---");
            System.out.println(
                    "El día " + fechaHoy + ", el estudiante " + nombreEstudiante +
                            " con documento: " + documentoEstudiante + ", domiciliado en " + direccionEstudiante +
                            ", con teléfono " + telefonoEstudiante + " y correo " + correoEstudiante +
                            ", solicitó el préstamo del libro \"" + tituloLibro + "\", escrito por " + autorLibro +
                            ", publicado por la editorial " + editorialLibro + " con " + numPaginas + " páginas. "
            );
            System.out.println("Intregantes: Estefania Cataño, Carolina Bolivar, Lorena mejia, Cristian Tovar");
        }
    }
}