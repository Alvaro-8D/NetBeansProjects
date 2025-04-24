package Hoja1Ej2;


public class Vehiculo 
{
    private int numSerie;
    private String color = "blanco";
/* ---------------------------- Constructores --------------------------------*/    
    public Vehiculo(int numSerie) {
        this.numSerie = numSerie;
    }
    public Vehiculo(int numSerie, String color) {
        this.numSerie = numSerie;
        this.color = color;
    }
/* ------------------------------- Metodos ---------------------------------- */
    public String getColor() {
        return color;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    
    public void arrancar()
    {
        String clase = ""+getClass();
        
        System.out.println("Arrancando "+clase.substring(15)+
                " ["+getNumSerie()+"] ...");
    }


}//class
