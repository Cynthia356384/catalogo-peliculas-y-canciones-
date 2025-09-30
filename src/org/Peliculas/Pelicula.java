
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
}

   