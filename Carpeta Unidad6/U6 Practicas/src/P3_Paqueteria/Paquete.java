package P3_Paqueteria;


public class Paquete {
    
    private static int  identificadores = 1000;
    private int         id;
    private int         peso;
    private int         precio = 0;
    private boolean     certificado;// se le a�aden 6 euros si est� certificado
    
/* ---------------------------- Constructores --------------------------------*/    
    public Paquete(int peso, boolean certificado) {
        this.id = identificadores;  
            identificadores ++;
        this.peso = peso;
        this.certificado = certificado;
        
        if (certificado) // se le a�aden 6 euros si est� certificado
            this.precio += 6;
    }
/* ------------------------------- Metodos ---------------------------------- */

    public static int getIdentificadores() {
        return identificadores;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isCertificado() {
        return certificado;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}// class
