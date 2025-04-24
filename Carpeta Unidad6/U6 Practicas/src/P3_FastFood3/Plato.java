package P3_FastFood3;


public class Plato 
{
    private static int  idSiguiente = 100;
    private int         id;
    private double      precio;
    private String      nombre;
    private boolean     oferta;
/* ---------------------------- Constructores --------------------------------*/    
    public Plato(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        this.id = idSiguiente; idSiguiente ++;
    }
    
    public Plato(double precio, String nombre, boolean oferta) {
        this.precio = precio;
        this.nombre = nombre;
        this.oferta = oferta;
    }
/* ------------------------------- Metodos ---------------------------------- */

    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isOferta() {
        return oferta;
    }

    public static void setIdSiguiente(int idSiguiente) {
        Plato.idSiguiente = idSiguiente;
    }

    public void setId(int id) {
        this.id = id;
    }

@Override
    public String toString() {
        return "Plato{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", oferta=" + oferta + '}';
    }
}//class
