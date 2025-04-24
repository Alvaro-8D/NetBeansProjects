package P1_FastFood1;


public class Cliente 
{
    private String      nombre;
    private Plato       plato1;
    private Plato       plato2;
    private Plato       plato3;
    private static int  contadorPlatos = 1;
    private double      cuentaFinal = 0; // total de dinero a pagar
/* ---------------------------- Constructores --------------------------------*/    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
/* ------------------------------- Metodos ---------------------------------- */
    public void hacerPedido (Plato p)
    {
        switch (contadorPlatos) {
            case 1:
                plato1 = p;
        // si un mismo cliente hace mas de un pedido, la cuenta final se resetea
                cuentaFinal = 0;
                cuentaFinal += p.getPrecio();
                break;
            case 2:
                plato2 = p;
                cuentaFinal += p.getPrecio();
                break;
            case 3:
                plato3 = p;
                cuentaFinal += p.getPrecio();
                break;
            default:
                System.out.println("Error");
        }
        contadorPlatos ++;
        
        if(contadorPlatos > 3)
            contadorPlatos = 1;
    }
    public void visualizarMisPlatos()
    {
        System.out.println("");
        System.out.println("* * *   "+nombre+"  * * * \nPlato1: "+plato1
                +"\nPlato2: "+plato2+"\nPlato3: "+plato3);
        System.out.println("---> Total = "+cuentaFinal);
    }

}//class
