package Hoja1Ej2;


public class Tractor extends Vehiculo
{
    private String tipo;
    private String estado;
/* ---------------------------- Constructores --------------------------------*/    
    public Tractor(String tipo, String estado, int numSerie) {
        super(numSerie);
        this.tipo = tipo;
        this.estado = estado;
    }

    public Tractor(String tipo, String estado, int numSerie, String color) {
        super(numSerie, color);
        this.tipo = tipo;
        this.estado = estado;
    }
/* ------------------------------- Metodos ---------------------------------- */
    public void cambiarEstado(String estado)
    {
        this.estado = estado;
    }
    
    
    
    
}//class
