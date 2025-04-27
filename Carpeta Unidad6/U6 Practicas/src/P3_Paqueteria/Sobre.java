package P3_Paqueteria;


public class Sobre extends Paquete{
    
    private String color; // no obligatorio
/* ---------------------------- Constructores --------------------------------*/    
    public Sobre(int peso, boolean certificado) {
        super(peso, certificado);
        
        if(peso <= 150)
            setPrecio(10);
        else if(peso <= 150)
            setPrecio(10);
        else
            setPrecio(10);
    }
    
    public Sobre(int peso, boolean certificado, String color) {
        super(peso, certificado);
        this.color = color;
    }
/* ------------------------------- Metodos ---------------------------------- */

  @Override
    public String toString() {
        return "\n" + "  SOBRE ("+getId()+")" + ":\n   + peso: " + getPeso() + 
        "\n   + precio: " + getPrecio() + "\n   + certificado: " + isCertificado()
                + "\n   + color: " + color +"\n";
    }   

}// class
