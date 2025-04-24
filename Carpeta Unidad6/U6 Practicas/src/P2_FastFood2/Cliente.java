package P2_FastFood2;

import java.util.ArrayList;

public class Cliente 
{
    private String      nombre;
    private ArrayList<Plato> platos = new ArrayList<Plato>();
    private static int  contadorPlatos = 1;
    private double      cuentaFinal = 0; // total de dinero a pagar
/* ---------------------------- Constructores --------------------------------*/    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
/* ------------------------------- Metodos ---------------------------------- */
    public void hacerPedido (Plato p, boolean nuevoPedido)
    {
        if(nuevoPedido)
        {
            contadorPlatos = 1;
            platos.clear();
        }
        
        if(contadorPlatos == 1) 
        {
            nuevoPedido = false;
            platos.add(0, p);
        // si un mismo cliente hace mas de un pedido, la cuenta final se resetea
            cuentaFinal = 0;
            cuentaFinal += p.getPrecio();
        }
        else
        {
            platos.add(p);
            cuentaFinal += p.getPrecio();
        }
        contadorPlatos ++;
        
    }
    public void visualizarMisPlatos()
    {
        int num = 1;
        
        System.out.println("");
        System.out.println("* * *   "+nombre+"  * * * ");
        for(Plato p: platos)
        {
            System.out.println("Plato"+num+": "+p);
            num ++;
        }
        System.out.println("---> Total = "+cuentaFinal);
    }

}//class
