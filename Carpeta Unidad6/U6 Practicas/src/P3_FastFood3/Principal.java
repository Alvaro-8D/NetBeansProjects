package P3_FastFood3;

import java.util.ArrayList;

public class Principal 
{
    public static void main(String[] args) 
    {
        // ArrayList de Clientes
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        clientes.add(new Cliente("pepe")) ;
        clientes.add(new Cliente("rebeca"));
        clientes.add(new Cliente("carlos"));
        clientes.add(new Cliente("spiderman"));
        
        // esta es la carta (platos disponibles
        Ternera plato1 = new Ternera("simple", 15.5, "Hamburguesa de ternera básica");
        Buey plato2 = new Buey("doble", 25.5, "Hamburguesa de ternera doble");
        MasaFina plato3 = new MasaFina("pequeña", 16.75, "pizza masa fina tamaño pequeño");
        MasaFina plato4 = new MasaFina("mediana", 25.0, "pizza masa fina tamaño mediano");
        MasaFina plato5 = new MasaFina("grande", 31.25, "pizza masa fina tamaño grande");
        MasaGruesa plato6 = new MasaGruesa("pequeña", 20.0, "pizza masa gruesa tamaño pequeño");
        MasaGruesa plato7 = new MasaGruesa("mediana", 28.0, "pizza masa gruesa tamaño mediano");
        MasaGruesa plato8 = new MasaGruesa("grande", 33.60, "pizza masa gruesa tamaño grande");
        Vegetariana plato9 = new Vegetariana("simple", 19.0, "Hamburguesa vegetariana");
        
        
        //pedido de pepe
        clientes.get(0).hacerPedido(plato1,true);
        
        // pedido de rebeca
        clientes.get(1).hacerPedido(plato2,true);
        clientes.get(1).hacerPedido(plato4,false);
        clientes.get(1).hacerPedido(plato8,false);
        clientes.get(1).hacerPedido(plato2,false);
        clientes.get(1).hacerPedido(plato4,false);
        clientes.get(1).hacerPedido(plato8,false);
        clientes.get(1).hacerPedido(plato2,false);
        clientes.get(1).hacerPedido(plato4,false);
        clientes.get(1).hacerPedido(plato8,false);
        clientes.get(1).hacerPedido(plato9,false);
        
        clientes.get(0).visualizarMisPlatos();
        
        System.out.println("");
        clientes.get(1).visualizarMisPlatos();
        
        // pedido de carlos
        clientes.get(2).hacerPedido(plato9,true);
        clientes.get(2).hacerPedido(plato5,false);
        clientes.get(2).hacerPedido(plato6,false);
        clientes.get(2).hacerPedido(plato9,false);
        
        System.out.println("");
        clientes.get(2).visualizarMisPlatos();
        
        // pedido de spiderman
        clientes.get(3).hacerPedido(plato9,true);
        clientes.get(3).hacerPedido(plato5,false);
        clientes.get(3).hacerPedido(plato6,false);
        clientes.get(3).hacerPedido(plato9,false);
        clientes.get(3).hacerPedido(plato2,false);
        clientes.get(3).hacerPedido(plato4,false);
        clientes.get(3).hacerPedido(plato8,false);
        clientes.get(3).hacerPedido(plato2,false);
        clientes.get(3).hacerPedido(plato4,false);
        
        System.out.println("");
        clientes.get(3).visualizarMisPlatos();
         
    }// main
/* ------------------------------- Metodos ---------------------------------- */


}//class
