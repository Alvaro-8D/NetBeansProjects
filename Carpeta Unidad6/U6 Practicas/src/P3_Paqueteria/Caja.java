package P3_Paqueteria;


public class Caja extends Paquete{
    // no tiene atributos propios
/* ---------------------------- Constructores --------------------------------*/    
    public Caja(int peso, boolean certificado) {
        super(peso, certificado);
    }
/* ------------------------------- Metodos ---------------------------------- */
    
  @Override
    public String toString() {
        return "    Paquete ("+getId()+")" + ":\n    peso: " + getPeso() + "\n    precio: " + getPrecio()
            + "\n   certificado: " + isCertificado();
    }
    
}// class
