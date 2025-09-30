import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Cancion cancion1 = new Cancion(33,"matricula brayan","brayan",10,"24216873");
        
    

        Scanner sc = new Scanner(System.in);
        ArrayList<Cancion> canciones = new ArrayList<>();
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        canciones.add(cancion1);

        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar canción");
            System.out.println("2. Listar canciones");
            System.out.println("3. Buscar canción por nombre");
            System.out.println("4. Eliminar canción por ID");
            System.out.println("5. Agregar película");
            System.out.println("6. Listar películas");
            System.out.println("7. Buscar película por nombre");
            System.out.println("8. Eliminar película por ID");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Cantante: ");
                String cantante = sc.nextLine();
                System.out.print("Calificación: ");
                float calificacion = sc.nextFloat();
                sc.nextLine();
                System.out.print("Notas: ");
                String notas = sc.nextLine();

                canciones.add(new Cancion(id, nombre, cantante, calificacion, notas));
                System.out.println("Canción agregada.");

            } else if (opcion == 2) {
                if (canciones.isEmpty()) {
                    System.out.println("No hay canciones.");
                } else {
                    System.out.println("--------MI ALBUM DE CANCIONES--------");
                    for (Cancion c : canciones) {
                        System.out.println(
                        "|ID:"+c.getId() +  
                        "\n|CANCION:"+c.getNombre() + 
                        "\n|ARTISTA:"+c.getCantante() + 
                        "\n|CALIFICACION:"+c.getCalificacion()+
                        "\n");
                    }
                }

            } else if (opcion == 3) {
                System.out.print("Nombre a buscar: ");
                String buscar = sc.nextLine();
                boolean encontrado = false;
                for (Cancion c : canciones) {
                    if (c.getNombre().compareTo(buscar) == 0) {
                        System.out.println("Encontrada: " + 
                        "|ID:"+c.getId() + 
                        "\n|CANCION:"+c.getNombre() + 
                        "\n|ARTISTA:"+c.getCantante()+
                        "\n|CALIFICACION:"+c.getCalificacion()+
                        "\n|NOTAS:"+c.getNotas());
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se encontró.");
                }

            } else if (opcion == 4) {
                System.out.print("ID a eliminar: ");
                int idEliminar = sc.nextInt();
                sc.nextLine();
                boolean borrado = false;
                for (int i = 0; i < canciones.size(); i++) {
                    if (canciones.get(i).getId() == idEliminar) {
                        canciones.remove(i);
                        System.out.println("Canción eliminada.");
                        borrado = true;
                        break;
                    }
                }
                if (!borrado) {
                    System.out.println("No se encontró el ID.");
                }

            } else if (opcion == 5) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Año: ");
                String año = sc.nextLine();
                System.out.print("Calificación: ");
                float calificacion = sc.nextFloat();
                sc.nextLine();
                System.out.print("Notas: ");
                String notas = sc.nextLine();

                peliculas.add(new Pelicula(id, nombre, año, calificacion, notas));
                System.out.println("Película agregada.");

            } else if (opcion == 6) {
                if (peliculas.isEmpty()) {
                    System.out.println("No hay películas.");
                } else {
                    System.out.println("--------MI ALBUM DE PELICULAS--------");
                    for (Pelicula p : peliculas) {
                        System.out.println(
                            "|ID:"+p.getId() + 
                            "\n|NOMBRE:" + p.getNombre() + 
                            "\n|ANIO SALIDA:" + p.getAño() + 
                            "\n|CALIFICACION:" + p.getCalificacion() +
                            "\n" );
                    }
                }

            } else if (opcion == 7) {
                System.out.print("Nombre a buscar: ");
                String buscar = sc.nextLine();
                boolean encontrado = false;
                for (Pelicula p : peliculas) {
                    if (p.getNombre().compareTo(buscar) == 0) {
                        System.out.println("------Encontrada------- " +
                        "\n|ID:"+ p.getId() + 
                        "\n|NOMBRE:" + p.getNombre() + 
                        "\n|ANIO:" + p.getAño());
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se encontró.");
                }

            } else if (opcion == 8) {
                System.out.print("ID a eliminar: ");
                int idEliminar = sc.nextInt();
                sc.nextLine();
                boolean borrado = false;
                for (int i = 0; i < peliculas.size(); i++) {
                    if (peliculas.get(i).getId() == idEliminar) {
                        peliculas.remove(i);
                        System.out.println("Película eliminada.");
                        borrado = true;
                        break;
                    }
                }
                if (!borrado) {
                    System.out.println("No se encontró el ID.");
                }
            }

        } while (opcion != 9);

        System.out.println("adios");
        sc.close();
    }
}
