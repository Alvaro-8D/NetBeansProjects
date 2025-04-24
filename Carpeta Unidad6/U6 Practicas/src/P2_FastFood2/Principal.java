package P2_FastFood2;


public class Principal 
{
    public static void main(String[] args) 
    {
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
        Cliente cliente1 = new Cliente("pepe");
        Cliente cliente2 = new Cliente("rebeca");
        
        //pedido de pepe
        cliente1.hacerPedido(plato1,true);
        
        // pedido de rebeca
        cliente2.hacerPedido(plato2,true);
        cliente2.hacerPedido(plato4,false);
        cliente2.hacerPedido(plato8,false);
        cliente2.hacerPedido(plato2,false);
        cliente2.hacerPedido(plato4,false);
        cliente2.hacerPedido(plato8,false);
        cliente2.hacerPedido(plato2,false);
        cliente2.hacerPedido(plato4,false);
        cliente2.hacerPedido(plato8,false);
        cliente2.hacerPedido(plato9,false);
        
        cliente1.visualizarMisPlatos();
        
        System.out.println("");
        cliente2.visualizarMisPlatos();
        
        // 4. Invéntate y prueba otro pedido para rebeca de otros tres platos
        
        // pedido de rebeca 2
        cliente2.hacerPedido(plato9,true);
        cliente2.hacerPedido(plato5,false);
        cliente2.hacerPedido(plato6,false);
        cliente2.hacerPedido(plato9,false);
        
        System.out.println("");
        cliente2.visualizarMisPlatos();
         
    }// main
/* ------------------------------- Metodos ---------------------------------- */


}//class
