package Hoja1Ej2;


public class Coche extends Vehiculo
{
    private int cilindrada;
/* ---------------------------- Constructores --------------------------------*/    
    public Coche(int cilindrada, int numSerie) {
        super(numSerie);
        this.cilindrada = cilindrada;
    }

    public Coche(int cilindrada, int numSerie, String color) {
        super(numSerie, color);
        this.cilindrada = cilindrada;
    }
/* ------------------------------- Metodos ---------------------------------- */


}//class
