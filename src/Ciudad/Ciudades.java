package Ciudad;

/**
 * Clase Ciudades: Representa una ciudad con atributos relacionados a su
 * identificación, nombre, número de trenes y capacidad máxima de trenes.
 * 
 * @author Edson García
 */
public class Ciudades {

    // Atributos de la ciudad
    private int id; // Identificador único de la ciudad
    private String nombre; // Nombre de la ciudad
    private int cantrenes; // Número actual de trenes en la ciudad
    private int cantMaximaTren = 5; // Capacidad máxima de trenes permitida

    /**
     * Constructor por defecto: Inicializa la ciudad sin establecer valores específicos.
     */
    public Ciudades() {
        // Constructor vacío, útil para inicializar la clase sin parámetros.
    }

    /**
     * Constructor con parámetros: Permite inicializar una ciudad con un nombre y
     * número inicial de trenes.
     * 
     * @param nom Nombre de la ciudad.
     * @param cant Número inicial de trenes en la ciudad.
     */
    public Ciudades(String nom, int cant) {
        this.nombre = nom; // Asigna el nombre de la ciudad.
        this.cantrenes = cant; // Asigna el número inicial de trenes.
    }

    // Métodos getter y setter para acceder y modificar los atributos.

    /**
     * Obtiene el nombre de la ciudad.
     * 
     * @return Nombre de la ciudad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nuevo nombre a la ciudad.
     * 
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número actual de trenes en la ciudad.
     * 
     * @return Número de trenes.
     */
    public int getCantrenes() {
        return cantrenes;
    }

    /**
     * Establece un nuevo número de trenes en la ciudad.
     * 
     * @param cantrenes Número de trenes a establecer.
     */
    public void setCantrenes(int cantrenes) {
        this.cantrenes = cantrenes;
    }

    /**
     * Obtiene la capacidad máxima de trenes permitida en la ciudad.
     * 
     * @return Capacidad máxima de trenes.
     */
    public int getCantMaximaTren() {
        return cantMaximaTren;
    }

    /**
     * Establece la capacidad máxima de trenes. Este método es privado ya que
     * probablemente no necesita ser modificado directamente desde fuera de la clase.
     * 
     * @param cantMaximaTren Capacidad máxima a establecer.
     */
    private void setCantMaximaTren(int cantMaximaTren) {
        this.cantMaximaTren = cantMaximaTren;
    }

    /**
     * Obtiene el identificador único de la ciudad.
     * 
     * @return Identificador de la ciudad.
     */
    public int getId() {
        return id;
    }

    /**
     * Asigna un identificador único a la ciudad.
     * 
     * @param id Identificador a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }
}
