package P3_Paqueteria;


public class Caja extends Paquete{
    // no tiene atributos propios
/* ---------------------------- Constructores --------------------------------*/    
    public Caja(int peso, boolean certificado) {
        super(peso, certificado);
        
        if(peso <= 150)
            setPrecio(getPrecio()+20);
        else if((peso <= 250)&&(peso > 150))
            setPrecio(getPrecio()+25);
        else
            setPrecio(getPrecio()+30);
    }
/* ------------------------------- Metodos ---------------------------------- */
    
  @Override
    public String toString() {
        return "\n" + "  CAJA ("+getId()+")" + ":\n   + peso: " + getPeso() 
    + "\n   + precio: " + getPrecio() + "\n   + certificado: " + isCertificado();
    }
    
}// class
