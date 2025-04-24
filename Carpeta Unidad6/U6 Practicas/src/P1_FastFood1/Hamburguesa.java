package P1_FastFood1;


public class Hamburguesa extends Plato
{
    private String tipo;
/* ---------------------------- Constructores --------------------------------*/    
    public Hamburguesa(String tipo, double precio, String nombre) {
        super(precio, nombre);
        this.tipo = tipo;
    }

    public Hamburguesa(String tipo, double precio, String nombre, boolean oferta) {
        super(precio, nombre, oferta);
        this.tipo = tipo;
    }
/* ------------------------------- Metodos ---------------------------------- */

@Override
    public String toString() {
        return "Plato{" + "id=" + getId() + ", precio=" + getPrecio() + ", nombre=" 
                + getNombre() + ", oferta=" + isOferta() + ", tipo=" + tipo + '}';
    }    
}//class
