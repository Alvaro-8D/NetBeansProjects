package P3_Paqueteria;


public class Sobre extends Paquete{
    
    private String color; // no obligatorio
/* ---------------------------- Constructores --------------------------------*/    
    public Sobre(int peso, boolean certificado) {
        super(peso, certificado);
        
        if(peso <= 150)
            setPrecio(getPrecio()+10);
        else if((peso <= 250)&&(peso > 150))
            setPrecio(getPrecio()+15);
        else
    // (-1) para indicar que este sobre será eliminado ya que supera el peso max
            setPrecio(-1);
    }
    
    public Sobre(int peso, boolean certificado, String color) {
        super(peso, certificado);
        this.color = color;
        
        if(peso <= 150)
            setPrecio(getPrecio()+10);
        else if((peso <= 250)&&(peso > 150))
            setPrecio(getPrecio()+15);
        else
    // (-1) para indicar que este sobre será eliminado ya que supera el peso max
            setPrecio(-1);
    }
/* ------------------------------- Metodos ---------------------------------- */

  @Override
    public String toString() {
        return "\n" + "  SOBRE ("+getId()+")" + ":\n   + peso: " + getPeso() + 
        "\n   + precio: " + getPrecio() + "\n   + certificado: " + isCertificado()
                + "\n   + color: " + color;
    }   

}// class
