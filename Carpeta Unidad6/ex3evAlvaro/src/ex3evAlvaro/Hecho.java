package ex3evAlvaro;


public class Hecho 
{
    private String  tipo;
    private String  descripcion;
    private int     dia;
    private int     mes;
    private int     anno ;
/* ---------------------------- Constructores --------------------------------*/    
    public Hecho(String tipo, String descripcion, int dia, int mes, int anno) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }
/* ------------------------------- Metodos ---------------------------------- */

@Override
    public String toString() {
        return "Hecho{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", dia=" + dia + ", mes=" + mes + ", anno=" + anno + '}';
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnno() {
        return anno;
    }
    
    

}//class
