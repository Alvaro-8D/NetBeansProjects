package P1_MUS;


public class Carta {
    
    private String  nombre;// combre completo (ej: sota de oros)
    private String  palo;// espadas, bastos, copas, oros
    private int     numero;// numero de la carta
    private boolean repartida = false;  // idica si ya ha sido repartida
    private int     valor; // puntuacion de la carta en el juego
// "numeroFicticio" sirve para identificar los 2 como As y los 3 como Rey
    private int     numeroFicticio;
    
    
/* ---------------------------- Constructores --------------------------------*/    
    public Carta(String palo, int numero) {
        this.palo = palo;
        switch(numero) //asigna nombre correcto a figuras (sota, caballo, rey)
        {
            case 1:         // As
                this.numero = 1;
                nombre = "As de "+palo;
                valor = 1;
                numeroFicticio = 1;
                break;
                
            case 2:         // sota
                this.numero = 2;
                nombre = "2 de "+palo;
                valor = 1;
                numeroFicticio = 1;
                break;
                
            case 3:         // sota
                this.numero = 1;
                nombre = "3 de "+palo;
                valor = 10;
                numeroFicticio = 12;
                break;
            
            case 8:         // sota
                this.numero = 10;
                nombre = "Sota de "+palo;
                valor = 10;
                numeroFicticio = this.numero;
                break;
                
            case 9:         // caballo
                this.numero = 11;
                nombre = "Caballo de "+palo;
                valor = 10;
                numeroFicticio = this.numero;
                break;
                
            case 10:        // rey
                this.numero = 12;
                nombre = "Rey de "+palo;
                valor = 10;
                numeroFicticio = 12;
                break;
                
            default:        // resto de numeros
                this.numero = numero;
                nombre = numero+" de "+palo;
                valor = this.numero;
                numeroFicticio = this.numero;
        }
    }
/* ------------------------------- Metodos ---------------------------------- */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isRepartida() {
        return repartida;
    }

    public void setRepartida(boolean repartida) {
        this.repartida = repartida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumeroFicticio() {
        return numeroFicticio;
    }

    public void setNumeroFicticio(int numeroFicticio) {
        this.numeroFicticio = numeroFicticio;
    }
    
    

@Override
    public String toString() {
        return "* * * * Carta * * * *" + "\nnombre: " + nombre + "\npalo: " + palo 
            + "\nnumero: " + numero + "\nrepartida: " 
                + repartida + "\nvalor: " + valor;
    }
}// class
