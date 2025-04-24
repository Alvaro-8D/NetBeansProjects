package P3_Paqueteria;


public class Sobre extends Paquete{
    
    private String color; // no obligatorio
/* ---------------------------- Constructores --------------------------------*/    
    public Sobre(int peso, boolean certificado) {
        super(peso, certificado);
    }
    
    public Sobre(int peso, boolean certificado, String color) {
        super(peso, certificado);
        this.color = color;
    }
/* ------------------------------- Metodos ---------------------------------- */

  @Override
    public String toString() {
        return "    Paquete ("+getId()+")" + ":\n    peso: " + getPeso() + "\n    precio: " + getPrecio()
            + "\n   certificado: " + isCertificado()+ "\n   color: " + color;
    }   

}// class
