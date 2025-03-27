package Trenes;

import javax.swing.JOptionPane;

public class Tren {
    private int id; // Identificador único del tren
    private int tipo; // Tipo de tren (0: Rústico, 1: Moderno, 2: Alta Velocidad)
    private int velocidad; // Velocidad del tren en km/h
    private String cuidadactual; // Ciudad actual donde se encuentra el tren
    private String TitleType; // Título del tipo de tren (Rústico, Moderno, Alta Velocidad)

    // Constructor que inicializa un tren con ID, tipo y ciudad actual
    public Tren(int _id,int type,String ciudad)
    {   
        id = _id;
        tipo=type;
        cuidadactual = ciudad;
        Tipos(type); // Establece el título y la velocidad según el tipo
    }
    // Constructor vacío
    public Tren()
    {
        
    }
    // Getter para el ID del tren
     public int getId() {
        return id;
    }
    // Setter para el ID del tren
    public void setId(int id) {
        this.id = id;
    }
    // Getter para el tipo del tren
    public int getTipo() {
        return tipo;
    }
    // Setter para el tipo del tren, con validación
    public void setTipo(int tipo) {
        if(tipo >= 0 && tipo <=2)
        {
        this.tipo = tipo;
        Tipos(tipo); // Actualiza el título y la velocidad según el nuevo tipo
        } else {
          JOptionPane.showConfirmDialog(null,"NO existe el tipo", "Tipo Inexistente", JOptionPane.DEFAULT_OPTION);
        }
    }
    // Getter para la ciudad actual del tren
    public String getCuidadactual() {
        return cuidadactual;
    }
    // Setter para la ciudad actual del tren
    public void setCuidadactual(String cuidadactual) {
        this.cuidadactual = cuidadactual;
    }
    // Getter para el tipo del tren
    public String getTitleType() {
        return TitleType;
    }
    // Setter privado para el título del tipo de tren
    private void setTitleType(String TitleType) {
        this.TitleType = TitleType;
    }
    // Método privado para establecer el título y la velocidad según el tipo de tren
    private void Tipos(int tiposenum)
    {
        if(tiposenum == 0)
         {
            setTitleType("Rustico");
            setVelocidad(50); // Velocidad de 50 km/h para trenes rústicos
         }
           
        if(tiposenum == 1)
         {
            setTitleType("Moderno");
            setVelocidad(100);  // Velocidad de 100 km/h para trenes modernos
         }
        if(tiposenum == 2)
         {
            setTitleType("Alta Velocidad");
            setVelocidad(250);  // Velocidad de 250 km/h para trenes de alta velocidad
         }
    }
    // Getter para la velocidad del tren
    public int getVelocidad() {
        return velocidad;
    }
    // Setter privado para la velocidad del tren
    private void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
  
}
