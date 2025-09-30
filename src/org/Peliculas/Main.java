import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sumar matrícula");
        System.out.println("2. Catálogo de películas");
        System.out.print("Elige una opción: ");
        int eleccion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (eleccion == 1) {
            Pelicula.sumarMatricula(sc);
        } else if (eleccion == 2) {
            Pelicula.catalogo(sc);
        } else {
            System.out.println("Opción inválida.");
        }

        sc.close();
    }
}
