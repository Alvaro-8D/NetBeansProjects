package P1_FastFood1;


public class Pizza extends Plato
{
    private String tamanio;
/* ---------------------------- Constructores --------------------------------*/    
    public Pizza(String tamanio, double precio, String nombre) {
        super(precio, nombre);
        this.tamanio = tamanio;
    }

    public Pizza(String tamanio, double precio, String nombre, boolean oferta) {
        super(precio, nombre, oferta);
        this.tamanio = tamanio;
    }
/* ------------------------------- Metodos ---------------------------------- */

    
    
@Override
    public String toString() {
        return "Plato{" + "id=" + getId() + ", precio=" + getPrecio() + ", nombre=" 
                + getNombre() + ", oferta=" + isOferta() + ", tamanio=" + tamanio + '}';
    } 
}//class
