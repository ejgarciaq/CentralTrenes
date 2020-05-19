package Ciudad;

public class Ciudades 
{
 private int id;
 private String nombre;
 private int cantrenes;
 private int cantMaximaTren = 5;
 
 public Ciudades()
 {
     
 }
 public Ciudades(String nom,int cant)
 {
     this.nombre =  nom;
     this.cantrenes = cant;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantrenes() {
        return cantrenes;
    }

    public void setCantrenes(int cantrenes) {
        this.cantrenes = cantrenes;
    }

    public int getCantMaximaTren() {
        return cantMaximaTren;
    }

    private void setCantMaximaTren(int cantMaximaTren) {
        this.cantMaximaTren = cantMaximaTren;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
