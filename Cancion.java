import java.util.ArrayList;

public class Cancion{
  private int id;
  private String nombre;
  private String cantante;
  private float calificacion;
  private String notas;
  
// constructor
public cancion(){}

public cancion(int id,String nombre,String cantante,float calificacion,String notas){
 this.id=id;
  this.nombre=nombre;
   this.cantante=cantante;
    this.calificacion=calificacion;
     this.notas=notas;
}

 //setters
 public void setId(int id){this.id = id;} 
  public void setNombre(String nombre){this.nombre = nombre;}
   public void setCantante(String cantante){this.cantante = cantante;}
    public void setCalificacion(float calificacion){this.calificacion = calificacion;}
     public void setNotas(String notas){this.notas = notas;}

 //getters
 public int getId(){return this.Id;}
  public String getNombre(){return this.nombre;}
   public String getCantante(){return this.cantante;}
    public float getCalificacion(){return this.calificacion;}
     public String getNotas(){return this.notas;}



} 