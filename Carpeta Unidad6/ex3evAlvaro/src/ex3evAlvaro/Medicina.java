package ex3evAlvaro;


public class Medicina extends Hecho
{
/* ---------------------------- Constructores --------------------------------*/    
    public Medicina(String tipo, String descripcion, int dia, int mes, int anno) {
        super(tipo, descripcion, dia, mes, anno);
    }
/* ------------------------------- Metodos ---------------------------------- */
@Override
    public String toString() {
        return "Hecho{" + "tipo=" + getTipo() + ", descripcion=" 
                + getDescripcion() + ", dia=" + getDia() + ", mes=" 
                + getMes() + ", anno=" + getAnno() + '}';
    }

}//class
