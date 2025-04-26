package P3_Paqueteria;

import java.util.Arrays;

public class Sucursal {

    
    private String      nombre;
    private String      direccion;
    private String      encargado;
    private Paquete     paquetes[] = new Paquete[4];
    private int         indicePaquetes = 0;
    
/* ---------------------------- Constructores --------------------------------*/
    public Sucursal(String nombre, String direccion, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.encargado = encargado;
    }
/* ------------------------------- Metodos ---------------------------------- */

    public Paquete[] getPaquetes() {
        return paquetes;
    }
    
    public int getIndicePaquetes() {
           return indicePaquetes;
    }
    
    public void setPaquetes(Paquete[] paquetes) {
        this.paquetes = paquetes;
    }
   
    public void sumaIndicePaquetes() {
        this.indicePaquetes ++;
    }

@Override
    public String toString() {
        return nombre + ":\ndireccion: " + direccion + "\nencargado: " + encargado 
            + "\npaquetes: " + Arrays.toString(paquetes) + "\nindicePaquetes: " + indicePaquetes + '}';
    }


}// class
