import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {
    private int id;
    private String nombre;
    private String año;
    private float calificacion;
    private String notas;

    // Constructor
    public Pelicula(int id, String nombre, String año, float calificacion, String notas) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.calificacion = calificacion;
        this.notas = notas;
    }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setAño(String año) { this.año = año; }
    public void setCalificacion(float calificacion) { this.calificacion = calificacion; }
    public void setNotas(String notas) { this.notas = notas; }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getAño() { return año; }
    public float getCalificacion() { return calificacion; }
    public String getNotas() { return notas; }

    // Método para sumar matrícula
    public static void sumarMatricula(Scanner sc) {
        System.out.print("¿Cuántos números tiene tu matrícula? ");
        int cantidad = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un número: ");
            suma += sc.nextInt();
        }
        sc.nextLine(); // limpiar buffer
        System.out.println("La suma de los números de la matrícula es: " + suma);
    }

    // Método para manejar catálogo
    public static void catalogo(Scanner sc) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- Catálogo de Películas ---");
            System.out.println("1. Agregar película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Buscar película por nombre");
            System.out.println("4. Listar todas las películas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch(opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Año: ");
                    String año = sc.nextLine();
                    System.out.print("Calificación: ");
                    float cal = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Notas: ");
                    String notas = sc.nextLine();
                    peliculas.add(new Pelicula(id, nombre, año, cal, notas));
                    System.out.println("Película agregada.");
                    break;

                case 2:
                    System.out.print("Nombre de la película a eliminar: ");
                    String eliminar = sc.nextLine();
                    boolean encontrada = false;
                    for (int i = 0; i < peliculas.size(); i++) {
                        if (peliculas.get(i).getNombre().equalsIgnoreCase(eliminar)) {
                            peliculas.remove(i);
                            encontrada = true;
                            System.out.println("Película eliminada.");
                            break;
                        }
                    }
                    if (!encontrada) System.out.println("No se encontró la película.");
                    break;

                case 3:
                    System.out.print("Nombre de la película a buscar: ");
                    String buscar = sc.nextLine();
                    boolean existe = false;
                    for (Pelicula p : peliculas) {
                        if (p.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.println("Película encontrada: " + p.getNombre() + " (" + p.getAño() + ")");
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) System.out.println("La película no se encontró.");
                    break;

                case 4:
                    System.out.println("\n--- Todas las películas ---");
                    for (Pelicula p : peliculas) {
                        System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() +
                                ", Año: " + p.getAño() + ", Calificación: " + p.getCalificacion() +
                                ", Notas: " + p.getNotas());
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del catálogo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while(opcion != 0);
    }
}
