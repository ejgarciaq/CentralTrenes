package Trenes;

import javax.swing.JOptionPane;

public class Tren {
    private int id;
    private int tipo;
    private int velocidad;
    private String cuidadactual;
    private String TitleType;
    
    public Tren(int _id,int type,String ciudad)
    {   
        id = _id;
        tipo=type;
        cuidadactual = ciudad;
        Tipos(type);
    }
    public Tren()
    {
        
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if(tipo >= 0 && tipo <=2)
        {
        this.tipo = tipo;
        Tipos(tipo);
        }
        else
        {
          JOptionPane.showConfirmDialog(null,"NO existe el tipo", "Tipo Inexistente", JOptionPane.DEFAULT_OPTION);
        }
    }
    public String getCuidadactual() {
        return cuidadactual;
    }

    public void setCuidadactual(String cuidadactual) {
        this.cuidadactual = cuidadactual;
    }

    public String getTitleType() {
        return TitleType;
    }

    private void setTitleType(String TitleType) {
        this.TitleType = TitleType;
    }
    private void Tipos(int tiposenum)
    {
        if(tiposenum == 0)
         {
            setTitleType("Rustico");
            setVelocidad(50); 
         }
           
        if(tiposenum == 1)
         {
            setTitleType("Moderno");
            setVelocidad(100);
         }
        if(tiposenum == 2)
         {
            setTitleType("Alta Velocidad");
            setVelocidad(250);
         }
    }

    public int getVelocidad() {
        return velocidad;
    }

    private void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
  
}
